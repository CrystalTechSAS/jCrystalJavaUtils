/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpUnprocessableEntity422 extends HttpResponseException{
	public HttpUnprocessableEntity422(String content) {
		super(422, content);
	}
	public HttpUnprocessableEntity422() {
		super(422, null);
	}
}
