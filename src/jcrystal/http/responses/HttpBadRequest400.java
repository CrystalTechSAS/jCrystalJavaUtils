/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpBadRequest400 extends HttpResponseException{
	public HttpBadRequest400(String content) {
		super(400, content);
	}
	public HttpBadRequest400() {
		super(400, null);
	}
}
