/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wordleandnerdle;

import java.awt.Component;

/**
 *
 * @author Ventsislav Peychev
 */
public class Methods {
    
    public static String getInput(javax.swing.JPanel[][] pnlarr, int currj)
    {
        String s = "";
        for (int i = 0; i < 8; ++i)
        {
            Component c = pnlarr[i][currj].getComponent(0);
            if (c instanceof javax.swing.JLabel)
            {
                s += ((javax.swing.JLabel) c).getText();
            }
        }
        System.out.println(s);
        return s;
    }
    
}
