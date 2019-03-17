/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpTemporaryRedirect307 extends HttpResponseException{
	public HttpTemporaryRedirect307(String content) {
		super(307, content);
	}
	public HttpTemporaryRedirect307() {
		super(307, null);
	}
}
