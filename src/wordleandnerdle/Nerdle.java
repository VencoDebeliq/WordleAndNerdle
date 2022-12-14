/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package wordleandnerdle;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 *
 * @author mac
 */
public class Nerdle extends javax.swing.JFrame {
    private String equation;
    private javax.swing.JPanel[][] pnlarr = new javax.swing.JPanel[8][6];
    private int curri;
    private int currj;
    
    private void setJ(int currj) // setting currj variable
    {
        if (currj < 0) return;
        if (currj < 6)
            this.currj = currj;
        else
            throw new RuntimeException("Out of bounds");
    }
    
    private void setI(int curri) // setting curri variable
    {
        if (curri < 0) return ;
        if (curri < 8)
            this.curri = curri;  
    }
    /**
     * Creates new form Nerdle
     */
    
    public Nerdle() {
        setTitle("Nerdle");
        initComponents();
        init_arr();
        equation = generateEquation();
        lblequation.setVisible(false);
    }
    private String getEquation()
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
    private boolean is_valid(String eq)
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
    
    private void init_arr()
    {
        int n = 8;
        int m = 6;
        for (int i = 0; i < n; ++i)
        {
            for (int j = 0; j < m; ++j)
            {
                pnlarr[i][j] = new javax.swing.JPanel();
                add(pnlarr[i][j]);
                pnlarr[i][j].setBounds(15 + i * (35 + 18), 40 + j * (35 + 18), 35, 35);
            }
        }
    }
    
    private int getEqAns(int a, int b, int si)
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
    private int getEqAns(int a, int b, char si)
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
    
    private void paint(String eq)
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
                pnlarr[i][currj].setBackground(new Color(102, 255, 102));
                countNums[(equation.charAt(i) - '0')]--;
            }
        }
        
        for (int i = 0; i < equation.length(); ++i)
        {
            if (arrIsGreen[i]) continue;
            if (!(eq.charAt(i) >= '0' && eq.charAt(i) <= '9')) continue;
            if (countNums[(eq.charAt(i) - '0')] == 0)
            {
                pnlarr[i][currj].setBackground(Color.BLACK);
            }
            else
            {
                pnlarr[i][currj].setBackground(new Color(102, 0, 153));
                countNums[eq.charAt(i) - '0']--;
            }
        }
    }
    
    private String generateEquation() // generates correct equation (has test outputs)
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnPLUS = new javax.swing.JButton();
        btnMULTIPL = new javax.swing.JButton();
        btnDIV = new javax.swing.JButton();
        btnEQ = new javax.swing.JButton();
        btnMINUS = new javax.swing.JButton();
        btnENT = new javax.swing.JButton();
        btnDEL = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblequation = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnPLUS.setText("+");
        btnPLUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPLUSActionPerformed(evt);
            }
        });

        btnMULTIPL.setText("*");
        btnMULTIPL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMULTIPLActionPerformed(evt);
            }
        });

        btnDIV.setText("/");
        btnDIV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDIVActionPerformed(evt);
            }
        });

        btnEQ.setText("=");
        btnEQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEQActionPerformed(evt);
            }
        });

        btnMINUS.setText("-");
        btnMINUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMINUSActionPerformed(evt);
            }
        });

        btnENT.setText("ENTER");
        btnENT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnENTActionPerformed(evt);
            }
        });

        btnDEL.setText("DEL");
        btnDEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDELActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPLUS, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMINUS, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMULTIPL, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDIV, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEQ, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnENT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnDEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPLUS, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMULTIPL, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDIV, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEQ, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMINUS, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnENT, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDEL, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblequation.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblequation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblequation.setText("NOT A PROPER EQUATION");
        lblequation.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(lblequation, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblequation, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 336, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        javax.swing.JLabel lbl = new javax.swing.JLabel();
        pnlarr[curri][currj].add(lbl);
        lbl.setText("4");
        Font font = new Font("Arial", Font.BOLD, 27);
        lbl.setFont(font);
        lbl.setVisible(true);
        setI(curri + 1);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        javax.swing.JLabel lbl = new javax.swing.JLabel();
        pnlarr[curri][currj].add(lbl);
        lbl.setText("2");
        Font font = new Font("Arial", Font.BOLD, 27);
        lbl.setFont(font);
        lbl.setVisible(true);
        setI(curri + 1);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btnENTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnENTActionPerformed
        try
        {
            if (!is_valid(getEquation())) 
                lblequation.setVisible(true);
             ActionListener taskperformer=new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    lblequation.setVisible(false);

                }
            };
            new javax.swing.Timer(3000, taskperformer).start();
                
                return;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            
        }
        for (int i = 0; i < 8; ++i)
        {
            for (int j = currj; j < 6; ++j)
            {
                pnlarr[i][j].setBackground(new MyPanel().getBackground());
            }
        }
        if (pnlarr[curri][currj].getComponentCount() == 0) return; // checking if the panle has any components
        paint(getEquation());
        setJ(currj + 1);
        setI(0);
        // test
    }//GEN-LAST:event_btnENTActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        javax.swing.JLabel lbl = new javax.swing.JLabel();
        pnlarr[curri][currj].add(lbl);
        lbl.setText("1");
        Font font = new Font("Arial", Font.BOLD, 27);
        lbl.setFont(font);
        lbl.setVisible(true);
        setI(curri + 1);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        javax.swing.JLabel lbl = new javax.swing.JLabel();
        pnlarr[curri][currj].add(lbl);
        lbl.setText("3");
        Font font = new Font("Arial", Font.BOLD, 27);
        lbl.setFont(font);
        lbl.setVisible(true);
        setI(curri + 1);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        javax.swing.JLabel lbl = new javax.swing.JLabel();
        pnlarr[curri][currj].add(lbl);
        lbl.setText("5");
        Font font = new Font("Arial", Font.BOLD, 27);
        lbl.setFont(font);
        lbl.setVisible(true);
        setI(curri + 1);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        javax.swing.JLabel lbl = new javax.swing.JLabel();
        pnlarr[curri][currj].add(lbl);
        lbl.setText("6");
        Font font = new Font("Arial", Font.BOLD, 27);
        lbl.setFont(font);
        lbl.setVisible(true);
        setI(curri + 1);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        javax.swing.JLabel lbl = new javax.swing.JLabel();
        pnlarr[curri][currj].add(lbl);
        lbl.setText("7");
        Font font = new Font("Arial", Font.BOLD, 27);
        lbl.setFont(font);
        lbl.setVisible(true);
        setI(curri + 1);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        javax.swing.JLabel lbl = new javax.swing.JLabel();
        pnlarr[curri][currj].add(lbl);
        lbl.setText("8");
        Font font = new Font("Arial", Font.BOLD, 27);
        lbl.setFont(font);
        lbl.setVisible(true);
        setI(curri + 1);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        javax.swing.JLabel lbl = new javax.swing.JLabel();
        pnlarr[curri][currj].add(lbl);
        lbl.setText("9");
        Font font = new Font("Arial", Font.BOLD, 27);
        lbl.setFont(font);
        lbl.setVisible(true);
        setI(curri + 1);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        javax.swing.JLabel lbl = new javax.swing.JLabel();
        pnlarr[curri][currj].add(lbl);
        lbl.setText("0");
        Font font = new Font("Arial", Font.BOLD, 27);
        lbl.setFont(font);
        lbl.setVisible(true);
        setI(curri + 1);
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnPLUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPLUSActionPerformed
        javax.swing.JLabel lbl = new javax.swing.JLabel();
        pnlarr[curri][currj].add(lbl);
        lbl.setText("+");
        Font font = new Font("Arial", Font.BOLD, 27);
        lbl.setFont(font);
        lbl.setVisible(true);
        setI(curri + 1);
    }//GEN-LAST:event_btnPLUSActionPerformed

    private void btnMINUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMINUSActionPerformed
        javax.swing.JLabel lbl = new javax.swing.JLabel();
        pnlarr[curri][currj].add(lbl);
        lbl.setText("-");
        Font font = new Font("Arial", Font.BOLD, 27);
        lbl.setFont(font);
        lbl.setVisible(true);
        setI(curri + 1);
    }//GEN-LAST:event_btnMINUSActionPerformed

    private void btnMULTIPLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMULTIPLActionPerformed
        javax.swing.JLabel lbl = new javax.swing.JLabel();
        pnlarr[curri][currj].add(lbl);
        lbl.setText("*");
        Font font = new Font("Arial", Font.BOLD, 27);
        lbl.setFont(font);
        lbl.setVisible(true);
        setI(curri + 1);
    }//GEN-LAST:event_btnMULTIPLActionPerformed

    private void btnDIVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDIVActionPerformed
        javax.swing.JLabel lbl = new javax.swing.JLabel();
        pnlarr[curri][currj].add(lbl);
        lbl.setText("/");
        Font font = new Font("Arial", Font.BOLD, 27);
        lbl.setFont(font);
        lbl.setVisible(true);
        setI(curri + 1);
    }//GEN-LAST:event_btnDIVActionPerformed

    private void btnEQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEQActionPerformed
        javax.swing.JLabel lbl = new javax.swing.JLabel();
        pnlarr[curri][currj].add(lbl);
        lbl.setText("=");
        Font font = new Font("Arial", Font.BOLD, 27);
        lbl.setFont(font);
        lbl.setVisible(true);
        setI(curri + 1);
    }//GEN-LAST:event_btnEQActionPerformed

    private void btnDELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDELActionPerformed
        if (pnlarr[curri][currj].getComponentCount() == 0)
            try
            {
                pnlarr[curri - 1][currj] = new MyPanel();
                add(pnlarr[curri - 1][currj]);
                pnlarr[curri - 1][currj].setBounds(15 + (curri - 1) * (35 + 18), 40 + currj * (35 + 18), 35, 35);
                setI(curri - 1);
            }
            catch (RuntimeException e){}
        else
        {
            pnlarr[curri][currj] = new MyPanel();
            add(pnlarr[curri][currj]);
            pnlarr[curri][currj].setBounds(15 + curri * (35 + 18), 40 + currj * (35 + 18), 35, 35);
        }
    }//GEN-LAST:event_btnDELActionPerformed

    public static void Run() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Nerdle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nerdle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nerdle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nerdle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nerdle().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnDEL;
    private javax.swing.JButton btnDIV;
    private javax.swing.JButton btnENT;
    private javax.swing.JButton btnEQ;
    private javax.swing.JButton btnMINUS;
    private javax.swing.JButton btnMULTIPL;
    private javax.swing.JButton btnPLUS;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblequation;
    // End of variables declaration//GEN-END:variables
}
