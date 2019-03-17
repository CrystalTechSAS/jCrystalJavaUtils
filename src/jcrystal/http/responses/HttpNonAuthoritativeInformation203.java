/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpNonAuthoritativeInformation203 extends HttpResponseException{
	public HttpNonAuthoritativeInformation203(String content) {
		super(203, content);
	}
	public HttpNonAuthoritativeInformation203() {
		super(203, null);
	}
}
