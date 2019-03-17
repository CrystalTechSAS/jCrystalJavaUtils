/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpMultiStatus207 extends HttpResponseException{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5228239272947374267L;
	public HttpMultiStatus207(String content) {
		super(207, content);
	}
	public HttpMultiStatus207() {
		super(207, null);
	}
}
