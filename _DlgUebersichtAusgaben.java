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
import net.miginfocom.swing.*;

/**
 *
 * @author Thomas Zimmermann
 */
public class _DlgUebersichtAusgaben extends javax.swing.JDialog {

    /**
     * Creates new form _DlgUebersichtAusgaben
     *
     * @param parent
     * @param modal
     */
    public _DlgUebersichtAusgaben(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        buttonGroupAusgabeformat.add(jRadioButtonPDF);
        buttonGroupAusgabeformat.add(jRadioButtonXLS);
        buttonGroupAusgabeformat.add(jRadioButtonDoc);
        buttonGroupRechnungen.add(rbAlle);
        buttonGroupRechnungen.add(rbBezahlt);
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
        jLabelZeitraum = new JLabel();
        jLabelAusgabeformat = new JLabel();
        jLabelVon = new JLabel();
        jLabelBis = new JLabel();
        jRadioButtonPDF = new JRadioButton();
        jDateChooserVon = new JDateChooser();
        jDateChooserBis = new JDateChooser();
        jRadioButtonXLS = new JRadioButton();
        jRadioButtonDoc = new JRadioButton();
        label1 = new JLabel();
        rbAlle = new JRadioButton();
        rbBezahlt = new JRadioButton();
        jButtonDrucken = new JButton();
        jButtonSchlie�en = new JButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Carola Hartmann Miles-Verlag");
        setResizable(false);
        setFont(new Font(Font.DIALOG, Font.BOLD, 12));
        setMinimumSize(new Dimension(430, 340));
        var contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //---- jLabel1 ----
            jLabel1.setFont(new Font("Tahoma", Font.BOLD, 12));
            jLabel1.setText("\u00dcbersicht der Ausgaben");
            panel1.add(jLabel1);
            jLabel1.setBounds(0, 0, 179, jLabel1.getPreferredSize().height);

            //---- jLabelZeitraum ----
            jLabelZeitraum.setFont(new Font("Tahoma", Font.BOLD, 11));
            jLabelZeitraum.setText("Zeitraum");
            panel1.add(jLabelZeitraum);
            jLabelZeitraum.setBounds(0, 38, 87, jLabelZeitraum.getPreferredSize().height);

            //---- jLabelAusgabeformat ----
            jLabelAusgabeformat.setFont(new Font("Tahoma", Font.BOLD, 11));
            jLabelAusgabeformat.setText("Ausgabeformat");
            panel1.add(jLabelAusgabeformat);
            jLabelAusgabeformat.setBounds(new Rectangle(new Point(304, 38), jLabelAusgabeformat.getPreferredSize()));

            //---- jLabelVon ----
            jLabelVon.setText("von ...");
            panel1.add(jLabelVon);
            jLabelVon.setBounds(0, 57, 87, 23);

            //---- jLabelBis ----
            jLabelBis.setText("... bis");
            panel1.add(jLabelBis);
            jLabelBis.setBounds(145, 55, 87, 23);

            //---- jRadioButtonPDF ----
            jRadioButtonPDF.setText("PDF");
            jRadioButtonPDF.setEnabled(false);
            panel1.add(jRadioButtonPDF);
            jRadioButtonPDF.setBounds(304, 57, 88, jRadioButtonPDF.getPreferredSize().height);
            panel1.add(jDateChooserVon);
            jDateChooserVon.setBounds(0, 85, 120, 23);
            panel1.add(jDateChooserBis);
            jDateChooserBis.setBounds(145, 85, 120, 23);

            //---- jRadioButtonXLS ----
            jRadioButtonXLS.setText("XLS");
            jRadioButtonXLS.setSelected(true);
            panel1.add(jRadioButtonXLS);
            jRadioButtonXLS.setBounds(304, 85, 88, jRadioButtonXLS.getPreferredSize().height);

            //---- jRadioButtonDoc ----
            jRadioButtonDoc.setText("DOC");
            jRadioButtonDoc.setEnabled(false);
            panel1.add(jRadioButtonDoc);
            jRadioButtonDoc.setBounds(304, 113, 88, jRadioButtonDoc.getPreferredSize().height);

            //---- label1 ----
            label1.setText("Umfang");
            label1.setFont(label1.getFont().deriveFont(label1.getFont().getStyle() | Font.BOLD));
            panel1.add(label1);
            label1.setBounds(0, 141, 87, label1.getPreferredSize().height);

            //---- rbAlle ----
            rbAlle.setSelected(true);
            rbAlle.setText("f\u00fcr Umsatzsteuervoranmeldung => alle Rechnungen");
            panel1.add(rbAlle);
            rbAlle.setBounds(0, 160, 299, rbAlle.getPreferredSize().height);

            //---- rbBezahlt ----
            rbBezahlt.setText("f\u00fcr Umsatzsteuererkl\u00e4rung => nur bezahlte Rechnungen");
            panel1.add(rbBezahlt);
            rbBezahlt.setBounds(new Rectangle(new Point(0, 188), rbBezahlt.getPreferredSize()));

            //---- jButtonDrucken ----
            jButtonDrucken.setText("Drucken");
            jButtonDrucken.addActionListener(e -> jButtonDruckenActionPerformed(e));
            panel1.add(jButtonDrucken);
            jButtonDrucken.setBounds(156, 235, 120, jButtonDrucken.getPreferredSize().height);

            //---- jButtonSchlie�en ----
            jButtonSchlie�en.setText("Schlie\u00dfen");
            jButtonSchlie�en.addActionListener(e -> jButtonSchlie�enActionPerformed(e));
            panel1.add(jButtonSchlie�en);
            jButtonSchlie�en.setBounds(280, 235, 120, jButtonSchlie�en.getPreferredSize().height);

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
                    .addComponent(panel1, GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, 274, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(13, Short.MAX_VALUE))
        );
        setSize(425, 330);
        setLocationRelativeTo(getOwner());

        //---- buttonGroup2 ----
        var buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(jRadioButtonPDF);
        buttonGroup2.add(jRadioButtonXLS);
        buttonGroup2.add(jRadioButtonDoc);

        //---- buttonGroup1 ----
        var buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(rbAlle);
        buttonGroup1.add(rbBezahlt);
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
            berAusgaben.berichtPDF(rbAlle.isSelected(), Modulhelferlein.printDateFormat("yyyy-MM-dd", vonDate), Modulhelferlein.printDateFormat("yyyy-MM-dd", bisDate));
        } else if (jRadioButtonXLS.isSelected()) { // Format XLSX
            berAusgaben.berichtXLS(rbAlle.isSelected(), Modulhelferlein.printDateFormat("yyyy-MM-dd", vonDate), Modulhelferlein.printDateFormat("yyyy-MM-dd", bisDate));
        } else { // Format DOCX
            berAusgaben.berichtDOC(rbAlle.isSelected(), Modulhelferlein.printDateFormat("yyyy-MM-dd", vonDate), Modulhelferlein.printDateFormat("yyyy-MM-dd", bisDate));
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
            _DlgUebersichtAusgaben dialog = new _DlgUebersichtAusgaben(new javax.swing.JFrame(), true);

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
    private JLabel jLabelZeitraum;
    private JLabel jLabelAusgabeformat;
    private JLabel jLabelVon;
    private JLabel jLabelBis;
    private JRadioButton jRadioButtonPDF;
    private JDateChooser jDateChooserVon;
    private JDateChooser jDateChooserBis;
    private JRadioButton jRadioButtonXLS;
    private JRadioButton jRadioButtonDoc;
    private JLabel label1;
    private JRadioButton rbAlle;
    private JRadioButton rbBezahlt;
    private JButton jButtonDrucken;
    private JButton jButtonSchlie�en;
    // End of variables declaration//GEN-END:variables

    private ButtonGroup buttonGroupAusgabeformat = new ButtonGroup();
    private ButtonGroup buttonGroupRechnungen = new ButtonGroup();
}
