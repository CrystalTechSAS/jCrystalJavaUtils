/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpNotAcceptable406 extends HttpResponseException{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7037941355572937943L;
	public HttpNotAcceptable406(String content) {
		super(406, content);
	}
	public HttpNotAcceptable406() {
		super(406, null);
	}
}
