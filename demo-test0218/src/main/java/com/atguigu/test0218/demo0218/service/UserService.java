package com.atguigu.test0218.demo0218.service;

import com.atguigu.test0218.demo0218.bean.UserInfo;

import java.util.List;

//业务逻辑层
public interface UserService {

    /**
     * 查询所有数据
     *
     * @return
     */
    List<UserInfo> findAll();

    /**
     * @param userInfo
     */
    void addUser(UserInfo userInfo);

    /**
     * 修改数据
     * @param userInfo
     */
    void updUser(UserInfo userInfo);

    /**
     * 修改数据
     * @param userInfo
     */
    void updUserByName(UserInfo userInfo);

    

    /**
     * 删除数据 boolean ,int ,void
     * @param userInfo
     */
    void delUser(UserInfo userInfo);
    
    
}
