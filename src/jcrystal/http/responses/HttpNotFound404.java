/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpNotFound404 extends HttpResponseException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 112312312312L;
	public HttpNotFound404(String content) {
		super(404, content);
	}
	public HttpNotFound404() {
		super(404, null);
	}
}
