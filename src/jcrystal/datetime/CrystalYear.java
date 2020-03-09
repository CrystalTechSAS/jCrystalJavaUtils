package jcrystal.datetime;
public class CrystalYear extends AbsCrystalDate<CrystalYear>{
	public CrystalYear(String text)throws java.text.ParseException{
		super(DateType.YEAR.FORMAT.parse(text));
	}
	public CrystalYear(long time){
		super(new java.util.Date(time));
	}
	@Override public CrystalYear create(long time){
		return new CrystalYear(time);
	}
	public CrystalYear(){
		super(new java.util.Date());
	}
	@Override public String format(){
		return DateType.YEAR.FORMAT.format(date);
	}
	public static String format(java.util.Date date){
		return DateType.YEAR.FORMAT.format(date);
	}
	@Override public CrystalYear next(){
		return add(java.util.GregorianCalendar.YEAR, 1);
	}
	@Override public CrystalYear prev(){
		return add(java.util.GregorianCalendar.YEAR, -1);
	}
	public static CrystalYear currentYear(){
		return new CrystalYear(CrystalDateUtils.currentYear().getTimeInMillis());
	}
}
