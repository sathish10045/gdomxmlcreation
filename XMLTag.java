/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author sathishnataraj
 * This class added as a template to add a xmlsyntax,start and end tag
 */

public class XMLTag 
 {
    
    
            public String xmlSyntax() 
                {
                    String syntax;
                    syntax="<?xml version="+"1.0" +"encoding="+"UTF-8"+" standalone="+"no"+"?>";
                       

                        return syntax;

                }
            
            public String startElement() 
                {
                       String starttag;
                    
                        starttag = "<gedcom>";

                        return starttag;

                }

            public String endElement() 
                {

                        String endtag = "</gedcom>";

                        return endtag;
                }
        
}
