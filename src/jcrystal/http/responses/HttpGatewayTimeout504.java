/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpGatewayTimeout504 extends HttpResponseException{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7956736922443321133L;
	public HttpGatewayTimeout504(String content) {
		super(504, content);
	}
	public HttpGatewayTimeout504() {
		super(504, null);
	}
}
