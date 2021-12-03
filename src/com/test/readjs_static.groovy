package com.test;
import groovy.json.JsonSlurperClassic

static def read_data_static(String jsonFile)
{
    def json = libraryResource jsonFile                    
    def data = new JsonSlurperClassic().parseText(json)
    return data
}
