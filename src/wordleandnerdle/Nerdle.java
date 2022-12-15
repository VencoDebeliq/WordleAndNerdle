/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package wordleandnerdle;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author mac
 */
public class Nerdle extends NerdleMethods {
    
    
    /**
     * Creates new form Nerdle
     */
    private final int dulzhyna=8;
    
    
    public Nerdle() {
        super();
        setTitle("Nerdle");
        initComponents();
        
        Toolkit obj=getToolkit();
        Dimension size=obj.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight());
        init_arr();
        lblequation.setVisible(false);
        
    }
   
    
    private void init_arr()
    {
        int n = 8;
        int m = 6;
        for (int i = 0; i < n; ++i)
        {
            for (int j = 0; j < m; ++j)
            {
                pnlarr[i][j] = new MyPanel();
                add(pnlarr[i][j]);
                pnlarr[i][j].setBounds(15 + i * (35 + 18), 40 + j * (35 + 18), 35, 35);
            }
        }
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
            if (!is_valid(GetInfofromPanels.getInput(pnlarr, currj,dulzhyna))) 
                lblequation.setVisible(true);
             ActionListener taskperformer=new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    lblequation.setVisible(false);

                }
            };
            new javax.swing.Timer(3000, taskperformer).start();
                
          
               
            if (!is_valid(GetInfofromPanels.getInput(pnlarr, currj,dulzhyna))) return;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            
        }
        for (int i = 0; i < 8; ++i)
        {
            for (int j = currj; j < 6; ++j)
            {
                pnlarr[i][j].repaint();
                //pnlarr[i][j].setBackground(new MyPanel().getBackground());
            }
        }
        if (pnlarr[curri][currj].getComponentCount() == 0) return; // checking if the panle has any components
        paint(GetInfofromPanels.getInput(pnlarr, currj,dulzhyna));
        System.out.println(currj);
        if(GetInfofromPanels.solved(pnlarr, currj, 8)){
            System.out.println("in if");
            ActionListener taskperformer=new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    setVisible(false);

                }
            };
            new javax.swing.Timer(1000, taskperformer).start();
            
         
            new Goodgame().setVisible(true);

        }
        else if (currj == 5)
        {
            System.out.println("in else");
            ActionListener taskperformer=new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    setVisible(false);

                }
            };
            new javax.swing.Timer(1000, taskperformer).start();
            
         
            new Gameover().setVisible(true);
        }
        setJ(currj + 1);
        setI(0);
        
         
       
    }//GEN-LAST:event_btnENTActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if (pnlarr[curri][currj].getComponentCount() != 0) return;
        javax.swing.JLabel lbl = new javax.swing.JLabel();
        pnlarr[curri][currj].add(lbl);
        lbl.setText("1");
        Font font = new Font("Arial", Font.BOLD, 27);
        lbl.setFont(font);
        lbl.setVisible(true);
        setI(curri + 1);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if (pnlarr[curri][currj].getComponentCount() != 0) return;
        javax.swing.JLabel lbl = new javax.swing.JLabel();
        pnlarr[curri][currj].add(lbl);
        lbl.setText("3");
        Font font = new Font("Arial", Font.BOLD, 27);
        lbl.setFont(font);
        lbl.setVisible(true);
        setI(curri + 1);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if (pnlarr[curri][currj].getComponentCount() != 0) return;
        javax.swing.JLabel lbl = new javax.swing.JLabel();
        pnlarr[curri][currj].add(lbl);
        lbl.setText("5");
        Font font = new Font("Arial", Font.BOLD, 27);
        lbl.setFont(font);
        lbl.setVisible(true);
        setI(curri + 1);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        if (pnlarr[curri][currj].getComponentCount() != 0) return;
        javax.swing.JLabel lbl = new javax.swing.JLabel();
        pnlarr[curri][currj].add(lbl);
        lbl.setText("6");
        Font font = new Font("Arial", Font.BOLD, 27);
        lbl.setFont(font);
        lbl.setVisible(true);
        setI(curri + 1);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        if (pnlarr[curri][currj].getComponentCount() != 0) return;
        javax.swing.JLabel lbl = new javax.swing.JLabel();
        pnlarr[curri][currj].add(lbl);
        lbl.setText("7");
        Font font = new Font("Arial", Font.BOLD, 27);
        lbl.setFont(font);
        lbl.setVisible(true);
        setI(curri + 1);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if (pnlarr[curri][currj].getComponentCount() != 0) return;
        javax.swing.JLabel lbl = new javax.swing.JLabel();
        pnlarr[curri][currj].add(lbl);
        lbl.setText("8");
        Font font = new Font("Arial", Font.BOLD, 27);
        lbl.setFont(font);
        lbl.setVisible(true);
        setI(curri + 1);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        if (pnlarr[curri][currj].getComponentCount() != 0) return;
        javax.swing.JLabel lbl = new javax.swing.JLabel();
        pnlarr[curri][currj].add(lbl);
        lbl.setText("9");
        Font font = new Font("Arial", Font.BOLD, 27);
        lbl.setFont(font);
        lbl.setVisible(true);
        setI(curri + 1);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        if (pnlarr[curri][currj].getComponentCount() != 0) return;
        javax.swing.JLabel lbl = new javax.swing.JLabel();
        pnlarr[curri][currj].add(lbl);
        lbl.setText("0");
        Font font = new Font("Arial", Font.BOLD, 27);
        lbl.setFont(font);
        lbl.setVisible(true);
        setI(curri + 1);
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnPLUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPLUSActionPerformed
        if (pnlarr[curri][currj].getComponentCount() != 0) return;
        javax.swing.JLabel lbl = new javax.swing.JLabel();
        pnlarr[curri][currj].add(lbl);
        lbl.setText("+");
        Font font = new Font("Arial", Font.BOLD, 27);
        lbl.setFont(font);
        lbl.setVisible(true);
        setI(curri + 1);
    }//GEN-LAST:event_btnPLUSActionPerformed

    private void btnMINUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMINUSActionPerformed
        if (pnlarr[curri][currj].getComponentCount() != 0) return;
        javax.swing.JLabel lbl = new javax.swing.JLabel();
        pnlarr[curri][currj].add(lbl);
        lbl.setText("-");
        Font font = new Font("Arial", Font.BOLD, 27);
        lbl.setFont(font);
        lbl.setVisible(true);
        setI(curri + 1);
    }//GEN-LAST:event_btnMINUSActionPerformed

    private void btnMULTIPLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMULTIPLActionPerformed
        if (pnlarr[curri][currj].getComponentCount() != 0) return;
        javax.swing.JLabel lbl = new javax.swing.JLabel();
        pnlarr[curri][currj].add(lbl);
        lbl.setText("*");
        Font font = new Font("Arial", Font.BOLD, 27);
        lbl.setFont(font);
        lbl.setVisible(true);
        setI(curri + 1);
    }//GEN-LAST:event_btnMULTIPLActionPerformed

    private void btnDIVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDIVActionPerformed
        if (pnlarr[curri][currj].getComponentCount() != 0) return;
        javax.swing.JLabel lbl = new javax.swing.JLabel();
        pnlarr[curri][currj].add(lbl);
        lbl.setText("/");
        Font font = new Font("Arial", Font.BOLD, 27);
        lbl.setFont(font);
        lbl.setVisible(true);
        setI(curri + 1);
    }//GEN-LAST:event_btnDIVActionPerformed

    private void btnEQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEQActionPerformed
        if (pnlarr[curri][currj].getComponentCount() != 0) return;
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
    /*
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
    */

}
