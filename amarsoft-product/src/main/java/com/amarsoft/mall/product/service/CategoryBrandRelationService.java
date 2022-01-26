package com.amarsoft.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.amarsoft.common.utils.PageUtils;
import com.amarsoft.mall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author zxbian
 * @email zxbian@12345678.com
 * @date 2022-01-06 10:20:43
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

