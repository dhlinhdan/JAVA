
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Date;

import java.lang.System.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import java.util.ArrayList;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.logging.Level;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author ASUS
 */
public class DatLichKhamFrame extends javax.swing.JFrame {

    /**
     * Creates new form DatLichKhamFrame
     */
    public DatLichKhamFrame() {
        initComponents();
        loadTenBS();
    }

    private void loadTenBS() {
        ArrayList<String> data = new ArrayList();
        String sql = "Select TENBS FROM BACSI";
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
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                data.add(rs.getString("TENBS"));
                System.out.println(rs.getString("TENBS"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
        for (String string : data) {
            BSKbox.addItem(string);
        }
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
        maBNtxt = new javax.swing.JTextField();
        tenBNtxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        yckhamBox = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        BSKbox = new javax.swing.JComboBox<>();
        ngKhamChoose = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        maBNtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maBNtxtActionPerformed(evt);
            }
        });
        maBNtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                maBNtxtKeyPressed(evt);
            }
        });

        tenBNtxt.setForeground(new java.awt.Color(153, 204, 255));
        tenBNtxt.setText("Tên bệnh nhân");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Mã bệnh nhân");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Tên bệnh nhân");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Ngày khám");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Yêu cầu khám");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Bác sĩ khám");

        yckhamBox.setText("Yêu cầu khám");
        yckhamBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yckhamBoxActionPerformed(evt);
            }
        });

        jButton2.setText("Đặt Lịch Khám");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(yckhamBox, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(BSKbox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ngKhamChoose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(maBNtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tenBNtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(63, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(maBNtxt)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tenBNtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ngKhamChoose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yckhamBox, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BSKbox)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public String getMaKB() {

        int count = 1;
        String sql = "select * from KHAMBENH";
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
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                count += 1;
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
        return String.valueOf(count);
    }

    public String getMaBS() {

        String sql = "select MABS from BACSI where TENBS = ?";
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
            String item = (String) BSKbox.getSelectedItem();
            statement.setString(1, item);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                return rs.getString("MABS");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
        return null;
    }
    private void yckhamBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yckhamBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yckhamBoxActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

       java.util.Date d = null;
        try {
            d = new SimpleDateFormat("yyyy-MM-dd").parse(LocalDate.now().toString());
        } catch (ParseException ex) {
            
        }
        java.util.Date datetime = ngKhamChoose.getDate();
        //System.out.println(d.before(datetime));
        if (datetime.before(d)) {
            JOptionPane.showMessageDialog(this, "Ngày khám bệnh phải sau thời điểm hiện tai");
        } else {
            String sql = "insert into KHAMBENH (MAKB, MABN, MABS, NGAYKHAM, YEUCAUKHAM) values(?, ?, ?, ?, ?)";
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
                statement.setString(1, getMaKB());
                statement.setString(2, maBNtxt.getText());
                statement.setString(3, getMaBS());
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yy");
                String date = sdf.format(ngKhamChoose.getDate());
                //System.out.println(date);
                statement.setString(4, date);
                statement.setString(5, yckhamBox.getText());
                int rs = statement.executeUpdate();
                if (rs == 0) {
                    JOptionPane.showMessageDialog(this, "Đặt lịch khám thất bại!!!");
                    reset();
                } else {
                    JOptionPane.showMessageDialog(this, "Đặt lịch khám thành công");
                    reset();
                }
            } catch (HeadlessException | ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void maBNtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maBNtxtActionPerformed


    }//GEN-LAST:event_maBNtxtActionPerformed

    private void maBNtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_maBNtxtKeyPressed
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
                statement.setString(1, maBNtxt.getText());
                ResultSet rs = statement.executeQuery();
                while (rs.next()) {
                    tenBNtxt.setText(rs.getString("TENBN"));
                    count += 1;
                }
                if (count == 0) {
                    JOptionPane.showMessageDialog(this, "Benh nhan chua dang ky");
                    reset();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_maBNtxtKeyPressed

    /**
     * @param args the command line arguments
     */
    public void reset() {
        maBNtxt.setText("");
        tenBNtxt.setText("");
        yckhamBox.setText("");
        //dcNgayKham.setDate(LocalDate.now());
    }

    private String Date(LocalDate now) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

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
            java.util.logging.Logger.getLogger(DatLichKhamFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatLichKhamFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatLichKhamFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatLichKhamFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new DatLichKhamFrame().setVisible(true);
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BSKbox;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField maBNtxt;
    private com.toedter.calendar.JDateChooser ngKhamChoose;
    private javax.swing.JTextField tenBNtxt;
    private javax.swing.JTextField yckhamBox;
    // End of variables declaration//GEN-END:variables
}