/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpAccepted202 extends HttpResponseException{
	private static final long serialVersionUID = -8569413090557294518L;
	public HttpAccepted202(String content) {
		super(202, content);
	}
	public HttpAccepted202() {
		super(202, null);
	}
}
