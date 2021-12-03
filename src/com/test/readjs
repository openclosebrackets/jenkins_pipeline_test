import groovy.json.JsonSlurperClassic
package com.test 

def read_data(String jsonFile)
{
    def json = libraryResource jsonFile                    
    def data = new JsonSlurperClassic().parseText(json)
    return data
}
