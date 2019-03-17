/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpNotModified304 extends HttpResponseException{
	public HttpNotModified304(String content) {
		super(304, content);
	}
	public HttpNotModified304() {
		super(304, null);
	}
}
