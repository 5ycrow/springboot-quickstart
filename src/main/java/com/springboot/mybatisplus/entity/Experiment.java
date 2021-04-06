package com.springboot.mybatisplus.entity;

import java.time.LocalDateTime;
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
@ApiModel(value="Experiment对象", description="")
public class Experiment implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer userid;

    private String username;

    private Integer envid;

    private String environmentname;

    private String environmentversion;

    private LocalDateTime createtime;

    private LocalDateTime lastopentime;

    private LocalDateTime lastleavetime;

    private String usedtime;

    private String expurl;


}
