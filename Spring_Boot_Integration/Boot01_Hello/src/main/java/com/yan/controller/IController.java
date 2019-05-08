package com.yan.controller;

import com.yan.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import java.util.List;

@Api(value = "Spring Boot整合接口测试", description = "管理整合接口，提供增、删、改、查操作页面")
public interface IController {
    /* @ApiOperation(value="获取指定id用户详细信息", notes="根据user的id来获取用户详细信息")
    @ApiImplicitParam(name = "id",value = "用户id", dataType = "String", paramType = "path")
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable Long id) ;*/
    //页面查询
    @ApiOperation("查询所有数据findAll列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "页码", required = true, paramType = "path", dataType = "int"),
            @ApiImplicitParam(name = "size", value = "每页记录数", required = true, paramType = "path", dataType = "int")
    })
    List<User> findAll(int page, int size);

    @ApiOperation("通过UID删除")
   // @ApiImplicitParam(name = "id",value = "用户ID",required = true,paramType = "path,",dataType = "int")
    void delUser(String uid);

    @ApiOperation("修改前按照id查询")
    //@ApiImplicitParam
    User updateFindbyid(String uid);

    @ApiOperation("修改页面")
    void updatUser(User User);

    @ApiOperation("添加数据")
    void addUser(User User);

    @ApiOperation("通过ID查询页面")
    User findbyid(String Userid);

    void daySubtract(User user);

    User UserLogin(String Userid, String Username);
}
