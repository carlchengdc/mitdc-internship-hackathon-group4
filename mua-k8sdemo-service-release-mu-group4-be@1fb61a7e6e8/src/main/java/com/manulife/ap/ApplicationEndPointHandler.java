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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

/**
 * Class to handle callbacks from Controller class.
 * @author hsharma
 */
@Component
public class ApplicationEndPointHandler {
	final static Logger logger = LoggerFactory.getLogger(ApplicationEndPointHandler.class);
	
	/**
	 * Function that returns Mono<> with string data.
	 * @param request : HTTP Payload from client
	 * @return Mono<ServerResponse>

	 */
	public Mono<ServerResponse> rest(ServerRequest request) {
		logger.info("send response");
		return ServerResponse
			.ok()
			.contentType(MediaType.APPLICATION_JSON)
			.body(BodyInserters.fromObject("simple strings"));
	}
}
