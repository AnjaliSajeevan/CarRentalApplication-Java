/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.UberModel;
import Business.UberModelDirectory;
import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Anjali
 */
public class CreateJPanel extends javax.swing.JPanel {
    private JPanel userProfileLayout;
    private UberModelDirectory uberDirectory;
    /**
     * Creates new form CreateJPanel
     */
    public CreateJPanel(JPanel userProfileLayout,UberModelDirectory uberDirectory) {
        initComponents();
        this.userProfileLayout = userProfileLayout;
        this.uberDirectory = uberDirectory;
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
        txtmakeYear = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMake = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtModel = new javax.swing.JTextField();
        txtSerialNo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        cBoxExpYes = new javax.swing.JCheckBox();
        cBoxExpNo = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTime = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cBoxYes = new javax.swing.JCheckBox();
        cBoxNo = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        txtSeatMin = new javax.swing.JTextField();
        txtSeatMax = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtUpdatedOn = new javax.swing.JTextField();
        btnLoadData = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 102, 102));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setPreferredSize(new java.awt.Dimension(1300, 700));
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                formComponentRemoved(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vehicle Manufacture Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        txtmakeYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmakeYearActionPerformed(evt);
            }
        });
        txtmakeYear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtmakeYearKeyPressed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Year:");

        txtMake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMakeActionPerformed(evt);
            }
        });
        txtMake.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMakeKeyPressed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Manufacture:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Model:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Serial No:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel2)
                .addGap(35, 35, 35)
                .addComponent(txtMake, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jLabel4)
                .addGap(31, 31, 31)
                .addComponent(txtmakeYear, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(27, 27, 27)
                .addComponent(txtSerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtmakeYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Create Vehicle Details");

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vehicle Maintenance Certificate Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Expired");

        cBoxExpYes.setBackground(new java.awt.Color(102, 102, 102));
        cBoxExpYes.setForeground(new java.awt.Color(255, 255, 255));
        cBoxExpYes.setText("Yes");
        cBoxExpYes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cBoxExpYesMousePressed(evt);
            }
        });

        cBoxExpNo.setBackground(new java.awt.Color(102, 102, 102));
        cBoxExpNo.setForeground(new java.awt.Color(255, 255, 255));
        cBoxExpNo.setText("No");
        cBoxExpNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cBoxExpNoMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(383, 383, 383)
                .addComponent(jLabel14)
                .addGap(117, 117, 117)
                .addComponent(cBoxExpYes)
                .addGap(26, 26, 26)
                .addComponent(cBoxExpNo)
                .addContainerGap(456, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cBoxExpYes)
                    .addComponent(cBoxExpNo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vehicle Availability Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Available:");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Location");

        txtTime.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTimeKeyPressed(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Available Time (in 24 hour clock):");

        cBoxYes.setBackground(new java.awt.Color(102, 102, 102));
        cBoxYes.setForeground(new java.awt.Color(255, 255, 255));
        cBoxYes.setText("Yes");
        cBoxYes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cBoxYesMousePressed(evt);
            }
        });
        cBoxYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxYesActionPerformed(evt);
            }
        });

        cBoxNo.setBackground(new java.awt.Color(102, 102, 102));
        cBoxNo.setForeground(new java.awt.Color(255, 255, 255));
        cBoxNo.setText("No");
        cBoxNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cBoxNoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cBoxNoMousePressed(evt);
            }
        });
        cBoxNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cBoxNoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cBoxNoKeyTyped(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Min Seats:");

        txtSeatMin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSeatMinKeyPressed(evt);
            }
        });

        txtSeatMax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSeatMaxKeyPressed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Max Seats:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSeatMin, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(137, 137, 137)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel6))
                .addGap(53, 53, 53)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(cBoxYes)
                        .addGap(45, 45, 45)
                        .addComponent(cBoxNo)
                        .addGap(75, 75, 75)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtSeatMax, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cBoxNo)
                    .addComponent(cBoxYes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSeatMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtSeatMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        btnCreate.setBackground(new java.awt.Color(0, 0, 0));
        btnCreate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("UpdatedOn:");

        txtUpdatedOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpdatedOnActionPerformed(evt);
            }
        });
        txtUpdatedOn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUpdatedOnKeyPressed(evt);
            }
        });

        btnLoadData.setBackground(new java.awt.Color(0, 0, 0));
        btnLoadData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLoadData.setForeground(new java.awt.Color(255, 255, 255));
        btnLoadData.setText("Load Data");
        btnLoadData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addGap(815, 815, 815))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(184, 184, 184)))
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUpdatedOn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnLoadData, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(315, 315, 315))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnBack)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtUpdatedOn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLoadData, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentAdded

    private void formComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentRemoved

    private void txtMakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMakeActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProfileLayout.remove(this);
        CardLayout layout =(CardLayout) userProfileLayout.getLayout();
        layout.previous(userProfileLayout);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        Date date1 ;
        
        if(txtModel.getText().equals("")|| txtmakeYear.getText().equals("")|| txtSeatMin.getText().equals("")||txtSeatMax.getText().equals("")||txtCity.getText().equals("")||txtTime.getText().equals("")||txtSerialNo.getText().equals("")||txtUpdatedOn.getText().equals("")){ 
                  JOptionPane.showMessageDialog(null, "Please enter all the required fields!");
                        
        }
                 else  
                 {
                String make = txtMake.getText();
                String model = txtModel.getText();
                String makeYear = txtmakeYear.getText();
                int seatMin = Integer.parseInt(txtSeatMin.getText());
                int seatMax = Integer.parseInt(txtSeatMax.getText());
                String city = txtCity.getText();
                double time = Double.parseDouble(txtTime.getText());
                String  serialNo = txtSerialNo.getText();
                String updatedDate = txtUpdatedOn.getText(); 
                 boolean isSelected = cBoxYes.isSelected();
                 boolean isSelected2 = cBoxExpYes.isSelected(); 
                                 
                        
                UberModel uber = uberDirectory.addAccount();
                
                if(isSelected==true){
                     uber.setAvailability("Yes");
                }else{uber.setAvailability("No");
                 }
                if(isSelected2==true){
                     uber.setExpired("Yes");
                }else{uber.setExpired("No");
                 }
                
                uber.setManufactuer(make);
                uber.setModel(model);
                uber.setMakeYear(makeYear);
                uber.setSeatMin(seatMin);
                uber.setSeatMax(seatMax);
                uber.setCity(city);
                uber.setTime(time);
                uber.setSerialNo(serialNo);
               
                
                
                
            try {  
                date1=new SimpleDateFormat("MM/dd/yyyy").parse(updatedDate);
                uber.setUpdatedDate(date1);
            } catch (ParseException ex) {
                Logger.getLogger(CreateJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
               
            
                
                
                
                JOptionPane.showMessageDialog(null, "Successfully Created ! ");
                
                txtMake.setText("");
                 txtModel.setText("");
                 txtmakeYear.setText("");
                 txtSeatMin.setText("");
                 txtSeatMax.setText("");
                 txtCity.setText("");
                 txtTime.setText("");
                 txtSerialNo.setText("");
                 txtUpdatedOn.setText("");
                 cBoxYes.setSelected(false);
                 cBoxNo.setSelected(false);
                 cBoxExpYes.setSelected(false);
                 cBoxExpNo.setSelected(false);
                 }          
    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtUpdatedOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpdatedOnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpdatedOnActionPerformed

    private void cBoxYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxYesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBoxYesActionPerformed

    private void txtTimeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimeKeyPressed
        // TODO add your handling code here:
        char c =evt.getKeyChar();
        if ((c >= '0' && c <= '9' || c =='.')||(c == KeyEvent.VK_BACK_SPACE)||(c == KeyEvent.VK_DELETE)){
            txtTime.setEditable(true);
        }else{
            txtTime.setEditable(false);
            JOptionPane.showMessageDialog(null, "Please enter only numbers and time not more than 24!");
        }
    }//GEN-LAST:event_txtTimeKeyPressed

    private void cBoxNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cBoxNoKeyTyped
        // TODO add your handling code here:
        
                 
    }//GEN-LAST:event_cBoxNoKeyTyped

    private void cBoxNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cBoxNoKeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_cBoxNoKeyPressed

    private void cBoxNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cBoxNoMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_cBoxNoMouseClicked

    private void cBoxNoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cBoxNoMousePressed
        // TODO add your handling code here:
        if(cBoxYes.isSelected()==true){
            
                    JOptionPane.showMessageDialog(null, "Only one checkbox can be selected!");
                    cBoxNo.setSelected(false);
        }
    }//GEN-LAST:event_cBoxNoMousePressed

    private void cBoxYesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cBoxYesMousePressed
        // TODO add your handling code here:
        if(cBoxNo.isSelected()==true){
            
                    JOptionPane.showMessageDialog(null, "Only one checkbox can be selected!");
                    cBoxYes.setSelected(false);
        }
    }//GEN-LAST:event_cBoxYesMousePressed

    private void txtSeatMinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSeatMinKeyPressed
        // TODO add your handling code here:
        char c =evt.getKeyChar();
        if ((c >= '0' && c <= '9' )||(c == KeyEvent.VK_BACK_SPACE)||(c == KeyEvent.VK_DELETE)){
            txtSeatMin.setEditable(true);
        }else{
            txtSeatMin.setEditable(false);
            JOptionPane.showMessageDialog(null, "Please enter only numbers!");
        }
    }//GEN-LAST:event_txtSeatMinKeyPressed

    private void txtSeatMaxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSeatMaxKeyPressed
        // TODO add your handling code here:
         char c =evt.getKeyChar();
        if ((c >= '0' && c <= '9' )||(c == KeyEvent.VK_BACK_SPACE)||(c == KeyEvent.VK_DELETE)){
            txtSeatMax.setEditable(true);
        }else{
            txtSeatMax.setEditable(false);
            JOptionPane.showMessageDialog(null, "Please enter only numbers!");
        }
    }//GEN-LAST:event_txtSeatMaxKeyPressed

    private void txtUpdatedOnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUpdatedOnKeyPressed
        // TODO add your handling code here:
        char c =evt.getKeyChar();
        if ((c >= '0' && c <= '9' || c == '/')||(c == KeyEvent.VK_BACK_SPACE)||(c == KeyEvent.VK_DELETE)){
            txtUpdatedOn.setEditable(true);
        }else{
            txtUpdatedOn.setEditable(false);
            JOptionPane.showMessageDialog(null, "Please enter valid date in the date format MM/dd/yyyy !");
        }
    }//GEN-LAST:event_txtUpdatedOnKeyPressed

    private void txtMakeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMakeKeyPressed
        // TODO add your handling code here:
        char c =evt.getKeyChar();
        if (!(c >= '0' && c <= '9' || c == '/')||(c == KeyEvent.VK_BACK_SPACE)||(c == KeyEvent.VK_DELETE)){
            txtMake.setEditable(true);
        }else{
            txtMake.setEditable(false);
            JOptionPane.showMessageDialog(null, "Please enter only characters !");
        }
    }//GEN-LAST:event_txtMakeKeyPressed

    private void txtmakeYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmakeYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmakeYearActionPerformed

    private void txtmakeYearKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmakeYearKeyPressed
        // TODO add your handling code here:
        char c =evt.getKeyChar();
        if ((c >= '0' && c <= '9' )||(c == KeyEvent.VK_BACK_SPACE)||(c == KeyEvent.VK_DELETE)){
            txtmakeYear.setEditable(true);
        }else{
            txtmakeYear.setEditable(false);
            JOptionPane.showMessageDialog(null, "Please enter only numbers !");
        }
    }//GEN-LAST:event_txtmakeYearKeyPressed

    private void cBoxExpNoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cBoxExpNoMousePressed
        // TODO add your handling code here:

        if(cBoxExpYes.isSelected()==true){

            JOptionPane.showMessageDialog(null, "Only one checkbox can be selected!");
            cBoxExpNo.setSelected(false);
        }
    }//GEN-LAST:event_cBoxExpNoMousePressed

    private void cBoxExpYesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cBoxExpYesMousePressed
        // TODO add your handling code here:
        if(cBoxExpNo.isSelected()==true){

            JOptionPane.showMessageDialog(null, "Only one checkbox can be selected!");
            cBoxExpYes.setSelected(false);
        }
    }//GEN-LAST:event_cBoxExpYesMousePressed

    private void btnLoadDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadDataActionPerformed
        // TODO add your handling code here:
         
        
         String filepath = "C:\\Users\\anjal\\Documents\\NetBeansProjects\\Assignment_2\\Assignment2.csv";
         File file = new File(filepath);
         String line =null;
         String manufactuer;
         String model;
         String makeYear;        
         int seatMin;       
         int seatMax;    
         String city ;  
         Double time;
         String serialNo;              
         String expired ;       
         String availability;
         Date date1 = null;
         
         try {
              
              BufferedReader br = new BufferedReader(new FileReader(file));
              
             for(int  i=0;i<10;i++)
        {
              while((line = br.readLine()) != null ){
                String[] temp = line.split(",");
                manufactuer=temp[1];
                model=temp[2];
                makeYear=temp[3];
                seatMin=Integer.parseInt(temp[5]);
                seatMax=Integer.parseInt(temp[6]);
                city=temp[4];
                time=Double.parseDouble(temp[9]);
                serialNo=temp[0];
                expired=temp[8];
                availability=temp[7];
               
                
                 
                try {
                     date1=new SimpleDateFormat("MM/dd/yyyy").parse(temp[10]);
                 } catch (ParseException ex) {
                     Logger.getLogger(UberModelDirectory.class.getName()).log(Level.SEVERE, null, ex);
                 }
                UberModel uber = uberDirectory.addAccount();
                
                uber.setManufactuer(manufactuer);
                uber.setModel(model);
                uber.setMakeYear(makeYear);
                uber.setSeatMin(seatMin);
                uber.setSeatMax(seatMax);
                uber.setCity(city);
                uber.setTime(time);
                uber.setSerialNo(serialNo);  
                uber.setAvailability(availability);
                uber.setExpired(expired);
                uber.setUpdatedDate(date1);
                
              }      
             
         }
         }catch (FileNotFoundException ex) {
             Logger.getLogger(UberModelDirectory.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException ex) {
             Logger.getLogger(UberModelDirectory.class.getName()).log(Level.SEVERE, null, ex);
         }
     
    
    JOptionPane.showMessageDialog(null, "Data Successfully Loaded");
        
    }//GEN-LAST:event_btnLoadDataActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnLoadData;
    private javax.swing.JCheckBox cBoxExpNo;
    private javax.swing.JCheckBox cBoxExpYes;
    private javax.swing.JCheckBox cBoxNo;
    private javax.swing.JCheckBox cBoxYes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtMake;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtSeatMax;
    private javax.swing.JTextField txtSeatMin;
    private javax.swing.JTextField txtSerialNo;
    private javax.swing.JTextField txtTime;
    private javax.swing.JTextField txtUpdatedOn;
    private javax.swing.JTextField txtmakeYear;
    // End of variables declaration//GEN-END:variables
}
