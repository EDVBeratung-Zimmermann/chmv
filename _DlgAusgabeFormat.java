/*
 * Copyright (C) 2017 EDV-Beratung Zimmermann
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package milesVerlagMain;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.GroupLayout;


/**
 *
 * @author Thomas Zimmermann
 *
 */
public class _DlgAusgabeFormat extends javax.swing.JDialog {

    /**
     * Creates new form _DlgAusgabeFormat
     *
     * @param parent
     * @param modal
     */
    public _DlgAusgabeFormat(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        conn = null;

        try { // Datenbank-Treiber laden
            Class.forName(ModulHelferlein.dbDriver);
        } catch (ClassNotFoundException exept) {
            ModulHelferlein.Fehlermeldung("Ausgabe","ClassNotFoundException",exept.getMessage());
            System.exit(1);
        } // Datenbank-Treiber laden

        try { // Verbindung zur Datenbank ?ber die JDBC-Br?cke
            conn = DriverManager.getConnection(ModulHelferlein.dbUrl, ModulHelferlein.dbUser, ModulHelferlein.dbPassword);
        } catch (SQLException exept) {
            ModulHelferlein.Fehlermeldung("Verbindung nicht moeglich","SQL-Exception",exept.getMessage());
            System.exit(1);
        } // try Verbindung zur Datenbank ?ber die JDBC-Br?cke

        switch (arg0) {
            case "Rechnung":
                jLabelTitel.setText(jLabelTitel.getText() + arg0);
                jLabelNummer.setText("Nummer: " + arg1);
                break;
            case "Pflichtexemplar":
                jLabelTitel.setText("Pflichtexemplar");
                switch (argumente[1]) {
                    case "BLB":
                        jLabelNummer.setText("Berliner Landesbibliothek");
                        break;
                    case "DNB":
                        jLabelNummer.setText("Deutsche Nationalbibliothek");
                        break;
                }
                break;
        }
        buttonGroupFormat.add(jRadioButtonPDF);
        buttonGroupFormat.add(jRadioButtonDOC);
        buttonGroupFormat.add(jRadioButtonXML);
        buttonGroupFormat.add(jRadioButtonHybrid);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        panel1 = new JPanel();
        jButtonDrucken = new JButton();
        jButtonAbbrechen = new JButton();
        jLabelTitel = new JLabel();
        jRadioButtonPDF = new JRadioButton();
        jRadioButtonDOC = new JRadioButton();
        jLabel2 = new JLabel();
        jLabelNummer = new JLabel();
        jRadioButtonXML = new JRadioButton();
        jRadioButtonHybrid = new JRadioButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Carola Hartmann Miles Verlag");
        setResizable(false);
        var contentPane = getContentPane();

        //======== panel1 ========
        {

            //---- jButtonDrucken ----
            jButtonDrucken.setText("Drucken");
            jButtonDrucken.addActionListener(e -> jButtonDruckenActionPerformed(e));

            //---- jButtonAbbrechen ----
            jButtonAbbrechen.setText("Abbrechen");
            jButtonAbbrechen.addActionListener(e -> jButtonAbbrechenActionPerformed(e));

            //---- jLabelTitel ----
            jLabelTitel.setFont(new Font("Tahoma", Font.BOLD, 12));
            jLabelTitel.setText("Ausgabe der ");

            //---- jRadioButtonPDF ----
            jRadioButtonPDF.setSelected(true);
            jRadioButtonPDF.setText("PDF");

            //---- jRadioButtonDOC ----
            jRadioButtonDOC.setText("DOC");
            jRadioButtonDOC.setEnabled(false);

            //---- jLabel2 ----
            jLabel2.setText("im Format");

            //---- jLabelNummer ----
            jLabelNummer.setText("nummer");

            //---- jRadioButtonXML ----
            jRadioButtonXML.setText("XML - E-Rechnung");

            //---- jRadioButtonHybrid ----
            jRadioButtonHybrid.setText("E-Rechnung Hybrid");

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(jLabelTitel)
                            .addComponent(jLabelNummer)
                            .addComponent(jLabel2)
                            .addComponent(jRadioButtonPDF)
                            .addComponent(jRadioButtonDOC)
                            .addComponent(jRadioButtonXML)
                            .addComponent(jRadioButtonHybrid)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jButtonDrucken, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonAbbrechen)))
                        .addContainerGap(30, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTitel)
                        .addGap(7, 7, 7)
                        .addComponent(jLabelNummer)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)
                        .addGap(7, 7, 7)
                        .addComponent(jRadioButtonPDF)
                        .addGap(0, 0, 0)
                        .addComponent(jRadioButtonDOC)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonXML)
                        .addGap(3, 3, 3)
                        .addComponent(jRadioButtonHybrid)
                        .addGap(47, 47, 47)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(jButtonDrucken)
                            .addComponent(jButtonAbbrechen))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());

        //---- buttonGroup1 ----
        var buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(jRadioButtonPDF);
        buttonGroup1.add(jRadioButtonDOC);
        buttonGroup1.add(jRadioButtonXML);
        buttonGroup1.add(jRadioButtonHybrid);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDruckenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDruckenActionPerformed
        // TODO add your handling code here:
        switch (argumente[0]) {
            case "Rechnung":
                try {
                    if (jRadioButtonPDF.isSelected()) {
                        briefRechnungMahnung.briefPDF(argumente[1], Integer.parseInt(argumente[2]), "",0);
                    } else if (jRadioButtonXML.isSelected()) {
                        briefRechnungMahnung.briefPDF(argumente[1], Integer.parseInt(argumente[2]), "",1);
                    } else if (jRadioButtonHybrid.isSelected()) {
                        briefRechnungMahnung.briefPDF(argumente[1], Integer.parseInt(argumente[2]), "",2);
                    } else {
                        briefRechnungMahnung.briefDOC(arg1, Integer.parseInt(arg2), "");
                    }
                } catch (Exception ex) {
                    ModulHelferlein.Fehlermeldung("Exception: " + ex.getMessage());
                }
                break;
            case "Pflichtexemplar":
                switch (argumente[1]) {
                    case "BLB":
                        try {
                            if (jRadioButtonPDF.isSelected()) {
                                briefPflichtexemplar.briefBLBPDF(argumente[2], argumente[3], argumente[4], argumente[5]);
                                String BestNr = ModulHelferlein.makeBestellung("",
                                                                          "Zentral- und Landesbibliothek Berlin",    
                                                                          "Pflichtexemplarstelle", 
                                                                          "Breite Stra�e 30 - 36", 
                                                                          "10178 Berlin", 
                                                                          "", 
                                                                          Integer.parseInt(argumente[6]), 
                                                                          2, 
                                                                          1); 
                               
                                briefRechnungMahnung.briefPDF(BestNr,2,"",0);
                            } else {
                                briefPflichtexemplar.briefBLBDOC(argumente[2], argumente[3], argumente[4], argumente[5]);

                                briefRechnungMahnung.briefDOC(ModulHelferlein.makeBestellung("", 
                                                                                        "Zentral- und Landesbibliothek Berlin", 
                                                                                        "Pflichtexemplarstelle", 
                                                                                        "Breite Stra�e 30 - 36", 
                                                                                        "10178 Berlin", 
                                                                                        "", 
                                                                                        Integer.parseInt(argumente[6]), 2, 1), 
                                                        2, "");
                            }
                        } catch (Exception ex) {
                            ModulHelferlein.Fehlermeldung("Exception: " + ex.getMessage());
                        }
                        break;
                    case "DNB":
                        try {
                            if (jRadioButtonPDF.isSelected()) {
                                briefPflichtexemplar.briefDNBPDF(argumente[2], argumente[3], argumente[4], argumente[5]);
                                briefRechnungMahnung.briefPDF(ModulHelferlein.makeBestellung("", 
                                                                                        "Deutsche Nationalbibliothek", 
                                                                                        "Referat L 1.3", 
                                                                                        "Deutscher Platz 1", 
                                                                                        "04103 Leipzig", 
                                                                                        "", 
                                                                                        Integer.parseInt(argumente[6]), 
                                                                                        2, 
                                                                                        2), 
                                                            2,
                                                            "",
                                                            0);
                            } else {
                                briefPflichtexemplar.briefDNBDOC(argumente[2], argumente[3], argumente[4], argumente[5]);
                                briefRechnungMahnung.briefDOC(ModulHelferlein.makeBestellung("", 
                                                                                        "Deutsche Nationalbibliothek", 
                                                                                        "Referat L 1.3", 
                                                                                        "Deutscher Platz 1", 
                                                                                        "04103 Leipzig", 
                                                                                        "", 
                                                                                        Integer.parseInt(argumente[6]), 
                                                                                        2, 
                                                                                        2), 
                                                            2,
                                                            "");
                            }
                        } catch (Exception ex) {
                            ModulHelferlein.Fehlermeldung("Exception: " + ex.getMessage());
                        }
                        break;
                }
                break;
        }
        this.dispose();
    }//GEN-LAST:event_jButtonDruckenActionPerformed

    private void jButtonAbbrechenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbbrechenActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonAbbrechenActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
/**        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarolaHartmannMilesVerlag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
*/        
        //</editor-fold>

        //</editor-fold>
        argumente = args;
        arg0 = args[0];
        arg1 = args[1];
        arg2 = args[2];
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            _DlgAusgabeFormat dialog = new _DlgAusgabeFormat(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    dialog.dispose();
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JPanel panel1;
    private JButton jButtonDrucken;
    private JButton jButtonAbbrechen;
    private JLabel jLabelTitel;
    private JRadioButton jRadioButtonPDF;
    private JRadioButton jRadioButtonDOC;
    private JLabel jLabel2;
    private JLabel jLabelNummer;
    private JRadioButton jRadioButtonXML;
    private JRadioButton jRadioButtonHybrid;
    // End of variables declaration//GEN-END:variables

    private static String arg0 = "";
    private static String arg1 = "";
    private static String arg2 = "";
    private static String[] argumente = null;
    
    private Connection conn = null;

    private ButtonGroup buttonGroupFormat = new ButtonGroup();
}
