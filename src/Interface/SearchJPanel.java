/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.UberModel;
import Business.UberModelDirectory;
import java.awt.CardLayout;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Anjali
 */
public class SearchJPanel extends javax.swing.JPanel {
private JPanel userProfileLayout;
    private UberModelDirectory uberDirectory;
    private TableRowSorter<TableModel> rowSorter;
    private UberModel uber;
    /**
     * Creates new form SearchJPanel
     */
    public SearchJPanel(JPanel userProfileLayout, UberModelDirectory uberDirectory) {
        
        initComponents();
       
        this.userProfileLayout = userProfileLayout;
        this.uberDirectory = uberDirectory;
        populateTable();
        populateTable2();
        manufactureList();
        showDate();
    }
    
    private void manufactureList(){
    DefaultListModel DLM = new DefaultListModel();
    uberDirectory.getUberList().stream().map((uber) -> {
        DLM.addElement(uber.getManufactuer());
        return uber;
    }).forEachOrdered((_item) -> {
        jList1.setModel(DLM);
    });
    }
    private void showDate()
        {Date d = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        txtgetCreatedOn.setText(sf.format(d));
        txtgetCreatedOn.setEnabled(false);
        
       }
    private void populateTable(){
            int x=0;
            int y=0;
            DefaultTableModel temp = (DefaultTableModel)jTableFull.getModel();
            temp.setRowCount(0);
            for(UberModel uber: uberDirectory.getUberList()){
                Object[] row = new Object[11];
                row[0] = uber;
                row[1] = uber.getManufactuer();
                row[2] = uber.getModel();
                row[3] = uber.getMakeYear();
                row[4] = uber.getCity();
                row[5] = uber.getSeatMin();
                row[6] = uber.getSeatMax();
                row[7] = uber.getAvailability();
                
                String availYes =uber.getAvailability();
                {if(availYes.equals("Yes")){
                    x=x+1;
                    }else{
                            y=y+1;
                            }
            }
                row[8] = uber.getExpired();
                row[9] = uber.getTime();
                row[10] = uber.getUpdatedDate();
                temp.addRow(row);
                
                
                
                Date d;
                d = uberDirectory.updatedDate();
              
                DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
                txtUpdateddate.setText(df.format(d));
                
                txtUpdateddate.setEnabled(false);
                
                
                                            
                             }
                
                txtSumAvailable.setText(String.valueOf(x));
                txtSumNotAvailable.setText(String.valueOf(y));
                txtSumAvailable.setEnabled(false);
                txtSumNotAvailable.setEnabled(false);
                
            }
    

               
          private void populateTable2(){
            int x=0;
            int y=0;
            DefaultTableModel temp = (DefaultTableModel)tblSearch.getModel();
            temp.setRowCount(0);
            for(UberModel uber: uberDirectory.getUberList()){
                Object[] row = new Object[11];
                row[0] = uber;
                row[1] = uber.getManufactuer();
                row[2] = uber.getModel();
                row[3] = uber.getMakeYear();
                row[4] = uber.getCity();
                row[5] = uber.getSeatMin();
                row[6] = uber.getSeatMax();
                row[7] = uber.getAvailability();
                
                String availYes =uber.getAvailability();
                {if(availYes.equals("Yes")){
                    x=x+1;
                    }else{
                            y=y+1;
                            }
            }
                row[8] = uber.getExpired();
                row[9] = uber.getTime();
                              
                temp.addRow(row);               
                             
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

        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnSearchAvail = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        txtSearch = new javax.swing.JTextField();
        txtSeatMax = new javax.swing.JTextField();
        txtSeatMin = new javax.swing.JTextField();
        btnSearch3 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        btnSearch1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtSumAvailable = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSumNotAvailable = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUpdateddate = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListSeats = new javax.swing.JList<>();
        txtfullsearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSearch = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnAvailSearch = new javax.swing.JButton();
        ParameterSearch = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableFull = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtgetCreatedOn = new javax.swing.JTextField();

        setBackground(new java.awt.Color(102, 102, 102));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1300, 900));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search Vehicle Details");

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Functions", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        btnSearchAvail.setBackground(new java.awt.Color(0, 0, 0));
        btnSearchAvail.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchAvail.setText("Search");
        btnSearchAvail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchAvailActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(102, 102, 102));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Seats: ");

        jLabel9.setBackground(new java.awt.Color(102, 102, 102));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Min");

        jLabel29.setBackground(new java.awt.Color(102, 102, 102));
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Max");

        jComboBox1.setBackground(new java.awt.Color(102, 102, 102));
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manufactuer", "Model", "Manufactured Year", "Serial no.", "Location" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        btnSearch3.setBackground(new java.awt.Color(0, 0, 0));
        btnSearch3.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch3.setText("Search");
        btnSearch3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch3ActionPerformed(evt);
            }
        });

        jComboBox2.setBackground(new java.awt.Color(102, 102, 102));
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Availability", "First Available Car", "ExpCertificate" }));

        btnSearch1.setBackground(new java.awt.Color(0, 0, 0));
        btnSearch1.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch1.setText("Search");
        btnSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch1ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("No. of currently available cars:");

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("No. of currently not available cars:");

        jList1.setBorder(javax.swing.BorderFactory.createTitledBorder("All car manufacturers available"));
        jScrollPane2.setViewportView(jList1);

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("All car manufacturers:");

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Last Updated On:");

        jListSeats.setBorder(javax.swing.BorderFactory.createTitledBorder("Available cars serial No."));
        jListSeats.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jListSeatsMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(jListSeats);

        txtfullsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfullsearchActionPerformed(evt);
            }
        });

        tblSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial No.", "Manufacture", "Model", "Manufacture Year", "Location", "Seat Min", "Seat Max", "Availability", "Expired Cert.", "Avail. Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSearch);
        if (tblSearch.getColumnModel().getColumnCount() > 0) {
            tblSearch.getColumnModel().getColumn(0).setResizable(false);
            tblSearch.getColumnModel().getColumn(1).setResizable(false);
            tblSearch.getColumnModel().getColumn(2).setResizable(false);
            tblSearch.getColumnModel().getColumn(3).setResizable(false);
            tblSearch.getColumnModel().getColumn(4).setResizable(false);
            tblSearch.getColumnModel().getColumn(5).setResizable(false);
            tblSearch.getColumnModel().getColumn(6).setResizable(false);
            tblSearch.getColumnModel().getColumn(7).setResizable(false);
            tblSearch.getColumnModel().getColumn(8).setResizable(false);
            tblSearch.getColumnModel().getColumn(9).setResizable(false);
        }

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Specify search:");

        btnAvailSearch.setText("Search on Available Vehicles ");
        btnAvailSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvailSearchActionPerformed(evt);
            }
        });

        ParameterSearch.setText("Search on result");
        ParameterSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParameterSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(717, 717, 717)
                        .addComponent(jLabel5)
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSumAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSumNotAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUpdateddate, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 359, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel9)
                                                .addComponent(txtSeatMin, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(74, 74, 74)
                                            .addComponent(txtSeatMax, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(100, 100, 100)
                                            .addComponent(jLabel29))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(btnSearch3)
                                            .addGap(20, 20, 20)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(jLabel7)
                                        .addGap(39, 39, 39))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSearchAvail)
                                    .addComponent(btnSearch1))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfullsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ParameterSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAvailSearch))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfullsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnAvailSearch)
                    .addComponent(ParameterSearch))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch1)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearchAvail))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtSumAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtSumNotAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtUpdateddate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSeatMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSeatMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearch3)))))
                .addGap(45, 45, 45))
        );

        jTableFull.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableFull.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SerialNo.", "Manufacture", "Model", "Manufacture Year", "Location", "Seat Min", "Seat Max", "Availability", "Expired Cert.", "Avail.Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableFull.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane4.setViewportView(jTableFull);
        if (jTableFull.getColumnModel().getColumnCount() > 0) {
            jTableFull.getColumnModel().getColumn(0).setResizable(false);
            jTableFull.getColumnModel().getColumn(1).setResizable(false);
            jTableFull.getColumnModel().getColumn(2).setResizable(false);
            jTableFull.getColumnModel().getColumn(3).setResizable(false);
            jTableFull.getColumnModel().getColumn(4).setResizable(false);
            jTableFull.getColumnModel().getColumn(5).setResizable(false);
            jTableFull.getColumnModel().getColumn(6).setResizable(false);
            jTableFull.getColumnModel().getColumn(7).setResizable(false);
            jTableFull.getColumnModel().getColumn(8).setResizable(false);
            jTableFull.getColumnModel().getColumn(9).setResizable(false);
        }

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Date and Time:");

        txtgetCreatedOn.setBackground(new java.awt.Color(102, 102, 102));
        txtgetCreatedOn.setForeground(new java.awt.Color(255, 255, 255));
        txtgetCreatedOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgetCreatedOnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(150, 150, 150)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(txtgetCreatedOn, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBack)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtgetCreatedOn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnSearchAvailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchAvailActionPerformed
        String check = jComboBox2.getSelectedItem().toString();
        
         if(check.equals("Availability")){
            String result = uberDirectory.searchAvailability();
            
            int myColumn = 7;
            if (result == null){
                JOptionPane.showMessageDialog(null,"There are no cars available", "Information",JOptionPane.INFORMATION_MESSAGE);
            }
            
            else{
                  DefaultTableModel dtm = (DefaultTableModel)tblSearch.getModel();
                    TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dtm);
                    tblSearch.setRowSorter(tr);
                    tr.setRowFilter(RowFilter.regexFilter(result,myColumn));
                
            }
        }
        else if(check.equals("ExpCertificate")){
            String result = uberDirectory.searchExpired();
            
            int myColumn = 8;
            if (result == null){
                JOptionPane.showMessageDialog(null,"There are no cars with expired maintanance certificate", "Information",JOptionPane.INFORMATION_MESSAGE);
            }
            
            else{
                  DefaultTableModel dtm = (DefaultTableModel)tblSearch.getModel();
                    TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dtm);
                    tblSearch.setRowSorter(tr);
                    tr.setRowFilter(RowFilter.regexFilter(result,myColumn));
                
            }
        }
         
        
        else if(check.equals("First Available Car")){
            double d = uberDirectory.searchFirstAvail();
            System.out.println(d);
            int myColumn = 9;
            String s = String.valueOf(d);
            
                    DefaultTableModel dtm = (DefaultTableModel)tblSearch.getModel();
                    TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dtm);
                    tblSearch.setRowSorter(tr);
                    tr.setRowFilter(RowFilter.regexFilter(s,myColumn));
                
            
    }//GEN-LAST:event_btnSearchAvailActionPerformed
        }
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnSearch3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch3ActionPerformed
        // TODO add your handling code here:

        String seatmin = txtSeatMin.getText();
        String seatmax = txtSeatMax.getText();
         if(seatmin.equals("")||seatmax.equals(""))
                 {JOptionPane.showMessageDialog(null,"Please enter both min seat and max seat values", "Information",JOptionPane.INFORMATION_MESSAGE);
                 
    }
         else{
        
        int x= Integer.parseInt(seatmin);
        int y=Integer.parseInt(seatmax);
        System.out.println(y);
               
        DefaultListModel DLM = new DefaultListModel();
        for(UberModel uber: uberDirectory.getUberList()){
            
         if (("Yes".equals(uber.getAvailability())) && (x==uber.getSeatMin())&&(uber.getSeatMax()<=y) ){
             DLM.addElement(uber.getSerialNo());
             
             jListSeats.setModel(DLM);  
             
        }
        }
         }
        
        
    }//GEN-LAST:event_btnSearch3ActionPerformed

     
    private void btnSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch1ActionPerformed
        // TODO add your handling code here:

        String compare = jComboBox1.getSelectedItem().toString();

        if(compare.equals("Model")){
            UberModel result = uberDirectory.searchModel(txtSearch.getText());

            if (result == null){
                JOptionPane.showMessageDialog(null,"The model entered is not correct", "Information",JOptionPane.INFORMATION_MESSAGE);
            }
            else{

                DefaultTableModel dtm = (DefaultTableModel)tblSearch.getModel();
                TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dtm);
                tblSearch.setRowSorter(tr);
                tr.setRowFilter(RowFilter.regexFilter(txtSearch.getText().trim(),2)); //column number
            }
        }
        else if(compare.equals("Manufactuer")){
            UberModel result = uberDirectory.searchManufactuer(txtSearch.getText());
            if (result == null){
                JOptionPane.showMessageDialog(null,"The manufacteur entered is not correct", "Information",JOptionPane.INFORMATION_MESSAGE);
            }
            else{ 
                DefaultTableModel dtm = (DefaultTableModel)tblSearch.getModel();
                TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dtm);
                tblSearch.setRowSorter(tr);
                tr.setRowFilter(RowFilter.regexFilter(txtSearch.getText().trim(),1));
            }
        }

        else if(compare.equals("Location")){
            
            String avail = "Yes";
            int myColumn=7;
            UberModel result = uberDirectory.searchCity(txtSearch.getText());
            if (result == null ){
                JOptionPane.showMessageDialog(null,"The city entered is not correct", "Information",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
            
            DefaultTableModel dtm = (DefaultTableModel)tblSearch.getModel(); 
            TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(tblSearch.getModel());
            tblSearch.setRowSorter(rowSorter);
            List<RowFilter<Object, Object>> filters = new ArrayList<RowFilter<Object, Object>>(2);
            filters.add(RowFilter.regexFilter(txtSearch.getText().trim(),4));
            filters.add(RowFilter.regexFilter(avail,myColumn));
            RowFilter<Object, Object> rf = RowFilter.andFilter(filters);
            rowSorter.setRowFilter(rf);
    
            }
                    }
      
        else if(compare.equals("Manufactured Year")){
            UberModel result = uberDirectory.searchMakeYear(txtSearch.getText());
            if (result == null){
                JOptionPane.showMessageDialog(null,"The year entered is not correct", "Information",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                DefaultTableModel dtm = (DefaultTableModel)tblSearch.getModel();
                TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dtm);
                tblSearch.setRowSorter(tr);
                tr.setRowFilter(RowFilter.regexFilter(txtSearch.getText().trim(),3));
             }
        }
        else if(compare.equals("Serial no.")){
            UberModel result = uberDirectory.searchSerial(txtSearch.getText());
            if (result == null){
                JOptionPane.showMessageDialog(null,"The serial No. entered is not correct", "Information",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                DefaultTableModel dtm = (DefaultTableModel)tblSearch.getModel();
                TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dtm);
                tblSearch.setRowSorter(tr);
                tr.setRowFilter(RowFilter.regexFilter(txtSearch.getText().trim(),0));
            }
        }
    }//GEN-LAST:event_btnSearch1ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProfileLayout.remove(this);
        CardLayout layout =(CardLayout) userProfileLayout.getLayout();
        layout.previous(userProfileLayout);//previous page
    }//GEN-LAST:event_btnBackActionPerformed

                
                
    private void txtfullsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfullsearchActionPerformed
        // TODO add your handling code here:
        
       
        this.rowSorter = new TableRowSorter<>(tblSearch.getModel()); 
         String text = txtfullsearch.getText();
     
        if (text.trim().length() == 0) {
        rowSorter.setRowFilter(null);
        } else {
       rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
        tblSearch.setRowSorter(rowSorter);
        
           
        
        }
    }//GEN-LAST:event_txtfullsearchActionPerformed

    private void txtgetCreatedOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgetCreatedOnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgetCreatedOnActionPerformed

    private void jListSeatsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListSeatsMousePressed
        // TODO add your handling code here:
        String selectedRow = jListSeats.getSelectedValue();
                DefaultTableModel dtm = (DefaultTableModel)tblSearch.getModel();
                TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dtm);
                tblSearch.setRowSorter(tr);
                tr.setRowFilter(RowFilter.regexFilter(selectedRow.trim(),0));

    }//GEN-LAST:event_jListSeatsMousePressed

    private void btnAvailSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvailSearchActionPerformed
        // TODO add your handling code here:
        String avail = "Yes";
        int myColumn = 7;
        String text = txtfullsearch.getText();
        
            DefaultTableModel dtm = (DefaultTableModel)tblSearch.getModel(); 
            TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(tblSearch.getModel());
            tblSearch.setRowSorter(rowSorter);
            List<RowFilter<Object, Object>> filters = new ArrayList<RowFilter<Object, Object>>(2);
            filters.add(RowFilter.regexFilter("(?i)" + text));
            filters.add(RowFilter.regexFilter(avail,myColumn));
            RowFilter<Object, Object> rf = RowFilter.andFilter(filters);
            rowSorter.setRowFilter(rf);
           
    }//GEN-LAST:event_btnAvailSearchActionPerformed

    private void ParameterSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParameterSearchActionPerformed
        // TODO add your handling code here:
        String avail = txtSearch.getText();
        String text = txtfullsearch.getText();
        
            DefaultTableModel dtm = (DefaultTableModel)tblSearch.getModel(); 
            TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(tblSearch.getModel());
            tblSearch.setRowSorter(rowSorter);
            List<RowFilter<Object, Object>> filters = new ArrayList<RowFilter<Object, Object>>(2);
            filters.add(RowFilter.regexFilter("(?i)" + text));
            filters.add(RowFilter.regexFilter(avail));
            RowFilter<Object, Object> rf = RowFilter.andFilter(filters);
            rowSorter.setRowFilter(rf);
        
        
        
    }//GEN-LAST:event_ParameterSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ParameterSearch;
    private javax.swing.JButton btnAvailSearch;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch1;
    private javax.swing.JButton btnSearch3;
    private javax.swing.JButton btnSearchAvail;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jListSeats;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableFull;
    private javax.swing.JTable tblSearch;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSeatMax;
    private javax.swing.JTextField txtSeatMin;
    private javax.swing.JTextField txtSumAvailable;
    private javax.swing.JTextField txtSumNotAvailable;
    private javax.swing.JTextField txtUpdateddate;
    private javax.swing.JTextField txtfullsearch;
    private javax.swing.JTextField txtgetCreatedOn;
    // End of variables declaration//GEN-END:variables
}
