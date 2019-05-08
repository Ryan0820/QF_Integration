package com.yan.controller.impl;

import com.yan.controller.IController;
import com.yan.model.User;
import com.yan.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin//跨域
@RequestMapping("/user")
public class IControllerImpl implements IController {


    @Autowired
    private IService service;


    /**
     * 增加
     *
     * @param user
     */
    @Override
    @RequestMapping(method = RequestMethod.POST)
    public void addUser(@RequestBody User user) {
        service.addUser(user);
    }

    /**
     * 按照UID删除
     *
     * @param uid
     */
    @Override
    @RequestMapping(value = "/{uid}",method = RequestMethod.DELETE)
    public void delUser(@PathVariable Long uid) {
        service.delUser(uid);
    }

    /**
     * 更新修改
     *
     * @param user
     */
    @Override
    @RequestMapping(method = RequestMethod.PUT)
    public void updateUser(@RequestBody User user) {
        service.updateUser(user);
    }

    /**
     * 按照UID查询
     *
     * @param uid
     * @return
     */
    @Override
    @RequestMapping(value = "/{uid}",method = RequestMethod.GET)
    public User findById(@PathVariable Long uid) {
        return service.findById(uid);
    }

    /**
     * 全部查询
     *
     * @param page 页码
     * @param size 条数
     * @return
     */
    @Override
    @GetMapping("/{page}/{size}")
    public List<User> findAll(@PathVariable(value = "page") int page, @PathVariable(value = "size") int size) {
        return service.findAll(page, size);
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




}
