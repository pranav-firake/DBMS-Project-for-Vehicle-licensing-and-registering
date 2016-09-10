/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Report_Opt.java
 *
 * Created on 11 Oct, 2012, 10:44:22 AM
 */
package rto;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
/**
 *
 * @author Bhupesh
 */
public class Report_Opt extends javax.swing.JFrame {

    /** Creates new form Report_Opt */
    public Report_Opt() {
        initComponents();
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation((int)(d.width/2-this.getSize().getWidth()/2), (int)(d.height/2-this.getSize().height/2));
    
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lic = new javax.swing.JButton();
        veh_reg = new javax.swing.JButton();
        quit = new javax.swing.JButton();
        back = new javax.swing.JButton();
        home1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 24));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EASY RTO AGENCY");

        lic.setFont(new java.awt.Font("Times New Roman", 0, 14));
        lic.setText("License Register");
        lic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                licActionPerformed(evt);
            }
        });

        veh_reg.setFont(new java.awt.Font("Times New Roman", 0, 14));
        veh_reg.setText("Vehicle Register");
        veh_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veh_regActionPerformed(evt);
            }
        });

        quit.setFont(new java.awt.Font("Times New Roman", 0, 14));
        quit.setText("Quit");
        quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Times New Roman", 0, 14));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        home1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        home1.setText("Home");
        home1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Monthly Report");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(back)
                                .addGap(98, 98, 98)
                                .addComponent(home1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                        .addComponent(quit)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lic, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(54, 54, 54)
                    .addComponent(veh_reg, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back)
                    .addComponent(quit)
                    .addComponent(home1))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(137, 137, 137)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lic)
                        .addComponent(veh_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(138, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void licActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_licActionPerformed
        close();
        LicRep_frame obj=new LicRep_frame();
        obj.setVisible(true);    // TODO add your handling code here:
}//GEN-LAST:event_licActionPerformed

    private void veh_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veh_regActionPerformed
        close();
        VehRep_frame obj=new VehRep_frame();
        obj.setVisible(true);    // TODO add your handling code here:
}//GEN-LAST:event_veh_regActionPerformed

    private void quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitActionPerformed
        System.exit(0);    // TODO add your handling code here:
}//GEN-LAST:event_quitActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        close();
        Option_frame obj=new Option_frame();
        obj.setVisible(true);    // TODO add your handling code here:
}//GEN-LAST:event_backActionPerformed

    private void home1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home1ActionPerformed
close();
        Option_frame obj=new Option_frame();
        obj.setVisible(true);        // TODO add your handling code here:
}//GEN-LAST:event_home1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Report_Opt().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton home1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton lic;
    private javax.swing.JButton quit;
    private javax.swing.JButton veh_reg;
    // End of variables declaration//GEN-END:variables
private void close() {
     WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
     Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
}
