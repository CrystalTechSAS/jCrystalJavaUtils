/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpFailedDependency424 extends HttpResponseException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5111484282643850415L;
	public HttpFailedDependency424(String content) {
		super(424, content);
	}
	public HttpFailedDependency424() {
		super(424, null);
	}
}
