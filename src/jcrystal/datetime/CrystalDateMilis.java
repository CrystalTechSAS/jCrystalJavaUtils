package jcrystal.datetime;
public class CrystalDateMilis extends AbsCrystalDate<CrystalDateMilis>{
	public CrystalDateMilis(String text)throws java.text.ParseException{
		super(DateType.DATE_MILIS.FORMAT.parse(text));
	}
	public CrystalDateMilis(long time){
		super(new java.util.Date(time));
	}
	@Override public CrystalDateMilis create(long time){
		return new CrystalDateMilis(time);
	}
	public CrystalDateMilis(){
		super(new java.util.Date());
	}
	@Override public String format(){
		return DateType.DATE_MILIS.FORMAT.format(date);
	}
	@Override public CrystalDateMilis next(){
		return add(1l);
	}
	@Override public CrystalDateMilis prev(){
		return add(-1l);
	}
	public static CrystalDateMilis now(){
		return new CrystalDateMilis();
	}
	public static CrystalDateMilis today(){
		return new CrystalDateMilis(CrystalDateUtils.today().getTimeInMillis());
	}
	public static CrystalDateMilis currentWeek(){
		return new CrystalDateMilis(CrystalDateUtils.currentWeek().getTimeInMillis());
	}
	public static CrystalDateMilis currentMonth(){
		return new CrystalDateMilis(CrystalDateUtils.currentMonth().getTimeInMillis());
	}
	public static CrystalDateMilis currentYear(){
		return new CrystalDateMilis(CrystalDateUtils.currentYear().getTimeInMillis());
	}
}
