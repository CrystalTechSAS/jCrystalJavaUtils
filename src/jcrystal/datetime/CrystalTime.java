package jcrystal.datetime;
public class CrystalTime extends AbsCrystalDate<CrystalTime>{
	public CrystalTime(String text)throws java.text.ParseException{
		super(DateType.TIME.FORMAT.parse(text));
	}
	public CrystalTime(long time){
		super(new java.util.Date(time));
	}
	@Override public CrystalTime create(long time){
		return new CrystalTime(time);
	}
	public CrystalTime(){
		super(new java.util.Date());
	}
	@Override public String format(){
		return DateType.TIME.FORMAT.format(date);
	}
	public static String format(java.util.Date date){
		return DateType.TIME.FORMAT.format(date);
	}
	@Override public CrystalTime next(){
		return add(java.util.GregorianCalendar.MINUTE, 1);
	}
	@Override public CrystalTime prev(){
		return add(java.util.GregorianCalendar.MINUTE, -1);
	}
	public static CrystalTime now(){
		return new CrystalTime();
	}
}
