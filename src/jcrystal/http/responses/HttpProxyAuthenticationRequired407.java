/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpProxyAuthenticationRequired407 extends HttpResponseException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8102909193428513029L;
	public HttpProxyAuthenticationRequired407(String content) {
		super(407, content);
	}
	public HttpProxyAuthenticationRequired407() {
		super(407, null);
	}
}
