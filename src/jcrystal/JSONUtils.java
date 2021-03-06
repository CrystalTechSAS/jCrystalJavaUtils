/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal;

import org.json.JSONObject;

import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class JSONUtils {
	public static String json(String valor){
		return JSONObject.quote(valor);
	}
	public static String json(long a){return Long.toString(a);}
	public static String json(int a){return Integer.toString(a);}
	public static String json(int[] a){
		String ret = "[";
		if(a.length>0)ret += a[0];
			for(int e=1;e<a.length;e++)
		ret+=","+a[e];
		return ret+"]";
	}
	public static String json(double a){return Double.toString(a);}
	public static String json(boolean a){return Boolean.toString(a);}
	
	public static String jsonQuote(String valor){
		return JSONObject.quote(valor);
	}
	public static String jsonQuote(long a){return Long.toString(a);}
	public static String jsonQuote(int a){return Integer.toString(a);}
	public static String jsonQuote(int[] a){
		String ret = "[";
		if(a.length>0)ret += a[0];
			for(int e=1;e<a.length;e++)
		ret+=","+a[e];
		return ret+"]";
	}
	public static String jsonQuote(String[] a){
		String ret = "[";
		if(a.length>0)ret += JSONObject.quote(a[0]);
			for(int e=1;e<a.length;e++)
		ret+=","+JSONObject.quote(a[e]);
		return ret+"]";
	}
	public static String jsonQuote(double[] a){
		String ret = "[";
		if(a.length>0)ret += Double.toString(a[0]);
			for(int e=1;e<a.length;e++)
		ret+=","+Double.toString(a[e]);
		return ret+"]";
	}
	public static String jsonQuote(long[] a){
		String ret = "[";
		if(a.length>0)ret += Long.toString(a[0]);
			for(int e=1;e<a.length;e++)
		ret+=","+Long.toString(a[e]);
		return ret+"]";
	}
	public static String jsonQuote(boolean[] a){
		String ret = "[";
		if(a.length>0)ret += Boolean.toString(a[0]);
			for(int e=1;e<a.length;e++)
		ret+=","+Boolean.toString(a[e]);
		return ret+"]";
	}
	public static String jsonQuote(double a){return Double.toString(a);}
	public static String jsonQuote(boolean a){return Boolean.toString(a);}
	public static String jsonQuoteString(List<String> puntos){
		Iterator<String> it = puntos.iterator();
		String ret = "[";
		if(it.hasNext())ret += jsonQuote(it.next());
			while(it.hasNext())
		ret += ","+jsonQuote(it.next());
		return ret+"]";
	}
	public static String jsonQuoteLong(List<Long> puntos){
		Iterator<Long> it = puntos.iterator();
		String ret = "[";
		if(it.hasNext())ret += it.next();
			while(it.hasNext())
		ret += ","+it.next().toString();
		return ret+"]";
	}
	public static String jsonQuoteDouble(List<Double> puntos){
		Iterator<Double> it = puntos.iterator();
		String ret = "[";
		if(it.hasNext())ret += Double.toString(it.next());
			while(it.hasNext())
				ret += ","+Double.toString(it.next());
		return ret+"]";
	}
	public static String jsonQuoteBoolean(List<Boolean> puntos){
		Iterator<Boolean> it = puntos.iterator();
		String ret = "[";
		if(it.hasNext())ret += Boolean.toString(it.next());
			while(it.hasNext())
				ret += ","+Boolean.toString(it.next());
		return ret+"]";
	}
	public static String jsonQuoteInteger(List<Integer> puntos){
		Iterator<Integer> it = puntos.iterator();
		String ret = "[";
		if(it.hasNext())ret += it.next();
			while(it.hasNext())
		ret += ","+it.next().toString();
		return ret+"]";
	}
	
	public static void jsonQuoteString(PrintWriter _pw, List<String> puntos){
		Iterator<String> it = puntos.iterator();
		_pw.print("[");
		if(it.hasNext())_pw.print(jsonQuote(it.next()));
			while(it.hasNext()) {
			_pw.print(",");
			_pw.print(jsonQuote(it.next()));
		}
		_pw.print("]");
	}
	public static void jsonQuoteLong(PrintWriter _pw, List<Long> puntos){
		Iterator<Long> it = puntos.iterator();
		_pw.print("[");
		if(it.hasNext())_pw.print(it.next());
			while(it.hasNext()) {
			_pw.print(",");
			_pw.print(it.next());
		}
		_pw.print("]");
	}
	public static void jsonQuoteBoolean(PrintWriter _pw, List<Boolean> puntos){
		Iterator<Boolean> it = puntos.iterator();
		_pw.print("[");
		if(it.hasNext())_pw.print(it.next());
			while(it.hasNext()) {
			_pw.print(",");
			_pw.print(it.next());
		}
		_pw.print("]");
	}
	public static void jsonQuoteDouble(PrintWriter _pw, List<Double> puntos){
		Iterator<Double> it = puntos.iterator();
		_pw.print("[");
		if(it.hasNext())_pw.print(it.next());
			while(it.hasNext()) {
			_pw.print(",");
			_pw.print(it.next());
		}
		_pw.print("]");
	}
	public static void jsonQuoteInteger(PrintWriter _pw, List<Integer> puntos){
		Iterator<Integer> it = puntos.iterator();
		_pw.print("[");
		if(it.hasNext())_pw.print(it.next());
			while(it.hasNext()) {
			_pw.print(",");
			_pw.print(it.next());
		}
		_pw.print("]");
	}
	
	public static class Map{
		public static void jsonQuoteStringDouble(PrintWriter _pw, java.util.Map<String, Double> puntos){
			Iterator<java.util.Map.Entry<String, Double>> it = puntos.entrySet().iterator();
			java.util.Map.Entry<String, Double> e;
			_pw.print("{");
			if(it.hasNext()){
				e = it.next();
				_pw.print(jsonQuote(e.getKey()));
				_pw.print(":");
				_pw.print(e.getValue());
			}
			while(it.hasNext()) {
				e = it.next();
				_pw.print(",");
				_pw.print(jsonQuote(e.getKey()));
				_pw.print(":");
				_pw.print(e.getValue());
			}
			_pw.print("}");
		}
		public static void jsonQuoteStringString(PrintWriter _pw, java.util.Map<String, String> puntos){
			Iterator<java.util.Map.Entry<String, String>> it = puntos.entrySet().iterator();
			java.util.Map.Entry<String, String> e;
			_pw.print("{");
			if(it.hasNext()){
				e = it.next();
				_pw.print(jsonQuote(e.getKey()));
				_pw.print(":");
				_pw.print(e.getValue());
			}
			while(it.hasNext()) {
				e = it.next();
				_pw.print(",");
				_pw.print(jsonQuote(e.getKey()));
				_pw.print(":");
				_pw.print(e.getValue());
			}
			_pw.print("}");
		}
	}
}
