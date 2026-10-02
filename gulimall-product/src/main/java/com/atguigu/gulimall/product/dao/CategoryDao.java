package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类表;商品三级分类
 * 
 * @author bangbangxie
 * @email bangbangxie@hotmail.com
 * @date 2026-09-30 17:59:33
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
