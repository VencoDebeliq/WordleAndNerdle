/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wordleandnerdle;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;

/**
 *
 * @author mac
 */
public class Wordlesystem {
   
    private FileReader filereader;
    private ArrayList<String> listofwords;
    
    
    
    public void setListofwords(){
         try {
             
            filereader=new FileReader("text.txt");
            BufferedReader bf=new BufferedReader(filereader);
            String str;   
            while((str=bf.readLine())!=null){
                if(str.equals("which"))
                {
                    System.out.println("Yesss sirrr");
                }
           
            }
        } 
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void see(){
        setListofwords();
        for (int i = 0; i < listofwords.size(); i++) {
            System.out.println(listofwords.get(i));
            
        }
    }
    public static void main(String[] args) {
        Wordlesystem obj=new Wordlesystem();
        obj.setListofwords();
    }
    
}
