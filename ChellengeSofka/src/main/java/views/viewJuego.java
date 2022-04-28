package views;

import com.mycompany.chellengesofka.controller.gameController;
import static java.lang.Double.max;
import static java.lang.Math.min;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import models.question;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Gio
 */
public class viewJuego extends javax.swing.JFrame {

    /**
     * Creates new form viewJuego
     */
    public viewJuego() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdbOption1 = new javax.swing.JRadioButton();
        rdbOption2 = new javax.swing.JRadioButton();
        rdbOption3 = new javax.swing.JRadioButton();
        rdbOption4 = new javax.swing.JRadioButton();
        lblQuestion = new javax.swing.JLabel();
        btnResponse = new javax.swing.JButton();
        lblCategory1 = new javax.swing.JLabel();
        lblCategory2 = new javax.swing.JLabel();
        lblCategory3 = new javax.swing.JLabel();
        lblCategory4 = new javax.swing.JLabel();
        lblCategory5 = new javax.swing.JLabel();
        lblJuego = new javax.swing.JLabel();
        lblOption1 = new javax.swing.JLabel();
        lblOption2 = new javax.swing.JLabel();
        lblOption3 = new javax.swing.JLabel();
        lblOption4 = new javax.swing.JLabel();
        lblNamePlayer = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rdbOption1.setText("A");

        rdbOption2.setText("B");

        rdbOption3.setText("C");

        rdbOption4.setText("D");

        lblQuestion.setText(".");

        btnResponse.setText("Responder");
        btnResponse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResponseActionPerformed(evt);
            }
        });

        lblCategory1.setText("Level 1 - $100.000");

        lblCategory2.setText("Level 2 - $200.000");

        lblCategory3.setText("Level 3 - $500.000");

        lblCategory4.setText("Level 4 - $1.000.000");

        lblCategory5.setText("Level 5 - $2.000.000");

        lblJuego.setText("CHALLENGE SOFKA - JUEGO DE PREGUNTAS Y RESPUESTAS");

        lblOption1.setText(".");

        lblOption2.setText(".");

        lblOption3.setText(".");

        lblOption4.setText(".");

        lblNamePlayer.setText(".");

        btnIniciar.setText("Mostrar Pregunta");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNamePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCategory5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCategory4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCategory3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCategory2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCategory1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(rdbOption1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblOption1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdbOption3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblOption3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(lblQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(lblJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(178, 178, 178)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdbOption4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblOption4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdbOption2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblOption2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnResponse, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 275, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblJuego)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategory1)
                    .addComponent(lblNamePlayer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCategory2)
                .addGap(18, 18, 18)
                .addComponent(lblCategory3)
                .addGap(18, 18, 18)
                .addComponent(lblCategory4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(lblCategory5)
                .addGap(76, 76, 76)
                .addComponent(lblQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbOption1)
                    .addComponent(rdbOption2)
                    .addComponent(lblOption1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOption2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbOption4)
                    .addComponent(rdbOption3)
                    .addComponent(lblOption3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOption4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResponse, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResponseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResponseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResponseActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        List<String> preguntas = new ArrayList<>();
        preguntas = getQuestions(1);
        setValueQuestion(getQuestion(preguntas));
    }//GEN-LAST:event_btnIniciarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewJuego().setVisible(true);
            }
        });
        
       List<String> preguntas = new ArrayList<>();
       question question = new question();
       gameController game = new gameController();
       question = game.getQuestion(1);
       preguntas = question.description;
       
    }
    
     private List<String> getQuestions(int level){
        question question = new question();
        gameController game = new gameController();
        question = game.getQuestion(level);
        return question.description;
    }
     
     private static String getQuestion(List<String> list){
        int randomNum = new Random().nextInt(5);
         
         return list.get(randomNum);
     }
     
     private void setValueQuestion(String pregunta){
         String[] valores = pregunta.split(",");
         
         lblQuestion.setText(valores[0]);
         lblOption1.setText(valores[1]);
         lblOption2.setText(valores[2]);
         lblOption3.setText(valores[3]);
         lblOption4.setText(valores[4]);
     }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnResponse;
    private javax.swing.JLabel lblCategory1;
    private javax.swing.JLabel lblCategory2;
    private javax.swing.JLabel lblCategory3;
    private javax.swing.JLabel lblCategory4;
    private javax.swing.JLabel lblCategory5;
    private javax.swing.JLabel lblJuego;
    private javax.swing.JLabel lblNamePlayer;
    private javax.swing.JLabel lblOption1;
    private javax.swing.JLabel lblOption2;
    private javax.swing.JLabel lblOption3;
    private javax.swing.JLabel lblOption4;
    private javax.swing.JLabel lblQuestion;
    private javax.swing.JRadioButton rdbOption1;
    private javax.swing.JRadioButton rdbOption2;
    private javax.swing.JRadioButton rdbOption3;
    private javax.swing.JRadioButton rdbOption4;
    // End of variables declaration//GEN-END:variables
}
