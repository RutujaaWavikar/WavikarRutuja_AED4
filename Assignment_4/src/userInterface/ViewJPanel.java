/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface;
import java.time.LocalDateTime;
import javax.swing.table.DefaultTableModel;
import model.Encounter;
import model.EncounterHistory;
import model.House;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;
import model.VitalSigns;

/**
 *
 * @author Rutuja
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    PersonDirectory personDirectory;
    PatientDirectory patientDirectory;
    EncounterHistory encounterHistory;
    public ViewJPanel(PersonDirectory personDirectory, PatientDirectory patientDirectory, EncounterHistory encounterHistory) {
        initComponents();
        this.personDirectory = personDirectory;
        this.patientDirectory = patientDirectory;
        this.encounterHistory = encounterHistory;
        displayPersonTableDetails();
        displayPatientTableDetails();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPerson = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtZipCode = new javax.swing.JTextField();
        lblPersonID = new javax.swing.JLabel();
        ddCity = new javax.swing.JComboBox<>();
        lblAddress = new javax.swing.JLabel();
        ddCommunity = new javax.swing.JComboBox<>();
        lblCommunity = new javax.swing.JLabel();
        ddHouseNumber = new javax.swing.JComboBox<>();
        lblCity = new javax.swing.JLabel();
        lblZipCode = new javax.swing.JLabel();
        lblHouseNumber = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtPersonID = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPatient = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lblBloodPressure = new javax.swing.JLabel();
        txtBloodPressure = new javax.swing.JTextField();
        btnCheck = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(600, 600));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("View Person information");

        tblPerson.setBackground(new java.awt.Color(204, 255, 204));
        tblPerson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Age", "City", "Community", "ID", "Apartment Number", "Address", "Zip Code"
            }
        ));
        tblPerson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPersonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPerson);

        btnUpdate.setBackground(new java.awt.Color(204, 255, 204));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(204, 255, 204));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblName.setText("Name:");

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        lblAge.setText("Age:");

        lblPersonID.setText("Person ID");

        ddCity.setBackground(new java.awt.Color(153, 255, 204));
        ddCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a City", "Boston Massachusset", "California", "Florida", "NewYork" }));
        ddCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddCityActionPerformed(evt);
            }
        });

        lblAddress.setText("Address:");

        ddCommunity.setBackground(new java.awt.Color(153, 255, 204));
        ddCommunity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a Community", "Albany", "Boylston Fenway", "Buffalo", "California Bay area", "Mission Main", "Mission Hill", "Norway", "Palm Springs", "Silicon valley", "Southern California", "Suffolk" }));

        lblCommunity.setText("Community:");

        ddHouseNumber.setBackground(new java.awt.Color(153, 255, 204));
        ddHouseNumber.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose House Number", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        ddHouseNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddHouseNumberActionPerformed(evt);
            }
        });

        lblCity.setText("City:");

        lblZipCode.setText("ZipCode:");

        lblHouseNumber.setText("House Number:");

        txtPersonID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPersonIDActionPerformed(evt);
            }
        });

        tblPatient.setBackground(new java.awt.Color(204, 255, 204));
        tblPatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "PatientID", "Name", "Age", "City", "Community", "ID", "House No", "Address", "Zip Code"
            }
        ));
        jScrollPane2.setViewportView(tblPatient);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Patient Details");

        lblBloodPressure.setText("Blood Pressure:");

        btnCheck.setBackground(new java.awt.Color(102, 255, 204));
        btnCheck.setText("Check");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPersonID)
                            .addComponent(lblZipCode)
                            .addComponent(lblAddress)
                            .addComponent(lblAge)
                            .addComponent(lblName)
                            .addComponent(lblBloodPressure))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtPersonID, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblCity))
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(67, 67, 67)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ddCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ddCity, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(174, 174, 174)
                                .addComponent(lblCommunity))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCheck))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(28, 28, 28)
                                        .addComponent(lblHouseNumber)))
                                .addGap(29, 29, 29)
                                .addComponent(ddHouseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 75, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPersonID)
                    .addComponent(txtPersonID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCity)
                    .addComponent(ddCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCommunity)
                    .addComponent(ddCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHouseNumber)
                    .addComponent(ddHouseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblZipCode)
                    .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBloodPressure)
                    .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCheck))
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblPerson.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblPerson.getModel();
        Person selectPerson = personDirectory.getListOfPerson().get(selectedRowIndex);
        
        personDirectory.deletePerson(selectPerson);
        displayPersonTableDetails(); 
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void ddCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddCityActionPerformed

    private void txtPersonIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPersonIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPersonIDActionPerformed

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        // TODO add your handling code here:
        //take blood pressure as input and display
        int selectedRowIndex = tblPerson.getSelectedRow();
        Person selectPerson = personDirectory.getListOfPerson().get(selectedRowIndex);
        int bloodPressure = Integer.parseInt(txtBloodPressure.getText());
        VitalSigns vitalSigns = new VitalSigns();
        vitalSigns.setBloodPressure(bloodPressure);                          //BP
        House housing = new House();                                         //choose house number
       
        Patient patient = new Patient("", 0, "", housing, vitalSigns, "", false);
        boolean isStable = patient.isPatientNormal(selectPerson.getAgeOfPerson());
        
        if(isStable == false){
              patientDirectory.addPatient(patient);
              patient.setPatientD(selectPerson.getIdOfPerson());
              patient.setNameOfPerson(selectPerson.getNameOfPerson());
              patient.setAgeOfPerson(selectPerson.getAgeOfPerson());
              patient.setHouse(selectPerson.getHouse());
              patient.setIdOfPerson(selectPerson.getIdOfPerson());
              patient.setVitalSigns(vitalSigns);
              displayPatientTableDetails();
        }
        
        Encounter encounter = new Encounter(vitalSigns);
        encounterHistory.addEncounter(encounter);
        encounter.setPatientID(patient.getPatientD());
        encounter.setDateOfVisit(LocalDateTime.now());
        encounter.setIsStable(patient.isPatientNormal(selectPerson.getAgeOfPerson()));
        encounter.setVitalSigns(vitalSigns);
    }//GEN-LAST:event_btnCheckActionPerformed

    private void tblPersonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPersonMouseClicked
        // TODO add your handling code here:
        int selectedRowIndex = tblPerson.getSelectedRow();
        
        DefaultTableModel model = (DefaultTableModel) tblPerson.getModel();
        Person selectPerson = personDirectory.getListOfPerson().get(selectedRowIndex);
        
        txtPersonID.setText(selectPerson.getIdOfPerson());
        txtAge.setText(String.valueOf(selectPerson.getAgeOfPerson()));
        txtName.setText(selectPerson.getNameOfPerson());
        txtAddress.setText(selectPerson.getHouse().getStreetName());
        txtZipCode.setText(String.valueOf(selectPerson.getHouse().getZipCode()));
        ddCity.setSelectedItem(selectPerson.getHouse().getNameOfCity());
        ddCommunity.setSelectedItem(selectPerson.getHouse().getNameOfCommunity());
        ddHouseNumber.setSelectedItem(selectPerson.getHouse().getApartmentNumber());
    }//GEN-LAST:event_tblPersonMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblPerson.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblPerson.getModel();
        //Person selectPerson = personDirectory.getListOfPerson().get(selectedRowIndex);
        model.setValueAt(txtName.getText(), selectedRowIndex, 0);
        model.setValueAt(txtAge.getText(), selectedRowIndex, 1);
        model.setValueAt(ddCity.getSelectedItem(), selectedRowIndex, 2);
        model.setValueAt(ddCommunity.getSelectedItem(), selectedRowIndex, 3);
        model.setValueAt(txtPersonID.getText(), selectedRowIndex, 4);
        model.setValueAt(ddHouseNumber.getSelectedItem(), selectedRowIndex, 5);
        model.setValueAt(txtAddress.getText(), selectedRowIndex, 6);
        model.setValueAt(txtZipCode.getText(), selectedRowIndex, 7);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void ddHouseNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddHouseNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddHouseNumberActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> ddCity;
    private javax.swing.JComboBox<String> ddCommunity;
    private javax.swing.JComboBox<String> ddHouseNumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblBloodPressure;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblHouseNumber;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPersonID;
    private javax.swing.JLabel lblZipCode;
    private javax.swing.JTable tblPatient;
    private javax.swing.JTable tblPerson;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPersonID;
    private javax.swing.JTextField txtZipCode;
    // End of variables declaration//GEN-END:variables

    private void displayPersonTableDetails(){
        DefaultTableModel tblmodel = (DefaultTableModel) tblPerson.getModel();
        tblmodel.setRowCount(0);
        for(Person person : personDirectory.getListOfPerson()){
            Object[]row = new Object[10];
            row[0] = person.getNameOfPerson();
            row[1] = person.getAgeOfPerson();
            row[2] = person.getHouse().getNameOfCity();
            row[3] = person.getHouse().getNameOfCommunity();
            row[4] = person.getIdOfPerson();
            row[5] = person.getHouse().getApartmentNumber();
            row[6] = person.getHouse().getStreetName();
            row[7] = person.getHouse().getZipCode();
            tblmodel.addRow(row);
        }
    }
    
    private void displayPatientTableDetails(){
        DefaultTableModel tblmodel = (DefaultTableModel) tblPatient.getModel();
        tblmodel.setRowCount(0);
        for(Patient patient : patientDirectory.getListOfPatients()){
            Object[]row = new Object[10];
            row[0] = patient.getIdOfPerson();
            row[1] = patient.getNameOfPerson();
            row[2] = patient.getAgeOfPerson();
            row[3] = patient.getHouse().getNameOfCity();
            row[4] = patient.getHouse().getNameOfCommunity();
            row[5] = patient.getIdOfPerson();
            row[6] = patient.getHouse().getApartmentNumber();
            row[7] = patient.getHouse().getStreetName();
            row[8] = patient.getHouse().getZipCode();
            tblmodel.addRow(row);
        }
    }
}

