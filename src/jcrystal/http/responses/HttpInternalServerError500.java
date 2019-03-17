/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpInternalServerError500 extends HttpResponseException{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2771722089969712752L;
	public HttpInternalServerError500(String content) {
		super(500, content);
	}
	public HttpInternalServerError500() {
		super(500, null);
	}
}
