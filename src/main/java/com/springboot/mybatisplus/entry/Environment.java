package com.springboot.mybatisplus.entry;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("environment") //对应表名
public class Environment implements Serializable {

    //对应id，可不填
    @TableId(value = "id")
    private int id;

    //对应字段名，如果属性名和字段名一致，可不填
    private int environmentid;

    private String environmentname;

    private String environmentversion;

    //表示表中没有这个字段，如果不加该注释，会抛异常
}
