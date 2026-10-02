package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息;订单项信息
 * 
 * @author bangbangxie
 * @email bangbangxie@hotmail.com
 * @date 2026-10-01 10:08:24
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
