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
import javax.swing.*;
import javax.swing.GroupLayout;
import com.toedter.calendar.*;

/**
 *
 * @author Thomas Zimmermann
 */
public class _DlgUebersichtZahlungen extends javax.swing.JDialog {

    /**
     * Creates new form _DlgUebersichtZahlungen
     *
     * @param parent
     * @param modal
     */
    public _DlgUebersichtZahlungen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        buttonGroupAusgabeformat.add(jRadioButtonPDF);
        buttonGroupAusgabeformat.add(jRadioButtonXLS);
        buttonGroupAusgabeformat.add(jRadioButtonDoc);
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
        label1 = new JLabel();
        jLabelZeitraum = new JLabel();
        jLabelAusgabeformat = new JLabel();
        jLabelVon = new JLabel();
        jLabelBis = new JLabel();
        jRadioButtonPDF = new JRadioButton();
        jDateChooserVon = new JDateChooser();
        jDateChooserBis = new JDateChooser();
        jRadioButtonXLS = new JRadioButton();
        jRadioButtonDoc = new JRadioButton();
        jButtonDrucken = new JButton();
        jButtonSchlie�en = new JButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("\u00dcbersicht der offenen Ausgaben");
        setResizable(false);
        setFont(new Font(Font.DIALOG, Font.BOLD, 12));
        setMinimumSize(new Dimension(370, 265));
        var contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //---- label1 ----
            label1.setText("Offene Rechnungen identifizieren");
            label1.setFont(label1.getFont().deriveFont(label1.getFont().getStyle() | Font.BOLD, label1.getFont().getSize() + 1f));
            panel1.add(label1);
            label1.setBounds(0, 0, 330, label1.getPreferredSize().height);

            //---- jLabelZeitraum ----
            jLabelZeitraum.setFont(new Font("Tahoma", Font.BOLD, 11));
            jLabelZeitraum.setText("Zeitraum");
            panel1.add(jLabelZeitraum);
            jLabelZeitraum.setBounds(0, 45, 87, jLabelZeitraum.getPreferredSize().height);

            //---- jLabelAusgabeformat ----
            jLabelAusgabeformat.setFont(new Font("Tahoma", Font.BOLD, 11));
            jLabelAusgabeformat.setText("Ausgabeformat");
            panel1.add(jLabelAusgabeformat);
            jLabelAusgabeformat.setBounds(230, 45, 102, jLabelAusgabeformat.getPreferredSize().height);

            //---- jLabelVon ----
            jLabelVon.setText("von ...");
            panel1.add(jLabelVon);
            jLabelVon.setBounds(0, 64, 87, 23);

            //---- jLabelBis ----
            jLabelBis.setText("... bis");
            panel1.add(jLabelBis);
            jLabelBis.setBounds(108, 64, 96, 23);

            //---- jRadioButtonPDF ----
            jRadioButtonPDF.setText("PDF");
            jRadioButtonPDF.setEnabled(false);
            panel1.add(jRadioButtonPDF);
            jRadioButtonPDF.setBounds(230, 64, 82, jRadioButtonPDF.getPreferredSize().height);
            panel1.add(jDateChooserVon);
            jDateChooserVon.setBounds(0, 92, 105, 23);
            panel1.add(jDateChooserBis);
            jDateChooserBis.setBounds(108, 92, 103, 23);

            //---- jRadioButtonXLS ----
            jRadioButtonXLS.setText("XLS");
            jRadioButtonXLS.setSelected(true);
            panel1.add(jRadioButtonXLS);
            jRadioButtonXLS.setBounds(230, 92, 82, jRadioButtonXLS.getPreferredSize().height);

            //---- jRadioButtonDoc ----
            jRadioButtonDoc.setText("DOC");
            jRadioButtonDoc.setEnabled(false);
            panel1.add(jRadioButtonDoc);
            jRadioButtonDoc.setBounds(230, 120, 82, jRadioButtonDoc.getPreferredSize().height);

            //---- jButtonDrucken ----
            jButtonDrucken.setText("Drucken");
            jButtonDrucken.addActionListener(e -> jButtonDruckenActionPerformed(e));
            panel1.add(jButtonDrucken);
            jButtonDrucken.setBounds(93, 174, 118, jButtonDrucken.getPreferredSize().height);

            //---- jButtonSchlie�en ----
            jButtonSchlie�en.setText("Schlie\u00dfen");
            jButtonSchlie�en.addActionListener(e -> jButtonSchlie�enActionPerformed(e));
            panel1.add(jButtonSchlie�en);
            jButtonSchlie�en.setBounds(214, 173, 117, jButtonSchlie�en.getPreferredSize().height);

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
                    .addComponent(panel1, GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        setSize(360, 255);
        setLocationRelativeTo(getOwner());

        //---- buttonGroup1 ----
        var buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(jRadioButtonPDF);
        buttonGroup1.add(jRadioButtonXLS);
        buttonGroup1.add(jRadioButtonDoc);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSchlie�enActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSchlie�enActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonSchlie�enActionPerformed

    private void jButtonDruckenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDruckenActionPerformed
        // TODO add your handling code here:
        java.util.Date vonDate = jDateChooserVon.getDate();
        java.util.Date bisDate = jDateChooserBis.getDate();

        if (jRadioButtonPDF.isSelected()) { // Format PDF
            berZahlungen.berichtPDF(Modulhelferlein.printDateFormat("yyyy-MM-dd", vonDate), Modulhelferlein.printDateFormat("yyyy-MM-dd", bisDate));
        } else if (jRadioButtonXLS.isSelected()) { // Format XLSX
            berZahlungen.berichtXLS(Modulhelferlein.printDateFormat("yyyy-MM-dd", vonDate), Modulhelferlein.printDateFormat("yyyy-MM-dd", bisDate));
        } else { // Format DOCX
            berZahlungen.berichtDOC(Modulhelferlein.printDateFormat("yyyy-MM-dd", vonDate), Modulhelferlein.printDateFormat("yyyy-MM-dd", bisDate));
        }
        this.dispose();
    }//GEN-LAST:event_jButtonDruckenActionPerformed

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
            _DlgUebersichtZahlungen dialog = new _DlgUebersichtZahlungen(new javax.swing.JFrame(), true);

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
    private JLabel label1;
    private JLabel jLabelZeitraum;
    private JLabel jLabelAusgabeformat;
    private JLabel jLabelVon;
    private JLabel jLabelBis;
    private JRadioButton jRadioButtonPDF;
    private JDateChooser jDateChooserVon;
    private JDateChooser jDateChooserBis;
    private JRadioButton jRadioButtonXLS;
    private JRadioButton jRadioButtonDoc;
    private JButton jButtonDrucken;
    private JButton jButtonSchlie�en;
    // End of variables declaration//GEN-END:variables

    private ButtonGroup buttonGroupAusgabeformat = new ButtonGroup();
}
