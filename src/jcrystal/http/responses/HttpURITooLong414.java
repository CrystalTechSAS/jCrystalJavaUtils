/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpURITooLong414 extends HttpResponseException{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5365722415145242711L;
	public HttpURITooLong414(String content) {
		super(414, content);
	}
	public HttpURITooLong414() {
		super(414, null);
	}
}
