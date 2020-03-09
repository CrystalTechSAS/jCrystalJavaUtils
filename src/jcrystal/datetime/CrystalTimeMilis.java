package jcrystal.datetime;
public class CrystalTimeMilis extends AbsCrystalDate<CrystalTimeMilis>{
	public CrystalTimeMilis(String text)throws java.text.ParseException{
		super(DateType.TIME_MILIS.FORMAT.parse(text));
	}
	public CrystalTimeMilis(long time){
		super(new java.util.Date(time));
	}
	@Override public CrystalTimeMilis create(long time){
		return new CrystalTimeMilis(time);
	}
	public CrystalTimeMilis(){
		super(new java.util.Date());
	}
	@Override public String format(){
		return DateType.TIME_MILIS.FORMAT.format(date);
	}
	public static String format(java.util.Date date){
		return DateType.TIME_MILIS.FORMAT.format(date);
	}
	@Override public CrystalTimeMilis next(){
		return add(1l);
	}
	@Override public CrystalTimeMilis prev(){
		return add(-1l);
	}
	public static CrystalTimeMilis now(){
		return new CrystalTimeMilis();
	}
}
