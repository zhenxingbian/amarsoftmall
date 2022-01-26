package com.amarsoft.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.amarsoft.common.utils.PageUtils;
import com.amarsoft.mall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author zxbian
 * @email zxbian@12345678.com
 * @date 2022-01-06 17:17:34
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

