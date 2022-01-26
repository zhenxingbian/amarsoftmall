package com.amarsoft.mall.coupon.dao;

import com.amarsoft.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zxbian
 * @email zxbian@12345678.com
 * @date 2022-01-06 18:40:32
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
