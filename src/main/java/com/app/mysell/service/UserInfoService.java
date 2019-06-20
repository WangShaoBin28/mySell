package com.app.mysell.service;

import com.app.mysell.common.model.ReturnInfo;
import com.app.mysell.entity.UserInfoEntity;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

/**
 * @Package com.app.mysell.service
 * @ClassName UserInfoService
 * @Author shaobin.wang
 * @Date 2019/06/20 18:21
 * @Version 1.0
 * @Description:
 **/
public interface UserInfoService {
    /**
     * @param pageNum
     * @param pageSize
     * @return com.app.mysell.common.model.ReturnInfo<com.github.pagehelper.PageInfo<com.app.mysell.entity.UserInfoEntity>>
     * @author shaobin.wang
     * @date 2019/06/20 18:24
     * @description
     */
    PageInfo<UserInfoEntity> selectUserInfoPage(int pageNum, int pageSize);
}
