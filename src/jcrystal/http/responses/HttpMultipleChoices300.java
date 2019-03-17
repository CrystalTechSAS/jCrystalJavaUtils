/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpMultipleChoices300 extends HttpResponseException{
	public HttpMultipleChoices300(String content) {
		super(300, content);
	}
	public HttpMultipleChoices300() {
		super(300, null);
	}
}
