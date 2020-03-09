package jcrystal.datetime;
public class CrystalDateTime extends AbsCrystalDate<CrystalDateTime>{
	public CrystalDateTime(String text)throws java.text.ParseException{
		super(DateType.DATE_TIME.FORMAT.parse(text));
	}
	public CrystalDateTime(long time){
		super(new java.util.Date(time));
	}
	@Override public CrystalDateTime create(long time){
		return new CrystalDateTime(time);
	}
	public CrystalDateTime(){
		super(new java.util.Date());
	}
	@Override public String format(){
		return DateType.DATE_TIME.FORMAT.format(date);
	}
	public static String format(java.util.Date date){
		return DateType.DATE_TIME.FORMAT.format(date);
	}
	@Override public CrystalDateTime next(){
		return add(java.util.GregorianCalendar.MINUTE, 1);
	}
	@Override public CrystalDateTime prev(){
		return add(java.util.GregorianCalendar.MINUTE, -1);
	}
	public static CrystalDateTime now(){
		return new CrystalDateTime();
	}
	public static CrystalDateTime today(){
		return new CrystalDateTime(CrystalDateUtils.today().getTimeInMillis());
	}
	public static CrystalDateTime currentWeek(){
		return new CrystalDateTime(CrystalDateUtils.currentWeek().getTimeInMillis());
	}
	public static CrystalDateTime currentMonth(){
		return new CrystalDateTime(CrystalDateUtils.currentMonth().getTimeInMillis());
	}
	public static CrystalDateTime currentYear(){
		return new CrystalDateTime(CrystalDateUtils.currentYear().getTimeInMillis());
	}
}
