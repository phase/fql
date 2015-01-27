package xyz.jadonfowler.fql;

public class Interpreter {
	
	private String input;
	private String output;
	
	public Interpreter(String text){
		this.input = text;
		for(String s : text.split(" ")){
			if(Keyword.isKeyword(s)){
				output += Keyword.convert(s);
			}
		}
	}
	
	public String getInput(){
		return input;
	}
	
	public String getOutput(){
		return output;
	}
	
}
