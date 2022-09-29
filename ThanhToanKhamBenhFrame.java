
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class ThanhToanKhamBenhFrame extends javax.swing.JFrame {

    /**
     * Creates new form ThanhToanKhamBenhFrame
     */
    public ThanhToanKhamBenhFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TIENBOX = new javax.swing.JLabel();
        MABNBOX = new javax.swing.JTextField();
        TENBNBOX = new javax.swing.JTextField();
        KLBOX = new javax.swing.JTextField();
        NGAYKHAM = new com.toedter.calendar.JDateChooser();
        YCBOX = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TABLE = new javax.swing.JTable();
        TTBT = new javax.swing.JButton();
        TTBOX = new javax.swing.JCheckBox();
        jSlider1 = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mã bệnh nhân");

        jLabel2.setText("Tên bệnh nhân");

        jLabel3.setText("Kết luận");

        jLabel4.setText("Ngày khám");

        jLabel5.setText("Yêu cầu khám");

        TIENBOX.setText("Yêu cầu khám");

        MABNBOX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MABNBOXActionPerformed(evt);
            }
        });
        MABNBOX.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MABNBOXKeyPressed(evt);
            }
        });

        TENBNBOX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TENBNBOXActionPerformed(evt);
            }
        });

        KLBOX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KLBOXActionPerformed(evt);
            }
        });

        YCBOX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YCBOXActionPerformed(evt);
            }
        });

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel7.setText("Danh sách dịch vụ đã khám");

        TABLE.setAutoCreateRowSorter(true);
        TABLE.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        TABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên dịch vụ", "Số lượng", "Thành tiền"
            }
        ));
        TABLE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABLEaddMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TABLE);

        TTBT.setText("Thanh toán");
        TTBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TTBTActionPerformed(evt);
            }
        });

        TTBOX.setText("ĐÃ THANH TOÁN");
        TTBOX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TTBOXActionPerformed(evt);
            }
        });

        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TENBNBOX, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(KLBOX, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MABNBOX, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(TTBOX, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TIENBOX, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(YCBOX, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                    .addComponent(NGAYKHAM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(31, 31, 31))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(TTBT)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MABNBOX, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NGAYKHAM, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TENBNBOX, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YCBOX, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TIENBOX, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KLBOX, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TTBOX)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TTBT)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MABNBOXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MABNBOXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MABNBOXActionPerformed

    private void TENBNBOXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TENBNBOXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TENBNBOXActionPerformed

    private void KLBOXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KLBOXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KLBOXActionPerformed

    private void YCBOXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YCBOXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YCBOXActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void TABLEaddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLEaddMouseClicked
      
    }//GEN-LAST:event_TABLEaddMouseClicked

    private void TTBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TTBTActionPerformed
        // TODO add your handling code here:
        String sql = "update KHAMBENH set THANHTOAN = 1 where MAKB = ?";
        try {
              //Ket noi voi database
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String hostname = "localhost";
            String db = "QLKB";
            String port = "1433";
            String usernamesql = "linhdan";
            String passwordsql = "123456";

            //          String connectURL = "jdbc:sqlserver://" + hostname + ":" + port + ";databaseName=" + db + ";" + "integratedSecurity=true"+ ";";
            String connectURL = "jdbc:sqlserver://" + hostname + ":" + port + ";DatabaseName=" + db + ";encrypt=true;trustServerCertificate=true;";

            Connection conn = DriverManager.getConnection(connectURL, usernamesql, passwordsql);

            PreparedStatement statement = conn.prepareStatement(sql);
            int check = statement.executeUpdate();
            if(check > 0){
                JOptionPane.showMessageDialog(this, "THANH TOÁN THÀNH CÔNG!!!!");
            }
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ThanhToanKhamBenhFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TTBTActionPerformed

    private void MABNBOXKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MABNBOXKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String sql = "select TENBN from BENHNHAN where MABN = ?";
            int count = 0;
            try {
                //Ket noi voi database
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String hostname = "localhost";
            String db = "QLKB";
            String port = "1433";
            String usernamesql = "linhdan";
            String passwordsql = "123456";

            //          String connectURL = "jdbc:sqlserver://" + hostname + ":" + port + ";databaseName=" + db + ";" + "integratedSecurity=true"+ ";";
            String connectURL = "jdbc:sqlserver://" + hostname + ":" + port + ";DatabaseName=" + db + ";encrypt=true;trustServerCertificate=true;";

            Connection conn = DriverManager.getConnection(connectURL, usernamesql, passwordsql);

                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setString(1, MABNBOX.getText());
                ResultSet rs = statement.executeQuery();
                while (rs.next()) {
                    TENBNBOX.setText(rs.getString("TENBN"));
                    count += 1;
                }
                if (count == 0) {
                    JOptionPane.showMessageDialog(this, "BỆNH NHÂN CHƯA ĐƯỢC ĐĂNG KÍ!!!");
                    reset();
                }
            } catch (HeadlessException | ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(this, e);
            }}
        
                // TODO add your handling code here:
        String sql = "select MAKB, KETLUAN, YEUCAUKHAM,THANHTOAN from KHAMBENH where MABN = ? and NGAYKHAM  = ?";
        try {
            
                //Ket noi voi database
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String hostname = "localhost";
            String db = "QLKB";
            String port = "1433";
            String usernamesql = "linhdan";
            String passwordsql = "123456";

            //          String connectURL = "jdbc:sqlserver://" + hostname + ":" + port + ";databaseName=" + db + ";" + "integratedSecurity=true"+ ";";
            String connectURL = "jdbc:sqlserver://" + hostname + ":" + port + ";DatabaseName=" + db + ";encrypt=true;trustServerCertificate=true;";

            Connection conn = DriverManager.getConnection(connectURL, usernamesql, passwordsql);

           
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, MABNBOX.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yy");
            String date = sdf.format(NGAYKHAM.getDate());
            statement.setString(2, date);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                makb = rs.getString("MAKB");
                KLBOX.setText(rs.getString("KETLUAN"));
                YCBOX.setText(rs.getString("YEUCAUKHAM"));
                thanhtoan = rs.getInt("THANHTOAN");
            }
            
            tbModel1 = new DefaultTableModel();
            tbModel1.setColumnIdentifiers(new String[]{"Tên dịch vụ", "Số lượng", "Thành tiền"});
            String sql1 = "select TENDV, SOLUONG, THANHTIEN from THUPHI tp join DICHVU dv on tp.MADV = dv.MADV where MAKB = ?";
            PreparedStatement statement1 = conn.prepareStatement(sql1);
            statement1.setString(1, makb);
            ResultSet rs1 = statement1.executeQuery();
            Object[] row = new Object[3];
            while(rs1.next()){
                row[0] = rs1.getString("TENDV");
                row[1] = rs1.getInt("SOLUONG");
                row[2] = rs1.getInt("THANHTIEN");
                tbModel1.addRow(row);
            }
            TABLE.setModel(tbModel1);
            TABLE.setVisible(true);
            int sum = 0;
            for(int i = 0; i < TABLE.getRowCount(); i++){
                sum += Integer.parseInt((String) TABLE.getValueAt(i, 2));
            }
            
            TIENBOX.setText(String.valueOf(sum));
            
            if(thanhtoan == 1){
                JOptionPane.showMessageDialog(this, "ĐÃ THANH TOÁN!!!");
                TTBOX.setSelected(true);
                TTBT.setEnabled(false);
                
            }
        } catch (HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_MABNBOXKeyPressed

    private void TTBOXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TTBOXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TTBOXActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
       int i = jSlider1.getValue();
       System.out.println(i);
    }//GEN-LAST:event_jSlider1StateChanged

    /**
     * @param args the command line arguments
     */
    DefaultTableModel tbModel1;
    String makb = null;
    int thanhtoan = 0;
    
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
            java.util.logging.Logger.getLogger(ThanhToanKhamBenhFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThanhToanKhamBenhFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThanhToanKhamBenhFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThanhToanKhamBenhFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThanhToanKhamBenhFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField KLBOX;
    private javax.swing.JTextField MABNBOX;
    private com.toedter.calendar.JDateChooser NGAYKHAM;
    private javax.swing.JTable TABLE;
    private javax.swing.JTextField TENBNBOX;
    private javax.swing.JLabel TIENBOX;
    private javax.swing.JCheckBox TTBOX;
    private javax.swing.JButton TTBT;
    private javax.swing.JTextField YCBOX;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables

    private void reset() {
MABNBOX.setText("");
        TENBNBOX.setText("");
        YCBOX.setText("");    }
}
