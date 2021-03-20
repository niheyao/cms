package com.cmsprogect.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cmsprogect.bean.CbUser;
import com.cmsprogect.bean.JsonObj;
import com.cmsprogect.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/*
* @RestController 是controller跟responseBody合体
* */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = {"/","/login"})
    public JsonObj login(CbUser user, HttpSession session){
        JsonObj result= new JsonObj();
        result.setErrorCode("0");
        result.setErrorMessage("登录成功");
        CbUser loginUser = new CbUser();
        if (!"".equals(user.getPassword())&& !"".equals(user.getUsername())){
            QueryWrapper qw = new QueryWrapper();
            qw.eq("username",user.getUsername());
            qw.eq("password",user.getPassword());
            loginUser = userService.getOne(qw);
        }
        if (loginUser!=null){
            session.setAttribute("userData",loginUser);
        }else {
            result.setErrorCode("-1");
            result.setErrorMessage("用户名或密码错误，请重试！");
        }
        return result;
    }
    @PostMapping("/userList")
    public JsonObj getUserList(@RequestParam Map<String, Object> map)  {
        JsonObj result= new JsonObj();
        result.setErrorCode("0");
        result.setErrorMessage("成功");
        String username= map.get("username").toString();
        QueryWrapper qw = new QueryWrapper();
        if (!"".equals(username)){
            qw.eq("username",username);
        }
        List<CbUser> users = userService.list(qw);
        result.setRow(users);
        return result;
    }
}
