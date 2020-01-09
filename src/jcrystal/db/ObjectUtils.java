package jcrystal.db;

/**
 * Contiene operadores de coalescencia
 * @author G
 *
 */
public class ObjectUtils {
	
	public static Boolean getBoolean(Object t, Boolean defaultValue){
		if(t==null)
			return defaultValue;
		return (Boolean)t;
	}
	public static Integer getInt(Object t, Integer defaultValue){
		if(t==null)
			return defaultValue;
		if(t instanceof Long)
			return ((Long)t).intValue();
		return (Integer)t;
	}
	public static Double getDouble(Object t, Double defaultValue){
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
		return (Double)t;
	}
	public static Long getLong(Object t, Long defaultValue){
		if(t==null)
			return defaultValue;
		if(t instanceof Integer)
			return ((Integer)t).longValue();
		return (Long)t;
	}
}
