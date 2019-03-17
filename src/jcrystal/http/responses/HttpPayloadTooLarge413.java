/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpPayloadTooLarge413 extends HttpResponseException{
	public HttpPayloadTooLarge413(String content) {
		super(413, content);
	}
	public HttpPayloadTooLarge413() {
		super(413, null);
	}
}
