/*
 *
 * Das JAVA-Programm Miles-Verlag Verlagsverwaltung stellt alle notwendigen
 * Funktionen f�r die Verwaltung des Carola Hartman Miles-Verlags bereit.
 *
 * Copyright (C) 2017 EDV-Beratung und Betrieb, Entwicklung von SOftware
 *                    Dipl.Inform Thomas Zimmermann
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
 *
 */
package milesVerlagMain;

import java.awt.*;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.JFileChooser;

/**
 *
 * @author Thomas Zimmermann
 */
public class VerwaltenDatenbankKonfigurationPfade extends javax.swing.JDialog {

    /**
     * Creates new form VerwaltenDatenbankKonfigurationPfade
     *
     * @param parent
     * @param modal
     */
    public VerwaltenDatenbankKonfigurationPfade(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.chooser = new JFileChooser(new File(System.getProperty("user.dir")));
        this.chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        initComponents();

        conn = null;

        // Datenbank-Treiber laden
        try {
            Class.forName(ModulHelferlein.dbDriver);
        } catch (ClassNotFoundException exept) {
            ModulHelferlein.Fehlermeldung("Treiber nicht gefunden.");
        }

        // Verbindung zur Datenbank �ber die JDBC-Br�cke
        try {
            conn = DriverManager.getConnection(ModulHelferlein.dbUrl, ModulHelferlein.dbUser, ModulHelferlein.dbPassword);
        } catch (SQLException exept) {
            ModulHelferlein.Fehlermeldung("Verbindung zur Datenbank nicht moeglich.");
        }

        // final Connection conn2=conn;
        if (conn != null) {
            SQLAnfrage = null; // Anfrage erzeugen

            try {
                SQLAnfrage = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                result = SQLAnfrage.executeQuery("SELECT * FROM tbl_konfiguration");

                System.out.println("Suche Konfiguration Pfede f�r  " + Benutzer);
                // gehe zum ersten Datensatz - wenn nicht leer
                boolean notGefunden = true;
                if (result.first()) {
                    System.out.println(" -> Datensatz  " + result.getString("Konfiguration_ID"));
                    System.out.println("    -> Datensatz  " + result.getString("Konfiguration_Benutzer"));
                    if (Benutzer.equals(result.getString("Konfiguration_Benutzer"))) {
                    System.out.println("    -> Gefunden  " + result.getString("Konfiguration_ID"));
                        field_ID.setText(result.getString("Konfiguration_ID"));
                        ID = result.getInt("Konfiguration_ID");
                        field_Benutzer = result.getString("Konfiguration_Benutzer");
                        field_Stammdaten.setText(result.getString("Konfiguration_Stammdaten"));
                        field_Einnahmen.setText(result.getString("Konfiguration_Einnahmen"));
                        field_Ausgaben.setText(result.getString("Konfiguration_Ausgaben"));
                        field_Umsaetze.setText(result.getString("Konfiguration_Umsaetze"));
                        field_Rechnungen.setText(result.getString("Konfiguration_Rechnungen"));
                        field_Mahnungen.setText(result.getString("Konfiguration_Mahnungen"));
                        field_Sicherung.setText(result.getString("Konfiguration_Sicherung"));
                        field_Termine.setText(result.getString("Konfiguration_Termine"));
                        field_Schriftverkehr.setText(result.getString("Konfiguration_Schriftverkehr"));
                        field_Steuer.setText(result.getString("Konfiguration_Steuer"));
                        notGefunden = false;
                    }
                    while (notGefunden) {
                        result.next();
                        System.out.println(" -> Datensatz  " + result.getString("Konfiguration_ID"));
                        System.out.println("    -> Datensatz  " + result.getString("Konfiguration_Benutzer"));
                        if (Benutzer.equals(result.getString("Konfiguration_Benutzer"))) {
                            System.out.println("    -> Gefunden  " + result.getString("Konfiguration_ID"));
                            field_ID.setText(result.getString("Konfiguration_ID"));
                            ID = result.getInt("Konfiguration_ID");
                            field_Benutzer = result.getString("Konfiguration_Benutzer");
                            field_Stammdaten.setText(result.getString("Konfiguration_Stammdaten"));
                            field_Einnahmen.setText(result.getString("Konfiguration_Einnahmen"));
                            field_Ausgaben.setText(result.getString("Konfiguration_Ausgaben"));
                            field_Umsaetze.setText(result.getString("Konfiguration_Umsaetze"));
                            field_Rechnungen.setText(result.getString("Konfiguration_Rechnungen"));
                            field_Mahnungen.setText(result.getString("Konfiguration_Mahnungen"));
                            field_Sicherung.setText(result.getString("Konfiguration_Sicherung"));
                            field_Termine.setText(result.getString("Konfiguration_Termine"));
                            field_Schriftverkehr.setText(result.getString("Konfiguration_Schriftverkehr"));
                            field_Steuer.setText(result.getString("Konfiguration_Steuer"));
                            notGefunden = false;
                        } // if Benutzer gefunden
                    } // while
                } // if notempty

            } catch (SQLException exept) {
                ModulHelferlein.Fehlermeldung(
                        "SQL-Exception: SQL-Anfrage nicht moeglich. "
                        + exept.getMessage());
                System.exit(1);
            }  // try
        } // if

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
        jLabel1 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        field_Einnahmen = new JTextField();
        field_Ausgaben = new JTextField();
        field_Umsaetze = new JTextField();
        field_Sicherung = new JTextField();
        field_Mahnungen = new JTextField();
        field_Rechnungen = new JTextField();
        field_Termine = new JTextField();
        field_Schriftverkehr = new JTextField();
        field_Steuer = new JTextField();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        jLabel11 = new JLabel();
        jLabel2 = new JLabel();
        field_Stammdaten = new JTextField();
        btnStammdaten = new JButton();
        btnEinnahmen = new JButton();
        btnAusgaben = new JButton();
        btnUmsaetze = new JButton();
        btnSicherungen = new JButton();
        btnMahnungen = new JButton();
        btnRechnungen = new JButton();
        btnTermine = new JButton();
        btnSchriftverkehr = new JButton();
        btnSteuer = new JButton();
        jButtonUpdate = new JButton();
        jButtonSchliessen = new JButton();
        field_ID = new JTextField();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Carola Hartmann Miles Verlag");
        setResizable(false);
        setMinimumSize(new Dimension(685, 415));
        setFont(new Font(Font.DIALOG, Font.BOLD, 12));
        var contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setMinimumSize(new Dimension(661, 351));
            panel1.setPreferredSize(new Dimension(661, 351));
            panel1.setLayout(null);

            //---- jLabel1 ----
            jLabel1.setFont(new Font("Tahoma", Font.BOLD, 12));
            jLabel1.setText("Verwalten der Konfiguration - Ausgabepfade");
            panel1.add(jLabel1);
            jLabel1.setBounds(new Rectangle(new Point(0, 0), jLabel1.getPreferredSize()));

            //---- jLabel3 ----
            jLabel3.setText("...");
            panel1.add(jLabel3);
            jLabel3.setBounds(0, 62, 64, 23);

            //---- jLabel4 ----
            jLabel4.setText("...");
            panel1.add(jLabel4);
            jLabel4.setBounds(0, 90, 64, 23);

            //---- jLabel5 ----
            jLabel5.setText("...");
            panel1.add(jLabel5);
            jLabel5.setBounds(0, 118, 64, 23);
            panel1.add(field_Einnahmen);
            field_Einnahmen.setBounds(69, 62, 532, 23);
            panel1.add(field_Ausgaben);
            field_Ausgaben.setBounds(69, 90, 532, 23);
            panel1.add(field_Umsaetze);
            field_Umsaetze.setBounds(69, 118, 532, 23);
            panel1.add(field_Sicherung);
            field_Sicherung.setBounds(69, 146, 532, 23);
            panel1.add(field_Mahnungen);
            field_Mahnungen.setBounds(69, 174, 532, 23);
            panel1.add(field_Rechnungen);
            field_Rechnungen.setBounds(69, 202, 532, 23);
            panel1.add(field_Termine);
            field_Termine.setBounds(69, 230, 532, 23);
            panel1.add(field_Schriftverkehr);
            field_Schriftverkehr.setBounds(69, 258, 532, 23);
            panel1.add(field_Steuer);
            field_Steuer.setBounds(69, 286, 532, 23);

            //---- jLabel6 ----
            jLabel6.setText("Sicherungen");
            panel1.add(jLabel6);
            jLabel6.setBounds(0, 146, 64, 23);

            //---- jLabel7 ----
            jLabel7.setText("Rezensionen");
            panel1.add(jLabel7);
            jLabel7.setBounds(0, 174, 64, 23);

            //---- jLabel8 ----
            jLabel8.setText("Rechnungen");
            panel1.add(jLabel8);
            jLabel8.setBounds(0, 202, 64, 23);

            //---- jLabel9 ----
            jLabel9.setText("Konfiguration");
            panel1.add(jLabel9);
            jLabel9.setBounds(0, 230, jLabel9.getPreferredSize().width, 23);

            //---- jLabel10 ----
            jLabel10.setText("Buchprojekte");
            panel1.add(jLabel10);
            jLabel10.setBounds(0, 258, 64, 23);

            //---- jLabel11 ----
            jLabel11.setText("Steuer");
            panel1.add(jLabel11);
            jLabel11.setBounds(0, 286, 64, 23);

            //---- jLabel2 ----
            jLabel2.setText("Berichte");
            panel1.add(jLabel2);
            jLabel2.setBounds(0, 38, 64, jLabel2.getPreferredSize().height);
            panel1.add(field_Stammdaten);
            field_Stammdaten.setBounds(69, 35, 532, field_Stammdaten.getPreferredSize().height);

            //---- btnStammdaten ----
            btnStammdaten.setText("...");
            btnStammdaten.addActionListener(e -> btnStammdatenActionPerformed(e));
            panel1.add(btnStammdaten);
            btnStammdaten.setBounds(new Rectangle(new Point(606, 34), btnStammdaten.getPreferredSize()));

            //---- btnEinnahmen ----
            btnEinnahmen.setText("...");
            btnEinnahmen.addActionListener(e -> btnEinnahmenActionPerformed(e));
            panel1.add(btnEinnahmen);
            btnEinnahmen.setBounds(new Rectangle(new Point(606, 62), btnEinnahmen.getPreferredSize()));

            //---- btnAusgaben ----
            btnAusgaben.setText("...");
            btnAusgaben.addActionListener(e -> btnAusgabenActionPerformed(e));
            panel1.add(btnAusgaben);
            btnAusgaben.setBounds(new Rectangle(new Point(606, 90), btnAusgaben.getPreferredSize()));

            //---- btnUmsaetze ----
            btnUmsaetze.setText("...");
            btnUmsaetze.addActionListener(e -> btnUmsaetzeActionPerformed(e));
            panel1.add(btnUmsaetze);
            btnUmsaetze.setBounds(new Rectangle(new Point(606, 118), btnUmsaetze.getPreferredSize()));

            //---- btnSicherungen ----
            btnSicherungen.setText("...");
            btnSicherungen.addActionListener(e -> btnSicherungenActionPerformed(e));
            panel1.add(btnSicherungen);
            btnSicherungen.setBounds(new Rectangle(new Point(606, 146), btnSicherungen.getPreferredSize()));

            //---- btnMahnungen ----
            btnMahnungen.setText("...");
            btnMahnungen.addActionListener(e -> btnMahnungenActionPerformed(e));
            panel1.add(btnMahnungen);
            btnMahnungen.setBounds(new Rectangle(new Point(606, 174), btnMahnungen.getPreferredSize()));

            //---- btnRechnungen ----
            btnRechnungen.setText("...");
            btnRechnungen.addActionListener(e -> btnRechnungenActionPerformed(e));
            panel1.add(btnRechnungen);
            btnRechnungen.setBounds(new Rectangle(new Point(606, 202), btnRechnungen.getPreferredSize()));

            //---- btnTermine ----
            btnTermine.setText("...");
            btnTermine.addActionListener(e -> btnTermineActionPerformed(e));
            panel1.add(btnTermine);
            btnTermine.setBounds(new Rectangle(new Point(606, 230), btnTermine.getPreferredSize()));

            //---- btnSchriftverkehr ----
            btnSchriftverkehr.setText("...");
            btnSchriftverkehr.addActionListener(e -> btnSchriftverkehrActionPerformed(e));
            panel1.add(btnSchriftverkehr);
            btnSchriftverkehr.setBounds(new Rectangle(new Point(606, 258), btnSchriftverkehr.getPreferredSize()));

            //---- btnSteuer ----
            btnSteuer.setText("...");
            btnSteuer.addActionListener(e -> btnSteuerActionPerformed(e));
            panel1.add(btnSteuer);
            btnSteuer.setBounds(new Rectangle(new Point(606, 286), btnSteuer.getPreferredSize()));

            //---- jButtonUpdate ----
            jButtonUpdate.setText("Update");
            jButtonUpdate.setToolTipText("Aktualisiert die Konfiguartionsdaten");
            jButtonUpdate.addActionListener(e -> jButtonUpdateActionPerformed(e));
            panel1.add(jButtonUpdate);
            jButtonUpdate.setBounds(456, 328, 95, jButtonUpdate.getPreferredSize().height);

            //---- jButtonSchliessen ----
            jButtonSchliessen.setText("Schlie\u00dfen");
            jButtonSchliessen.setToolTipText("Schlie\u00dft den Dialog");
            jButtonSchliessen.addActionListener(e -> jButtonSchliessenActionPerformed(e));
            panel1.add(jButtonSchliessen);
            jButtonSchliessen.setBounds(556, 328, 95, jButtonSchliessen.getPreferredSize().height);

            //---- field_ID ----
            field_ID.setEditable(false);
            panel1.add(field_ID);
            field_ID.setBounds(615, 5, 25, field_ID.getPreferredSize().height);

            { // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel1.getComponentCount(); i++) {
                    Rectangle bounds = panel1.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel1.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel1.setMinimumSize(preferredSize);
                panel1.setPreferredSize(preferredSize);
            }
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, 651, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(12, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
        );
        setSize(675, 405);
        setLocationRelativeTo(getOwner());
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
        try {
            if (field_Stammdaten.getText() == null) {
                field_Stammdaten.setText("");
            }
            if (field_Einnahmen.getText() == null) {
                field_Einnahmen.setText("");
            }
            if (field_Ausgaben.getText() == null) {
                field_Ausgaben.setText("");
            }
            if (field_Umsaetze.getText() == null) {
                field_Umsaetze.setText("");
            }
            if (field_Rechnungen.getText() == null) {
                field_Rechnungen.setText("");
            }
            if (field_Sicherung.getText() == null) {
                field_Sicherung.setText("");
            }
            if (field_Mahnungen.getText() == null) {
                field_Mahnungen.setText("");
            }
            if (field_Termine.getText() == null) {
                field_Termine.setText("");
            }
            if (field_Schriftverkehr.getText() == null) {
                field_Schriftverkehr.setText("");
            }
            if (field_Steuer.getText() == null) {
                field_Steuer.setText("");
            }
            result.updateString("Konfiguration_Stammdaten", field_Stammdaten.getText());
            result.updateString("Konfiguration_Einnahmen", field_Einnahmen.getText());
            result.updateString("Konfiguration_Ausgaben", field_Ausgaben.getText());
            result.updateString("Konfiguration_Umsaetze", field_Umsaetze.getText());
            result.updateString("Konfiguration_Rechnungen", field_Rechnungen.getText());
            result.updateString("Konfiguration_Sicherung", field_Sicherung.getText());
            result.updateString("Konfiguration_Mahnungen", field_Mahnungen.getText());
            result.updateString("Konfiguration_Termine", field_Termine.getText());
            result.updateString("Konfiguration_Schriftverkehr", field_Schriftverkehr.getText());
            result.updateString("Konfiguration_Steuer", field_Steuer.getText());
            result.updateRow();
 
            ModulHelferlein.pathBerichte = field_Stammdaten.getText();
            ModulHelferlein.pathEinnahmen = field_Einnahmen.getText();
            ModulHelferlein.pathAusgaben = field_Ausgaben.getText();
            ModulHelferlein.pathUmsaetze = field_Umsaetze.getText();
            ModulHelferlein.pathRechnungen = field_Rechnungen.getText();
            ModulHelferlein.pathSicherung = field_Sicherung.getText();
            ModulHelferlein.pathRezensionen = field_Mahnungen.getText();
            ModulHelferlein.pathKonfiguration = field_Termine.getText();
            ModulHelferlein.pathBuchprojekte = field_Schriftverkehr.getText();
            ModulHelferlein.pathSteuer = field_Steuer.getText();
        } catch (SQLException exept) {
            ModulHelferlein.Fehlermeldung("Update Konfiguration Ausgabepfade", "SQL-Exception: " + exept.getMessage());
        }

        // Dialog schlie�en
        jButtonSchliessenActionPerformed(evt);
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonSchliessenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSchliessenActionPerformed
        // TODO add your handling code here:
        try {
            result.close();
            SQLAnfrage.close();
            conn.close();
        } catch (SQLException exept) {
            ModulHelferlein.Fehlermeldung("SQL-Exception: " + exept.getMessage());
        }
        this.dispose();
    }//GEN-LAST:event_jButtonSchliessenActionPerformed

    private void btnStammdatenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStammdatenActionPerformed
        // TODO add your handling code here:
        if (chooser.showDialog(null, "Verzeichnis w�hlen") == JFileChooser.APPROVE_OPTION) {
            field_Stammdaten.setText(chooser.getSelectedFile().getPath());
        }
    }//GEN-LAST:event_btnStammdatenActionPerformed

    private void btnEinnahmenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEinnahmenActionPerformed
        // TODO add your handling code here:
        if (chooser.showDialog(null, "Verzeichnis w�hlen") == JFileChooser.APPROVE_OPTION) {
            field_Einnahmen.setText(chooser.getSelectedFile().getPath());
        }
    }//GEN-LAST:event_btnEinnahmenActionPerformed

    private void btnAusgabenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAusgabenActionPerformed
        // TODO add your handling code here:
        if (chooser.showDialog(null, "Verzeichnis w�hlen") == JFileChooser.APPROVE_OPTION) {
            field_Ausgaben.setText(chooser.getSelectedFile().getPath());
        }
    }//GEN-LAST:event_btnAusgabenActionPerformed

    private void btnUmsaetzeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUmsaetzeActionPerformed
        // TODO add your handling code here:
        if (chooser.showDialog(null, "Verzeichnis w�hlen") == JFileChooser.APPROVE_OPTION) {
            field_Umsaetze.setText(chooser.getSelectedFile().getPath());
        }
    }//GEN-LAST:event_btnUmsaetzeActionPerformed

    private void btnSicherungenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSicherungenActionPerformed
        // TODO add your handling code here:
        if (chooser.showDialog(null, "Verzeichnis w�hlen") == JFileChooser.APPROVE_OPTION) {
            field_Sicherung.setText(chooser.getSelectedFile().getPath());
        }
    }//GEN-LAST:event_btnSicherungenActionPerformed

    private void btnMahnungenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMahnungenActionPerformed
        // TODO add your handling code here:
        if (chooser.showDialog(null, "Verzeichnis w�hlen") == JFileChooser.APPROVE_OPTION) {
            field_Mahnungen.setText(chooser.getSelectedFile().getPath());
        }
    }//GEN-LAST:event_btnMahnungenActionPerformed

    private void btnRechnungenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRechnungenActionPerformed
        // TODO add your handling code here:
        if (chooser.showDialog(null, "Verzeichnis w�hlen") == JFileChooser.APPROVE_OPTION) {
            field_Rechnungen.setText(chooser.getSelectedFile().getPath());
        }
    }//GEN-LAST:event_btnRechnungenActionPerformed

    private void btnTermineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTermineActionPerformed
        // TODO add your handling code here:
        if (chooser.showDialog(null, "Verzeichnis w�hlen") == JFileChooser.APPROVE_OPTION) {
            field_Termine.setText(chooser.getSelectedFile().getPath());
        }
    }//GEN-LAST:event_btnTermineActionPerformed

    private void btnSchriftverkehrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSchriftverkehrActionPerformed
        // TODO add your handling code here:
        if (chooser.showDialog(null, "Verzeichnis w�hlen") == JFileChooser.APPROVE_OPTION) {
            field_Schriftverkehr.setText(chooser.getSelectedFile().getPath());
        }
    }//GEN-LAST:event_btnSchriftverkehrActionPerformed

    private void btnSteuerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSteuerActionPerformed
        // TODO add your handling code here:
        if (chooser.showDialog(null, "Verzeichnis w�hlen") == JFileChooser.APPROVE_OPTION) {
            field_Steuer.setText(chooser.getSelectedFile().getPath());
        }
    }//GEN-LAST:event_btnSteuerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Benutzer = args[0];
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /**
         * try { for (javax.swing.UIManager.LookAndFeelInfo info :
         * javax.swing.UIManager.getInstalledLookAndFeels()) { if
         * ("Nimbus".equals(info.getName())) {
         * javax.swing.UIManager.setLookAndFeel(info.getClassName()); break; } }
         * } catch (ClassNotFoundException | InstantiationException |
         * IllegalAccessException | javax.swing.UnsupportedLookAndFeelException
         * ex) {
         * java.util.logging.Logger.getLogger(CarolaHartmannMilesVerlag.class.getName()).log(java.util.logging.Level.SEVERE,
         * null, ex); }
         */
        //</editor-fold>

        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            VerwaltenDatenbankKonfigurationPfade dialog = new VerwaltenDatenbankKonfigurationPfade(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    dialog.setVisible(false);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JPanel panel1;
    private JLabel jLabel1;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JTextField field_Einnahmen;
    private JTextField field_Ausgaben;
    private JTextField field_Umsaetze;
    private JTextField field_Sicherung;
    private JTextField field_Mahnungen;
    private JTextField field_Rechnungen;
    private JTextField field_Termine;
    private JTextField field_Schriftverkehr;
    private JTextField field_Steuer;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel2;
    private JTextField field_Stammdaten;
    private JButton btnStammdaten;
    private JButton btnEinnahmen;
    private JButton btnAusgaben;
    private JButton btnUmsaetze;
    private JButton btnSicherungen;
    private JButton btnMahnungen;
    private JButton btnRechnungen;
    private JButton btnTermine;
    private JButton btnSchriftverkehr;
    private JButton btnSteuer;
    private JButton jButtonUpdate;
    private JButton jButtonSchliessen;
    private JTextField field_ID;
    // End of variables declaration//GEN-END:variables

    private Connection conn;
    private Statement SQLAnfrage;
    private ResultSet result;
    private JFileChooser chooser;
    private static String Benutzer = "";
    private static int ID = 0;
    private static String field_Benutzer = "";
}
