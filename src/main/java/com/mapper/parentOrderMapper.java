package com.mapper;

import java.util.ArrayList;
import java.util.Date;

import org.apache.ibatis.annotations.Param;

import com.domain.parentOrder;

public interface parentOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(parentOrder record);

    int insertSelective(parentOrder record);

    parentOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(parentOrder record);

    int updateByPrimaryKey(parentOrder record);
    
    parentOrder getOrderLock(Integer id);
    
    int updateOrderStatus(@Param("cartId")Integer cartId,@Param("status")Integer status);
    
    ArrayList<parentOrder> ListByUserId(Integer userId);
    
    int updateOrderStatus(@Param("date")Date date);
    
    ArrayList<parentOrder> ListBydate(@Param("date")Date date);
}