package com.codetime1234.springbootmybatis.user.controller;

import com.codetime1234.springbootmybatis.user.entity.UserEntity;
import com.codetime1234.springbootmybatis.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @author liben123_奔奔
 * @create 2020-03-20 11:24
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/getAll")
    @ResponseBody
    public List<UserEntity>getAll(Map map){
        return userService.getAll(map);
    }

    @RequestMapping("/delById")
    public String delById(Integer id){
        userService.delById(id);
        return "redirect:/index.html";
    }

    @RequestMapping("save")
    @ResponseBody
    public String save(@RequestBody UserEntity userEntity){
        System.out.println("用户注册 - " + userEntity.toString());
        userService.save(userEntity);
        return "success";
    }
}
