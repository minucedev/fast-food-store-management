/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;


import BUS.Staff_BUS;
import DTO.Staff;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Josie
 */
public class Staff_GUI extends javax.swing.JPanel implements checkPermission {

    private Staff_BUS staffBUS = new Staff_BUS();
    private ArrayList<Staff> staffList;
    LocalDate localDate = LocalDate.now();
    int year = localDate.getYear();
    

    /**
     * Creates new form Staff_GUI
     */
    public Staff_GUI(int permissionType, String dcdt_Id){
        staffList = staffBUS.readStaffsData();
        initComponents();
        loadTable(staffList);
        autoStaffId();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel3 = new Custom.RoundPanel();
        roundPanel1 = new Custom.RoundPanel();
        jLabel8 = new javax.swing.JLabel();
        txtStaffID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtStaffName = new javax.swing.JTextField();
        txtYearOfBirth = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtBaseSalary = new javax.swing.JTextField();
        btnAdd1 = new Custom.Button();
        btnUpdate1 = new Custom.Button();
        btnDelete1 = new Custom.Button();
        btnRefresh = new Custom.Button();
        roundPanel2 = new Custom.RoundPanel();
        scrStaffList = new javax.swing.JScrollPane();
        tblStaffList = new javax.swing.JTable();
        cbbSearchFilter = new javax.swing.JComboBox<>();
        txtSearch = new javax.swing.JTextField();
        btnSearchStaff = new Custom.Button();

        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(1015, 650));

        roundPanel3.setBackground(new java.awt.Color(51, 51, 51));

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Mã nhân viên:");

        txtStaffID.setEditable(false);
        txtStaffID.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtStaffID.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(94, 84, 142)), javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 4)));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Tên nhân viên:");

        txtStaffName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtStaffName.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(94, 84, 142)), javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 4)));

        txtYearOfBirth.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtYearOfBirth.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(94, 84, 142)), javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 4)));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Năm sinh:");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("Địa chỉ:");

        txtAddress.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtAddress.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(94, 84, 142)), javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 4)));

        txtGender.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtGender.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(94, 84, 142)), javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 4)));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setText("Giới tính:");

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setText("Số điện thoại:");

        txtPhone.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtPhone.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(94, 84, 142)), javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 4)));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setText("Lương:");

        txtBaseSalary.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtBaseSalary.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(94, 84, 142)), javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 4)));

        btnAdd1.setBackground(new java.awt.Color(240, 240, 240));
        btnAdd1.setBorder(null);
        btnAdd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/plus.png"))); // NOI18N
        btnAdd1.setText("  Add    ");
        btnAdd1.setColor(new java.awt.Color(240, 240, 240));
        btnAdd1.setColorClick(new java.awt.Color(240, 235, 235));
        btnAdd1.setColorOver(new java.awt.Color(255, 255, 255));
        btnAdd1.setFocusPainted(false);
        btnAdd1.setRadius(20);
        btnAdd1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdd1MouseClicked(evt);
            }
        });

        btnUpdate1.setBackground(new java.awt.Color(240, 240, 240));
        btnUpdate1.setBorder(null);
        btnUpdate1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/wrench.png"))); // NOI18N
        btnUpdate1.setText("  Update");
        btnUpdate1.setColor(new java.awt.Color(240, 240, 240));
        btnUpdate1.setColorClick(new java.awt.Color(240, 235, 235));
        btnUpdate1.setColorOver(new java.awt.Color(255, 255, 255));
        btnUpdate1.setFocusPainted(false);
        btnUpdate1.setRadius(20);
        btnUpdate1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdate1MouseClicked(evt);
            }
        });

        btnDelete1.setBackground(new java.awt.Color(240, 240, 240));
        btnDelete1.setBorder(null);
        btnDelete1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/delete.png"))); // NOI18N
        btnDelete1.setText("  Delete");
        btnDelete1.setColor(new java.awt.Color(240, 240, 240));
        btnDelete1.setColorClick(new java.awt.Color(240, 235, 235));
        btnDelete1.setColorOver(new java.awt.Color(255, 255, 255));
        btnDelete1.setFocusPainted(false);
        btnDelete1.setRadius(20);
        btnDelete1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDelete1MouseClicked(evt);
            }
        });

        btnRefresh.setBackground(new java.awt.Color(240, 240, 240));
        btnRefresh.setBorder(null);
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/refresh.png"))); // NOI18N
        btnRefresh.setText("  Refresh");
        btnRefresh.setColor(new java.awt.Color(240, 240, 240));
        btnRefresh.setColorClick(new java.awt.Color(240, 235, 235));
        btnRefresh.setColorOver(new java.awt.Color(255, 255, 255));
        btnRefresh.setFocusPainted(false);
        btnRefresh.setRadius(20);
        btnRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRefreshMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBaseSalary, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStaffName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStaffID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtPhone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtGender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtYearOfBirth, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDelete1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addGap(45, 45, 45))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtStaffName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtYearOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtBaseSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126))
        );

        roundPanel2.setBackground(new java.awt.Color(255, 255, 255));

        scrStaffList.setBackground(new java.awt.Color(255, 255, 255));
        scrStaffList.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách nhân viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        scrStaffList.setForeground(new java.awt.Color(255, 255, 255));

        tblStaffList.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tblStaffList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã nhân viên", "Tên nhân viên", "Năm sinh", "Địa chỉ", "Giới tính", "Số điện thoại", "Lương"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblStaffList.setInheritsPopupMenu(true);
        tblStaffList.setRowHeight(30);
        tblStaffList.setSelectionBackground(new java.awt.Color(235, 235, 235));
        tblStaffList.setSelectionForeground(new java.awt.Color(51, 51, 51));
        tblStaffList.setUpdateSelectionOnSort(false);
        tblStaffList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStaffListMouseClicked(evt);
            }
        });
        scrStaffList.setViewportView(tblStaffList);

        cbbSearchFilter.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        cbbSearchFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã nhân viên", "Tên nhân viên", "Giới tính" }));
        cbbSearchFilter.setFocusable(false);

        txtSearch.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 255)), javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 4)));
        txtSearch.setSelectionColor(new java.awt.Color(204, 153, 255));
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnSearchStaff.setBackground(new java.awt.Color(240, 240, 240));
        btnSearchStaff.setBorder(null);
        btnSearchStaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/search.png"))); // NOI18N
        btnSearchStaff.setColor(new java.awt.Color(240, 240, 240));
        btnSearchStaff.setColorClick(new java.awt.Color(240, 235, 235));
        btnSearchStaff.setColorOver(new java.awt.Color(255, 255, 255));
        btnSearchStaff.setFocusPainted(false);
        btnSearchStaff.setFocusable(false);
        btnSearchStaff.setRadius(5);
        btnSearchStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchStaffMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout roundPanel2Layout = new javax.swing.GroupLayout(roundPanel2);
        roundPanel2.setLayout(roundPanel2Layout);
        roundPanel2Layout.setHorizontalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrStaffList, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                    .addGroup(roundPanel2Layout.createSequentialGroup()
                        .addComponent(cbbSearchFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        roundPanel2Layout.setVerticalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbbSearchFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSearchStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(scrStaffList)
                .addContainerGap())
        );

        javax.swing.GroupLayout roundPanel3Layout = new javax.swing.GroupLayout(roundPanel3);
        roundPanel3.setLayout(roundPanel3Layout);
        roundPanel3Layout.setHorizontalGroup(
            roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundPanel3Layout.setVerticalGroup(
            roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    private void btnAdd1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdd1MouseClicked
        //Thêm nhân viên
        try {
            String idString = staffBUS.autoStaffID();
            if (staffEmpty()) JOptionPane.showMessageDialog(this, "Thông tin nhân viên không được để trống", "Warning", JOptionPane.WARNING_MESSAGE);
            
            else if (year - Integer.parseInt(txtYearOfBirth.getText()) < 18 || year - Integer.parseInt(txtYearOfBirth.getText()) > 90) 
            JOptionPane.showMessageDialog(this, "Độ tuổi không phù hợp chỉ nhận từ 18 đến 90", "Warning", JOptionPane.WARNING_MESSAGE);
            
            else if(!txtPhone.getText().matches("(84|0[3|5|7|8|9])+([0-9]{8})")) 
            JOptionPane.showMessageDialog(this, "Số điện thoại không đúng", "Warning", JOptionPane.WARNING_MESSAGE);
            
            
            else if(staffBUS.phoneStaffExisted(idString, txtPhone.getText()))
            JOptionPane.showMessageDialog(this, "Số điện thoại đã tồn tại", "Warning", JOptionPane.WARNING_MESSAGE);

            else if(!txtBaseSalary.getText().matches("-?\\d+")) 
            JOptionPane.showMessageDialog(this, "Tiền lương phải là số", "Warning", JOptionPane.WARNING_MESSAGE);
            
            else if(txtStaffName.getText().matches("-?\\w+")) 
            JOptionPane.showMessageDialog(this, "Tên nhân viên phải là chữ", "Warning", JOptionPane.WARNING_MESSAGE);
            
            else {
                    Staff sf = new Staff(idString, txtStaffName.getText(), Integer.parseInt(txtYearOfBirth.getText()), txtGender.getText(), txtAddress.getText(), txtPhone.getText(), Integer.parseInt(txtBaseSalary.getText()), false);
                
                    if (staffBUS.addStaffString(sf)) {
                        JOptionPane.showMessageDialog(this, "Thêm nhân viên thành công");
                        staffList = staffBUS.readStaffsData();
                        loadTable(staffList);
                        refreshRow();
                    }     
            }
        }
        catch(NumberFormatException e){
            
        }
    }//GEN-LAST:event_btnAdd1MouseClicked

    private void btnUpdate1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdate1MouseClicked

        try {
            if (staffEmpty()) JOptionPane.showMessageDialog(this, "Chọn nhân viên cần sửa", "Warning", JOptionPane.WARNING_MESSAGE);
            
            else if (year - Integer.parseInt(txtYearOfBirth.getText()) < 18 || year - Integer.parseInt(txtYearOfBirth.getText()) > 90) 
            JOptionPane.showMessageDialog(this, "Độ tuổi không phù hợp chỉ nhận từ 18 đến 90", "Warning", JOptionPane.WARNING_MESSAGE);
            
            else if(!txtPhone.getText().matches("(84|0[3|5|7|8|9])+([0-9]{8})")) 
            JOptionPane.showMessageDialog(this, "Số điện thoại không đúng", "Warning", JOptionPane.WARNING_MESSAGE);
            
            else if(staffBUS.phoneStaffExisted(txtStaffID.getText(), txtPhone.getText()))
            JOptionPane.showMessageDialog(this, "Số điện thoại đã tồn tại", "Warning", JOptionPane.WARNING_MESSAGE);
            
            else if(!txtBaseSalary.getText().matches("-?\\d+")) 
            JOptionPane.showMessageDialog(this, "Tiền lương phải là số", "Warning", JOptionPane.WARNING_MESSAGE);
            
            else if(txtStaffName.getText().matches("-?\\w+")) 
            JOptionPane.showMessageDialog(this, "Tên nhân viên phải là chữ", "Warning", JOptionPane.WARNING_MESSAGE);
            
            else {
                    int rowCount = tblStaffList.getSelectedRow();
                    Staff selectedStaff = staffList.get(rowCount);
                    Staff sf = new Staff(selectedStaff.getStaffId(), txtStaffName.getText(), Integer.parseInt(txtYearOfBirth.getText()), txtGender.getText(), txtAddress.getText(), txtPhone.getText(), Integer.parseInt(txtBaseSalary.getText()), false);
                
                    if (staffBUS.updateStaffString(sf)) {
                        JOptionPane.showMessageDialog(this, "Sửa nhân viên thành công");
                        staffList = staffBUS.readStaffsData();
                        loadTable(staffList);
                        refreshRow();
                    }     
            }
        }
        catch(NumberFormatException e){
            
        }
    }//GEN-LAST:event_btnUpdate1MouseClicked

    private void btnDelete1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelete1MouseClicked

        if (txtStaffID.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "Chưa chọn nhân viên muốn xóa !!!");
        
        else if (JOptionPane.showConfirmDialog(null, "Xác nhận xóa", "Warnning", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                int rowCount = tblStaffList.getSelectedRow();
                Staff selectedStaff = staffList.get(rowCount);
                
                if (staffBUS.deleteStaffString(selectedStaff.getStaffId()) ) {
                    JOptionPane.showMessageDialog(this, "Đã xóa nhân viên");
                    staffList = staffBUS.readStaffsData();
                    loadTable(staffList);
                    refreshRow();
                }
            }
        
    }//GEN-LAST:event_btnDelete1MouseClicked

    private void btnSearchStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchStaffMouseClicked
        //Staff_BUS staffBUS = new Staff_BUS();
        if (!txtSearch.getText().isEmpty()) {
            ArrayList<Staff> resultList;
            resultList = staffBUS.searchStaff(txtSearch.getText(),cbbSearchFilter.getSelectedItem()+"");
            loadTable(resultList);
            refreshRow();
            
        }
        else {
            loadTable(staffList);
            refreshRow();
        }
                
    }//GEN-LAST:event_btnSearchStaffMouseClicked

    private void btnRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefreshMouseClicked
        refreshRow();
    }//GEN-LAST:event_btnRefreshMouseClicked

    private void tblStaffListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStaffListMouseClicked
        int i = tblStaffList.getSelectedRow();
        Staff selectedStaff = staffList.get(i);

        txtStaffID.setText(selectedStaff.getStaffId());
        txtStaffName.setText(selectedStaff.getStaffName());
        txtYearOfBirth.setText(selectedStaff.getStaffBirthYear() + "");
        txtGender.setText(selectedStaff.getGender());
        txtAddress.setText(selectedStaff.getAddress());
        txtPhone.setText(selectedStaff.getPhoneNum());
        txtBaseSalary.setText(selectedStaff.getBaseSalary() + "");
    }//GEN-LAST:event_tblStaffListMouseClicked

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Custom.Button btnAdd1;
    private Custom.Button btnDelete1;
    private Custom.Button btnRefresh;
    private Custom.Button btnSearchStaff;
    private Custom.Button btnUpdate1;
    private javax.swing.JComboBox<String> cbbSearchFilter;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private Custom.RoundPanel roundPanel1;
    private Custom.RoundPanel roundPanel2;
    private Custom.RoundPanel roundPanel3;
    private javax.swing.JScrollPane scrStaffList;
    private javax.swing.JTable tblStaffList;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBaseSalary;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtStaffID;
    private javax.swing.JTextField txtStaffName;
    private javax.swing.JTextField txtYearOfBirth;
    // End of variables declaration//GEN-END:variables

    /**
     *
     */
    private void loadTable(ArrayList<Staff> staffList) {

        DefaultTableModel model = (DefaultTableModel) tblStaffList.getModel();
        model.setRowCount(0);

        for (Staff sf : staffList) {
            String sfId = sf.getStaffId();
            String sfName = sf.getStaffName();
            int sfYear = sf.getStaffBirthYear();
            String sfGender = sf.getGender();
            String sfAddress = sf.getAddress();
            String sfPhone = sf.getPhoneNum();
            int sfSalary = sf.getBaseSalary();

            Object row[] = new Object[]{sfId, sfName, sfYear, sfGender, sfAddress, sfPhone, sfSalary};
            model.addRow(row);
        }
    }
    
    private void refreshRow() {
        txtStaffID.setText("");
        txtStaffName.setText("");
        txtYearOfBirth.setText("");
        txtGender.setText("");
        txtAddress.setText("");
        txtPhone.setText("");
        txtBaseSalary.setText("");
    }
    
     private boolean staffEmpty() {
        return  txtStaffName.getText().isEmpty() || txtYearOfBirth.getText().isEmpty() || txtGender.getText().isEmpty() || txtAddress.getText().isEmpty() || txtPhone.getText().isEmpty() || txtBaseSalary.getText().isEmpty();
    }
    
    private void autoStaffId() {
        String id;
        id = staffBUS.autoStaffID();
        txtStaffID.setText(id);

    }

}
