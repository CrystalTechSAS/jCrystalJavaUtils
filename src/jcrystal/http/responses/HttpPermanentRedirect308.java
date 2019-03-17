/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpPermanentRedirect308 extends HttpResponseException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8897895479883408252L;
	public HttpPermanentRedirect308(String content) {
		super(308, content);
	}
	public HttpPermanentRedirect308() {
		super(308, null);
	}
}
