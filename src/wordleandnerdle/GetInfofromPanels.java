/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wordleandnerdle;

import java.awt.Color;
import java.awt.Component;

/**
 *
 * @author Ventsislav Peychev
 */
public class GetInfofromPanels {
    
    private static int rowsloved;
    
    public void setRow(int row){
        this.rowsloved=row;
    }
    
    public static int getRow(){
        return rowsloved;
    }
    
    public static String getInput(javax.swing.JPanel[][] pnlarr, int currj,int n)
    {
        String s = "";
        for (int i = 0; i < n; ++i)
        {
            Component c = pnlarr[i][currj].getComponent(0);
            if (c instanceof javax.swing.JLabel)
            {
                s += ((javax.swing.JLabel) c).getText();
            }
        }
        String ans=s.toLowerCase();
        //System.out.println(ans);
        return ans;
    }
    public static boolean solved(javax.swing.JPanel[][] pnlarr, int currj, int n)  
    {
        for (int i = 0; i < n; i++) {
             if(!(pnlarr[i][currj].getBackground().getRGB() == (new Color(102, 255, 102)).getRGB()))
             {
                 return false;
             }
              
        }
        return true;
    }
    
    
         
}
