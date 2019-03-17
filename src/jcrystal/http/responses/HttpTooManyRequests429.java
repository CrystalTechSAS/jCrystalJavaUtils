/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpTooManyRequests429 extends HttpResponseException{
	public HttpTooManyRequests429(String content) {
		super(429, content);
	}
	public HttpTooManyRequests429() {
		super(429, null);
	}
}
