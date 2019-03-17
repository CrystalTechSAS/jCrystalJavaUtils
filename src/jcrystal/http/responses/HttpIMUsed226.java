/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpIMUsed226 extends HttpResponseException{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6671293924024009394L;
	public HttpIMUsed226(String content) {
		super(226, content);
	}
	public HttpIMUsed226() {
		super(226, null);
	}
}
