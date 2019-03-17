/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpForbidden403 extends HttpResponseException{
	public HttpForbidden403(String content) {
		super(403, content);
	}
	public HttpForbidden403() {
		super(403, null);
	}
}
