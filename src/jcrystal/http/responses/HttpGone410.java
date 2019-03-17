/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpGone410 extends HttpResponseException{
	public HttpGone410(String content) {
		super(410, content);
	}
	public HttpGone410() {
		super(410, null);
	}
}
