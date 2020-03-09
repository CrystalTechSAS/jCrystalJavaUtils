/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co>, December 2018
 */
package jcrystal.datetime;

import java.util.GregorianCalendar;
import java.util.TimeZone;

public class CrystalDateUtils {
	public static final TimeZone UTC = TimeZone.getTimeZone("UTC");
	public static final TimeZone GMT_5 = TimeZone.getTimeZone("GMT-05:00");
	
	public static TimeZone DEFAULT_TIME_ZONE = UTC;
	
	public static GregorianCalendar now(){
		return new GregorianCalendar();
	}
	public static GregorianCalendar today(){
		GregorianCalendar gc = new GregorianCalendar(UTC);
		gc.set(GregorianCalendar.HOUR_OF_DAY, 0);
		gc.set(GregorianCalendar.MINUTE, 0);
		gc.set(GregorianCalendar.MILLISECOND, 0);
		return gc;
	}
	public static GregorianCalendar today(TimeZone time){
		GregorianCalendar gc = new GregorianCalendar(time);
		gc.set(GregorianCalendar.HOUR_OF_DAY, 0);
		gc.set(GregorianCalendar.MINUTE, 0);
		gc.set(GregorianCalendar.MILLISECOND, 0);
		return gc;
	}
	public static GregorianCalendar currentMonth(){
		GregorianCalendar gc = new GregorianCalendar(UTC);
		gc.set(GregorianCalendar.HOUR_OF_DAY, 0);
		gc.set(GregorianCalendar.MINUTE, 0);
		gc.set(GregorianCalendar.MILLISECOND, 0);
		gc.set(GregorianCalendar.DAY_OF_MONTH, 1);
		return gc;
	}
	public static GregorianCalendar currentMonth(TimeZone time){
		GregorianCalendar gc = new GregorianCalendar(time);
		gc.set(GregorianCalendar.HOUR_OF_DAY, 0);
		gc.set(GregorianCalendar.MINUTE, 0);
		gc.set(GregorianCalendar.MILLISECOND, 0);
		gc.set(GregorianCalendar.DAY_OF_MONTH, 1);
		return gc;
	}
	public static GregorianCalendar currentYear(){
		GregorianCalendar gc = new GregorianCalendar(UTC);
		gc.set(GregorianCalendar.HOUR_OF_DAY, 0);
		gc.set(GregorianCalendar.MINUTE, 0);
		gc.set(GregorianCalendar.MILLISECOND, 0);
		gc.set(GregorianCalendar.DAY_OF_YEAR, 1);
		gc.set(GregorianCalendar.MONTH, GregorianCalendar.JANUARY);
		return gc;
	}
	public static GregorianCalendar currentYear(TimeZone time){
		GregorianCalendar gc = new GregorianCalendar(time);
		gc.set(GregorianCalendar.HOUR_OF_DAY, 0);
		gc.set(GregorianCalendar.MINUTE, 0);
		gc.set(GregorianCalendar.MILLISECOND, 0);
		gc.set(GregorianCalendar.DAY_OF_YEAR, 1);
		gc.set(GregorianCalendar.MONTH, GregorianCalendar.JANUARY);
		return gc;
	}
	public static GregorianCalendar currentWeek(){
		GregorianCalendar gc = new GregorianCalendar(UTC);
		gc.set(GregorianCalendar.HOUR_OF_DAY, 0);
		gc.set(GregorianCalendar.MINUTE, 0);
		gc.set(GregorianCalendar.MILLISECOND, 0);
		gc.set(GregorianCalendar.DAY_OF_WEEK, 0);
		return gc;
	}
	
}
