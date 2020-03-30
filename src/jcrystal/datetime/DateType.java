/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co>, December 2018
 */
package jcrystal.datetime;

import java.text.SimpleDateFormat;

public enum DateType {
	DATE_TIME("yyyyMMddHHmm", "dd/MM/yyyy HH:mm"),
	TIME("HHmm", "HH:mm"),
	DATE("yyyyMMddHHmm","dd/MM/yyyy"),
	MONTH("yyyyMMHHmm","MM/yyyy"),
	YEAR("yyyy","yyyy"),
	DATE_SECONDS("yyyyMMddHHmmss", "dd/MM/yyyy HH:mm"),
	TIME_SECONDS("HHmmss", "HH:mm:ss"),
	DATE_MILIS("yyyyMMddHHmmssSSS", "dd/MM/yyyy HH:mm"),
	TIME_MILIS("HHmmssSSS", "HH:mm:ss");
	
	public final SimpleDateFormat FORMAT;
	public final String format;
	public String userFormat;
	DateType(String format, String userFormat){
		FORMAT = new SimpleDateFormat(this.format = format);
		FORMAT.setTimeZone(CrystalDateUtils.DEFAULT_TIME_ZONE);
		this.userFormat = userFormat;
	}
}
