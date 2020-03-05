package com.yau.mapper;

import com.yau.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Select("select id, name, password, age from \"User\" where name = #{username} ")
    User findUserByUsername(@Param("username") String username);
}
