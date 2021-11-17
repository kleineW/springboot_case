package com.example.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.dao.UserDao;
import com.example.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



public interface UserService {
        Page findByPage(Page page);
        boolean saveUser(User user);
        boolean deleteUser(Integer id);
        boolean updateUser(User user);

}
