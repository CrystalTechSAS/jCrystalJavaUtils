package jcrystal.datetime;
public class CrystalDateSeconds extends AbsCrystalDate<CrystalDateSeconds>{
	public CrystalDateSeconds(String text)throws java.text.ParseException{
		super(DateType.DATE_SECONDS.FORMAT.parse(text));
	}
	public CrystalDateSeconds(long time){
		super(new java.util.Date(time));
	}
	@Override public CrystalDateSeconds create(long time){
		return new CrystalDateSeconds(time);
	}
	public CrystalDateSeconds(){
		super(new java.util.Date());
	}
	@Override public String format(){
		return DateType.DATE_SECONDS.FORMAT.format(date);
	}
	public static String format(java.util.Date date){
		return DateType.DATE_SECONDS.FORMAT.format(date);
	}
	@Override public CrystalDateSeconds next(){
		return add(java.util.GregorianCalendar.SECOND, 1);
	}
	@Override public CrystalDateSeconds prev(){
		return add(java.util.GregorianCalendar.SECOND, -1);
	}
	public static CrystalDateSeconds now(){
		return new CrystalDateSeconds();
	}
	public static CrystalDateSeconds today(){
		return new CrystalDateSeconds(CrystalDateUtils.today().getTimeInMillis());
	}
	public static CrystalDateSeconds currentWeek(){
		return new CrystalDateSeconds(CrystalDateUtils.currentWeek().getTimeInMillis());
	}
	public static CrystalDateSeconds currentMonth(){
		return new CrystalDateSeconds(CrystalDateUtils.currentMonth().getTimeInMillis());
	}
	public static CrystalDateSeconds currentYear(){
		return new CrystalDateSeconds(CrystalDateUtils.currentYear().getTimeInMillis());
	}
}
