package com.test

class BashCommandsEmulator {
    def script
    
    BashCommandsEmulator(script)
    {
        this.script = script
    }
    
    void bce_echo(String text)
    {
        this.script.echo text 
    }
    
}
