package com.test;

class textFormater { 
  
	textFormater(script) {
		this.script = script
	}
	
  	void printFormat(String intext, String color) { 
      switch(color) {
      case "red":
        result_in = "\033[31;42m"
        result_out = "\033[0m"
        break
      default:
        result_in = "\033[31;42m"
        result_out = "\033[0m"
        break
    } 
		  script.echo result_in + "${intext}" + result_out  	
  	}  
  
}
