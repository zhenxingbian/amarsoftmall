package com.amarsoft.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.amarsoft.common.utils.PageUtils;
import com.amarsoft.mall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * ้่ดงๅๅ 
 *
 * @author zxbian
 * @email zxbian@12345678.com
 * @date 2022-01-06 16:50:09
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

