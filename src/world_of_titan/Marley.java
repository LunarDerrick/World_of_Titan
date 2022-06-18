/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package world_of_titan;

import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author hongb
 */
public class Marley extends javax.swing.JFrame {

    /**
     * Creates new form Marley
     */
    public Marley() {
        initComponents();
        paradis.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        convertbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        marley = new javax.swing.JTextField();
        paradis = new javax.swing.JTextField();
        encryption = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 506, 547, 0));

        convertbtn.setBackground(new java.awt.Color(255, 204, 102));
        convertbtn.setFont(new java.awt.Font("Viner Hand ITC", 0, 12)); // NOI18N
        convertbtn.setText("Convert");
        convertbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertbtnActionPerformed(evt);
            }
        });
        getContentPane().add(convertbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 518, -1, -1));

        jLabel3.setFont(new java.awt.Font("Viner Hand ITC", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Marley Converter");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(255, 255, 255)));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 550, 105));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Marley:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Paradis:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, -1));

        marley.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        marley.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        marley.setToolTipText("");
        marley.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        marley.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marleyActionPerformed(evt);
            }
        });
        getContentPane().add(marley, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 547, 145));

        paradis.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        paradis.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        paradis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paradisActionPerformed(evt);
            }
        });
        getContentPane().add(paradis, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 547, 145));

        encryption.setBackground(new java.awt.Color(255, 204, 102));
        encryption.setFont(new java.awt.Font("Viner Hand ITC", 0, 12)); // NOI18N
        encryption.setText("Cipher");
        encryption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encryptionActionPerformed(evt);
            }
        });
        getContentPane().add(encryption, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 518, -1, -1));

        back.setBackground(new java.awt.Color(255, 204, 102));
        back.setForeground(new java.awt.Color(0, 0, 0));
        back.setIcon(new javax.swing.ImageIcon("C:\\Users\\hongb\\OneDrive\\Documents\\NetBeansProjects\\Assignment\\src\\assignment\\DS Assignment\\icons8-reply-arrow-30.png")); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\hongb\\OneDrive\\Documents\\NetBeansProjects\\World_of_Titan\\src\\world_of_titan\\DS Assignment\\Et6K6QuVgAIQEqb.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void convertbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertbtnActionPerformed
        // TODO add your handling code here:
       MyHashMap<Character, Character> Marley = new MyHashMap<Character, Character>();
        Marley.put('a', 'j');
        Marley.put('b', 'c');
        Marley.put('c', 't');
        Marley.put('d', 'a');
        Marley.put('e', 'k');
        Marley.put('f', 'z');
        Marley.put('g', 's');
        Marley.put('h', 'i');
        Marley.put('i', 'w');
        Marley.put('j', 'x');
        Marley.put('k', 'o');
        Marley.put('l', 'n');
        Marley.put('m', 'g');
        Marley.put('n', 'b');
        Marley.put('o', 'f');
        Marley.put('p', 'h');
        Marley.put('q', 'l');
        Marley.put('r', 'd');
        Marley.put('s', 'e');
        Marley.put('t', 'y');
        Marley.put('u', 'm');
        Marley.put('v', 'v');
        Marley.put('w', 'u');
        Marley.put('x', 'p');
        Marley.put('y', 'q');
        Marley.put('z', 'r');
        Marley.put('A', 'J');
        Marley.put('B', 'C');
        Marley.put('C', 'T');
        Marley.put('D', 'A');
        Marley.put('E', 'K');
        Marley.put('F', 'Z');
        Marley.put('G', 'S');
        Marley.put('H', 'I');
        Marley.put('I', 'W');
        Marley.put('J', 'X');
        Marley.put('K', 'O');
        Marley.put('L', 'N');
        Marley.put('M', 'G');
        Marley.put('N', 'B');
        Marley.put('O', 'F');
        Marley.put('P', 'H');
        Marley.put('Q', 'L');
        Marley.put('R', 'D');
        Marley.put('S', 'E');
        Marley.put('T', 'Y');
        Marley.put('U', 'M');
        Marley.put('V', 'V');
        Marley.put('W', 'U');
        Marley.put('X', 'P');
        Marley.put('Y', 'Q');
        Marley.put('Z', 'R');
        Marley.put('$', ' ');
        Marley.put(',', ',');
        Marley.put('(', ' ' );
        Marley.put(')', ' ');
        
        if (marley.equals("")){
                JOptionPane.showMessageDialog(null,"Please Enter All Data!","Error",JOptionPane.ERROR_MESSAGE);
            }
            char[] marleychar = marley.getText().toCharArray();
            String store ="";

            Stack<Character>s = new Stack<>();
            for (int i = 0; i < marleychar.length; i++) {
                
                if(marleychar[i]=='^'){
                    i++;
                    store+=Character.toUpperCase(Marley.get(marleychar[i++]));
                }
                
                if(marleychar[i]=='('){
                    i++;
                    while(marleychar[i]!=')'){
                        
                        if(marleychar[i]=='^'){
                            i++;
                            s.push(Character.toUpperCase(marleychar[i++]));
                        }
                        
                        else{
                            s.push(marleychar[i++]);
                        } 
                    }
                                        
                    while(!s.isEmpty()){
                        store+=Marley.get(s.pop());
                    }
                }
                else{
                    store+=Marley.get(marleychar[i]);
                }
            }
            paradis.setText(store);
            paradis.setEditable(false);
            
    }//GEN-LAST:event_convertbtnActionPerformed

    private void marleyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marleyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marleyActionPerformed

    private void paradisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paradisActionPerformed
        // TODO add your handling code here:
        paradis.setEnabled(false);
        paradis.setEditable(false);
    }//GEN-LAST:event_paradisActionPerformed

    private void encryptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encryptionActionPerformed
        // TODO add your handling code here:
        Security e = new Security();
        e.show();
        
        
    }//GEN-LAST:event_encryptionActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        Menu m2 = new Menu();
        m2.show();

        dispose();
    }//GEN-LAST:event_backActionPerformed
public class MyHashMap<K, V> {
    class Entry<K, V> {
        final K key;
        V value;
        Entry<K, V> next;

        public Entry(K key, V value, Entry<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        // getters, equals, hashCode and toString

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public Entry<K, V> getNext() {
            return next;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public String toString() {
          Entry<K,V> temp = this;
          StringBuilder sb = new StringBuilder();
          while (temp != null) {
            sb.append(temp.key + " -> " + temp.value + ",");
            temp = temp.next;
          }      
          return sb.toString();
        }


    }
    
    private Entry<K, V>[] buckets;
    private static final int INITIAL_CAPACITY = 1 << 4; // 16

    private int size = 0;

    public MyHashMap() {
        this(INITIAL_CAPACITY);
    }

    public MyHashMap(int capacity) {
        this.buckets = new Entry[capacity];
    }



    public void put(K key, V value) {
        Entry<K, V> entry = new Entry<>(key, value, null);

        int bucket = key.hashCode() % INITIAL_CAPACITY;

        Entry<K, V> existing = buckets[bucket];
        if (existing == null) {
            buckets[bucket] = entry;
            size++;
        } else {
            // compare the keys see if key already exists
            while (existing.next != null) {
                if (existing.key.equals(key)) {
                    existing.value = value;
                    return;
                }
                existing = existing.next;
            }

            if (existing.key.equals(key)) {
                existing.value = value;
            } else {
                existing.next = entry;
                size++;
            }
        }
    } 
    
    public V get(K key) {
        Entry<K, V> bucket = buckets[key.hashCode() % INITIAL_CAPACITY];

        while (bucket != null) {
            if (bucket.key.equals(key)) {
                return bucket.value;
            }
            bucket = bucket.next;
        }
        return null;
    }
}
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
            java.util.logging.Logger.getLogger(Marley.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Marley.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Marley.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Marley.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Marley().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton convertbtn;
    private javax.swing.JButton encryption;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JProgressBar jProgressBar1;
    public static javax.swing.JTextField marley;
    public static javax.swing.JTextField paradis;
    // End of variables declaration//GEN-END:variables
}
