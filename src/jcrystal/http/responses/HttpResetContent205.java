/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpResetContent205 extends HttpResponseException{
	public HttpResetContent205(String content) {
		super(205, content);
	}
	public HttpResetContent205() {
		super(205, null);
	}
}
