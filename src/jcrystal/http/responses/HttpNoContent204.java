/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpNoContent204 extends HttpResponseException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7614670014843404844L;
	public HttpNoContent204(String content) {
		super(204, content);
	}
	public HttpNoContent204() {
		super(204, null);
	}
}
