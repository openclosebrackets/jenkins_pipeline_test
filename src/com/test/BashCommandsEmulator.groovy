package com.test

class BashCommandsEmulator {
    def script
    String ansi_start = "\033"
    String ansi_stop = "\033[0m"
    
    
    BashCommandsEmulator(script)
    {
        this.script = script
    } 
    
    // echo("text1 ","text 2 ")
    void echo(String... texts)
    {
        String color = "31"
        boolean bold = false
        boolean underline = false
        
        String str = "${this.ansi_start}[${color}"
        if (bold)
        {
            str += ";1"
        }
        if (underline)
        {
            str += ";4"
        }
        str += "m${texts.join("")}${this.ansi_stop}" 
        
        
        //String underline = "4"
        
        //example: "\033[31;1;4mHello\033[0m"
        //String str = "${this.ansi_start}[${color};${bold};${underline}m${texts.join("")}${this.ansi_stop}"
        
        this.script.echo str
    } 
 
}
