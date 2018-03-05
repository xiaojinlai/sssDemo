package cn.eli.sss.dao;

import cn.eli.sss.entity.EliUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends JpaRepository<EliUser, Long> {

    /**
     * 根据用户名密码查询数据
     *
     * @param name
     * @param password
     * @return
     */
    EliUser findByNameAndPassword(String name, String password);

    List<EliUser> findAll();
}
