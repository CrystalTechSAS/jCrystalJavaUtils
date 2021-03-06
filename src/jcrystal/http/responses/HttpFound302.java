/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpFound302 extends HttpResponseException{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1676569196451548361L;
	public HttpFound302(String content) {
		super(302, content);
	}
	public HttpFound302() {
		super(302, null);
	}
}
