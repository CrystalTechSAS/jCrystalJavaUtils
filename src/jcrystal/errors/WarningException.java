/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.errors;

import jcrystal.utils.InternalException;

public class WarningException extends InternalException{
	
	private static final long serialVersionUID = 1L;
	
	public WarningException(String mensaje) {
		super(100, mensaje);
	}
	public WarningException(int code, String mensaje) {
		super(code%100 + 100, mensaje);
	}
	
}
