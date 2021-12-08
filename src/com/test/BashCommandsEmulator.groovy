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
    
}
