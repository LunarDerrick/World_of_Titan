/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package world_of_titan;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author hongb
 */
public class Wall extends javax.swing.JFrame {
 private java.util.LinkedList<String> list = new java.util.LinkedList();
    /**
     * Creates new form Wall
     */
    public Wall() {
        initComponents();
        layer.setEditable(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        weak = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        enter = new javax.swing.JButton();
        num = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        layer = new javax.swing.JTextArea();
        Find = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 204, 102));
        jLabel3.setFont(new java.awt.Font("Viner Hand ITC", 1, 48)); // NOI18N
        jLabel3.setText("Wall of  Maria");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 37, -1, 105));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setText("Number of layers:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        weak.setEditable(false);
        weak.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        weak.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        weak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weakActionPerformed(evt);
            }
        });
        getContentPane().add(weak, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 110, 90));

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel2.setText("Weakest part of the wall is");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, -1, -1));

        enter.setBackground(new java.awt.Color(255, 255, 204));
        enter.setFont(new java.awt.Font("Viner Hand ITC", 0, 12)); // NOI18N
        enter.setText("Enter");
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });
        getContentPane().add(enter, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, -1, -1));

        num.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        num.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformed(evt);
            }
        });
        getContentPane().add(num, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 58, -1));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        layer.setColumns(20);
        layer.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        layer.setRows(5);
        jScrollPane2.setViewportView(layer);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 258, 170, 233));

        Find.setBackground(new java.awt.Color(255, 255, 204));
        Find.setFont(new java.awt.Font("Viner Hand ITC", 0, 12)); // NOI18N
        Find.setText("Find");
        Find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindActionPerformed(evt);
            }
        });
        getContentPane().add(Find, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 503, 170, -1));

        back.setBackground(new java.awt.Color(255, 255, 204));
        back.setForeground(new java.awt.Color(51, 51, 255));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/world_of_titan/DS Assignment/icons8-reply-arrow-30.png"))); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel4.setFont(new java.awt.Font("STSong", 1, 14)); // NOI18N
        jLabel4.setText("e.g. 2 4 6");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 232, -1, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/world_of_titan/DS Assignment/v-vilimir-petkov-highresscreenshot00010.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void weakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weakActionPerformed

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
        // TODO add your handling code here:

        try{
        String store = "";
        for(int i = 0;i<Integer.parseInt(num.getText());i++){
            list.add(" Enter brick edges of layer "+(i+1)+" ");
        }
        while(!list.isEmpty()){
           store += list.pop()+"\n";
        }
        layer.setText(store);
        layer.setEditable(true);
        }catch(Exception e){
           JOptionPane.showMessageDialog(null,"Please enter an integer!","Error",JOptionPane.ERROR_MESSAGE);
              num.setText("");
              layer.setText(""); 
        }
       
    }//GEN-LAST:event_enterActionPerformed

    private void numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numActionPerformed

    private void FindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindActionPerformed
        // TODO add your handling code here:
        try{
        String input="";
        List<List<Integer>> walls = new ArrayList<>();
        List<Integer> edges = new ArrayList<>();
        List<String> layers = new ArrayList<>();
        String[] a = layer.getText().split("\\r?\\n");
        //store each layer's edges into arraylist 'layers'
        for(String s:a){
            layers.add(s);
        }
        
        //for each element in arraylist 'layers', split the elements into single element
        //compare which edge has the most frequency
        int max = 0;
        do {
            edges.clear();
            for (int i=0; i <=layers.size()-1; i++) {
                input = layers.get(i);
                if (!input.isBlank()) {
                    String[] arr = input.split(" ");
                    for (String string : arr) {
                        int temp = Integer.parseInt(string);
                        edges.add(temp);
                        if (temp >= max) {
                            max = temp;
                        }
                    }
                } else {
                       JOptionPane.showMessageDialog(null,"Please Enter All Data!","Error",JOptionPane.ERROR_MESSAGE);
                       num.setText("");
                       layer.setText("");
                }
                if (max == 0) {
                JOptionPane.showMessageDialog(null,"Please any number larger than 0!","Error",JOptionPane.ERROR_MESSAGE);
                       num.setText("");
                       layer.setText("");
                }
            }
        } while (max == 0);

        walls.add(edges);
        List<Integer> index = walls.get(0);
        WallOfMaria wom = new WallOfMaria();
        String store = "";
        store += wom.getMost(index, max+1);
        weak.setText(store);
        }catch(Exception e){
           JOptionPane.showMessageDialog(null,"Invalid format!","Error",JOptionPane.ERROR_MESSAGE);   
        }
    }//GEN-LAST:event_FindActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        Menu m2 = new Menu();
        m2.show();

        dispose();
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(Wall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Wall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Wall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Wall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Wall().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Find;
    private javax.swing.JButton back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton enter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea layer;
    private javax.swing.JTextField num;
    private javax.swing.JTextField weak;
    // End of variables declaration//GEN-END:variables
}
