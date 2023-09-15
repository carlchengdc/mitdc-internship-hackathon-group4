/*************************************************************************
 * Manulife Financial Service CONFIDENTIAL
 * 
 *  All Rights Reserved.
 * 
 * NOTICE:  All information contained herein is, and remains
 * the property of Manulife Financial Services,
 * if any.  The intellectual and technical concepts contained
 * herein are proprietary to Manulife Financial Services
 * and its suppliers and may be covered by patents in process, 
 * and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Manulife Financial Services.
 */
package com.manulife.ap;

import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

/**
 * Provides programming hook to REST controller using Spring Boot WebFlux.
 * @author Himanshu Sharma
 */
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class ApplicationController {
	/**
	 * Provides hook to end point handlers.
	 * Replace handler::rest with respective needs.
	 * @param handler
	 * @return
	 */
	@Bean
	public RouterFunction<ServerResponse> route(ApplicationEndPointHandler handler) {
		return RouterFunctions
			.route(RequestPredicates.GET("/v1/your-service/ep1").and(RequestPredicates.accept(MediaType.APPLICATION_JSON)), handler::rest)
		 	.andRoute(RequestPredicates.GET("/v1/your-service/ep2").and(RequestPredicates.accept(MediaType.APPLICATION_JSON)), handler::rest);
	}	
}