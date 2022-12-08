/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wordleandnerdle;

import wordleandnerdle.Registersystem;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author mac
 */
public class ReadandWrite {
 

    
    
     private FileWriter fw;
     private FileReader fr;
     
     
     
    public boolean checkIfexisting(Registersystem obj){
        boolean check=true;
        try {
            fr=new FileReader("Secretinfo.txt");
            BufferedReader bf=new BufferedReader(fr);
            String str;   
            while((str=bf.readLine())!=null){
                if(str.equals(obj.getUsername()+"\t"+obj.getPassword()))
                {
                    check=false;
                  
                }
                //System.out.println(str+"    "+obj.getUsername()+"\t"+obj.getPassword());
            }
        } 
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        return check;
    }
     
 
    public void setinfotofile(Registersystem obj) throws IOException{
        try {
          
            fw = new FileWriter("Secretinfo.txt",true);
            fw.write(obj.getUsername()+"\t"+obj.getPassword() + "\n");
            fw.close();
            fw = new FileWriter("PointFile.txt", true);
            fw.write(obj.getUsername() + '\t' + obj.getPoints() + '\n');
            fw.close();
        }
             
        catch (IOException e) {
            throw new RuntimeException(e);
        }
         
         
  
    }
    
       
    
    
}


