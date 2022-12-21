/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wordleandnerdle;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author mac
 */
public class ReadandWrite {
 

    
    
     private FileWriter fw;
     private FileReader fr;
    private static int points;
    
    public void setPoints(int points){
        this.points=points;
    }
    public static int getPoints(){
        return points;
    }
           
     
    public boolean checkIfMatchRegister(Registersystem obj){
        boolean check=true;
        try {
            fr=new FileReader("Secretinfo.txt");
            BufferedReader bf=new BufferedReader(fr);
            String str; 
            
            String username=obj.getUsername();
            
            while((str=bf.readLine())!=null){
                ArrayList<Character>merger=new ArrayList<>();
                for (int i = 0; i < str.length(); i++) {
                   if(str.charAt(i)=='\t'){
                       //System.out.println(str.charAt(i));
                       break;
                       
                   }
                   else if(str.charAt(i)!='\t'){
                       merger.add(str.charAt(i));
                       System.out.println(str.charAt(i));
                   }
                    
                }
               String finalusername ="";
                for (int i = 0; i <merger.size(); i++) {
                  finalusername+=merger.get(i);
                    
                }
                System.out.println(finalusername);
                if(username.equals(finalusername))
                {
                    check=false;
                  
                }
                
            }
        } 
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        
        return check;
    }
    
     public boolean checkIfexistingLogin(Registersystem obj){
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
     
 
    public void setinfotoFiles(Registersystem obj) throws IOException{
        try {
          
            fw = new FileWriter("Secretinfo.txt",true);
            fw.write(obj.getUsername()+"\t"+obj.getPassword() + "\n");
            fw.close();
              
            fw = new FileWriter("Points.txt", true);
            fw.write(obj.getUsername() + "\t" + "0"+ '\n');
            fw.close();
            
        }
             
        catch (IOException e) {
            throw new RuntimeException(e);
        }
         
         
  
    }
    
   /* public  String getPoints() throws FileNotFoundException, IOException{
       fr=new FileReader("Points.txt");
       BufferedReader bf=new BufferedReader(fr);
       String s;
       String reversedpoints="";
       while((s=bf.readLine())!=null){
          String currentusername ="";
          
          for (int i = 0; i < s.length(); i++) {
              if(s.charAt(i)!='\t'){
                  currentusername+=s.charAt(i);
              }
              else{
                  break;
              } 
          }
          
          if(currentusername.equals(Registersystem.getUsername())){
              for (int i = s.length()-1; i >=0 ; --i) {
                  if(s.charAt(i)!='\t'){
                       reversedpoints+=s.charAt(i);
                  }
                  else{
                      break;
                  }
                  
              }
          }
          
      }
       bf.close();
       String finalpoints="";
        for (int i = reversedpoints.length()-1; i>=0; i++) {
            finalpoints+=reversedpoints.charAt(i);
            
        }
        
       
       return finalpoints;
    }
*/
    
    
    
    
    
 
  
   public void setnewPoints(int points) throws IOException{
        
       fr=new FileReader("Points.txt");
       BufferedReader bf=new BufferedReader(fr);
       String str;
       ArrayList<String> merger=new ArrayList<>();
       String reversedpoints ="";
      while((str=bf.readLine())!=null){
          String currentusername ="";
          
          for (int i = 0; i < str.length(); i++) {
              if(str.charAt(i)!='\t'){
                  currentusername+=str.charAt(i);
              }
              else{
                  break;
              } 
          }
          
          if(currentusername.equals(Registersystem.getUsername())){
              for (int i = str.length()-1; i >=0 ; --i) {
                  if(str.charAt(i)!='\t'){
                       reversedpoints+=str.charAt(i);
                  }
                  else{
                      break;
                  }
                  
              }
          }
          else{
              merger.add(str+"\n");
          }
          
      }
       bf.close();
       String startingpointsgetter=reversedpoints;
       String finalreversedpoints ="";
       for (int i =startingpointsgetter.length()-1; i>=0;--i) {
           finalreversedpoints+=startingpointsgetter.charAt(i);
           
       }
       int finalpoints=Integer.parseInt(finalreversedpoints);
       setPoints(finalpoints+points);
       merger.add(Registersystem.getUsername()+"\t"+(finalpoints+points));
      fw=new FileWriter("Points.txt");
       
       for (int i = 0; i <merger.size(); i++) {
           fw.write(merger.get(i));
           
       }
      
       fw.close();
   }
   
    
   
   
    
    
}
 



