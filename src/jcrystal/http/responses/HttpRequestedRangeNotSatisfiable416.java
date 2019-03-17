/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpRequestedRangeNotSatisfiable416 extends HttpResponseException{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2610531005359303228L;
	public HttpRequestedRangeNotSatisfiable416(String content) {
		super(416, content);
	}
	public HttpRequestedRangeNotSatisfiable416() {
		super(416, null);
	}
}
