package com.yan.repository;

import com.yan.model.User;

import java.util.List;

/**
 * @author Yan
 *  持久层接口
 */
//@Repository
public interface IRepository {
    /**
     * 增加
     *
     * @param user
     */
    void addUser(User user);


    /**
     * 按照UID删除
     *
     * @param uid
     */
    void delUser(Long uid);

    /**
     * 更新修改
     *
     * @param user
     */
    void updateUser(User user);

    /**
     * 按照UID查询
     *
     * @param uid
     * @return
     */
    User findById(Long uid);

    /**
     * 全部查询
     *
     * @param page 页码
     * @param size 条数
     * @return
     */
    List<User> findAll(int page, int size);


    User updateFindbyid(String uid);

    void daySubtract(User user);

    User UserLogin(String uid, String Username);
}
