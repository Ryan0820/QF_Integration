package com.yan.service.impl;

import com.yan.dao.IDao;
import com.yan.dao.impl.IDaoImpl;
import com.yan.model.User;
import com.yan.service.IService;
import com.yan.util.IdWorker;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Yan
 */
@Service
public class IServiceImpl implements IService {

    // @Autowired IRepository dao;

    private IDao dao = new IDaoImpl();

    /**
     * 增加
     *
     * @param user
     */
    @Override
    public void addUser(User user) {
        //使用twitter的雪花算法输入id
        IdWorker idWorker = new IdWorker();
        long uid = idWorker.nextId();
        user.setUid(uid);
        dao.addUser(user);
    }

    /**
     * 按照UID删除
     *
     * @param uid
     */
    @Override
    public void delUser(Long uid) {
        dao.delUser(uid);
    }

    /**
     * 更新修改
     *
     * @param user
     */
    @Override
    public void updateUser(User user) {
        dao.updateUser(user);
    }

    /**
     * 按照UID查询
     *
     * @param uid
     * @return
     */
    @Override
    public User findById(Long uid) {
        return dao.findById(uid);
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
        return dao.findAll(page, size);
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
