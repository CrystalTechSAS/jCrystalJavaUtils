/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;
public class HttpPaymentRequired402 extends HttpResponseException{
	public HttpPaymentRequired402(String content) {
		super(402, content);
	}
	public HttpPaymentRequired402() {
		super(402, null);
	}
}
