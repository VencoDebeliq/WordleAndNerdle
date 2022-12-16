package wordleandnerdle;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author mac
 */
public class Gameover extends javax.swing.JFrame {

    protected static String caseforpanel;
    public static void setCase(String s){
        Gameover.caseforpanel=s;
    }
    public static String getCase(){
        return caseforpanel;
    }
    
    private void setLBL(){
        if(getCase().length()>5){
            lblrevealwordorequation.setText(String.format("YOUR EQUATION WAS %s",getCase() ));
        }
        else{
            lblrevealwordorequation.setText(String.format("YOUR WORD WAS %s",getCase().toUpperCase() ));
        }
    }
   
    public Gameover() {
        initComponents();
        Toolkit obj=getToolkit();
        Dimension size=obj.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight());
        setLBL();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainpnl = new javax.swing.JPanel();
        lblgameover = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnplayagain = new javax.swing.JButton();
        lblrevealwordorequation = new javax.swing.JLabel();
        lbl0points = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainpnl.setBackground(new java.awt.Color(0, 153, 255));

        lblgameover.setFont(new java.awt.Font("Baskerville", 3, 48)); // NOI18N
        lblgameover.setForeground(new java.awt.Color(255, 255, 255));
        lblgameover.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblgameover.setText("GAME OVER!");

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BACK TO MENU");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnplayagain.setBackground(new java.awt.Color(0, 153, 255));
        btnplayagain.setForeground(new java.awt.Color(255, 255, 255));
        btnplayagain.setText("PLAY AGAIN");
        btnplayagain.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnplayagain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplayagainActionPerformed(evt);
            }
        });

        lblrevealwordorequation.setFont(new java.awt.Font("Baskerville", 3, 24)); // NOI18N
        lblrevealwordorequation.setForeground(new java.awt.Color(255, 255, 255));
        lblrevealwordorequation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbl0points.setFont(new java.awt.Font("Baskerville", 3, 18)); // NOI18N
        lbl0points.setForeground(new java.awt.Color(255, 255, 255));
        lbl0points.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl0points.setText("YOU GET 0 POINTS");

        javax.swing.GroupLayout mainpnlLayout = new javax.swing.GroupLayout(mainpnl);
        mainpnl.setLayout(mainpnlLayout);
        mainpnlLayout.setHorizontalGroup(
            mainpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainpnlLayout.createSequentialGroup()
                        .addComponent(btnplayagain, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 329, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainpnlLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblgameover, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainpnlLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblrevealwordorequation, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainpnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl0points, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
        );
        mainpnlLayout.setVerticalGroup(
            mainpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpnlLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(lblgameover, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblrevealwordorequation, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl0points, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(mainpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnplayagain, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnplayagainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplayagainActionPerformed
        // TODO add your handling code here:
        if(caseforpanel.length()>5){
            dispose();
            new Nerdle().setVisible(true);
        }
        else{
            dispose();
            try {
                new Wordle().setVisible(true);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Gameover.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }//GEN-LAST:event_btnplayagainActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        new ENTRYPAGE().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnplayagain;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lbl0points;
    private javax.swing.JLabel lblgameover;
    private javax.swing.JLabel lblrevealwordorequation;
    private javax.swing.JPanel mainpnl;
    // End of variables declaration//GEN-END:variables
}
