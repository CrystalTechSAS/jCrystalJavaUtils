/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.datetime;
import java.util.*;
import java.text.ParseException;
public class CrystalDateTime{
	public static final java.text.SimpleDateFormat SDF = new java.text.SimpleDateFormat("yyyyMMddHHmm");
	static {SDF.setTimeZone(TimeZone.getTimeZone("UTC"));}
	private final java.util.Date date;
	public CrystalDateTime(String text)throws ParseException{
		date = SDF.parse(text);
	}
	public CrystalDateTime(long time){
		date = new java.util.Date(time);
	}
	public CrystalDateTime(){
		date = new Date();
	}
	public String format(){
		return SDF.format(date);
	}
	public java.util.Date toDate(){
		return date;
	}
	public static java.util.Date toDate(CrystalDateTime cDate){
		return cDate == null ? null : cDate.date;
	}
	public static final java.text.SimpleDateFormat SDF_SIMPLE_TIME = new java.text.SimpleDateFormat("HH:mm");
	public static final java.text.SimpleDateFormat SDF_SIMPLE_DATE = new java.text.SimpleDateFormat("dd/MM/yyyy");
	public static final java.text.SimpleDateFormat SDF_SIMPLE_DATE_TEXT = new java.text.SimpleDateFormat("dd MMM yyyy");
	public static final java.text.SimpleDateFormat SDF_SIMPLE_DATE_TIME = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm");
	public static CrystalDateTime now(){
		return new CrystalDateTime(System.currentTimeMillis());
	}
	public static CrystalDateTime today(){
		GregorianCalendar gc = new GregorianCalendar();
		gc.set(GregorianCalendar.HOUR_OF_DAY, 0);
		gc.set(GregorianCalendar.MINUTE, 0);
		gc.set(GregorianCalendar.MILLISECOND, 0);
		return new CrystalDateTime(gc.getTimeInMillis());
	}
	public static CrystalDateTime toMonth(){
		GregorianCalendar gc = new GregorianCalendar();
		gc.set(GregorianCalendar.HOUR_OF_DAY, 0);
		gc.set(GregorianCalendar.MINUTE, 0);
		gc.set(GregorianCalendar.MILLISECOND, 0);
		gc.set(GregorianCalendar.DAY_OF_MONTH, 1);
		return new CrystalDateTime(gc.getTimeInMillis());
	}
	public static CrystalDateTime toWeek(){
		GregorianCalendar gc = new GregorianCalendar();
		gc.set(GregorianCalendar.HOUR_OF_DAY, 0);
		gc.set(GregorianCalendar.MINUTE, 0);
		gc.set(GregorianCalendar.MILLISECOND, 0);
		gc.set(GregorianCalendar.DAY_OF_WEEK, 0);
		return new CrystalDateTime(gc.getTimeInMillis());
	}
	public CrystalDateTime add(int field, int value){
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(date);
		gc.add(field, value);
		return new CrystalDateTime(gc.getTimeInMillis());
	}
	public CrystalDateTime add(long time){
		return new CrystalDateTime(date.getTime() + time);
	}
}
