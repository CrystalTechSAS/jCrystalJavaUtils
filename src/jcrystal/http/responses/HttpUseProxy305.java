/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpUseProxy305 extends HttpResponseException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8777082663895811837L;
	public HttpUseProxy305(String content) {
		super(305, content);
	}
	public HttpUseProxy305() {
		super(305, null);
	}
}
