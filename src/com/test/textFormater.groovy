package com.test;

class textFormater { 
  String color
  String inTex
  
	textFormater(script) {
		this.script = script
	}
	
  	void printFormat() { 
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
		  script.echo result_in + "${inTex}" + result_out  	
  	}  
  
}
