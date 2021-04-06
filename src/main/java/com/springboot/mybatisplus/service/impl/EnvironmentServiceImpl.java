package com.springboot.mybatisplus.service.impl;

import com.springboot.mybatisplus.entity.Environment;
import com.springboot.mybatisplus.mapper.EnvironmentMapper;
import com.springboot.mybatisplus.service.IEnvironmentService;
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
public class EnvironmentServiceImpl extends ServiceImpl<EnvironmentMapper, Environment> implements IEnvironmentService {

}
