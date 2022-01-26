package com.amarsoft.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.amarsoft.common.utils.PageUtils;
import com.amarsoft.mall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author zxbian
 * @email zxbian@12345678.com
 * @date 2022-01-06 18:40:33
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

