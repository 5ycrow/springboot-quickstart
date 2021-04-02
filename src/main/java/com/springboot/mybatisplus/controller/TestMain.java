package com.springboot.mybatisplus.controller;

import com.springboot.mybatisplus.entry.Environment;
import com.springboot.mybatisplus.mapper.EnvironmentMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Api("相关接口Test")
@RestController

@RequestMapping("/environment")
public class TestMain {

    @Autowired()
    private EnvironmentMapper environmentMapper;

//    @ApiOperation("获取当前所有环境信息")
    @GetMapping("/list")
    public List<Environment> list(){
        List<Environment> environments = environmentMapper.selectList(null);
        return environments;
    }


}
