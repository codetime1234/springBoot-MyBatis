package com.codetime1234.springbootmybatis.user.dao;

import com.codetime1234.springbootmybatis.user.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author liben123_奔奔
 * @create 2020-03-20 11:27
 */
@Mapper
public interface UserDao {

    List<UserEntity> getAll(@Param("content") Map map);

    void delById(Integer id);

    void save(UserEntity userEntity);
}
