/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package world_of_titan;

import static java.lang.Math.abs;
import java.util.InputMismatchException;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author hongb
 */
public class Titans extends javax.swing.JFrame {
private java.util.LinkedList<Object> list = new java.util.LinkedList();
    /**
     * Creates new form Titans
     */
    public Titans() {
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

        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        titan = new javax.swing.JTextArea();
        num = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        generate = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        kill = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Viner Hand ITC", 1, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Titans");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 300, 105));

        titan.setEditable(false);
        titan.setColumns(20);
        titan.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        titan.setRows(5);
        jScrollPane1.setViewportView(titan);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 438, 110));

        num.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        num.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformed(evt);
            }
        });
        getContentPane().add(num, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 103, 160));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel1.setText("Enter number of TITAN:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 204));
        jButton1.setFont(new java.awt.Font("Viner Hand ITC", 0, 12)); // NOI18N
        jButton1.setText("Generate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 103, -1));
        getContentPane().add(generate, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 512, -1, -1));

        back.setBackground(new java.awt.Color(255, 255, 204));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/world_of_titan/DS Assignment/icons8-reply-arrow-30.png"))); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel4.setText("Sequence to be killed:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel5.setText("Total distance moved:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, -1, -1));

        kill.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        kill.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(kill, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, 330, 20));

        total.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, 220, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/world_of_titan/DS Assignment/Attack-on-Titan-Eren-1200x675.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     public class Titan implements Comparable<Titan> {

    private int index, risk, legs, speed, pattern, climbing, type, height;

    public Titan(int index) {
        this.index = index;
        TitanRisk(index);
    }

    public int getRisk() {
        return risk;
    }

    public int getIndex() {
        return index;
    }

    public int getLegs() {
        return legs;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPattern() {
        return pattern;
    }

    public int getClimbing() {
        return climbing;
    }

    public int getHeight() {
        return height;
    }

    public int getType() {
        return type;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setRisk(int risk) {
        this.risk = risk;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setPattern(int pattern) {
        this.pattern = pattern;
    }

    public void setClimbing(int climbing) {
        this.climbing = climbing;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void TitanRisk(int index) {
        Random titan = new Random();

        //generate a random number(0-9)
        //0-5 = normal type titan
        //6-8 = abnormal titan
        //9 = ONE OF THE NINE TITANS
        type = titan.nextInt(10);

        if (type < 6) {
            setHeight(titan.nextInt(25 - 5) + 5);

            Integer[] arraylegs = {0, 2, 4};
            legs = arraylegs[titan.nextInt(3)];

            setSpeed(titan.nextInt(25 - 5) + 5);

            setPattern(titan.nextInt(3));
            String patternstr = "";

            setClimbing(titan.nextInt(2));
            String climbingstr = "";

            Integer[] dangerrisk = new Integer[5];

            if (height > 20) {
                dangerrisk[0] = 3;
            } else if (height > 10) {
                dangerrisk[0] = 2;
            } else {
                dangerrisk[0] = 1;
            }

            if (legs == 4) {
                dangerrisk[1] = 3;
            } else if (legs == 2) {
                dangerrisk[1] = 2;
            } else {
                dangerrisk[1] = 1;
            }

            if (speed > 20) {
                dangerrisk[2] = 3;
            } else if (speed > 10) {
                dangerrisk[2] = 2;
            } else {
                dangerrisk[2] = 1;
            }

            if (pattern == 2) {
                dangerrisk[3] = 3;
                patternstr = "Not repeated pattern";
            } else if (pattern == 1) {
                dangerrisk[3] = 2;
                patternstr = "Repeated pattern";
            } else {
                dangerrisk[3] = 1;
                patternstr = "Normal pattern";
            }

            if (climbing == 1) {
                dangerrisk[4] = 3;
                climbingstr = "Can climb";
            } else {
                dangerrisk[4] = 1;
                climbingstr = "Cannot climb";
            }

            int risk = 0; //set the initial risk = 0
            for (int i = 0; i < dangerrisk.length; i++) {
                risk += dangerrisk[i];
            }

            this.risk = risk;
            list.add("Titan " + index + ": Normal Titan (" + height + "m, " + legs + " legs, " + speed + "ms, " + patternstr + ", " + climbingstr + ") Risk=" + risk+"\n");
        } else if (type < 9) {
            risk = 15;
            list.add("Titan " + index + ": Abnormal Titan Risk=" + risk+"\n");
        } else if (type < 10) {
            risk = 19;
            list.add("Titan " + index + ": ONE OF THE NINE TITANS Risk=" + risk+"\n");
        }
    }

    @Override
    public int compareTo(Titan temp) {
        if (this.getRisk() > temp.getRisk()) {
            return -1;
        } else if (this.getRisk() == temp.getRisk()) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        String p = "";
        String c = "";
        String t = "";
        if (getType() < 6) {
            t = "Normal Titan";

            switch (getPattern()) {
                case 1:
                    p = "normal pattern";
                    break;
                case 2:
                    p = "repeated pattern";
                    break;
                default:
                    p = "repeated pattern";
                    break;
            }

            if (getClimbing() == 3) {
                c = "can climb";
            } else {
                c = "cannot climb";
            }
            return "Titan " + getIndex() + ": " + t + " (" + getHeight() + "m, " + getLegs() + " legs, " + getSpeed() + "ms, " + p + ", " + c + ") Risk=" + risk;
        } else if (getType() < 9) {
            t = "Abnormal Titan";
            return "Titan " + getIndex() + ": " + t + " Risk=" + getRisk();
        } else {
            t = "ONE OF THE NINE TITANS";
            return "Titan " + getIndex() + ": " + t + " Risk=" + getRisk();
        }
    }

}   
    private void generateTitan(int numOfTitan) {
        String store = "";
       
        PriorityQueue<Titan> pq = new PriorityQueue<>();
        PriorityQueue<Titan> pqtmp = new PriorityQueue<>();

        for (int i = 1; i <= numOfTitan; i++) {
            pqtmp.add(new Titan(i));
        }

        while (!pqtmp.isEmpty()) {
            pq.add(pqtmp.poll());
        }

        int initial = 0;
        int distance = 0;
        int sequence;
        int counter = 0;

        String store2="";
        
        for (Titan titan : pq) {
            sequence = titan.getIndex();
            if (counter == pq.size() - 1) {
                store2+=("Titan " + sequence );
            } else {
                store2+=("Titan " + sequence + " --> ");
            }
            distance += abs(sequence - initial);
            initial = sequence;

            counter++;
        }

        total.setText(distance+"");
        kill.setText(store2);
        while(!list.isEmpty()){
        store += list.pop();
        titan.setText(store);
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        boolean t;
       do{
           
            try {
    
                if ((Integer.parseInt(num.getText()) >= -2147483647 && Integer.parseInt(num.getText())<= 2147483646) && num.getText().equals("")) {
                    t = false;
                } else {
                    t = true;
                }
            } catch (Exception e) {
               JOptionPane.showMessageDialog(null,"Please enter an integer!","Error",JOptionPane.ERROR_MESSAGE);
                num.setText("");
            }
        } while (t = false);
           
    
       generateTitan(Integer.parseInt(num.getText()));
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numActionPerformed

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
            java.util.logging.Logger.getLogger(Titans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Titans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Titans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Titans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Titans().setVisible(true);
            }
        });
  
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel generate;
    private static javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kill;
    public static javax.swing.JTextField num;
    private javax.swing.JTextArea titan;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
