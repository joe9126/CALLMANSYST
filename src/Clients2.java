
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JOE
 */
public class Clients2 extends javax.swing.JFrame {
Home access=new Home(); java.sql.Date startdateadded, enddateadded;
 String toDate, fromDate, address,town, contperson, mobile, CLIENTNAME,currency,billschedule,pmschedule,client;
     SimpleDateFormat sdf=new SimpleDateFormat("dd MMM,yyyy");  java.util.Date date;
   String[] cols={"NO","CLIENT NO","NAME","P.O. BOX","TOWN","CONT. PERSON ","TELEPHONE ","EMAIL","DATE ADDED"};
   
  DefaultTableModel clientstableModel=new DefaultTableModel(cols,0){
   @Override
   public boolean isCellEditable(int row,int column){
        return column == 0;
   }  };
   DecimalFormat df1=new DecimalFormat("#,###.00");
    public Clients2() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        clientsholderPanel = new javax.swing.JPanel();
        clientPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        clientnameTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cleintnoTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        poboxTxt = new javax.swing.JTextField();
        contpersonTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        townTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        teleTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        clientsTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        regfromdatePicker = new org.jdesktop.swingx.JXDatePicker();
        jLabel8 = new javax.swing.JLabel();
        regtodatePicker = new org.jdesktop.swingx.JXDatePicker();
        jButton3 = new javax.swing.JButton();
        todateTxt = new javax.swing.JTextField();
        fromdateTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CLIENTS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        clientsholderPanel.setBackground(new java.awt.Color(255, 255, 255));

        clientPanel2.setBackground(new java.awt.Color(255, 255, 255));
        clientPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NEW CLIENT  ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(153, 0, 153))); // NOI18N
        clientPanel2.setForeground(new java.awt.Color(204, 0, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("CLIENT NAME:");

        clientnameTxt.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        clientnameTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clientnameTxtMouseExited(evt);
            }
        });
        clientnameTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                clientnameTxtKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("CLIENT NO:");

        cleintnoTxt.setEditable(false);
        cleintnoTxt.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("P.O. BOX:");

        poboxTxt.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        contpersonTxt.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("CONTACT PERSON:");

        townTxt.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("TELEPHONE:");

        teleTxt.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        teleTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                teleTxtKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("EMAIL:");

        emailTxt.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setText("TOWN:");

        javax.swing.GroupLayout clientPanel2Layout = new javax.swing.GroupLayout(clientPanel2);
        clientPanel2.setLayout(clientPanel2Layout);
        clientPanel2Layout.setHorizontalGroup(
            clientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(clientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(clientPanel2Layout.createSequentialGroup()
                        .addGroup(clientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(44, 44, 44))
                    .addGroup(clientPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(86, 86, 86)))
                .addGroup(clientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(clientnameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                    .addComponent(poboxTxt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailTxt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cleintnoTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(clientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(clientPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(contpersonTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(clientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, clientPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addGap(69, 69, 69)
                            .addComponent(teleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(clientPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(clientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(townTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(196, 196, 196))
        );
        clientPanel2Layout.setVerticalGroup(
            clientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientPanel2Layout.createSequentialGroup()
                .addGroup(clientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(clientPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(clientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cleintnoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(23, 23, 23)
                        .addGroup(clientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clientnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(clientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(poboxTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addGroup(clientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(townTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)))
                        .addGap(18, 18, 18)
                        .addGroup(clientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(clientPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(clientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(contpersonTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(36, 36, 36))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CLIENTS LIST", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 0, 153))); // NOI18N

        clientsTable.setModel(clientstableModel);
        clientsTable.setFillsViewportHeight(true);
        clientsTable.setGridColor(new java.awt.Color(204, 0, 204));
        clientsTable.setRowHeight(25);
        clientsTable.setRowMargin(2);
        clientsTable.setSelectionBackground(new java.awt.Color(204, 0, 204));
        clientsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientsTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(clientsTable);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Clients by Date Added", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 0, 153))); // NOI18N

        jLabel1.setText("FROM:");

        regfromdatePicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regfromdatePickerActionPerformed(evt);
            }
        });

        jLabel8.setText("TO:");

        regtodatePicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regtodatePickerActionPerformed(evt);
            }
        });

        jButton3.setText("PRINT");

        todateTxt.setEditable(false);
        todateTxt.setText(" ");

        fromdateTxt.setEditable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(regtodatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(regfromdatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(todateTxt)
                    .addComponent(fromdateTxt)))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jButton3)
                .addGap(0, 124, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(regfromdatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fromdateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(regtodatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(todateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 943, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout clientsholderPanelLayout = new javax.swing.GroupLayout(clientsholderPanel);
        clientsholderPanel.setLayout(clientsholderPanelLayout);
        clientsholderPanelLayout.setHorizontalGroup(
            clientsholderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientsholderPanelLayout.createSequentialGroup()
                .addGroup(clientsholderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(clientsholderPanelLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(clientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(clientsholderPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(543, Short.MAX_VALUE))
        );
        clientsholderPanelLayout.setVerticalGroup(
            clientsholderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clientsholderPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(clientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(454, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(clientsholderPanel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1278, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clientnameTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientnameTxtMouseExited
       if(client!=null){ clientnameTxt.setText(client);}
    }//GEN-LAST:event_clientnameTxtMouseExited

    private void clientnameTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clientnameTxtKeyTyped
          getclientsList(); getClient();
    }//GEN-LAST:event_clientnameTxtKeyTyped


public void  getClient(){
      try {
       
          String getusersql="SELECT  CLIENT_NO,POBOX,TOWN, CONT_PERSON,MOBILE, CLIENTNAME FROM CLIENTS WHERE CLIENTNAME LIKE '"+clientnameTxt.getText()+"%'";
          Connection connectDb=(Connection)DriverManager.getConnection( access.server,  access.username, access.dbpword);
          PreparedStatement pst=(PreparedStatement)connectDb.prepareStatement(getusersql);
          ResultSet rst=pst.executeQuery(); int i=0;
          while(rst.next()){
        // cleintnoTxt.setText(rst.getString(1));  
          poboxTxt.setText(rst.getString(2)); 
           townTxt.setText(rst.getString(3));
          contpersonTxt.setText(rst.getString(4));  teleTxt.setText(rst.getString(5)); 
          CLIENTNAME=rst.getString(6);
          i++;
          }
          if(i<1){
   poboxTxt.setText(null);     // cleintnoTxt.setText(null);  
           townTxt.setText(null);
          contpersonTxt.setText(null);  teleTxt.setText(null);  CLIENTNAME=null;   client=  clientnameTxt.getText();
          }
      } catch (SQLException ex) {
          Logger.getLogger(Clients2.class.getName()).log(Level.SEVERE, null, ex);
      }

}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(clientnameTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter client name!","Client Name Required",JOptionPane.WARNING_MESSAGE);
        }else if(cleintnoTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter client number!","Client Number Required",JOptionPane.WARNING_MESSAGE);
        }
        /* else if(teleTxt.getText().trim().length()!=10){
            JOptionPane.showMessageDialog(null,"Please enter a valid telephone/mobile number!","Invalid Date",JOptionPane.WARNING_MESSAGE);
        } */

        else{
      {
                try {
                    String getusersql="SELECT CLIENTNAME FROM CLIENTS WHERE CLIENT_NO='"+cleintnoTxt.getText()+"'";
                    Connection connectDb=(Connection)DriverManager.getConnection( access.server,  access.username, access.dbpword);
                    PreparedStatement pst=(PreparedStatement)connectDb.prepareStatement(getusersql);
                    ResultSet rst=pst.executeQuery(); int i=0;
                    while(rst.next()){
                        i++;
                    }
   String contperson2="",email="",pobox="",city="",telephone="",address2="";
                        if(contpersonTxt.getText().isEmpty()){
                            contperson2="N/A";
                        }  else{ contperson2=contpersonTxt.getText();}

                        if(teleTxt.getText().isEmpty()){
                            telephone="N/A";
                        }  else{ telephone=teleTxt.getText();}

                        if(townTxt.getText().isEmpty()){
                            city="N/A";
                        }  else{ city=townTxt.getText();}

                        if(emailTxt.getText().isEmpty()){
                            city="N/A";
                        }  else{ email=emailTxt.getText();}

                        if(poboxTxt.getText().isEmpty()){
                            city="N/A";
                        }  else{ address2=poboxTxt.getText();}    
                        
                    if(i>0){
int choice2=JOptionPane.showConfirmDialog(null,"Do you want to update details for "+clientnameTxt.getText()+"? "
        + "","Confirm Update",JOptionPane.YES_NO_OPTION);
      if(choice2==JOptionPane.YES_OPTION){
   String updatesql="UPDATE CLIENTS SET CLIENTNAME=?, POBOX=?, TOWN=?,CONT_PERSON=?, MOBILE=?,EMAIL=? WHERE CLIENT_NO='"+cleintnoTxt.getText()+"'";   
   PreparedStatement pst2=(PreparedStatement)connectDb.prepareStatement(updatesql);
                        pst2.setString(1, clientnameTxt.getText());   
                        pst2.setString(2,address2);  pst2.setString(3, city);
                        pst2.setString(4, contperson2);  pst2.setString(5, telephone);
                        pst2.setString(6, email);  
                        int g= pst2.executeUpdate();  
    if(g>0){
       JOptionPane.showMessageDialog(null,clientnameTxt.getText()+" details updated successfully!","Update Successfull",JOptionPane.INFORMATION_MESSAGE);
          getclientsList();  clearFields();  }                      
      }
                    }
                    else{
  int choice=JOptionPane.showConfirmDialog(null, "Do you want to save "+clientnameTxt.getText()+" as a new Client?","Confirm",JOptionPane.YES_NO_OPTION);
            if(choice==JOptionPane.YES_OPTION) {        
                        LocalDate localDate = LocalDate.now();
                     //   String todayDate=(DateTimeFormatter.ofPattern("yyyy/MM/dd").format(localDate));
                     java.util.Date date2=Date.valueOf(localDate); 
                        java.sql.Date  sqltodayDate=new java.sql.Date(date2.getTime());

                        String insertsql="INSERT INTO CLIENTS  VALUES (?,?,?,?,?,?,?,?) ";
                        PreparedStatement pst2=(PreparedStatement)connectDb.prepareStatement(insertsql);
                        pst2.setString(1, cleintnoTxt.getText());   pst2.setString(2, clientnameTxt.getText());
                        pst2.setString(3,address2);  pst2.setString(4, city);
                        pst2.setString(5, contperson2);  pst2.setString(6, telephone);
                        pst2.setString(7, email);  pst2.setDate(8, sqltodayDate);
                        int g= pst2.executeUpdate();
                        if(g>0){
                            JOptionPane.showMessageDialog(null,clientnameTxt.getText()+" details saved successfully!","Saved Successfully",JOptionPane.INFORMATION_MESSAGE);
                getclientsList();  clearFields();
        
                        }
                    }}
                } catch (SQLException ex ) {
                    Logger.getLogger(Clients2.class.getName()).log(Level.SEVERE, null, ex);
                } 
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
public void clearFields(){
 clientnameTxt.setText(null);      
           cleintnoTxt.setText(null);  poboxTxt.setText(null); 
           townTxt.setText(null);emailTxt.setText(null);
          contpersonTxt.setText(null);  teleTxt.setText(null);  CLIENTNAME=null;    
}
    private void teleTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_teleTxtKeyTyped
        char c=evt.getKeyChar();
        if(!((c>='0')&&(c<='9') )){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_teleTxtKeyTyped

    private void regfromdatePickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regfromdatePickerActionPerformed
        fromdateTxt.setText(sdf.format(regfromdatePicker.getDate())); 
   startdateadded=new java.sql.Date(regfromdatePicker.getDate().getTime());
    }//GEN-LAST:event_regfromdatePickerActionPerformed

    private void regtodatePickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regtodatePickerActionPerformed
   todateTxt.setText(sdf.format(regtodatePicker.getDate())); 
enddateadded=new java.sql.Date(regtodatePicker.getDate().getTime());

getclientsList();
    }//GEN-LAST:event_regtodatePickerActionPerformed

    private void clientsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientsTableMouseClicked
   int row=clientsTable.getSelectedRow();
   
 cleintnoTxt.setText(String.valueOf(clientstableModel.getValueAt(row, 1)));
 clientnameTxt.setText(String.valueOf(clientstableModel.getValueAt(row, 2)));
 poboxTxt.setText(String.valueOf(clientstableModel.getValueAt(row, 3)));
           townTxt.setText(String.valueOf(clientstableModel.getValueAt(row, 4)));
          contpersonTxt.setText(String.valueOf(clientstableModel.getValueAt(row, 5)));
          teleTxt.setText(String.valueOf(clientstableModel.getValueAt(row, 6)));
          emailTxt.setText(String.valueOf(clientstableModel.getValueAt(row, 7)));
          CLIENTNAME=null;   
    }//GEN-LAST:event_clientsTableMouseClicked
public void getclientsList(){
  try {
      
      int f=clientsTable.getRowCount();
      for(int g=0;g<f;g++){
      clientstableModel.removeRow(0);
      }
        String getusersql;     
     
        if(startdateadded!=null&&enddateadded!=null){
            getusersql="SELECT  CLIENT_NO,CLIENTNAME,POBOX,TOWN, CONT_PERSON,MOBILE, EMAIL,DATE_ADDED FROM CLIENTS WHERE "
                  + "DATE_ADDED >='"+startdateadded+"' AND DATE_ADDED <='"+enddateadded+"' ORDER BY CLIENTNAME ASC";
        }
        
        else if(!clientnameTxt.getText().isEmpty()){
         getusersql="SELECT  CLIENT_NO,CLIENTNAME,POBOX,TOWN, CONT_PERSON,MOBILE, EMAIL,DATE_ADDED FROM CLIENTS where CLIENTNAME  "
                  + " LIKE '"+clientnameTxt.getText()+"%' ORDER BY CLIENTNAME ASC";
        }
        else{
      getusersql="SELECT  CLIENT_NO,CLIENTNAME,POBOX,TOWN, CONT_PERSON,MOBILE, EMAIL,DATE_ADDED FROM CLIENTS  "
                  + " ORDER BY CLIENTNAME ASC";
        }
          Connection connectDb=(Connection)DriverManager.getConnection( access.server,  access.username, access.dbpword);
          PreparedStatement pst=(PreparedStatement)connectDb.prepareStatement(getusersql);
          ResultSet rst=pst.executeQuery(); int i=0;
          while(rst.next()){
   clientstableModel.addRow(new Object[]{i+1,rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),
   rst.getString(5),rst.getString(6),rst.getString(7),sdf.format(rst.getDate(8))}); 
        i++;
          }

      } catch (SQLException ex) {
          Logger.getLogger(Clients2.class.getName()).log(Level.SEVERE, null, ex);
      }

}
    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField cleintnoTxt;
    public javax.swing.JPanel clientPanel2;
    private javax.swing.JTextField clientnameTxt;
    private javax.swing.JTable clientsTable;
    public javax.swing.JPanel clientsholderPanel;
    private javax.swing.JTextField contpersonTxt;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JTextField fromdateTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField poboxTxt;
    private org.jdesktop.swingx.JXDatePicker regfromdatePicker;
    private org.jdesktop.swingx.JXDatePicker regtodatePicker;
    private javax.swing.JTextField teleTxt;
    private javax.swing.JTextField todateTxt;
    private javax.swing.JTextField townTxt;
    // End of variables declaration//GEN-END:variables
}
