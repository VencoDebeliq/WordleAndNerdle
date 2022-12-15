/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wordleandnerdle;

import java.awt.Color;
import java.util.Random;

/**
 *
 * @author Ventsislav Peychev
 */
public class NerdleMethods extends javax.swing.JFrame {
    private String equation;
    protected javax.swing.JPanel[][] pnlarr = new javax.swing.JPanel[8][6];
    protected int curri;
    protected int currj;
    
    
    protected void setJ(int currj) // setting currj variable
    {
        if (currj < 0) return;
        if (currj < 6)
            this.currj = currj;
    }
    
    protected void setI(int curri) // setting curri variable
    {
        if (curri < 0) return ;
        if (curri < 8)
            this.curri = curri;  
    }
    
    protected NerdleMethods()
    {
        equation = generate();
    }
    
    protected boolean is_valid(String eq)
    {
        String num[] = new String[3];
        num[0] = "";
        num[1] = "";
        num[2] = "";
        int k = 0;
        char znak[] = new char[2];
        for (int i = 0; i < eq.length(); ++i)
        {
            if (!(eq.charAt(i) >= '0' && eq.charAt(i) <= '9'))
            {
                znak[k] = eq.charAt(i);
                k++;
            }
            else
            {
                num[k] += eq.charAt(i);
            }
        }
        try
        {
            return getEqAns(Integer.parseInt(num[0]), Integer.parseInt(num[1]), znak[0]) == Integer.parseInt(num[2]);
        }
        catch (RuntimeException re)
        {
            return false;
        }
    }
    
    protected int getEqAns(int a, int b, int si)
    {
        switch (si)
        {
            case 0:
                if (a % b == 0)
                    return a / b;
                else
                    throw new RuntimeException("Incorrect input");
            case 1:
                return a * b;
            case 2:
                return a + b;
            case 3:
                return a - b;
        }
        return 0;
    }
    
    protected int getEqAns(int a, int b, char si)
    {
        switch (si)
        {
            case '/':
                if (a % b == 0)
                    return a / b;
                else
                    throw new RuntimeException("Incorrect input");
            case '*':
                return a * b;
            case '+':
                return a + b;
            case '-':
                return a - b;
        }
        return 0;
    }
    
    protected String generate() // generates correct equation (has test outputs)
    {
        Random rand = new Random();
        String ans = "";
        final char[] znaci = 
        {
            '/', '*', '+', '-'
        };
        while (ans.length() != 8)
        {
            ans = "";
            int a = rand.nextInt(999) + 1;
            int b = rand.nextInt(999) + 1;
            int randInt = rand.nextInt(4);
            ans += a;
            ans += znaci[randInt];
            ans += b;
            ans += '=';
            try
            {
                if (getEqAns(a, b, randInt) < 0)
                {
                    ans = "";
                    continue;
                }
                ans += getEqAns(a, b, randInt);
            }
            catch (RuntimeException re)
            {
                ans = "";
                continue;
            }
            if (ans.length() <= 6) System.out.println("Less than 6");
        }
        System.out.println(ans);
        return ans;
    }
    
    protected void paintPanels(String eq)
    {
        boolean arrIsGreen[] = new boolean[8];
        int countNums[] = new int [10];
        for (int i = 0; i < equation.length(); ++i)
        {
            pnlarr[i][currj].getComponent(0).setForeground(Color.white);
            if (!(equation.charAt(i) >= '0' && equation.charAt(i) <= '9'))
            {
                continue;
            }
            countNums[(equation.charAt(i) - '0')]++;
            if (eq.charAt(i) == equation.charAt(i))
            {
                arrIsGreen[i] = true;
                pnlarr[i][currj].setBackground(new Color(102, 255, 102)); // paints panel in color green
                countNums[(equation.charAt(i) - '0')]--;
            }
        } // for za zeleni cifri
        
        for (int i = 0; i < equation.length(); ++i)
        {
            if (arrIsGreen[i]) continue;
            if (!(eq.charAt(i) >= '0' && eq.charAt(i) <= '9')) continue;
            if (countNums[(eq.charAt(i) - '0')] == 0)
            {
                pnlarr[i][currj].setBackground(Color.gray);
            }
            else
            {
                pnlarr[i][currj].setBackground(new Color(102, 0, 153)); // paints panel in color purple
                countNums[eq.charAt(i) - '0']--;
            }
        } // for za lilavi i cherni cifri
        for (int i = 0; i < eq.length(); ++i)
        {
            if (eq.charAt(i) >= '0' && eq.charAt(i) <= '9') continue;
            boolean ok = true;
            for (int j = 0; j < equation.length(); ++j)
            {
                if (eq.charAt(i) == equation.charAt(j))
                {
                    ok = false;
                    if (i == j)
                    {
                        arrIsGreen[i] = true;
                        pnlarr[i][currj].setBackground(new Color(102, 255, 102)); // paints panel in color green
                    }
                    else
                    {
                        pnlarr[i][currj].setBackground(new Color(102, 0, 153)); // paints panel in color purple
                    }
                }
            }
            if (ok) pnlarr[i][currj].setBackground(Color.gray);
        } // for za znaci
        
        for (int i = 0; i < eq.length(); ++i)
        {
            if (!arrIsGreen[i]) continue;
            paintBtn(eq.charAt(i), pnlarr[i][currj].getBackground());
        }
        
        for (int i = 0; i < eq.length(); ++i)
        {
            if (getBtnColor(eq.charAt(i)).getRGB() == (new Color(102, 0, 153)).getRGB() || getBtnColor(eq.charAt(i)).getRGB() == (new Color(102, 255, 102)).getRGB()) continue;
            paintBtn(eq.charAt(i), pnlarr[i][currj].getBackground());
        }
    }
    
    private void paintBtn(char c, Color col)
    {
        switch (c)
        {
            case '1':
                btn1.setForeground(Color.white);
                btn1.setBackground(col);
                break;
            case '2':
                btn2.setForeground(Color.white);
                btn2.setBackground(col);
                break;
            case '3':
                btn3.setForeground(Color.white);
                btn3.setBackground(col);
                break;
            case '4':
                btn4.setForeground(Color.white);
                btn4.setBackground(col);
                break;
            case '5':
                btn5.setForeground(Color.white);
                btn5.setBackground(col);
                break;
            case '6':
                btn6.setForeground(Color.white);
                btn6.setBackground(col);
                break;
            case '7':
                btn7.setForeground(Color.white);
                btn7.setBackground(col);
                break;
            case '8':
                btn8.setForeground(Color.white);
                btn8.setBackground(col);
                break;
            case '9':
                btn9.setForeground(Color.white);
                btn9.setBackground(col);
                break;
            case '0':
                btn0.setForeground(Color.white);
                btn0.setBackground(col);
                break;
            case '+':
                btnPLUS.setForeground(Color.white);
                btnPLUS.setBackground(col);
                break;
            case '-':
                btnMINUS.setForeground(Color.white);
                btnMINUS.setBackground(col);
                break;
            case '*':
                btnMULTIPL.setForeground(Color.white);
                btnMULTIPL.setBackground(col);
                break;
            case '/':
                btnDIV.setForeground(Color.white);
                btnDIV.setBackground(col);
                break;
            case '=':
                btnEQ.setForeground(Color.white);
                btnEQ.setBackground(col);
                break;
        }
    }

    private Color getBtnColor(char c)
    {
        switch (c)
        {
            case '1':
                return btn1.getBackground();
            case '2':
                return btn2.getBackground();
            case '3':
                return btn3.getBackground();
            case '4':
                return btn4.getBackground();
            case '5':
                return btn5.getBackground();
            case '6':
                return btn6.getBackground();
            case '7':
                return btn7.getBackground();
            case '8':
                return btn8.getBackground();
            case '9':
                return btn9.getBackground();
            case '0':
                return btn0.getBackground();
            case '+':
                return btnPLUS.getBackground();
            case '-':
                return btnMINUS.getBackground();
            case '*':
                return btnMULTIPL.getBackground();
            case '/':
                return btnDIV.getBackground();
            case '=':
                return btnEQ.getBackground();
            default:
                return new MyPanel().getBackground();
        }
    }
    
    
    protected javax.swing.JButton btn0;
    protected javax.swing.JButton btn1;
    protected javax.swing.JButton btn2;
    protected javax.swing.JButton btn3;
    protected javax.swing.JButton btn4;
    protected javax.swing.JButton btn5;
    protected javax.swing.JButton btn6;
    protected javax.swing.JButton btn7;
    protected javax.swing.JButton btn8;
    protected javax.swing.JButton btn9;
    protected javax.swing.JButton btnDEL;
    protected javax.swing.JButton btnDIV;
    protected javax.swing.JButton btnENT;
    protected javax.swing.JButton btnEQ;
    protected javax.swing.JButton btnMINUS;
    protected javax.swing.JButton btnMULTIPL;
    protected javax.swing.JButton btnPLUS;
    protected javax.swing.JPanel jPanel1;
    protected javax.swing.JPanel jPanel2;
    protected javax.swing.JLabel lblequation;
}
