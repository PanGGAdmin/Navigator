package com.example;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableTransactionManagement
public class NavigatorApplication extends WebMvcConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication.run(NavigatorApplication.class, args);
	}

	/**
	 * 设置json为fastjson
	 * @param converters
	 * rs
	 */
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		super.configureMessageConverters(converters);
		FastJsonHttpMessageConverter oFastConverter = new FastJsonHttpMessageConverter();

		FastJsonConfig oFastJsonConfig = new FastJsonConfig();
		oFastJsonConfig.setSerializerFeatures(
				SerializerFeature.PrettyFormat
		);
		oFastConverter.setFastJsonConfig(oFastJsonConfig);
		//设置编码格式
		List<MediaType> oFastMediaTypeList = new ArrayList<>();
		oFastMediaTypeList.add(MediaType.APPLICATION_JSON_UTF8);
		oFastConverter.setSupportedMediaTypes(oFastMediaTypeList);

		converters.add(oFastConverter);
	}

	/**
	 * 设置跨域
	 * @param registry
	 */
	@Override
	public void addCorsMappings(CorsRegistry registry) {

		registry.addMapping("*//**")
				.allowCredentials(true)
				.allowedHeaders("*")
				.allowedOrigins("*")
				.allowedMethods("*");

	}
}
