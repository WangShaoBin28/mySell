package com.app.mysell.dao;

import com.app.mysell.entity.UserInfoEntity;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Package ${PACKAGE_NAME}
 * @ClassName  ${NAME}
 * @Author shaobin.wang
 * @Date  2019/04/29 17:14
 * @Version 1.0
 * @Description:  
 **/
@Repository
@Mapper
public interface UserInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserInfoEntity record);

    int insertSelective(UserInfoEntity record);

    UserInfoEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserInfoEntity record);

    int updateByPrimaryKey(UserInfoEntity record);

    List<UserInfoEntity> selectUserInfoPage();

}