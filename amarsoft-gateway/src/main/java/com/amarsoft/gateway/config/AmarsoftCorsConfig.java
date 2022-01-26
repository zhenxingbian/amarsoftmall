package com.amarsoft.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

/**
 * @author zxbian
 * @version 1.0
 * @date 2022/1/17 10:41
 */
@Configuration
public class AmarsoftCorsConfig {

    @Bean
    public CorsWebFilter corsWebFilter(){

        UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();

        CorsConfiguration corsConfiguration = new CorsConfiguration();

        corsConfiguration.addAllowedHeader("*");//允许哪些头
        corsConfiguration.addAllowedMethod("*");//允许哪些方法
        corsConfiguration.addAllowedOrigin("*");//允许哪些来源
        corsConfiguration.setAllowCredentials(true);//是否允许cookies

        urlBasedCorsConfigurationSource.registerCorsConfiguration("/**",corsConfiguration);

        return new CorsWebFilter(urlBasedCorsConfigurationSource);
    }

}
