/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpUnsupportedMediaType415 extends HttpResponseException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5783736994202061253L;
	public HttpUnsupportedMediaType415(String content) {
		super(415, content);
	}
	public HttpUnsupportedMediaType415() {
		super(415, null);
	}
}
