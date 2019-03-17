/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpAlreadyReported208 extends HttpResponseException{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2310452000442747746L;
	public HttpAlreadyReported208(String content) {
		super(208, content);
	}
	public HttpAlreadyReported208() {
		super(208, null);
	}
}
