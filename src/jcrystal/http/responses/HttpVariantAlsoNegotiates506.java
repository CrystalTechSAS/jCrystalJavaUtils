/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpVariantAlsoNegotiates506 extends HttpResponseException{
	public HttpVariantAlsoNegotiates506(String content) {
		super(506, content);
	}
	public HttpVariantAlsoNegotiates506() {
		super(506, null);
	}
}
