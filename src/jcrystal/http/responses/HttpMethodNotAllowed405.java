/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpMethodNotAllowed405 extends HttpResponseException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4126903927078324872L;
	public HttpMethodNotAllowed405(String content) {
		super(405, content);
	}
	public HttpMethodNotAllowed405() {
		super(405, null);
	}
}
