/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpLoopDetected508 extends HttpResponseException{
	public HttpLoopDetected508(String content) {
		super(508, content);
	}
	public HttpLoopDetected508() {
		super(508, null);
	}
}
