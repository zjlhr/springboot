package com.lhr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * SwaggerConfig
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).groupName("swagger2-demo测试").select()
				.apis(RequestHandlerSelectors.basePackage("com.lhr.server.controller")).paths(PathSelectors.any()).build();

	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("SpringBoot学习demo").contact(new Contact("张杰", "", "")).version("1.0")
				.description("swagger2-demo测试1").build();

	}

	/**
	 * 可以定义多个组，比如本类中定义把test和demo区分开了 （访问页面就可以看到效果了）
	 *
	 */
	// @Bean
	// public Docket testApi() {
	// return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
	// .apis(RequestHandlerSelectors.basePackage("com.zj.controller")).paths(PathSelectors.any()).build();
	// }
	//
	// private ApiInfo apiInfo() {
	// ApiInfo apiInfo = new ApiInfo("SpringBoot学习demo", // 大标题
	// "Spring boot + swagger + mybatis + druid", // 小标题
	// "1.0", // 版本
	// "NO terms of service", "admin@raye.wang", // 作者
	// "RayeBlog", // 链接显示文字
	// "http://www.raye.wang/"// 网站链接
	// );
	//
	// return apiInfo;
	// }
}
