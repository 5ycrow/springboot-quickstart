package com.springboot.mybatisplus.controller;


import com.springboot.mybatisplus.entity.User;
import com.springboot.mybatisplus.service.IUserService;
import com.springboot.mybatisplus.service.impl.UserServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Los
 * @since 2021-04-06
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl iUserService;
    @ApiOperation("查询所有user")
    @GetMapping("/list")
    public List<User> userList(){
        List<User> users=iUserService.list();
        return users;
    }

}
