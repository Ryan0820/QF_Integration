package com.yan.service;


import com.yan.model.User;

import java.util.List;

/**
 *
 */
public interface IService {
    public List<User> findAll(int page, int size);

    void delUser(String id);

    User updateFindbyid(String Userid);

    void updatUser(User User);

    void addUser(User User);

    User findbyid(String Userid);

    void daySubtract(User user);

    User UserLogin(String Userid, String Username);
}
