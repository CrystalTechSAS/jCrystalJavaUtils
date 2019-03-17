/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpNotExtended510 extends HttpResponseException{
	public HttpNotExtended510(String content) {
		super(510, content);
	}
	public HttpNotExtended510() {
		super(510, null);
	}
}
