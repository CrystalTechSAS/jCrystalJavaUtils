package jcrystal.datetime;

import java.util.GregorianCalendar;

public abstract class AbsCrystalDate<T extends AbsCrystalDate<?>> {
	
	public static final java.text.SimpleDateFormat SDF_SIMPLE_TIME = new java.text.SimpleDateFormat("HH:mm");
	public static final java.text.SimpleDateFormat SDF_SIMPLE_DATE = new java.text.SimpleDateFormat("dd/MM/yyyy");
	public static final java.text.SimpleDateFormat SDF_SIMPLE_DATE_TEXT = new java.text.SimpleDateFormat("dd MMM yyyy");
	public static final java.text.SimpleDateFormat SDF_SIMPLE_DATE_TIME = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm");
	
	protected final java.util.Date date;
	
	public AbsCrystalDate(java.util.Date date) {
		this.date = date;
	}
	
	public java.util.Date toDate(){
		return date;
	}
	
	public abstract T create(long time);
	public abstract T next();
	public abstract T prev();
	public abstract String format();
	
	public T add(int field, int value){
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(date);
		gc.add(field, value);
		return create(gc.getTimeInMillis());
	}
	public T add(long time){
		return create(date.getTime() + time);
	}
	public static java.util.Date toDate(AbsCrystalDate<?> cDate){
		return cDate == null ? null : cDate.date;
	}
}
