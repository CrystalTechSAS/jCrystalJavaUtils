/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpInsufficientStorage507 extends HttpResponseException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3147378768858486913L;
	public HttpInsufficientStorage507(String content) {
		super(507, content);
	}
	public HttpInsufficientStorage507() {
		super(507, null);
	}
}
