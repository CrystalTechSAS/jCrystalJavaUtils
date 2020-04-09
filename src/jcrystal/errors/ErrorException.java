/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.errors;

import jcrystal.utils.InternalException;

public class ErrorException extends InternalException{
	
	private static final long serialVersionUID = 1L;
	
	public ErrorException(String mensaje) {
		super(200, mensaje);
	}
	public ErrorException(int code, String mensaje) {
		super(code%100 + 200, mensaje);
	}
	public ErrorException(int code, Exception ex) {
		super(code, ex);
	}
	public ErrorException(int code, String mensaje, Exception ex) {
		super(code, mensaje, ex);
	}
	
}
