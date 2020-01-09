package jcrystal.db;

/**
 * Contiene operadores de coalescencia
 * @author G
 *
 */
public class PrimitiveUtils {
	public static boolean getBoolean(Object t, boolean defaultValue){
		if(t==null)
			return defaultValue;
		return (Boolean)t;
	}
	public static int getInt(Object t, int defaultValue){
		if(t==null)
			return defaultValue;
		if(t instanceof Long)
			return ((Long)t).intValue();
		return (Integer)t;
	}
	public static double getDouble(Object t, double defaultValue){
		if(t==null)
			return defaultValue;
		if(t instanceof Double)
			return (double)t;
		if(t instanceof Float)
			return ((Float)t).doubleValue();
		if(t instanceof Long)
			return ((Long)t).doubleValue();
		if(t instanceof Integer)
			return ((Integer)t).doubleValue();
		return (double)t;
	}
	public static long getLong(Object t, long defaultValue){
		if(t==null)
			return defaultValue;
		if(t instanceof Integer)
			return ((Integer)t).longValue();
		return (Long)t;
	}
}
