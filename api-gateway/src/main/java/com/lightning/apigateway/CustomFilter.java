package com.lightning.apigateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Configuration
public class CustomFilter implements GlobalFilter{

	Logger logger = LoggerFactory.getLogger(CustomFilter.class);
	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		// TODO Auto-generated method stub
		
		ServerHttpRequest request = exchange.getRequest();
//		request.getHeaders().getFirst("AAuthentication")
		logger.info("pre filter");
		return chain.filter(exchange).then(Mono.fromRunnable(() -> {
//			ServerHttpResponse response =  exchange.getResponse().getStatusCode();
			logger.info("Post filter");
		}));
	}
	
}
