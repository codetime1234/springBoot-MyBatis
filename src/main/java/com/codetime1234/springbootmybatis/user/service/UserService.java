package com.codetime1234.springbootmybatis.user.service;

import com.codetime1234.springbootmybatis.user.entity.UserEntity;

import java.util.List;
import java.util.Map;

/**
 * @author liben123_奔奔
 * @create 2020-03-20 11:25
 */
public interface UserService {

     List<UserEntity> getAll(Map map);

     void delById(Integer id);

     void save(UserEntity userEntity);
}
