/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpRequestTimeout408 extends HttpResponseException{
	/**
	 * 
	 */
	private static final long serialVersionUID = -99921931402962224L;
	public HttpRequestTimeout408(String content) {
		super(408, content);
	}
	public HttpRequestTimeout408() {
		super(408, null);
	}
}
