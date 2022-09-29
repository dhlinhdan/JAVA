
//import java.lang.System.Logger.Level;
import com.microsoft.sqlserver.jdbc.SQLServerPreparedStatement;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author ASUS
 */
public class KhamBenhFrame extends javax.swing.JFrame {

    /**
     * Creates new form KhamBenhFrame
     */
    DefaultTableModel modelDV = new DefaultTableModel();
    DefaultTableModel modelDVBS = new DefaultTableModel();
    public KhamBenhFrame() {
        initComponents();
        showtenBacSi();
        showtenBenhNhan();
        showDSDVBacSiChon();
        //loadDataDV();
        showDSDichVu();
        //initTbaleDV();
        
    }
    

    

    private void loadDataDV() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String hostname = "localhost";
            String db = "QLSP";
            String port = "1433";
            String usernamesql = "linhdan";
            String passwordsql = "123456";

            //          String connectURL = "jdbc:sqlserver://" + hostname + ":" + port + ";databaseName=" + db + ";" + "integratedSecurity=true"+ ";";
            String connectURL = "jdbc:sqlserver://" + hostname + ":" + port + ";DatabaseName=" + db + ";encrypt=true;trustServerCertificate=true;";

            Connection conn = DriverManager.getConnection(connectURL, usernamesql, passwordsql);
            int iRow;
            Vector row, column;
            column = new Vector();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("Select [TENDV] from [DICHVU]");
            ResultSetMetaData metaData = rs.getMetaData();
            iRow = metaData.getColumnCount();

            for (int i = 1; i <= iRow; i++) {
                column.add(metaData.getColumnName(1));
            }
            modelDV.setColumnIdentifiers(column);
            while (rs.next()) {
                row = new Vector();
                for (int i = 1; i <= iRow; i++) {
                    row.addElement(rs.getString(i));
                }
                modelDV.addRow(row);
                tableDV.setModel(modelDV);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    private void showDSDichVu() {
        String sql = "SELECT TENDV FROM DICHVU";
        DefaultTableModel modelDVV = (DefaultTableModel) tableDV.getModel();

        //tbModel1.setRowCount(0);
        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String hostname = "localhost";
            String db = "QLKB";
            String port = "1433";
            String usernamesql = "linhdan";
            String passwordsql = "123456";

            //          String connectURL = "jdbc:sqlserver://" + hostname + ":" + port + ";databaseName=" + db + ";" + "integratedSecurity=true"+ ";";
            String connectURL = "jdbc:sqlserver://" + hostname + ":" + port + ";DatabaseName=" + db + ";encrypt=true;trustServerCertificate=true;";

            Connection conn = DriverManager.getConnection(connectURL, usernamesql, passwordsql);
            
            String row[] = new String[1];
            Statement st = conn.createStatement();
            
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                modelDVV.addRow(new String[]{rs.getString("TENDV")});
            }

            tableDV.setModel(modelDVV);
            tableDV.setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {

        }

    }
    
    public String getMaKB() {
        String sql = "Select makb from khambenh where mabs = ? and mabn  = ? and ngaykham = ? and ketluan = ? and yeucaukham = ?";
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
            statement.setString(1, getMaBS());
            statement.setString(2, getMaBN());
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yy");
            String date = sdf.format(ngKhamChoose.getDate());
            System.out.println(date);
            statement.setString(3, date);
            statement.setString(3, klBox.getText());
            statement.setString(4, YCBOX.getText());
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                return rs.getString("MAKB");
                //System.out.println(rs.getString("tenbs"));
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
        return null;
    }

    private void showDSDVBacSiChon() {
        modelDVBS = new DefaultTableModel();
        modelDVBS.setColumnIdentifiers(new String[]{"Tên dịch vụ", "Số lượng"});
        tableDVBS.setModel(modelDVBS);
        tableDVBS.setVisible(true);
    }

    private void showtenBenhNhan() {
        ArrayList<String> data = new ArrayList();
        String sql = "Select TENBN FROM BENHNHAN";
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
                data.add(rs.getString("TENBN"));
                System.out.println(rs.getString("TENBN"));
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
        for (String string : data) {
            TENBNBOX.addItem(string);
        }
    }

    private void showtenBacSi() {
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
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
        for (String string : data) {
            BSKbox.addItem(string);
        }

    }

    public String getTenBS() {
        return (String) BSKbox.getSelectedItem();
    }

    public String getMaBN() {

        String sql = "select MABN from benhnhan where TENBN = ?";
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
            String item = (String) TENBNBOX.getSelectedItem();
            statement.setString(1, item);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                return rs.getString("MABN");
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
        return null;
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
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
        return null;
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
        klBox = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        YCBOX = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableDVBS = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        BSKbox = new javax.swing.JComboBox<>();
        TENBNBOX = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableDV = new javax.swing.JTable();
        ngKhamChoose = new com.toedter.calendar.JDateChooser();
        findBN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Bác sĩ khám");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Tên bệnh nhân");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Kết luận");

        klBox.setText("Kết luận");
        klBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                klBoxActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Ngày khám");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Yêu cầu khám");

        YCBOX.setText("Yêu cầu khám");
        YCBOX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YCBOXActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Danh sách dịch vụ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Danh sách dịch vụ bác sĩ chọn");

        tableDVBS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên dịch vụ", "Số lượng"
            }
        ));
        tableDVBS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDVBSaddMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableDVBS);

        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TENBNBOX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TENBNBOXMouseClicked(evt);
            }
        });
        TENBNBOX.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TENBNBOXKeyPressed(evt);
            }
        });

        tableDV.setAutoCreateRowSorter(true);
        tableDV.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tableDV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên dịch vụ"
            }
        ));
        tableDV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDVaddMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableDV);

        findBN.setText("Tìm Bệnh Nhân");
        findBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findBNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(klBox))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(BSKbox, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(TENBNBOX, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(77, 77, 77)
                                        .addComponent(findBN)))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(YCBOX, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ngKhamChoose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(65, 65, 65)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BSKbox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TENBNBOX)
                                .addGap(6, 6, 6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(findBN))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ngKhamChoose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(YCBOX, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(klBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void klBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_klBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_klBoxActionPerformed

    private void YCBOXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YCBOXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YCBOXActionPerformed

    private void tableDVBSaddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDVBSaddMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableDVBSaddMouseClicked

    private void TENBNBOXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TENBNBOXMouseClicked

        String sql = "select YEUCAUKHAM from BENHNHAN bn join "
                + "                 (select MABN, TENBS, YEUCAUKHAM "
                + "                 from KHAMBENH kb join BACSI bs on kb.MABS = bs.MABS "
                + "                 where TENBS = ? and ngaykham = ? and THANHTOAN is null) a "
                + "                 on bn.MABN = a.MABN"
                + "                 where TENBN = ?";
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
            statement.setString(1, getTenBS());
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yy");
            String date = sdf.format(ngKhamChoose.getDate());
            System.out.println(date);
            statement.setString(2, date);
            String item = (String) TENBNBOX.getSelectedItem();
            statement.setString(3, item);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                YCBOX.setText(rs.getString("YEUCAUKHAM"));
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_TENBNBOXMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int sluong = tableDVBS.getRowCount();
        int sum = 0;
        String madv = null;
        int gia = 0;
        int sldv;
        // them vao thu phi
        for (int i = 0; i < sluong; i++) {
            String sql1 = "select MADV, DONGIA from DICHVU where TENDV = ?";
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

                PreparedStatement statement1 = conn.prepareStatement(sql1);
                statement1.setString(1, (String) tableDVBS.getValueAt(i, 0));
                ResultSet rs1 = statement1.executeQuery();
                while (rs1.next()) {
                    madv = rs1.getString("MADV");
                    gia = rs1.getInt("DONGIA");
                }
                if (!madv.isEmpty() && getMaKB() != null) {
                    JOptionPane.showMessageDialog(this, "Thêm hóa đơn thất bại!!!");
                } else {
                    String sql = "insert into THUPHI (MAKB, MADV, SOLUONG, THANHTIEN) values(?, ?, ?, ?)";
                    PreparedStatement statement = conn.prepareStatement(sql);
                    statement.setString(1, getMaKB());
                    statement.setString(2, madv);
                    sldv = Integer.parseInt((String) tableDVBS.getValueAt(i, 1));
                    statement.setInt(3, sldv);
                    statement.setInt(4, gia * sldv);
                    sum += gia * sldv;
                    int check = statement.executeUpdate();
                    if (check > 0) {
                        JOptionPane.showMessageDialog(this, "Thêm hóa đơn thành công!");
                    } else {
                        JOptionPane.showMessageDialog(this, "Thêm hóa đơn thất bại!!!");
                    }
                }

            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(KhamBenhFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        // cap nhat kham benh
        if (sum > 0 && getMaKB() != null) {
            String sql2 = "update KHAMBENH set KETLUAN = ? and THANHTOAN = 0 where MAKB = ?";
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

                PreparedStatement statement2 = conn.prepareStatement(sql2);
                statement2.setString(1, klBox.getText());
                statement2.setString(2, getMaKB());
                int check = statement2.executeUpdate();
                if (check > 0) {
                    JOptionPane.showMessageDialog(this, "Cập nhật khám bệnh thành công!");
                } else {
                    JOptionPane.showMessageDialog(this, "Cập nhật khám bệnh thất bại!!!");
                }
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(KhamBenhFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Cập nhật khám bệnh thất bại!!!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tableDVaddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDVaddMouseClicked
            int[] index = tableDV.getSelectedRows();
            modelDV= (DefaultTableModel) tableDV.getModel();
        Object[] row = new Object[2];
        modelDVBS = (DefaultTableModel) tableDVBS.getModel();
        for (int i = 0; i < index.length; i++) {
            String m = JOptionPane.showInputDialog(this, "Nhập số lượng dịch vụ!!!");
            //System.out.println(m);
            row[0] = modelDV.getValueAt(i, 0);
            row[1] = m;
            modelDVBS.addRow(row);
            modelDV.removeRow(i);}
    }//GEN-LAST:event_tableDVaddMouseClicked

    private void TENBNBOXKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TENBNBOXKeyPressed
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String maBN = getMaBN();
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

                String sql = "SELECT [YEUCAUKHAM] FROM [KHAMBENH] WHERE [MABN] ="+ maBN;
                SQLServerPreparedStatement ps = (SQLServerPreparedStatement) conn.prepareStatement(sql);


                ResultSet rs;
                rs = ps.executeQuery();
                while (rs.next()) {
                    String YEUCAUKHAM;
                    YEUCAUKHAM = rs.getString("YEUCAUKHAM");
                    YCBOX.setText(YEUCAUKHAM);
                }
                
                


            } catch (SQLException e) {
                System.err.println(e);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(KhamBenhFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_TENBNBOXKeyPressed

    private void findBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findBNActionPerformed
        ArrayList<String> dataKB = new ArrayList();
       
        //System.out.println(date);
        String sql = "select TENBN from BENHNHAN bn join "
                + "                 (select MABN, TENBS, NGAYKHAM "
                + "                 from KHAMBENH kb join BÁCI bs on kb.MABS = bs.MABS "
                + "                 where TENBS = ? and NGAYKHAM = ? and THANHTOAN is null) a "
                + "                 on bn.MABN = a.MABN";
        try {
            
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
            statement.setString(1, getTenBS());
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yy");
            String date = sdf.format(ngKhamChoose.getDate());
            statement.setString(2, date);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                dataKB.add(rs.getString("TENBN"));
            }
            for (String string : dataKB) {
                TENBNBOX.addItem(string);
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_findBNActionPerformed

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
            java.util.logging.Logger.getLogger(KhamBenhFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KhamBenhFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KhamBenhFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KhamBenhFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KhamBenhFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BSKbox;
    private javax.swing.JComboBox<String> TENBNBOX;
    private javax.swing.JTextField YCBOX;
    private javax.swing.JButton findBN;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField klBox;
    private com.toedter.calendar.JDateChooser ngKhamChoose;
    private javax.swing.JTable tableDV;
    private javax.swing.JTable tableDVBS;
    // End of variables declaration//GEN-END:variables
}
