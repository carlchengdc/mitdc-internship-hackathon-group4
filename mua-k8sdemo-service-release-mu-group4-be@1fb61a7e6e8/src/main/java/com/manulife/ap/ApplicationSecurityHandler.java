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
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.security.web.server.util.matcher.ServerWebExchangeMatchers;

/**
 * @author Himanshu Sharma
 */
@Configuration
public class ApplicationSecurityHandler{
	
	/**
	 * Configuration handler to handle security for serivce.
	 * TODO: Need to configure as per your project needs. 
	 * @param http
	 * @return
	 */
	@Bean
	public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
		return http
				.authorizeExchange()
					.pathMatchers("/actuator/health/**","/actuator/info","/actuator/metrics/**")
					.permitAll()
					.and()
				.authorizeExchange()
					.pathMatchers("/**")
					.authenticated()
					.and()
				.formLogin()
					.and()
				.httpBasic()
					.and()
				.csrf()
					// disable csrf for actuator's endpoint otherwise they will be blocked
					.requireCsrfProtectionMatcher(
							ServerWebExchangeMatchers.pathMatchers("/actuator/**")::matches)
					.disable()
				.build();
	}
}
