/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.entity.types;

public class LongText {
	public final String text;
	public LongText(String text) {
		this.text = text;
	}
	@Override
	public String toString() {
		return text;
	}
	public static LongText create(String val) {
		if(val == null)
			return null;
		return new LongText(val);
	}
}
