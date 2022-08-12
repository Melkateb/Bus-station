package busstation1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CustomerBooking extends javax.swing.JFrame {

    Logic logic = new Logic();
    Upload upload = new Upload();

    public CustomerBooking() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jLabel1 = new javax.swing.JLabel();
        ViewButton = new javax.swing.JButton();
        BuyButton = new javax.swing.JButton();
        BackButton1 = new javax.swing.JButton();
        ExitButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ReservedTripsTable = new javax.swing.JTable();
        RoundBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(650, 400));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel1.setText("Trips");

        ViewButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ViewButton.setText("View");
        ViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewButtonActionPerformed(evt);
            }
        });

        BuyButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BuyButton.setText("Buy");
        BuyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyButtonActionPerformed(evt);
            }
        });

        BackButton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BackButton1.setText("Back");
        BackButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButton1ActionPerformed(evt);
            }
        });

        ExitButton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ExitButton1.setText("Exit");
        ExitButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Ticket Type:");

        ReservedTripsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Trip", "Price", "Stops", "Seats", "Vehicles"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        ReservedTripsTable.setToolTipText("");
        ReservedTripsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReservedTripsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ReservedTripsTable);

        RoundBox.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        RoundBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Round" }));
        RoundBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoundBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BackButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ExitButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(RoundBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 111, Short.MAX_VALUE)
                                .addComponent(BuyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(ViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BackButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ExitButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RoundBox, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BuyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewButtonActionPerformed
        int i;
        DefaultTableModel model = (DefaultTableModel) ReservedTripsTable.getModel();
        Object[] lines = upload.TripsUpload();
        for (i = 0; i < lines.length; i++) {
            String[] row = lines[i].toString().split(" ");
            model.addRow(row);
        }
    }//GEN-LAST:event_ViewButtonActionPerformed

    private void BackButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButton1ActionPerformed
        Customer Info = new Customer();
        Info.setVisible(true);
    }//GEN-LAST:event_BackButton1ActionPerformed

    private void ExitButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButton1ActionPerformed

    private void BuyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyButtonActionPerformed
        String filepath = logic.GetFilePath();
        File file = new File(filepath);
        int i;
        try {
            FileWriter w = new FileWriter(file.getAbsoluteFile(), true);
            BufferedWriter b = new BufferedWriter(w);
            DefaultTableModel m = (DefaultTableModel) ReservedTripsTable.getModel();
            int[] index = ReservedTripsTable.getSelectedRows();
            int selectedRow = ReservedTripsTable.getSelectedRow();
            String seatNo = (String) ReservedTripsTable.getValueAt(selectedRow, 3);
            int seatNoInt = Integer.parseInt(seatNo);
            if (seatNoInt > 0) {
                seatNoInt = seatNoInt - 1;
                String choice = (String) RoundBox.getSelectedItem();
                for (i = 0; i < index.length; i++) {
                    for (int j = 0; j < ReservedTripsTable.getColumnCount(); j++) {
                        if (j == 1 && "Round".equals(choice)) {
                            float price = Integer.parseInt((String) ReservedTripsTable.getModel().getValueAt(index[i], j));
                            price = (float) (price * 1.7);
                            b.write(price + " ");
                            j++;
                        }
                        if (j == 3) {
                            b.write(seatNoInt + " ");
                            j++;
                        }
                        b.write(ReservedTripsTable.getModel().getValueAt(index[i], j) + " ");
                    }
                    if ("Single".equals(choice)) {
                        b.write("Single ");
                    } else if ("Round".equals(choice)) {
                        b.write("Round ");
                    }
                    b.newLine();
                }

                String filepath1 = "C:\\Users\\mariam\\Documents\\NetBeansProjects\\BusStation1\\Trips.txt";
                File file1 = new File(filepath1);
                try {
                    FileWriter w1 = new FileWriter(file1.getAbsoluteFile());
                    BufferedWriter b1 = new BufferedWriter(w1);
                    for (int l = 0; l < ReservedTripsTable.getRowCount(); l++) {
                        for (int j = 0; j < ReservedTripsTable.getColumnCount(); j++) {
                            if ((l == selectedRow) && (j == 3)) {
                                b1.write(seatNoInt + " ");
                                j++;
                            }
                            b1.write(ReservedTripsTable.getModel().getValueAt(l, j) + " ");
                        }
                        b1.newLine();
                    }
                    b1.close();
                    w1.close();
                } catch (IOException ex) {
                    Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No enough seats", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            b.close();
            w.close();
        } catch (IOException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_BuyButtonActionPerformed

    private void ReservedTripsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReservedTripsTableMouseClicked

    }//GEN-LAST:event_ReservedTripsTableMouseClicked

    private void RoundBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoundBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoundBoxActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton1;
    private javax.swing.JButton BuyButton;
    private javax.swing.JButton ExitButton1;
    private javax.swing.JTable ReservedTripsTable;
    private javax.swing.JComboBox<String> RoundBox;
    private javax.swing.JButton ViewButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
