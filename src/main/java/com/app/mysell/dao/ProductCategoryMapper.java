package com.app.mysell.dao;

import com.app.mysell.entity.ProductCategoryEntity;
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
public interface ProductCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ProductCategoryEntity record);

    int insertSelective(ProductCategoryEntity record);

    ProductCategoryEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ProductCategoryEntity record);

    int updateByPrimaryKey(ProductCategoryEntity record);
}