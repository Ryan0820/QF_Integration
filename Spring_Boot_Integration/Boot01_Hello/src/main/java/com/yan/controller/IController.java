package com.yan.controller;

import com.yan.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import java.util.List;

/**
 * 系统开发Api暴露于前台接口
 */
@Api(value = "Spring Boot整合测试接口", description = "管理整合接口，提供增、删、改、查操作页面")
public interface IController {

    /**
     * 增加
     *
     * @param user
     */
    @ApiOperation("添加数据")
    void addUser(User user);


    /**
     * 按照UID删除
     *
     * @param uid
     */
    //@ApiImplicitParam(name = "uid",value = "用户ID",required = true,paramType = "path,",dataType = "long")
    @ApiOperation("通过UID删除")
    void delUser(Long uid);

    /**
     * 更新修改
     *
     * @param user
     */
    @ApiOperation("修改页面")
    void updateUser(User user);

    /**
     * 按照UID查询
     *
     * @param uid
     * @return
     */
    @ApiOperation("通过ID查询页面")
    User findById(Long uid);

    /**
     * 全部查询
     *
     * @param page 页码
     * @param size 条数
     * @return
     */
    @ApiOperation("查询所有数据findAll列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "页码", required = true, paramType = "path", dataType = "int"),
            @ApiImplicitParam(name = "size", value = "每页记录数", required = true, paramType = "path", dataType = "int")
    })
    List<User> findAll(int page, int size);


    @ApiOperation("修改前按照id查询")
        //@ApiImplicitParam
    User updateFindbyid(String uid);

    void daySubtract(User user);

    User UserLogin(String uid, String Username);
    /* @ApiOperation(value="获取指定id用户详细信息", notes="根据user的id来获取用户详细信息")
    @ApiImplicitParam(name = "id",value = "用户id", dataType = "String", paramType = "path")
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable Long id) ;*/
}
