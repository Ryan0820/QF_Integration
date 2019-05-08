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

    /**
     * 增加
     *
     * @param user
     */
    @Override
    public void addUser(User user) {
        String sql = "INSERT INTO user VALUES (?,?,?,?,?,?,?)";
        jt.update(sql, user.getUid(), user.getName(), user.getAge(), user.getSex(), user.getBirthday(), user.getPhone(), user.getAddress());
    }

    /**
     * 按照UID删除
     *
     * @param uid
     */
    @Override
    public void delUser(Long uid) {
        String sql = "DELETE FROM user WHERE uid = ?";
        jt.update(sql, uid);
    }

    /**
     * 更新修改
     *
     * @param user
     */
    @Override
    public void updateUser(User user) {
        String sql = "UPDATE user SET name=?,age=?,sex=?,birthday=?,phone=?,address=? WHERE uid = ?";
        jt.update(sql, user.getName(), user.getAge(), user.getSex(), user.getBirthday(), user.getPhone(), user.getAddress(), user.getUid());
    }

    /**
     * 按照UID查询
     *
     * @param uid
     * @return
     */
    @Override
    public User findById(Long uid) {
        String sql = "SELECT * FROM user WHERE uid = ?";
        return jt.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), uid);

    }

    /**
     * 全部查询
     *
     * @param page 页码
     * @param size 条数
     * @return
     */
    @Override
    public List<User> findAll(int page, int size) {
        String sql = "select * from user LIMIT ? ,? ";
        List<User> Users = jt.query(sql, new BeanPropertyRowMapper<User>(User.class), page, size);
        return Users;
    }

    @Override
    public User updateFindbyid(String uid) {
        return null;
    }

    @Override
    public void daySubtract(User user) {

    }

    @Override
    public User UserLogin(String uid, String Username) {
        return null;
    }

    /*
    @Override
    public void daySubtract1(User user) {
        String sql = "UPDATE user SET birthday =? WHERE uid = ?";
        jt.update(sql, user.getBirthday(), user.getUid());

    }

    @Override
    public User UserLogin1(int Userid, String Username) {
        String sql = "SELECT * FROM user WHERE uid =? AND  name =?";
        User User = jt.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), Userid, Username);
        return User;
    }
    @Override
    public User updateFindbyid1(int uid) {
        String sql = "SELECT * FROM user WHERE uid = ?";
        User User = jt.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), uid);
        return User;
    }
*/
}
