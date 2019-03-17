/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpLengthRequired411 extends HttpResponseException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8964878780552782789L;
	public HttpLengthRequired411(String content) {
		super(411, content);
	}
	public HttpLengthRequired411() {
		super(411, null);
	}
}
