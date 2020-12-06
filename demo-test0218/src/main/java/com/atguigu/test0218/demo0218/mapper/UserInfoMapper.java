package com.atguigu.test0218.demo0218.mapper;

import com.atguigu.test0218.demo0218.bean.UserInfo;
import tk.mybatis.mapper.common.Mapper;

//mapper泛型 表示当前mapper要操作的实体类
//数据访问层
public interface UserInfoMapper extends Mapper<UserInfo> {
}
