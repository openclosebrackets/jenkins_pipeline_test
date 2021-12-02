package com.test;

class textFormater { 
   
  	static void printFormat(script, String intext, String color) {   
    
		String result_in = "\033[31;42m"
		String result_out = "\033[0m" 
		script.echo   result_in + "${intext}" + result_out  	
		
  	}  
  
}
