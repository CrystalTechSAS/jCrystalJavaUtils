/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpConflict409 extends HttpResponseException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2876488692809139052L;
	public HttpConflict409(String content) {
		super(409, content);
	}
	public HttpConflict409() {
		super(409, null);
	}
}
