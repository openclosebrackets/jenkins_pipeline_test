package com.test

class BashCommandsEmulator {
    def script
    
    BashCommandsEmulator(script)
    {
        this.script = script
    }
    
    void echo(String text)
    {
        this.script.echo text 
    }
 
    // echo("text1 ","text 2 ")
    void echo(String... texts)
    {
        this.script.echo texts.join("")
    } 
 
}
