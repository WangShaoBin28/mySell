package com.app.mysell.dao;

import com.app.mysell.entity.OrderMasterInfoEntity;
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
public interface OrderMasterInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderMasterInfoEntity record);

    int insertSelective(OrderMasterInfoEntity record);

    OrderMasterInfoEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderMasterInfoEntity record);

    int updateByPrimaryKey(OrderMasterInfoEntity record);
}