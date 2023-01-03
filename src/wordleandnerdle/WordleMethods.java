/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wordleandnerdle;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author mac
 */
public class WordleMethods extends javax.swing.JFrame{
   
    protected javax.swing.JPanel[][]  pnlarr = new javax.swing.JPanel[5][6];
    protected int curri; // index of current panel
    protected int currj; // index of current panel
    protected String word;
    private FileReader fr;
    
    
    protected void setJ(int currj) // setting currj variable
    {
        if (currj < 0) return;
        if (currj < 6)
            this.currj = currj;
    }
    protected int getJ(){
        return currj;
    }
    
       
    protected void setI(int curri) // setting curri variable
    {
        if (curri < 0) return ;
        if (curri < 5)
            this.curri = curri;  
    }
    protected int getI(){
        return curri;
    }
    
    protected WordleMethods() throws FileNotFoundException{
        word=generate();
    }
    
    private String generate() throws FileNotFoundException{
        Random gen=new Random();
        String randomword = null;
        int countercheck=1;
        try {
            fr=new FileReader("wordsfromwordle.txt");
            BufferedReader bf=new BufferedReader(fr);
            
            int randomline=gen.nextInt(2309)+1;
            while((bf.readLine())!=null){
                countercheck++;
                if(countercheck==randomline){
                    randomword=bf.readLine();
                }
            }
            System.out.println(randomword);
        } catch (IOException ex) {
            Logger.getLogger(Wordle.class.getName()).log(Level.SEVERE, null, ex);
        }
        return randomword;
    }
    
    public boolean is_valid(){
        try {
            fr=new FileReader("wordsfromwordle.txt");
            BufferedReader bf=new BufferedReader(fr);
            String wordcheck;
            
            while((wordcheck=bf.readLine())!=null){
                if(wordcheck.equals(GetInfofromPanels.getInput(pnlarr, currj, 5).toLowerCase())){
                    return true;
                }
            }
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Wordle.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Wordle.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
        
    }
    
    protected void paintPanels(String s){
        boolean arrifperfmatch[]=new boolean[5];//for za perfect match
        int countLetters[] = new int [26];
        for (int i = 0; i <word.length() ; i++) {
            pnlarr[i][getJ()].getComponent(0).setForeground(Color.white);
            if (!(word.charAt(i) >= 'a' && word.charAt(i) <= 'z'))
            {
                continue;
            }
            countLetters[(word.charAt(i) - 'a')]++;
            if(word.charAt(i)==s.charAt(i)){

                arrifperfmatch[i]=true;
                pnlarr[i][getJ()].setBackground(new Color(102, 255, 102));//zelen cvqt
                countLetters[word.charAt(i)-'a']--;
            }
             
        }
          
        for (int i = 0; i < word.length(); ++i)
        {
            if (arrifperfmatch[i]==true) {
                continue;
            }
            if (!(word.charAt(i) >= 'a' && word.charAt(i) <= 'z'))
            {
                continue;
            }
            
            if (countLetters[(s.charAt(i) - 'a')] == 0)
            {
                pnlarr[i][getJ()].setBackground(Color.gray);
            }
            else
            {
                pnlarr[i][getJ()].setBackground(new Color(102, 0, 153)); // lilav cvqt
                countLetters[s.charAt(i) - 'a']--;
            }
        }
        
        for (int i = 0; i < s.length(); ++i)
        {
            if (!arrifperfmatch[i]) continue;
            paintBtn(s.charAt(i), pnlarr[i][getJ()].getBackground());
        }
        
        for (int i = 0; i < s.length(); ++i)
        {
            if (getBtnColor(s.charAt(i)).getRGB() == (new Color(102, 0, 153)).getRGB() || getBtnColor(s.charAt(i)).getRGB() == (new Color(102, 255, 102)).getRGB()) continue;
            paintBtn(s.charAt(i), pnlarr[i][getJ()].getBackground());
        }
    }
    
    private void paintBtn(char c, Color col)
    {
        switch (c)
        {
            case 'a':
                btnA.setForeground(Color.white);
                btnA.setBackground(col);
                break;
            case 'b':
                btnB.setForeground(Color.white);
                btnB.setBackground(col);
                break;
            case 'c':
                btnC.setForeground(Color.white);
                btnC.setBackground(col);
                break;
            case 'd':
                btnD.setForeground(Color.white);
                btnD.setBackground(col);
                break;
            case 'e':
                btnE.setForeground(Color.white);
                btnE.setBackground(col);
                break;
            case 'f':
                btnF.setForeground(Color.white);
                btnF.setBackground(col);
                break;
            case 'g':
                btnG.setForeground(Color.white);
                btnG.setBackground(col);
                break;
            case 'h':
                btnH.setForeground(Color.white);
                btnH.setBackground(col);
                break;
            case 'i':
                btnI.setForeground(Color.white);
                btnI.setBackground(col);
                break;
            case 'j':
                btnJ.setForeground(Color.white);
                btnJ.setBackground(col);
                break;
            case 'k':
                btnK.setForeground(Color.white);
                btnK.setBackground(col);
                break;
            case 'l':
                btnL.setForeground(Color.white);
                btnL.setBackground(col);
                break;
            case 'm':
                btnM.setForeground(Color.white);
                btnM.setBackground(col);
                break;
            case 'n':
                btnN.setForeground(Color.white);
                btnN.setBackground(col);
                break;
            case 'o':
                btnO.setForeground(Color.white);
                btnO.setBackground(col);
                break;
            case 'p':
                btnP.setForeground(Color.white);
                btnP.setBackground(col);
                break;
            case 'q':
                btnQ.setForeground(Color.white);
                btnQ.setBackground(col);
                break;
            case 'r':
                btnR.setForeground(Color.white);
                btnR.setBackground(col);
                break;
            case 's':
                btnS.setForeground(Color.white);
                btnS.setBackground(col);
                break;
            case 't':
                btnT.setForeground(Color.white);
                btnT.setBackground(col);
                break;
            case 'u':
                btnU.setForeground(Color.white);
                btnU.setBackground(col);
                break;
            case 'v':
                btnV.setForeground(Color.white);
                btnV.setBackground(col);
                break;
            case 'x':
                btnX.setForeground(Color.white);
                btnX.setBackground(col);
                break;
            case 'w':
                btnW.setForeground(Color.white);
                btnW.setBackground(col);
                break;
            case 'y':
                btnY.setForeground(Color.white);
                btnY.setBackground(col);
                break;
            case 'z':
                btnZ.setForeground(Color.white);
                btnZ.setBackground(col);
                break;
        }
    }
    
    private Color getBtnColor(char c)
    {
        switch (c)
        {
            case 'a':
                return btnA.getBackground();
            case 'b':
                return btnB.getBackground();
            case 'c':
                return btnC.getBackground();
            case 'd':
                return btnD.getBackground();
            case 'e':
                return btnE.getBackground();
            case 'f':
                return btnF.getBackground();
            case 'g':
                return btnG.getBackground();
            case 'h':
                return btnH.getBackground();
            case 'i':
                return btnI.getBackground();
            case 'j':
                return btnJ.getBackground();
            case 'k':
                return btnK.getBackground();
            case 'l':
                return btnL.getBackground();
            case 'm':
                return btnM.getBackground();
            case 'o':
                return btnO.getBackground();
            case 'p':
                return btnP.getBackground();
            case 'q':
                return btnQ.getBackground();
            case 'r':
                return btnR.getBackground();
            case 's':
                return btnS.getBackground();
            case 't':
                return btnT.getBackground();
            case 'u':
                return btnU.getBackground();
            case 'v':
                return btnV.getBackground();
            case 'x':
                return btnX.getBackground();
            case 'w':
                return btnW.getBackground();
            case 'y':
                return btnY.getBackground();
            case 'z':
                return btnZ.getBackground();
            default:
                return new MyPanel().getBackground();
        }
    }
      
      
      
      
    protected javax.swing.JButton btnA;
    protected javax.swing.JButton btnB;
    protected javax.swing.JButton btnC;
    protected javax.swing.JButton btnD;
    protected javax.swing.JButton btnDEL;
    protected javax.swing.JButton btnE;
    protected javax.swing.JButton btnENT;
    protected javax.swing.JButton btnF;
    protected javax.swing.JButton btnG;
    protected javax.swing.JButton btnH;
    protected javax.swing.JButton btnI;
    protected javax.swing.JButton btnJ;
    protected javax.swing.JButton btnK;
    protected javax.swing.JButton btnL;
    protected javax.swing.JButton btnM;
    protected javax.swing.JButton btnN;
    protected javax.swing.JButton btnO;
    protected javax.swing.JButton btnP;
    protected javax.swing.JButton btnQ;
    protected javax.swing.JButton btnR;
    protected javax.swing.JButton btnS;
    protected javax.swing.JButton btnT;
    protected javax.swing.JButton btnU;
    protected javax.swing.JButton btnV;
    protected javax.swing.JButton btnW;
    protected javax.swing.JButton btnX;
    protected javax.swing.JButton btnY;
    protected javax.swing.JButton btnZ;
    protected javax.swing.JButton jButton27;
    protected javax.swing.JPanel jPanel1;
    protected javax.swing.JPanel jPanel3;
    protected javax.swing.JLabel lblwordlist;
    protected javax.swing.JPanel pnlkeyboard;
     protected javax.swing.JPanel jPanel2;
     protected javax.swing.JLabel jLabel1;
     protected javax.swing.JLabel jLabel2;
     protected javax.swing.JLabel jLabel3;
     protected javax.swing.JLabel jLabel4;
   
    
     
}
