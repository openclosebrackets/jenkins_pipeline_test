package com.test

class BashCommandsEmulator {
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
 
}
