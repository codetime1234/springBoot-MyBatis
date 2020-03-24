package com.codetime1234.springbootmybatis.user.service.impl;

import com.codetime1234.springbootmybatis.user.dao.UserDao;
import com.codetime1234.springbootmybatis.user.entity.UserEntity;
import com.codetime1234.springbootmybatis.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author liben123_奔奔
 * @create 2020-03-20 11:26
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<UserEntity> getAll(Map map) {
        return userDao.getAll(map);
    }

    @Override
    public void delById(Integer id) {
        userDao.delById(id);
    }

    @Override
    public void save(UserEntity userEntity) {
        userEntity.setCreatetime(new Date());
        userEntity.setStatus(1);
        userDao.save(userEntity);
    }
}
