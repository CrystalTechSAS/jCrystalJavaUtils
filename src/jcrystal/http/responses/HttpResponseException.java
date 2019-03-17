/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.http.responses;

public class HttpResponseException extends NullPointerException{
	private int code;
	private String content; 
	
	public HttpResponseException(int code, String content) {
		this.code = code;
		this.content = content;
	}
	public int getCode() {
		return code;
	}
	public String getContent() {
		return content;
	}
}