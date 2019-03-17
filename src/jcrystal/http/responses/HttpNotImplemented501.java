/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpNotImplemented501 extends HttpResponseException{
	public HttpNotImplemented501(String content) {
		super(501, content);
	}
	public HttpNotImplemented501() {
		super(501, null);
	}
}
