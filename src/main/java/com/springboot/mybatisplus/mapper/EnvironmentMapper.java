package com.springboot.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springboot.mybatisplus.entry.Environment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface EnvironmentMapper extends BaseMapper<Environment> {

}
