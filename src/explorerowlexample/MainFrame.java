
package explorerowlexample;

import com.hp.hpl.jena.query.QuerySolution;
import java.awt.Color;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;



public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
     public ArrayList<String> ListActivite = new ArrayList<String>();  // for the  activity list
    public MainFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        role = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TxtPane = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        role1 = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        role2 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        role.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Human", "Other Animals" }));
        role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Host");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Symptoms : ");

        jScrollPane5.setViewportView(TxtPane);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 153, 0));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(255, 255, 255));
        jButton16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 0, 0));
        jButton16.setText("Clear");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        jLabel5.setText("ViralD");

        jButton3.setText("Visual Owl");

        role1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "----------------------", "Backpain", "Coughing", "Dehydration", "Diahorrea", "High Fever", "Impaired Bladder", "Loss of Sensation", "Muscle Ache", "Rash", "Seizure", "Shivering", "vomiting", "weakness" }));
        role1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                role1ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 153, 0));
        jButton4.setText("Search By Instance ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setForeground(new java.awt.Color(51, 153, 0));
        jButton5.setText("Search By Diseases");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Disease : ");

        role2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "----------------------", "Hepatitis_B", "Dengue", "Hepatitis A", "Mumps", "Rabies", "Small Pox" }));
        role2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                role2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(359, 359, 359)
                                .addComponent(jLabel5))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(250, 250, 250)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(role1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(role2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(role, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(115, 115, 115)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(63, 63, 63)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(role1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(role2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButton16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void projetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projetActionPerformed

       
    }//GEN-LAST:event_projetActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void role1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_role1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_role1ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        // jTextArea1.setText("");
        TxtPane.setText("");
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            //Diahorrea
            if(this.role1.getSelectedItem().toString().equals("Diahorrea"))
            {
                String queryString =
                "PREFIX onto: <http://www.semanticweb.org/dipta/ontologies/2018/4/untitled-ontology-28#>"
                + "SELECT distinct ?Virus "
                +"WHERE {?Virus onto:contains onto:diahorrea}";

                //  String s = go.toString();
                String s = OpenOWL.GetResultAsString(queryString); //call method GetResultAsString from OpenOWL class
                // test ;)
            System.out.println(s+"Has Diahorrea");

            // display it ..
            appendVersPane(TxtPane, s, Color.DARK_GRAY);

        }
            //Loss of Sensation
        if(this.role1.getSelectedItem().toString().equals("Loss of Sensation"))
            {
                String queryString =
                "PREFIX onto: <http://www.semanticweb.org/dipta/ontologies/2018/4/untitled-ontology-28#>"
                + "SELECT distinct ?Virus "
                +"WHERE {?Virus onto:contains onto:losssensation}";

                //  String s = go.toString();
                String s = OpenOWL.GetResultAsString(queryString); //call method GetResultAsString from OpenOWL class
                // test ;)
            System.out.println(s+"Has Diahorrea");

            // display it ..
            appendVersPane(TxtPane, s, Color.DARK_GRAY);

        }
        //Backpain
        if(this.role1.getSelectedItem().toString().equals("Backpain"))
            {
                String queryString =
                "PREFIX onto: <http://www.semanticweb.org/dipta/ontologies/2018/4/untitled-ontology-28#>"
                + "SELECT distinct ?Virus "
                +"WHERE {?Virus onto:contains onto:Back_Pain}";

                //  String s = go.toString();
                String s = OpenOWL.GetResultAsString(queryString); //call method GetResultAsString from OpenOWL class
                // test ;)
            System.out.println(s+"Has Diahorrea");

            // display it ..
            appendVersPane(TxtPane, s, Color.DARK_GRAY);

        }
        //Rash
        if(this.role1.getSelectedItem().toString().equals("Rash"))
            {
                String queryString =
                "PREFIX onto: <http://www.semanticweb.org/dipta/ontologies/2018/4/untitled-ontology-28#>"
                + "SELECT distinct ?Virus "
                +"WHERE {?Virus onto:contains onto:rash}"
                +"group by ?Virus";

                //  String s = go.toString();
                String s = OpenOWL.GetResultAsString(queryString); //call method GetResultAsString from OpenOWL class
                // test ;)
            System.out.println(s+"Has Diahorrea");

            // display it ..
            appendVersPane(TxtPane, s, Color.DARK_GRAY);

        }
        //Coughing
        if(this.role1.getSelectedItem().toString().equals("Coughing"))
            {
                String queryString =
                "PREFIX onto: <http://www.semanticweb.org/dipta/ontologies/2018/4/untitled-ontology-28#>"
                + "SELECT distinct ?Virus "
                +"WHERE {?Virus onto:contains onto:coughing}"
                +"group by ?Virus";

                //  String s = go.toString();
                String s = OpenOWL.GetResultAsString(queryString); //call method GetResultAsString from OpenOWL class
                // test ;)
            System.out.println(s+"Has Diahorrea");

            // display it ..
            appendVersPane(TxtPane, s, Color.DARK_GRAY);

        }
        //Vomoting
         if(this.role1.getSelectedItem().toString().equals("vomiting"))
            {
                String queryString =
                "PREFIX onto: <http://www.semanticweb.org/dipta/ontologies/2018/4/untitled-ontology-28#>"
                + "SELECT distinct ?Virus "
                +"WHERE {?Virus onto:contains onto:vomiting}"
                +"group by ?Virus";

                //  String s = go.toString();
                String s = OpenOWL.GetResultAsString(queryString); //call method GetResultAsString from OpenOWL class
                // test ;)
            System.out.println(s+"Has Diahorrea");

            // display it ..
            appendVersPane(TxtPane, s, Color.DARK_GRAY);

        }
        //Weakness
        if(this.role1.getSelectedItem().toString().equals("weakness"))
            {
                String queryString =
                "PREFIX onto: <http://www.semanticweb.org/dipta/ontologies/2018/4/untitled-ontology-28#>"
                + "SELECT distinct ?Virus "
                +"WHERE {?Virus onto:contains onto:weakness}"
                +"group by ?Virus";

                //  String s = go.toString();
                String s = OpenOWL.GetResultAsString(queryString); //call method GetResultAsString from OpenOWL class
                // test ;)
            System.out.println(s+"Has Diahorrea");

            // display it ..
            appendVersPane(TxtPane, s, Color.DARK_GRAY);

        }
        //Shivering
        if(this.role1.getSelectedItem().toString().equals("Shivering"))
            {
                String queryString =
                "PREFIX onto: <http://www.semanticweb.org/dipta/ontologies/2018/4/untitled-ontology-28#>"
                + "SELECT distinct ?Virus "
                +"WHERE {?Virus onto:contains onto:shivering}"
                +"group by ?Virus";

                //  String s = go.toString();
                String s = OpenOWL.GetResultAsString(queryString); //call method GetResultAsString from OpenOWL class
                // test ;)
            System.out.println(s+"Has Diahorrea");

            // display it ..
            appendVersPane(TxtPane, s, Color.DARK_GRAY);

        }
        //Seizures
        if(this.role1.getSelectedItem().toString().equals("Seizure"))
            {
                String queryString =
                "PREFIX onto: <http://www.semanticweb.org/dipta/ontologies/2018/4/untitled-ontology-28#>"
                + "SELECT distinct ?Virus "
                +"WHERE {?Virus onto:contains onto:seizure}"
                +"group by ?Virus";

                //  String s = go.toString();
                String s = OpenOWL.GetResultAsString(queryString); //call method GetResultAsString from OpenOWL class
                // test ;)
            System.out.println(s+"Has Diahorrea");

            // display it ..
            appendVersPane(TxtPane, s, Color.DARK_GRAY);

        }
        //Muscle Ache
        if(this.role1.getSelectedItem().toString().equals("Muscle Ache"))
            {
                String queryString =
                "PREFIX onto: <http://www.semanticweb.org/dipta/ontologies/2018/4/untitled-ontology-28#>"
                + "SELECT distinct ?Virus "
                +"WHERE {?Virus onto:contains onto:muscle_ache}"
                +"group by ?Virus";

                //  String s = go.toString();
                String s = OpenOWL.GetResultAsString(queryString); //call method GetResultAsString from OpenOWL class
                // test ;)
            System.out.println(s+"Has Diahorrea");

            // display it ..
            appendVersPane(TxtPane, s, Color.DARK_GRAY);

        }
        //Dehydration
        if(this.role1.getSelectedItem().toString().equals("Dehydration"))
            {
                String queryString =
                "PREFIX onto: <http://www.semanticweb.org/dipta/ontologies/2018/4/untitled-ontology-28#>"
                + "SELECT distinct ?Virus "
                +"WHERE {?Virus onto:contains onto:dehydration}"
                +"group by ?Virus";

                //  String s = go.toString();
                String s = OpenOWL.GetResultAsString(queryString); //call method GetResultAsString from OpenOWL class
                // test ;)
            System.out.println(s+"Has Diahorrea");

            // display it ..
            appendVersPane(TxtPane, s, Color.DARK_GRAY);

        }
        //impaired Bladder
        if(this.role1.getSelectedItem().toString().equals("Impaired Bladder"))
            {
                String queryString =
                "PREFIX onto: <http://www.semanticweb.org/dipta/ontologies/2018/4/untitled-ontology-28#>"
                + "SELECT distinct ?Virus "
                +"WHERE {?Virus onto:contains onto:impaired_bladder}"
                +"group by ?Virus";

                //  String s = go.toString();
                String s = OpenOWL.GetResultAsString(queryString); //call method GetResultAsString from OpenOWL class
                // test ;)
            System.out.println(s+"Has Diahorrea");

            // display it ..
            appendVersPane(TxtPane, s, Color.DARK_GRAY);

        }
        //High Fever
        if(this.role1.getSelectedItem().toString().equals("High Fever"))
            {
                String queryString =
                "PREFIX onto: <http://www.semanticweb.org/dipta/ontologies/2018/4/untitled-ontology-28#>"
                + "SELECT distinct ?Virus "
                +"WHERE {?Virus onto:contains onto:high_fever}"
                +"group by ?Virus";

                //  String s = go.toString();
                String s = OpenOWL.GetResultAsString(queryString); //call method GetResultAsString from OpenOWL class
                // test ;)
            System.out.println(s+"Has Diahorrea");

            // display it ..
            appendVersPane(TxtPane, s, Color.DARK_GRAY);

        }
        
        if(this.role2.getSelectedItem().toString().equals("Hepatitis B"))
            {
                String queryString =
                "PREFIX onto: <http://www.semanticweb.org/dipta/ontologies/2018/4/untitled-ontology-28#>"
                + "SELECT distinct distinct ?Host "
                +"WHERE {?Host onto:has onto:Hepatitis_B}"
                +"group by ?Virus";

                //  String s = go.toString();
                String s = OpenOWL.GetResultAsString(queryString); //call method GetResultAsString from OpenOWL class
                // test ;)
            System.out.println(s+"Has Diahorrea");

            // display it ..
            appendVersPane(TxtPane, s, Color.DARK_GRAY);

        }
        
        if(this.role2.getSelectedItem().toString().equals("Dengue"))
            {
                String queryString =
                "PREFIX onto: <http://www.semanticweb.org/dipta/ontologies/2018/4/untitled-ontology-28#>"
                + "SELECT distinct ?Host "
                +"WHERE {?Host onto:has onto:Dengue}";

                //  String s = go.toString();
                String s = OpenOWL.GetResultAsString(queryString); //call method GetResultAsString from OpenOWL class
                // test ;)
            System.out.println(s);

            // display it ..
            appendVersPane(TxtPane, s, Color.DARK_GRAY);

        }
        
        if(this.role2.getSelectedItem().toString().equals("Hepatitis A"))
            {
                String queryString =
                "PREFIX onto: <http://www.semanticweb.org/dipta/ontologies/2018/4/untitled-ontology-28#>"
                + "SELECT distinct ?Host "
                +"WHERE {?Host onto:has onto:Hepatitis_A}";

                //  String s = go.toString();
                String s = OpenOWL.GetResultAsString(queryString); //call method GetResultAsString from OpenOWL class
                // test ;)
            System.out.println(s);

            // display it ..
            appendVersPane(TxtPane, s, Color.DARK_GRAY);

        }
        
        if(this.role2.getSelectedItem().toString().equals("Mumps"))
            {
                String queryString =
                "PREFIX onto: <http://www.semanticweb.org/dipta/ontologies/2018/4/untitled-ontology-28#>"
                + "SELECT distinct ?Host "
                +"WHERE {?Host onto:has onto:Mumps}";

                //  String s = go.toString();
                String s = OpenOWL.GetResultAsString(queryString); //call method GetResultAsString from OpenOWL class
                // test ;)
            System.out.println(s);

            // display it ..
            appendVersPane(TxtPane, s, Color.DARK_GRAY);

        }
        
        if(this.role2.getSelectedItem().toString().equals("Mumps"))
            {
                String queryString =
                "PREFIX onto: <http://www.semanticweb.org/dipta/ontologies/2018/4/untitled-ontology-28#>"
                + "SELECT distinct ?Host "
                +"WHERE {?Host onto:has onto:Mumps}";

                //  String s = go.toString();
                String s = OpenOWL.GetResultAsString(queryString); //call method GetResultAsString from OpenOWL class
                // test ;)
            System.out.println(s);

            // display it ..
            appendVersPane(TxtPane, s, Color.DARK_GRAY);

        }
        
        if(this.role2.getSelectedItem().toString().equals("Rabies"))
            {
                String queryString =
                "PREFIX onto: <http://www.semanticweb.org/dipta/ontologies/2018/4/untitled-ontology-28#>"
                + "SELECT distinct ?Host "
                +"WHERE {?Host onto:has onto:Rabies}";

                //  String s = go.toString();
                String s = OpenOWL.GetResultAsString(queryString); //call method GetResultAsString from OpenOWL class
                // test ;)
            System.out.println(s);

            // display it ..
            appendVersPane(TxtPane, s, Color.DARK_GRAY);

        }
        
        if(this.role2.getSelectedItem().toString().equals("Small Pox"))
            {
                String queryString =
                "PREFIX onto: <http://www.semanticweb.org/dipta/ontologies/2018/4/untitled-ontology-28#>"
                + "SELECT ?Host "
                +"WHERE {?Host onto:has onto:Smallpox}";

                //  String s = go.toString();
                String s = OpenOWL.GetResultAsString(queryString); //call method GetResultAsString from OpenOWL class
                // test ;)
            System.out.println(s);

            // display it ..
            appendVersPane(TxtPane, s, Color.DARK_GRAY);

        }
         
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void roleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void role2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_role2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_role2ActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane TxtPane;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JComboBox role;
    private javax.swing.JComboBox role1;
    private javax.swing.JComboBox role2;
    // End of variables declaration//GEN-END:variables

  private void appendVersPane(JTextPane tp, String msg, Color c)
    {
        StyleContext sc = StyleContext.getDefaultStyleContext();
        AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, c);

        aset = sc.addAttribute(aset, StyleConstants.FontFamily, "Lucida Console");
        aset = sc.addAttribute(aset, StyleConstants.Alignment, StyleConstants.ALIGN_JUSTIFIED);

        int len = tp.getDocument().getLength();
        tp.setCaretPosition(len);
        tp.setCharacterAttributes(aset, false);
        tp.replaceSelection(msg);
    }
}
