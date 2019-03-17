/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpSeeOther303 extends HttpResponseException{
	public HttpSeeOther303(String content) {
		super(303, content);
	}
	public HttpSeeOther303() {
		super(303, null);
	}
}
