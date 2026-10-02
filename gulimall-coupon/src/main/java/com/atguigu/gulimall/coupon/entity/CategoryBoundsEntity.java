package com.atguigu.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品分类积分设置;商品分类积分设置
 * 
 * @author bangbangxie
 * @email bangbangxie@hotmail.com
 * @date 2026-10-01 10:11:15
 */
@Data
@TableName("sms_category_bounds")
public class CategoryBoundsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * category_id
	 */
	private Long categoryId;
	/**
	 * 成长积分倍率;成长积分
	 */
	private BigDecimal growBounds;
	/**
	 * 购物积分倍率;购物积分
	 */
	private BigDecimal buyBounds;
	/**
	 * 优惠生效情况;优惠生效情况[1111（四个状态位，从右到左）;0 - 无优惠，成长积分是否赠送;1 - 无优惠，购物积分是否赠送;2 - 有优惠，成长积分是否赠送;3 - 有优惠，购物积分是否赠送【状态位0：不赠送，1：赠送】]
	 */
	private Integer work;

}
