package com.test;

class staticTextFormater { 
   
  	//static void printFormat(script, String intext, String color) {   
    static def printMe(script) {   
    
		String result_in = "\033[31;42m"
		String result_out = "\033[0m" 
		//script.echo   result_in + "${intext}" + result_out  	
		script.echo   result_in + "Hello" + result_out  	
		
  	}  
  
}
