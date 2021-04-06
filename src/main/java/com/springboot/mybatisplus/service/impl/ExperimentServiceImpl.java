package com.springboot.mybatisplus.service.impl;

import com.springboot.mybatisplus.entity.Experiment;
import com.springboot.mybatisplus.mapper.ExperimentMapper;
import com.springboot.mybatisplus.service.IExperimentService;
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
public class ExperimentServiceImpl extends ServiceImpl<ExperimentMapper, Experiment> implements IExperimentService {

}
