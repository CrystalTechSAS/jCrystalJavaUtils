package jcrystal.datetime;
public class CrystalDate extends AbsCrystalDate<CrystalDate>{
	public CrystalDate(String text)throws java.text.ParseException{
		super(DateType.DATE.FORMAT.parse(text));
	}
	public CrystalDate(long time){
		super(new java.util.Date(time));
	}
	@Override public CrystalDate create(long time){
		return new CrystalDate(time);
	}
	public CrystalDate(){
		super(new java.util.Date());
	}
	@Override public String format(){
		return DateType.DATE.FORMAT.format(date);
	}
	public static String format(java.util.Date date){
		return DateType.DATE.FORMAT.format(date);
	}
	@Override public CrystalDate next(){
		return add(java.util.GregorianCalendar.DAY_OF_YEAR, 1);
	}
	@Override public CrystalDate prev(){
		return add(java.util.GregorianCalendar.DAY_OF_YEAR, -1);
	}
	public static CrystalDate now(){
		return new CrystalDate();
	}
	public static CrystalDate today(){
		return new CrystalDate(CrystalDateUtils.today().getTimeInMillis());
	}
	public static CrystalDate currentWeek(){
		return new CrystalDate(CrystalDateUtils.currentWeek().getTimeInMillis());
	}
	public static CrystalDate currentMonth(){
		return new CrystalDate(CrystalDateUtils.currentMonth().getTimeInMillis());
	}
	public static CrystalDate currentYear(){
		return new CrystalDate(CrystalDateUtils.currentYear().getTimeInMillis());
	}
}
