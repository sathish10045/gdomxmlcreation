/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/*
 *
 * @author sathishnataraj
 * This is a main class reading the data from the file and generating the 
 * xml element and it made as a singleton class
 */


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
     
class GetData
 {
        XMLTag xmlsync=new XMLTag();
        XMLDataMapping dm=new XMLDataMapping();
        
            
            /*
             * This method used to validate the input file and parsing the data
            */
        
            public void processData()
            {
                    BufferedReader bf;
                    File f;
                    String text,value,valueone;
                    
                try
                {
                        System.out.println(xmlsync.xmlSyntax());
                        System.out.println(xmlsync.startElement());
                        f=new File("D:/TGC551.ged");
                        
                        
                      if(f.getName().equals("TGC55C.ged") || f.getName().equals("TGC55CLF.ged")
                              || f.getName().equals("TGC551.ged") || f.getName().equals("TGC551LF.ged"))
                      {
                          
                      
                            bf=new BufferedReader(new FileReader(f));

                            while ((text = bf.readLine())!=null)  
                            {

                                if(text.startsWith(dm.ZERO))
                                {
                                    value = text.substring(2,6);
                                    valueone = text.substring(6);
                                    buildXml(value,valueone);
                                }
                                else if(text.startsWith(dm.ONE))
                                {

                                    value = text.substring(2,6);
                                    valueone = text.substring(6);
                                    buildXmlOne(value,valueone);

                                }
                                else if(text.startsWith(dm.TWO))
                                {


                                    value = text.substring(2,6);
                                    valueone = text.substring(6);
                                    buildXmlTwo(value,valueone);

                                }
                                else if(text.startsWith(dm.THREE))
                                {
                                    value = text.substring(2,6);
                                    valueone = text.substring(6);
                                    buildXmlThree(value,valueone);
                                }
                                else if(text.startsWith(dm.FOUR))
                                {
                                    value = text.substring(2,6);
                                    valueone = text.substring(6);
                                    buildXmlFour(value,valueone);
                                    System.out.println(" ");   
                                }

                            }
                                System.out.println("</gedcom>");  
                                bf.close();
                       
                      }
                      
                      else
                      {
                          System.out.println("Entered file is incorrect");
                      }
                     
                    }catch (Exception e)
                    {
                        // Catch exception if any
                            System.err.println(e.getMessage());
                    }
                    
            }
      
             /*
             * The below methods used to build the xml elements
             */
            
           public void buildXml(String data,String dataOne)
            {
                
                   if(dataOne!=null || dataOne!="")
                   {
                       
                       System.out.println("<"+dataOne+" "+"id='"+data+"'>");
                       
                               
                   }
                   else
                   {
                       System.out.println("<"+data+">");
                      
                   }
           }
           
           public void buildXmlOne(String data,String dataOne)
            {
                
                   if(dataOne!=null || dataOne!="")
                   {
                       dataOne.trim();
                       System.out.println("  "+"<"+data+" "+"value='"+dataOne+"'>");
                       
                               
                   }
                  
           }
           
           
            public void buildXmlTwo(String data,String dataOne)
            {
                
                   if(dataOne!=null || dataOne!="")
                   {
                       
                       System.out.println("    "+"<"+data+">"+dataOne+"</"+data+">");
                       
                               
                   }
                  
           }
            
            public void buildXmlThree(String data,String dataOne)
            {
                
                   if(dataOne!=null || dataOne!="")
                   {
                       
                       System.out.println("    "+"<"+data+">"+dataOne+"</"+data+">");
                       
                               
                   }
                  
           }
            
            public void buildXmlFour(String data,String dataOne)
            {
                
                   if(dataOne!=null || dataOne!="")
                   {
                       
                       System.out.println("   "+"<"+data+">"+dataOne+"</"+data+">");
                       
                               
                   }
                  
           }
           
           
           
           
  }

//This a Singleton class

public class XMLAggregationProcess 
{
            private static XMLAggregationProcess instance;
             
            private XMLAggregationProcess()
            {
            } 
            public static synchronized XMLAggregationProcess getInstance()
            {
                    
                    if (instance == null)
                    {
                    instance = new XMLAggregationProcess();
                    }
                    return instance;

            }
            public static void main(String args[])
            {
                GetData get = new GetData();
                get.processData();

            }
 }



