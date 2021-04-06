package com.springboot.mybatisplus.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author Los
 * @since 2021-04-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Environment对象", description="")
public class Environment implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer environmentid;

    private String environmentname;

    private String environmentversion;


}
