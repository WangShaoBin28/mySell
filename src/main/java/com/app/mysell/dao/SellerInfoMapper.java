package com.app.mysell.dao;

import com.app.mysell.entity.SellerInfoEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

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
public interface SellerInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SellerInfoEntity record);

    int insertSelective(SellerInfoEntity record);

    SellerInfoEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SellerInfoEntity record);

    int updateByPrimaryKey(SellerInfoEntity record);
}