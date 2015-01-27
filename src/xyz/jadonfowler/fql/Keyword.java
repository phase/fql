package xyz.jadonfowler.fql;

import java.util.HashMap;

public enum Keyword {
	
	ALL("all", "*"),
	AND("and", "AND"),
	AS("as", "AS"),
	BETWEEN("between", "BETWEEN"),
	BY("by", "BY"),
	CASE("case", "CASE"),
	DECODE("decode", "DECODE"),
	DELETE("delete", "DELETE"),
	DISTINCT("distinct", "DISTINCT"),
	ELSE("else", "ELSE"),
	END("stop", "END"),
	EQUALS("equals", "="),
	FROM("from", "FROM"),
	GREATER_THAN("greater", ">"),
	GREATER_THAN_OR_EQUAL("greater|equal", ">="),
	GROUP("group", "GRUOP"),
	HAVING("has", "HAVING"),
	IN("in", "IN"),
	INTO("into", "INTO"),
	INSERT("put", "INSERT"),
	IS("is", "IS"),
	JOIN("join", "JOIN"),
	LESS_THAN("less", "<"),
	LESS_THAN_OR_EQUAL("less|equal", "<="),
	LIKE("like", "LIKE"),
	MATCHED("matched", "MATCHED"),
	MULTIPLY("x", "*"),
	NATURAL("natural", "NATURAL"),
	NOT("!", "NOT"),
	NOT_EQUALS("!equals", "<>"),
	ON("on", "ON"),
	OR("or", "OR"),
	ORDER("order", "ORDER"),
	SET("set", "SET"),
	SELECT("select", "SELECT"),
	THEN("then", "THEN"),
	VALUES("values", "VALUES"),
	WHERE("where", "WHERE"),
	WHILE("while", "WHILE"),
	;
	
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
