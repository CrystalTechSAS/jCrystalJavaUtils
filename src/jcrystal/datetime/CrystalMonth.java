package jcrystal.datetime;
public class CrystalMonth extends AbsCrystalDate<CrystalMonth>{
	public CrystalMonth(String text)throws java.text.ParseException{
		super(DateType.MONTH.FORMAT.parse(text));
	}
	public CrystalMonth(long time){
		super(new java.util.Date(time));
	}
	@Override public CrystalMonth create(long time){
		return new CrystalMonth(time);
	}
	public CrystalMonth(){
		super(new java.util.Date());
	}
	@Override public String format(){
		return DateType.MONTH.FORMAT.format(date);
	}
	public static String format(java.util.Date date){
		return DateType.MONTH.FORMAT.format(date);
	}
	@Override public CrystalMonth next(){
		return add(java.util.GregorianCalendar.MONTH, 1);
	}
	@Override public CrystalMonth prev(){
		return add(java.util.GregorianCalendar.MONTH, -1);
	}
	public static CrystalMonth now(){
		return new CrystalMonth();
	}
	public static CrystalMonth currentMonth(){
		return new CrystalMonth(CrystalDateUtils.currentMonth().getTimeInMillis());
	}
	public static CrystalMonth currentYear(){
		return new CrystalMonth(CrystalDateUtils.currentYear().getTimeInMillis());
	}
}
