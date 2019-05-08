package com.yan.controller.impl;

import com.yan.controller.IController;
import com.yan.model.User;
import com.yan.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IControllerImpl implements IController {


    @Autowired
    private IService service;


    @Override
    //@RequestMapping(value = "/findAll/{page}/{size}", method = RequestMethod.GET)
    @GetMapping("/findAll/{page}/{size}")
    public List<User> findAll(@PathVariable(value = "page") int page, @PathVariable(value = "size") int size) {
        return service.findAll(page, size);
    }

    @Override
    @RequestMapping(value = "/delUser/{uid}",method = RequestMethod.DELETE)
    public void delUser(String uid) {

        service.delUser(uid);
    }

    @Override
    @RequestMapping(value = "/updateFindbyid/{uid}",method = RequestMethod.GET)
    public User updateFindbyid(String uid) {
        return service.updateFindbyid(uid);
    }

    @Override
    public void updatUser(User User) {

    }

    @Override
    public void addUser(User User) {

    }

    @Override
    public User findbyid(String Userid) {
        return null;
    }

    @Override
    public void daySubtract(User user) {

    }

    @Override
    public User UserLogin(String Userid, String Username) {
        return null;
    }
}
