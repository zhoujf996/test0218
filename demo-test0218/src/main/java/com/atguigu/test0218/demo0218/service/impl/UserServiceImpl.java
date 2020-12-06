package com.atguigu.test0218.demo0218.service.impl;

import com.atguigu.test0218.demo0218.bean.UserInfo;
import com.atguigu.test0218.demo0218.mapper.UserInfoMapper;
import com.atguigu.test0218.demo0218.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    //表示当前UserInfoMapper在容器中
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.selectAll();
    }

    @Override
    public void addUser(UserInfo userInfo) {

        //有选择的添加
        userInfoMapper.insertSelective(userInfo);
    }

    @Override
    public void updUser(UserInfo userInfo) {
        //根据id修改name
        //update userInfo(表名) set name=? where id=?
        //UserInfo userInfo1 = new UserInfo();
        userInfo.setName("0218 优秀");
        userInfo.setId("5");
        userInfoMapper.updateByPrimaryKeySelective(userInfo);
    }

    @Override
    public void updUserByName(UserInfo userInfo) {
        //根据name 修改 loginName
        //第一个参数:userInfo 表示要修改的数据
        //第二个参数:表示根据什么条件修改
        //update userInfo set loginName=? where name=?
        Example example = new Example(UserInfo.class);
        //创建修改条件
        //第一个参数：property指的是实体类的属性名，还是数据库表中的字段名？
        //第二个参数:修改的具体值
        example.createCriteria().andEqualTo("name", userInfo.getName());
        userInfoMapper.updateByExampleSelective(userInfo, example);
    }

//    @Override
//    public void delUser(UserInfo userInfo) {
//        //删除数据
//        //delete from userInfo where id=?
//        userInfoMapper.deleteByPrimaryKey(userInfo.getId());
//    }


//    @Override
//    public void delUser(UserInfo userInfo) {
//        //删除数据
//        //delete from userInfo where name=?
//        Example example = new Example(UserInfo.class);
//        example.createCriteria().andEqualTo("name", userInfo.getName());
//        userInfoMapper.deleteByExample(example);
//    }

    @Override
    public void delUser(UserInfo userInfo) {
        //删除数据
        //delete from userInfo where nickName=?
        // example主要作用就是封装条件
        userInfoMapper.delete(userInfo);
    }
}
