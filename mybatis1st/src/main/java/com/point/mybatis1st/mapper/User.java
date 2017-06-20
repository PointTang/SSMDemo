package com.point.mybatis1st.mapper;

import com.point.mybatis1st.model.UserModel;

import java.util.List;

/**
 * Created by Point on 2017/6/19.
 */
public interface User {
    public UserModel findOne(int id);
    public List<UserModel> findAll();
}
