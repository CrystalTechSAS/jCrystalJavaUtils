/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpServiceUnavailable503 extends HttpResponseException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 115127883495649041L;
	public HttpServiceUnavailable503(String content) {
		super(503, content);
	}
	public HttpServiceUnavailable503() {
		super(503, null);
	}
}
