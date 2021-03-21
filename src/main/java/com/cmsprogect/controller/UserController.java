package com.cmsprogect.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cmsprogect.bean.CbUser;
import com.cmsprogect.bean.JsonObj;
import com.cmsprogect.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/*
* @RestController 是controller跟responseBody合体
* */
@RestController
@Api(tags = "用户模块")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = {"/","/login"})
    @ApiOperation(value = "登录", notes = "")
    @ApiImplicitParam(name = "username，password", value = "用户名，密码", required = true, dataType = "String")
    public JsonObj login(CbUser user, HttpSession session){
        JsonObj result= new JsonObj();
        CbUser loginUser = new CbUser();
        if (!"".equals(user.getPassword())&& !"".equals(user.getUsername())){
            QueryWrapper qw = new QueryWrapper();
            qw.eq("username",user.getUsername());
            qw.eq("password",user.getPassword());
            loginUser = userService.getOne(qw);
        }
        if (loginUser!=null){
            session.setAttribute("userData",loginUser);
            result.resultWithoutRow("0","登录成功");
        }else {
            result.resultWithoutRow("-1","用户名或密码错误，请重试！");
        }
        return result;
    }
    @PostMapping("/userList")
    @ApiOperation(value = "查询用户列表", notes = "")
    @ApiImplicitParam(name = "username（默认为空）", value = "用户名", required = true, dataType = "String")
    public JsonObj getUserList(@RequestParam Map<String, Object> map)  {
        JsonObj result= new JsonObj();
        String username= map.get("username").toString();
        QueryWrapper qw = new QueryWrapper();
        if (!"".equals(username)){
            qw.eq("username",username);

        }
        List<CbUser> users = userService.list(qw);
        result.setRow(users);
        return result;
    }
    @PostMapping("/addOrUpdateUser")
    @ApiOperation(value = "新增或修改用户信息", notes = "")
    @ApiImplicitParam(name = "username,password,mobile,startDate,stopDate", value = "用户名,密码，手机号", required = true, dataType = "String")
    public JsonObj addOrUpdateUser(CbUser user){
        JsonObj result = new JsonObj();
        boolean rtn = true;
        if (user.getId()!=null){
            rtn = userService.updateById(user);
        }else{
            rtn = userService.save(user);
        }
        if (rtn){
            result.resultWithoutRow("0","保存成功");
        }else{
            result.resultWithoutRow("-1","保存失败");
        }
        return result;
    }
    @PostMapping("/delUser")
    @ApiOperation(value = "删除用户信息", notes = "")
    @ApiImplicitParam(name = "id", value = "用户id", required = true, dataType = "String")
    public JsonObj delUser(Integer id){
        JsonObj result = new JsonObj();
        boolean rtn = userService.removeById(id);
        if (rtn){
            result.resultWithoutRow("0","删除成功");
        }else{
            result.resultWithoutRow("-1","删除失败");
        }
        return result;
    }
}
