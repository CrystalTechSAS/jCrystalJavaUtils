/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.errors;

import jcrystal.utils.InternalException;

public class InfoException extends InternalException{
	
	private static final long serialVersionUID = 1L;
	
	public InfoException(String mensaje) {
		super(0, mensaje);
	}
	public InfoException(int code, String mensaje) {
		super(code%100, mensaje);
	}
	public InfoException(int code, Exception ex) {
		super(code, ex);
	}
	public InfoException(int code, String mensaje, Exception ex) {
		super(code, mensaje, ex);
	}
	
}
