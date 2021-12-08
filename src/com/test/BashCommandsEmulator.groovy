package com.test

class BashCommandsEmulator {
    
    private Map colorTable = ["black":30,
                              "red":31,
                              "green":32,
                              "yellow":33,
                              "blue":34,
                              "magenta":35,
                              "cyan":36,
                              "white":37]
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
    
    // Example echo([color:"red",bold: true, underline: true],"text1 ","text 2 ")
    void echo(Map format, String... texts)
    {
        // check if user gives format keys, if not set default
        if (format.color == null) format.color = "black"
        if (format.bold == null) format.bold = false
        if (format.underline == null) format.underline = false
        
        // you can now give option as "Red","red", "REd",...
        format.color = format.color.toLowerCase()
        
        // if color is not in color table, set to black
        if (!(format.color in colorTable.keySet())) format.color = "black"
        
        // ansi coloring 
        String str = "\033[${colorTable[format.color as String]}"
        
        if (format.bold) str+=";1"
        
        if (format.backgroundColor in colorTable.keySet()) str+=";${colorTable[format.backgroundColor as String] + 10}"
        
        if (format.underline) str+=";4"
        
        //final string to echo
        str += "m${texts.join("")}\033[0m"  
        
        this.script.echo str
    } 
    
    // Example echo("text1 ",[color:"red",bold: true, underline: true])
    void echo(String text, Map format)
    {
         echo(format, text)
    }
 
}
