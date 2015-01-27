package xyz.jadonfowler.fql;

import java.util.HashMap;

public enum Keyword {
	
	IS("is", "IS");
	
	private String before;
	private String after;
	
	Keyword(String a, String b){
		this.before = b;
		this.after = a;
	}
	
	private static HashMap<String, String> lookUp;
	
	static{
		lookUp = new HashMap<String, String>();
		for(Keyword k : Keyword.values()){
			lookUp.put(k.before, k.after);
		}
	}
	
	public static String convert(String s){
		return lookUp.get(s);
	}
	
	public static boolean isKeyword(String s){
		return lookUp.containsKey(s);
	}
	
}
