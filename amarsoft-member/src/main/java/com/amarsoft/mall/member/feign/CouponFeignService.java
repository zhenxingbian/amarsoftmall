package com.amarsoft.mall.member.feign;

import com.amarsoft.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zxbian
 * @version 1.0
 * @date 2022/1/7 10:42
 */
@FeignClient(name = "amarsoft-coupon")
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/info/{id}")
    public R info(@PathVariable("id") Long id);
}
