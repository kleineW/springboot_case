package com.example.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.controller.util.R;
import com.example.domain.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{currentpage}/{size}")
    public R getByPage(@PathVariable Integer currentpage, @PathVariable Integer size){
        Page page = new Page(currentpage,size);
        List records = userService.findByPage(page).getRecords();
        return  new R(records,page);
    }
    @PostMapping
    public R SaveUser(@RequestBody User user){
        boolean b = userService.saveUser(user);
        return new R(b);
    }
    @PutMapping
    public R updateUser(@RequestBody User user){
        boolean b = userService.updateUser(user);
        return new R(b);
    }
    @DeleteMapping("/{id}")
    public R deleteUser(@PathVariable Integer id){
        boolean b = userService.deleteUser(id);
        return new R(b);
    }


}
