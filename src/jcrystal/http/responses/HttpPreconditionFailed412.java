/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpPreconditionFailed412 extends HttpResponseException{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8239600016094910944L;
	public HttpPreconditionFailed412(String content) {
		super(412, content);
	}
	public HttpPreconditionFailed412() {
		super(412, null);
	}
}
