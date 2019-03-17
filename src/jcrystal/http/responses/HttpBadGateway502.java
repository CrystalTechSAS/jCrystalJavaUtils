/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpBadGateway502 extends HttpResponseException{
	public HttpBadGateway502(String content) {
		super(502, content);
	}
	public HttpBadGateway502() {
		super(502, null);
	}
}
