/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpPreconditionRequired428 extends HttpResponseException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6557063927356891185L;
	public HttpPreconditionRequired428(String content) {
		super(428, content);
	}
	public HttpPreconditionRequired428() {
		super(428, null);
	}
}
