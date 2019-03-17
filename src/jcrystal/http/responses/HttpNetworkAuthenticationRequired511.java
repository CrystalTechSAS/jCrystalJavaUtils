/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpNetworkAuthenticationRequired511 extends HttpResponseException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6607710340922674084L;
	public HttpNetworkAuthenticationRequired511(String content) {
		super(511, content);
	}
	public HttpNetworkAuthenticationRequired511() {
		super(511, null);
	}
}
