package com.test

class BashCommandsEmulator {
    
    Map colorTable = ["black":"30","red":"31"]
    def script
    
    BashCommandsEmulator(script)
    {
        this.script = script
    } 
       
    // echo("text1 ","text 2 ")
    void echo(String... texts)
    {
        this.script.echo texts.join("")
    } 
    
    // echo([color:"red",bold: true, underline: true],"text1 ","text 2 ")
    void echo(Map format, String... texts)
    {
        if (format.color == null) format.color = "black"
        if (format.bold == null) format.bold = false
        if (format.underline == null) format.underline = false
        
        String str = "\033[${colorTable[format.color as String]}"
        if (format.bold)
        {
            str += ";1"
        }
        if (format.underline)
        {
            str += ";4"
        }
        str += "m${texts.join("")}\033[0m"  
        
        this.script.echo str
    } 
 
}
