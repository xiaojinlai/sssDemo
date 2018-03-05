package cn.eli.sss.service.impl;

import cn.eli.sss.dao.UserDao;
import cn.eli.sss.entity.EliUser;
import cn.eli.sss.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    public boolean login(EliUser user) {

        EliUser eliUser = this.userDao.findByNameAndPassword(user.getName(), user.getPassword());

        if (eliUser == null)
            return false;
        else
            return true;
    }
}
