package com.app.mysell.service.impl;

import com.app.mysell.dao.UserInfoMapper;
import com.app.mysell.entity.UserInfoEntity;
import com.app.mysell.service.UserInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Package com.app.mysell.service.impl
 * @ClassName UserInfoServiceImpl
 * @Author shaobin.wang
 * @Date 2019/06/20 18:21
 * @Version 1.0
 * @Description:
 **/
@Service
@Slf4j
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    /**
     * @param pageNum
     * @param pageSize
     * @return com.app.mysell.common.model.ReturnInfo<com.github.pagehelper.PageInfo                                                                                                                               <                                                                                                                               com.app.mysell.entity.UserInfoEntity>>
     * @author shaobin.wang
     * @date 2019/06/20 18:24
     * @description
     */
    @Override
    public PageInfo<UserInfoEntity> selectUserInfoPage(int pageNum, int pageSize) {


        PageHelper.startPage(pageNum, pageSize);

        List<UserInfoEntity> page = userInfoMapper.selectUserInfoPage();
        PageInfo<UserInfoEntity> userInfoEntityPageInfo = new PageInfo<>(page);

        return userInfoEntityPageInfo;
    }
}
