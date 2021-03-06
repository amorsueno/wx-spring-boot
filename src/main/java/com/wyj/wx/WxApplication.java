package com.wyj.wx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.EnableTransactionManagement;
/**
 * @Author:amorsueno
 * @Description:
 * @Date: 2017/11/16 17:23
 *
 */
@SpringBootApplication
@ServletComponentScan
@EnableTransactionManagement // 开始事务支持
public class WxApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(WxApplication.class, args);
	}


	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(WxApplication.class);
	}

	@Bean
	public EmbeddedServletContainerCustomizer containerCustomizer(){
		return (container -> {
			ErrorPage error401Page = new ErrorPage(HttpStatus.UNAUTHORIZED,"/401.html");
			ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND,"/404.html");
			ErrorPage error500Page = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR,"/500.html");
			container.addErrorPages(error401Page,error404Page,error500Page);
		});
	}
}
