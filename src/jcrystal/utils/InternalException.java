/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.utils;

public class InternalException extends RuntimeException{
	/**
	*
	*/
	private static final long serialVersionUID = 7111184985492759212L;
	public final int code;
	public InternalException(int code, String mensaje){
		super(mensaje);
		this.code = code;
	}
	public InternalException(int code, Exception ex) {
		super(ex);
		this.code = code;
	}
	public InternalException(int code, String mensaje, Exception ex) {
		super(mensaje, ex);
		this.code = code;
	}
}
