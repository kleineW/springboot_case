package com.example.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("springuser")
public class User {
    private Integer id;
    private String name;
    private String type;
    private String description;

}
