package com.app.mysell.dao;

import com.app.mysell.entity.ProductInfoEntity;
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
public interface ProductInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ProductInfoEntity record);

    int insertSelective(ProductInfoEntity record);

    ProductInfoEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ProductInfoEntity record);

    int updateByPrimaryKey(ProductInfoEntity record);
}