/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpMisdirectedRequest421 extends HttpResponseException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8314031620814888312L;
	public HttpMisdirectedRequest421(String content) {
		super(421, content);
	}
	public HttpMisdirectedRequest421() {
		super(421, null);
	}
}
