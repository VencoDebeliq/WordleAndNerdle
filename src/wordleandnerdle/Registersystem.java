/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wordleandnerdle;



public class Registersystem extends REGISTER {
    
    private static String username;
    private static String password;
  
  
  
    
    private boolean is_ok(String s)
    {
        for (int i = 0; i < s.length(); ++i)
        {
            if (s.charAt(i) == ' ') return false;
        }
        return true && s != null && s.length() != 0;
    }
    
    public  void setUsername(String username){
        if(is_ok(username)){
            this.username=username;
        }
        else
        {
            throw new RuntimeException("Empty");
        }
    }
    
    public static String getUsername(){
        return username;
    }
    public void setPassword(String password){
        if(is_ok(password)){
            this.password=password;
        }
        else
        {
            throw new RuntimeException("Empty");
        }
    }
    public static String getPassword(){
        return password;
    }
    
    public Registersystem(String username, String password)
    {
        setUsername(username);
        setPassword(password);
        
    }
    
   
    
    public Registersystem()
    {
        this("_", "_");
    }
    
    
}

