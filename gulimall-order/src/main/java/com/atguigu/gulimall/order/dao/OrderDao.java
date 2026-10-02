package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单表;订单
 * 
 * @author bangbangxie
 * @email bangbangxie@hotmail.com
 * @date 2026-10-01 10:08:24
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
