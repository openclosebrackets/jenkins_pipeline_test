package com.test;
import groovy.json.JsonSlurperClassic

def read_data(String jsonFile)
{
    def json = libraryResource jsonFile                    
    def data = new JsonSlurperClassic().parseText(json)
    return data
}
