package com.springboot.mybatisplus.service.impl;

import com.springboot.mybatisplus.entity.User;
import com.springboot.mybatisplus.mapper.UserMapper;
import com.springboot.mybatisplus.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Los
 * @since 2021-04-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
