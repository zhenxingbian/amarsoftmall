package com.amarsoft.mall.member.dao;

import com.amarsoft.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zxbian
 * @email zxbian@12345678.com
 * @date 2022-01-06 18:42:59
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
