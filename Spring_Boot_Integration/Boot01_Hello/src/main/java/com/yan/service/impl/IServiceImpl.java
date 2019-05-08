package com.yan.service.impl;

import com.yan.dao.IDao;
import com.yan.dao.impl.IDaoImpl;
import com.yan.model.User;
import com.yan.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Yan
 */
@Service
public class IServiceImpl implements IService {

    private IDao dao = new IDaoImpl();

    /**
     * @return
     */
    @Override
    public List<User> findAll(int page, int size) {
        return dao.findAll(page,size);
    }

    @Override
    public void delUser(String id) {
        dao.delUser(Integer.parseInt(id));
    }

    @Override
    public User updateFindbyid(String Userid) {
        return dao.updateFindbyid(Integer.parseInt(Userid));
    }

    @Override
    public void updatUser(User User) {
        dao.updateUser(User);
    }

    @Override
    public void addUser(User User) {
        dao.addUser(User);
    }

    @Override
    public User findbyid(String Userid) {
        return dao.findbyid(Integer.parseInt(Userid));
    }

    @Override
    public void daySubtract(User user) {

        dao.daySubtract(user);
    }

    @Override
    public User UserLogin(String Userid, String Username) {
        return dao.UserLogin(Integer.parseInt(Userid),Username);
    }

}
