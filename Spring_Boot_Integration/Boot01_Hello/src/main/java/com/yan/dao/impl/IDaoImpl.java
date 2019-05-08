package com.yan.dao.impl;

import com.yan.dao.IDao;
import com.yan.model.User;
import com.yan.util.DruidUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @author Yan
 */
public class IDaoImpl implements IDao {


    /**
     * 调用工具类
     */
    private JdbcTemplate jt = new JdbcTemplate(DruidUtils.getDataSource());


    @Override
    public void addUser(User User) {
        String sql = "INSERT INTO user VALUES (?,?,?,?,?,?,?)";
        jt.update(sql, User.getUid(), User.getName(), User.getAge(), User.getSex(), User.getBirthday(), User.getPhone(), User.getAddress());
    }

    @Override
    public User findbyid(int uid) {
        String sql = "SELECT * FROM user WHERE uid = ?";
        User User = jt.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), uid);
        return User;
    }

    @Override
    public void daySubtract(User user) {
        String sql = "UPDATE user SET birthday =? WHERE uid = ?";
        jt.update(sql, user.getBirthday(), user.getUid());

    }

    @Override
    public User UserLogin(int Userid, String Username) {
        String sql = "SELECT * FROM user WHERE uid =? AND  name =?";
        User User = jt.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), Userid, Username);
        return User;
    }

    @Override
    public void delUser(int uid) {
        String sql = "DELETE FROM user WHERE uid = ?";
        jt.update(sql, uid);
    }

    @Override
    public User updateFindbyid(int uid) {
        String sql = "SELECT * FROM user WHERE uid = ?";
        User User = jt.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), uid);
        return User;
    }

    @Override
    public void updateUser(User User) {
        String sql = "UPDATE user SET name=?,age=?,sex=?,birthday=?,phone=?,address=? WHERE uid = ?";
        jt.update(sql, User.getName(), User.getAge(), User.getSex(), User.getBirthday(), User.getPhone(), User.getAddress(), User.getUid());
    }

    @Override
    public List<User> findAll(int page, int size) {
        String sql = "select * from user LIMIT ? ,? ";
        List<User> Users = jt.query(sql, new BeanPropertyRowMapper<User>(User.class),page,size);
        return Users;
    }

}
