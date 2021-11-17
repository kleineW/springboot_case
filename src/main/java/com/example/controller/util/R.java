package com.example.controller.util;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;

@Data
public class R {
    private Boolean flag;
    private Object data;
    private Page page;
    public  R(Boolean flag,Object data){
        this.flag = flag;
        this.data = data;
    }
    public  R(Object data,Page page){
        this.data = data;
        this.page = page;
    }
    public R(boolean flag){
        this.flag = flag;
    }
    public R(){

    }
}
