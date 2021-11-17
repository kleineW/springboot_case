package com.example.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.dao.UserDao;
import com.example.domain.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public Page findByPage(Page page) {

        return userDao.selectPage(page,null);
    }

    @Override
    public boolean saveUser(User user) {
        int i = userDao.insert(user);
        return i>0;
    }

    @Override
    public boolean deleteUser(Integer id) {
        int i = userDao.deleteById(id);
        return i>0;
    }

    @Override
    public boolean updateUser(User user) {
        int i = userDao.updateById(user);
        return i>0;
    }


}
