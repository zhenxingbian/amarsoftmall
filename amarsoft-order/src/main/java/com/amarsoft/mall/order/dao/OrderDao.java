package com.amarsoft.mall.order.dao;

import com.amarsoft.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zxbian
 * @email zxbian@12345678.com
 * @date 2022-01-06 16:50:09
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
