package views;

import com.mycompany.chellengesofka.controller.configureGameController;
import javax.swing.JOptionPane;
import models.question;

/**
 *
 * @author Gio
 */
public class viewConfigureGame extends javax.swing.JFrame {

    /**
     * Creates new form viewConfigureGame
     */
    public viewConfigureGame() {
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

        lblPregunta = new javax.swing.JLabel();
        txtQuestion = new javax.swing.JTextField();
        lblOption1 = new javax.swing.JLabel();
        txtOption1 = new javax.swing.JTextField();
        lblOption2 = new javax.swing.JLabel();
        txtOption2 = new javax.swing.JTextField();
        lblOption3 = new javax.swing.JLabel();
        txtOption3 = new javax.swing.JTextField();
        lblAnswer = new javax.swing.JLabel();
        txtAnswer = new javax.swing.JTextField();
        spnLevel = new javax.swing.JSpinner();
        lblAnswer1 = new javax.swing.JLabel();
        btnSaveQuestion = new javax.swing.JButton();
        lblQuestionConfiguration = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPregunta.setText("Pregunta:");
        getContentPane().add(lblPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 73, -1));
        getContentPane().add(txtQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 270, -1));

        lblOption1.setText("Opción 1: ");
        getContentPane().add(lblOption1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 62, -1));
        getContentPane().add(txtOption1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 200, -1));

        lblOption2.setText("Opción 2:");
        getContentPane().add(lblOption2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 51, -1));
        getContentPane().add(txtOption2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 200, -1));

        lblOption3.setText("Opción 3:");
        getContentPane().add(lblOption3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 51, -1));
        getContentPane().add(txtOption3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 200, -1));

        lblAnswer.setText("Nivel:");
        getContentPane().add(lblAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 62, -1));
        getContentPane().add(txtAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 200, -1));
        getContentPane().add(spnLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        lblAnswer1.setText("Respuesta:");
        getContentPane().add(lblAnswer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 62, -1));

        btnSaveQuestion.setText("Guardar");
        btnSaveQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveQuestionActionPerformed(evt);
            }
        });
        getContentPane().add(btnSaveQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, -1));

        lblQuestionConfiguration.setText("CONFIGURACIÓN DE PREGUNTAS");
        getContentPane().add(lblQuestionConfiguration, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveQuestionActionPerformed
        validarCamposVacios(); 
    }//GEN-LAST:event_btnSaveQuestionActionPerformed

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
            java.util.logging.Logger.getLogger(viewConfigureGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewConfigureGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewConfigureGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewConfigureGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewConfigureGame().setVisible(true);
            }
        });
    }
    
    private boolean validarCamposVacios() {
    int valorNivel = (int)spnLevel.getValue();
    
    if (txtQuestion.getText().equals("") || txtOption1.getText().equals("") || 
            txtOption2.getText().equals("") || txtOption3.getText().equals("") ||
            txtAnswer.getText().equals("")) {
        JOptionPane.showMessageDialog(null, "Por favor llenar todos los campos");
    }
    else if( valorNivel <= 0 || valorNivel > 5){
        JOptionPane.showMessageDialog(null, "Por favor seleccione entre 1 y 5");
    }
    else{
        question question = new question();
        configureGameController config = new configureGameController();
        String description = txtQuestion.getText() + "," +
                txtOption1.getText() + "," +
                txtOption2.getText() + "," +
                txtOption3.getText() + "," +
                txtAnswer.getText();
        
        question.question = description;
        question.idCategory = valorNivel;
        
        boolean saved = config.saveConfigureGame(question);
        if (saved) {
            JOptionPane.showMessageDialog(null, "Guardado exitoso!");
        }
    }
    return true;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveQuestion;
    private javax.swing.JLabel lblAnswer;
    private javax.swing.JLabel lblAnswer1;
    private javax.swing.JLabel lblOption1;
    private javax.swing.JLabel lblOption2;
    private javax.swing.JLabel lblOption3;
    private javax.swing.JLabel lblPregunta;
    private javax.swing.JLabel lblQuestionConfiguration;
    private javax.swing.JSpinner spnLevel;
    private javax.swing.JTextField txtAnswer;
    private javax.swing.JTextField txtOption1;
    private javax.swing.JTextField txtOption2;
    private javax.swing.JTextField txtOption3;
    private javax.swing.JTextField txtQuestion;
    // End of variables declaration//GEN-END:variables
}


