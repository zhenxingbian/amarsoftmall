package com.amarsoft.mall.product;
import com.amarsoft.mall.product.entity.BrandEntity;
import com.amarsoft.mall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author zxbian
 * @version 1.0
 * @date 2022/1/6 14:18
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class productMainApplication {
    @Autowired
    BrandService brandService;

    @Test
    public void  contextLoads(){
        BrandEntity brandEntity = new BrandEntity();

        brandEntity.setName("hahaha");

        brandService.save(brandEntity);

        System.out.println("保存成功！");
    }

}
