package com.atguigu.gulimall.ware.service;

import com.atguigu.common.utils.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gulimall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存表;商品库存
 *
 * @author bangbangxie
 * @email bangbangxie@hotmail.com
 * @date 2026-10-01 10:09:37
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

