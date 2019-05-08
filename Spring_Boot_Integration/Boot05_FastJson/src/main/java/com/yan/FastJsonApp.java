package com.yan;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;

@SpringBootApplication
public class FastJsonApp /*extends WebMvcConfigurerAdapter */{

    @Bean
    public HttpMessageConverters Fast(){
        //创建fastjson消息转换器
        FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
        //配置
        FastJsonConfig config = new FastJsonConfig();
        //对json数据格式化
        config.setSerializerFeatures(SerializerFeature.PrettyFormat);
        converter.setFastJsonConfig(config);
        HttpMessageConverter<?> converters = converter;
        return new HttpMessageConverters(converters);
    }

    /**
     * 消息转换 第一中方法继承
     * {@inheritDoc}
     * <p>This implementation is empty.
     */
  /*  @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        //创建fastjson消息转换器
        FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
        //配置
        FastJsonConfig config = new FastJsonConfig();
        //对json数据格式化
        config.setSerializerFeatures(SerializerFeature.PrettyFormat);
        converter.setFastJsonConfig(config);
        converters.add(converter);
    }*/


    public static void main(String[] args) {
        SpringApplication.run(FastJsonApp.class);
    }
}
