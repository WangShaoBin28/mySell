package com.app.mysell.dao;

import com.app.mysell.entity.CommentInfoEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Package ${PACKAGE_NAME}
 * @ClassName  ${NAME}
 * @Author shaobin.wang
 * @Date  2019/04/29 17:13
 * @Version 1.0
 * @Description:  
 **/
@Repository
@Mapper
public interface CommentInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CommentInfoEntity record);

    int insertSelective(CommentInfoEntity record);

    CommentInfoEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommentInfoEntity record);

    int updateByPrimaryKey(CommentInfoEntity record);
}