/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package world_of_titan;

import javax.swing.JOptionPane;

/**
 *
 * @author hongb
 */
public class Killing extends javax.swing.JFrame {

    /**
     * Creates new form Killing
     */
    public Killing() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        location = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        best = new javax.swing.JTextArea();
        back = new javax.swing.JButton();
        Map = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Viner Hand ITC", 1, 48)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Killing");
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 310, 105));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel1.setText("Enter location of TITAN:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel2.setText("Best Path:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 314, -1, -1));

        location.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        location.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        location.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationActionPerformed(evt);
            }
        });
        getContentPane().add(location, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 252, 92, -1));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        best.setEditable(false);
        best.setColumns(20);
        best.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        best.setRows(5);
        best.setToolTipText("");
        best.setAutoscrolls(false);
        jScrollPane1.setViewportView(best);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 314, 182, 78));

        back.setBackground(new java.awt.Color(255, 255, 204));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/world_of_titan/DS Assignment/icons8-reply-arrow-30.png"))); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        Map.setBackground(new java.awt.Color(255, 255, 204));
        Map.setFont(new java.awt.Font("Viner Hand ITC", 0, 12)); // NOI18N
        Map.setText("Map");
        Map.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MapActionPerformed(evt);
            }
        });
        getContentPane().add(Map, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 452, 245, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 204));
        jButton2.setFont(new java.awt.Font("Viner Hand ITC", 0, 12)); // NOI18N
        jButton2.setText("Find moving TITAN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 204));
        jButton3.setFont(new java.awt.Font("Viner Hand ITC", 0, 12)); // NOI18N
        jButton3.setText("Find");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 252, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel5.setText("Time passed:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, -1, -1));

        time.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        getContentPane().add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, -1, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/world_of_titan/DS Assignment/AttackOnTitanErenVsColossal.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void locationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        Menu m2 = new Menu();
        m2.show();

        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void MapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MapActionPerformed
        // TODO add your handling code here:
        Map m = new Map();
        m.setVisible(true);
    }//GEN-LAST:event_MapActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Scouting scouting = new Scouting();
        scouting.loadMap("mapData.txt");
//        scouting.findMovingTitan();
        
        boolean hasError = false;
        int[] inputList = {-1};
        // collect raw input
        // input example: 1 3 5 (space)
        String input = Killing.location.getText();
        String[] inputStr = input.split(" ");
        // convert input to integer array
        inputList = new int[inputStr.length];
        if (inputStr.length == 0) {
            JOptionPane.showMessageDialog(null,"Please Enter The Location(s)!","Error",JOptionPane.ERROR_MESSAGE);
        } else {
            for (int i = 0; i < inputStr.length; i++) {
                if (scouting.isNumeric(inputStr[i]) && scouting.withinRange(inputStr[i])) {
                    inputList[i] = Integer.parseInt(inputStr[i]);
                } else {
                   JOptionPane.showMessageDialog(null,scouting.getErrorMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                   location.setText("");
                    hasError = true;
                    break;
                }
            }
            
            if (!hasError) {
                scouting.BFS2(inputList);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
                // attempt on 2.4 best path to kill titan
        // scouting.findTitan();
        Scouting scouting = new Scouting();
        scouting.loadMap("mapData.txt");
                String text = location.getText();
                if (scouting.isNumeric(text) && scouting.withinRange(text)) {
                    int value = Integer.parseInt(text);
                    
                    scouting.BFS(value);
                } else {
                    JOptionPane.showMessageDialog(null,scouting.getErrorMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                    location.setText("");
                }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Killing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Killing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Killing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Killing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Killing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Map;
    private javax.swing.JButton back;
    public static javax.swing.JTextArea best;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField location;
    public static javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
