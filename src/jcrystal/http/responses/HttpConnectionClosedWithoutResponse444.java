/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpConnectionClosedWithoutResponse444 extends HttpResponseException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7462605681626968392L;
	public HttpConnectionClosedWithoutResponse444(String content) {
		super(444, content);
	}
	public HttpConnectionClosedWithoutResponse444() {
		super(444, null);
	}
}
