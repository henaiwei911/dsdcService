package com.ds.hnw.dsgcservice.Dao;

import com.ds.hnw.dsgcservice.entry.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface userDao {

    public User findUserByName(String username);
}
