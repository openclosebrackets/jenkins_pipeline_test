package com.test;
import static groovy.json.JsonSlurperClassic.*;

class readjs_static { 
  
  static void read_data_static(String jsonFile)
    {
         def json = libraryResource jsonFile                    
        def data = parseText(json)
    }
  
/*
  	static def read_data_static(String jsonFile)
    {
        def json = libraryResource jsonFile                    
        def data = new JsonSlurperClassic().parseText(json)
        return data
    }
 */
  
}
