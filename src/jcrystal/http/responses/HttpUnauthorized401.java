/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpUnauthorized401 extends HttpResponseException{
	public HttpUnauthorized401(String content) {
		super(401, content);
	}
	public HttpUnauthorized401() {
		super(401, null);
	}
}
