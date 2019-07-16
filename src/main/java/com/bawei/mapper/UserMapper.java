package com.bawei.mapper;

import com.bawei.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public List<User>  selectUsers();
}
