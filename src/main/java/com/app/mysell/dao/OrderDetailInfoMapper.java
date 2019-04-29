package com.app.mysell.dao;

import com.app.mysell.entity.OrderDetailInfoEntity;
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
public interface OrderDetailInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderDetailInfoEntity record);

    int insertSelective(OrderDetailInfoEntity record);

    OrderDetailInfoEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderDetailInfoEntity record);

    int updateByPrimaryKey(OrderDetailInfoEntity record);
}