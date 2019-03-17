/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpUpgradeRequired426 extends HttpResponseException{
	/**
	 * 
	 */
	private static final long serialVersionUID = -742850691522936884L;
	public HttpUpgradeRequired426(String content) {
		super(426, content);
	}
	public HttpUpgradeRequired426() {
		super(426, null);
	}
}
