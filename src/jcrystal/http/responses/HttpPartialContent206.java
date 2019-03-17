/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpPartialContent206 extends HttpResponseException{
	public HttpPartialContent206(String content) {
		super(206, content);
	}
	public HttpPartialContent206() {
		super(206, null);
	}
}
