package jcrystal.datetime;
public class CrystalTimeSeconds extends AbsCrystalDate<CrystalTimeSeconds>{
	public CrystalTimeSeconds(String text)throws java.text.ParseException{
		super(DateType.TIME_SECONDS.FORMAT.parse(text));
	}
	public CrystalTimeSeconds(long time){
		super(new java.util.Date(time));
	}
	@Override public CrystalTimeSeconds create(long time){
		return new CrystalTimeSeconds(time);
	}
	public CrystalTimeSeconds(){
		super(new java.util.Date());
	}
	@Override public String format(){
		return DateType.TIME_SECONDS.FORMAT.format(date);
	}
	@Override public CrystalTimeSeconds next(){
		return add(java.util.GregorianCalendar.SECOND, 1);
	}
	@Override public CrystalTimeSeconds prev(){
		return add(java.util.GregorianCalendar.SECOND, -1);
	}
	public static CrystalTimeSeconds now(){
		return new CrystalTimeSeconds();
	}
}
