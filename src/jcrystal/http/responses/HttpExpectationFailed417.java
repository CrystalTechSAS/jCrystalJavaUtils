/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpExpectationFailed417 extends HttpResponseException{
	public HttpExpectationFailed417(String content) {
		super(417, content);
	}
	public HttpExpectationFailed417() {
		super(417, null);
	}
}
