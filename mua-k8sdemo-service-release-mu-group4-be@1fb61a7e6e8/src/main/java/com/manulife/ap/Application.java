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

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.function.context.config.ContextFunctionCatalogAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * Entry point for reactive Java application.
 * Supports caching by default.
 * 
 * @author himanshu sharma
 * @since January 2019
 */

@EnableCaching
@EnableDiscoveryClient
@ImportResource("classpath:service-config.xml")
@ComponentScan(basePackages = "com.manulife.ap")
@SpringBootApplication
public class Application{
	/**
	 * Application start point.
	 * @param args
	 */
	public static void main(String[] args){
		SpringApplication.run(Application.class, args);		
	}
}
