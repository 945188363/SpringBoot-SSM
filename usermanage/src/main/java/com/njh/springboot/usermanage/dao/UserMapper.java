package com.njh.springboot.usermanage.dao;

import com.njh.springboot.usermanage.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

    User selectUserByName(String name);
}
