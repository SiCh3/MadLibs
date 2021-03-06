package my.madlibs;

import java.awt.*;

public class MadLibsUI extends javax.swing.JFrame {
    
    private String words[] = {"Verb ending in 'ing': ", "Plural Noun: ", "Adjective: ", "Animate Plural Noun: ", 
                                "One-Word Celebrity Name: ", "Adjective: ", "First Name: ", "Animal: "};
    private String input[] = new String[8];
    private int clicks = 0;
    
    /**
     * Creates new form MadLibsUI
     */
    public MadLibsUI() {
        initComponents();
        
        this.getContentPane().setBackground(Color.orange);
        welcomeLabel.setForeground(Color.blue);
        outputLabel1.setForeground(Color.blue);
        outputLabel2.setForeground(Color.blue);
        outputLabel3.setForeground(Color.blue);
        errorLabel.setForeground(Color.red);
    }
    
    private boolean isEmpty(String input[], int index) {
        if (input[index].equals("")) {
            return true;
        }
        return false;
    }
    
    private String capitalize (String input[], int index) {
        String word = input[index];
        return (word.substring(0, 1).toUpperCase() + word.substring(1, word.length()));
    }
    
    private void toString(String input[]) {
        outputLabel1.setText(capitalize(input, 0) + " " + capitalize(input, 1) + " is a very " + input[2] + " show about " + input[3]);
        outputLabel2.setText("that work together to save " + capitalize(input, 4) + " from the" );
        outputLabel3.setText(input[5] + " villain known as " + capitalize(input, 6) + " the " + capitalize(input, 7) + ".");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeLabel = new javax.swing.JLabel();
        instructionsLabel = new javax.swing.JLabel();
        wordTypeLabel = new javax.swing.JLabel();
        inputTextField = new javax.swing.JTextField();
        nextButton = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();
        outputLabel1 = new javax.swing.JLabel();
        outputLabel2 = new javax.swing.JLabel();
        outputLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        welcomeLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLabel.setText("Welcome to a game of MadLibs!");

        instructionsLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        instructionsLabel.setText("Instructions: enter the following types of words and click next to move on");

        wordTypeLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        wordTypeLabel.setText("Verb ending in 'ing': ");

        inputTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTextFieldActionPerformed(evt);
            }
        });

        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        errorLabel.setText(" ");

        outputLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        outputLabel1.setText(" ");

        outputLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        outputLabel2.setText(" ");

        outputLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        outputLabel3.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(wordTypeLabel)
                        .addGap(18, 18, 18)
                        .addComponent(inputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(errorLabel)
                            .addComponent(nextButton))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(welcomeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(60, 60, 60))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(instructionsLabel)
                        .addContainerGap(38, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(outputLabel3)
                            .addComponent(outputLabel2)
                            .addComponent(outputLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(welcomeLabel)
                .addGap(18, 18, 18)
                .addComponent(instructionsLabel)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wordTypeLabel)
                    .addComponent(inputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(nextButton)
                .addGap(18, 18, 18)
                .addComponent(errorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(outputLabel1)
                .addGap(18, 18, 18)
                .addComponent(outputLabel2)
                .addGap(18, 18, 18)
                .addComponent(outputLabel3)
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTextFieldActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
      
            try{
                
                input[clicks] = inputTextField.getText();

                //check if there's no user input
                if (isEmpty(input, clicks)) {
                    errorLabel.setText("Error: enter a word");
                    input[clicks] = inputTextField.getText();
                }
                
                //check if the first word ends in "ing"
                else if (input[0].indexOf("ing") < 0) {
                    errorLabel.setText("Error: enter a verb ending in -ing");
                    input[clicks] = inputTextField.getText();
                }  
                
                else {
                    errorLabel.setText("");
                    clicks++;
                    wordTypeLabel.setText(words[clicks]);
                    inputTextField.setText("");
                }

            } catch (Exception e) {
                errorLabel.setText("Mad Lib complete!");
            }
            
            if (clicks == 8) {
                instructionsLabel.setText("");
                toString(input);
            }   
    }//GEN-LAST:event_nextButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MadLibsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MadLibsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MadLibsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MadLibsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MadLibsUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errorLabel;
    private javax.swing.JTextField inputTextField;
    private javax.swing.JLabel instructionsLabel;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel outputLabel1;
    private javax.swing.JLabel outputLabel2;
    private javax.swing.JLabel outputLabel3;
    private javax.swing.JLabel welcomeLabel;
    private javax.swing.JLabel wordTypeLabel;
    // End of variables declaration//GEN-END:variables
}