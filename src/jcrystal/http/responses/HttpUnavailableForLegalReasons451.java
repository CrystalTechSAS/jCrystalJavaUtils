/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpUnavailableForLegalReasons451 extends HttpResponseException{
	public HttpUnavailableForLegalReasons451(String content) {
		super(451, content);
	}
	public HttpUnavailableForLegalReasons451() {
		super(451, null);
	}
}
