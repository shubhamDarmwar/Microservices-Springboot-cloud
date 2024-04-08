//package com.lightning.feignclients;
//
//import org.springframework.cloud.client.loadbalancer.LoadBalanced;
//import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
//import org.springframework.context.annotation.Bean;
//
//import feign.Feign;
//
//@LoadBalancerClient(value = "address-service")
//public class AddressLoadBalancer {
//	
//	@LoadBalanced
//	@Bean
//	public Feign.Builder feigBuilder(){
//		return Feign.builder();
//	}
//}
//

//// API gateway do the work of load balancing. We don't need to implement custom load balancer 