package com.amarsoft.mall.product.dao;

import com.amarsoft.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zxbian
 * @email zxbian@12345678.com
 * @date 2022-01-06 10:20:43
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
