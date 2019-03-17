/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpLocked423 extends HttpResponseException{
	public HttpLocked423(String content) {
		super(423, content);
	}
	public HttpLocked423() {
		super(423, null);
	}
}
