package com.test

class BashCommandsEmulator {
    def script
    String ansi_start = "\033"
    String ansi_stop = "\033[0m"
    Map format = [color:"30",bold:"0", underline:"4"]
    
    
    BashCommandsEmulator(script)
    {
        this.script = script
    } 
    
    // echo("text1 ","text 2 ")
    void echo(String... texts)
    {
        String color = "31"
        String bold = "1"
        String underline = "4"
        
        //example: "\033[31;1;4mHello\033[0m"
        String str = "${this.ansi_start}[${this.format.color};${this.format.bold};${this.format.underline}m${texts.join("")}${this.ansi_stop}"
        
        this.script.echo str
    } 
 
}
