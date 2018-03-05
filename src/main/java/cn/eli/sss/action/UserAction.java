package cn.eli.sss.action;

import cn.eli.sss.entity.EliUser;
import cn.eli.sss.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.Map;

@Controller("userAction")
@Scope("prototype")
public class UserAction extends ActionSupport {

    @Resource
    private UserService userService;

    private EliUser user;

    public EliUser getUser() {
        return user;
    }

    public void setUser(EliUser user) {
        this.user = user;
    }

    public String login() {
        if (userService.login(user)) {
            Map session = ActionContext.getContext().getSession();
            session.put("user", user);
            return SUCCESS;
        } else {
            return ERROR;
        }
    }
}
