package com.example.feignbackend;

import org.springframework.context.annotation.Configuration;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class SpaceStationClientInterceptor implements RequestInterceptor {
	@Override
	public void apply(final RequestTemplate template) {
		template.header("myheaderkey", "myvar1");
		log.warn("### we are using a custom interceptor");
	}
}
