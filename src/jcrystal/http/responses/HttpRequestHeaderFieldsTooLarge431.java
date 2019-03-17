/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpRequestHeaderFieldsTooLarge431 extends HttpResponseException{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3983943515608535769L;
	public HttpRequestHeaderFieldsTooLarge431(String content) {
		super(431, content);
	}
	public HttpRequestHeaderFieldsTooLarge431() {
		super(431, null);
	}
}
