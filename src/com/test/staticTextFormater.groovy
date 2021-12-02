package com.test;

class textFormater { 
  
  def script
	textFormater(script) {
		this.script = script
	}
	
  	static void printFormat(String intext, String color) {   
    
        String result_in = "\033[31;42m"
        String result_out = "\033[0m" 
        script.echo   result_in + "${intext}" + result_out  	
		
  	}  
  
}
