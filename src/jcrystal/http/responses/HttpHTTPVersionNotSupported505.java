/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpHTTPVersionNotSupported505 extends HttpResponseException{
	public HttpHTTPVersionNotSupported505(String content) {
		super(505, content);
	}
	public HttpHTTPVersionNotSupported505() {
		super(505, null);
	}
}
