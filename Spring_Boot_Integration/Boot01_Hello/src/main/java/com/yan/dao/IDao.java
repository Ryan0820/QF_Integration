package com.yan.dao;

import com.yan.model.User;

import java.util.List;

/**
 * @author Yan
 */
public interface IDao {

    List<User> findAll(int page, int size);

    void delUser(int id);

    User updateFindbyid(int Userid);

    void updateUser(User User);

    void addUser(User User);

    User findbyid(int id);


    void daySubtract(User user);

    User UserLogin(int Userid, String Username);
}
