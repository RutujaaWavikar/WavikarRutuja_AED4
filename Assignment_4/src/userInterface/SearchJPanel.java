/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import javax.swing.table.DefaultTableModel;
import model.Encounter;
import model.EncounterHistory;
import model.Patient;
import model.PatientDirectory;

/**
 *
 * @author Rutuja
 */
public class SearchJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchJPanel
     */
    EncounterHistory encounterHistory;
    PatientDirectory patientDirectory;
    String selectText = "";
    public SearchJPanel(EncounterHistory encounterHistory, PatientDirectory patientDirectory) {
        initComponents();
        this.encounterHistory = encounterHistory;
        this.patientDirectory = patientDirectory;
        displayEncounterHistory();
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
        tblPatientHistory = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPatients = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        ddSort = new javax.swing.JComboBox<>();
        txtMinAge = new javax.swing.JTextField();
        txtMaxAge = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCommunity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(153, 255, 255));
        setPreferredSize(new java.awt.Dimension(600, 600));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Visit Record");

        tblPatientHistory.setBackground(new java.awt.Color(204, 255, 204));
        tblPatientHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "PatientID", "BloodPressure", "Health Check", "Visit Date"
            }
        ));
        jScrollPane1.setViewportView(tblPatientHistory);

        tblPatients.setBackground(new java.awt.Color(204, 255, 204));
        tblPatients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "PatientID", "Name", "Age", "City", "Community", "BloodPressure", "isNormal", "Person'ID", "Apartment Number"
            }
        ));
        jScrollPane2.setViewportView(tblPatients);

        btnSearch.setBackground(new java.awt.Color(153, 255, 204));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        ddSort.setBackground(new java.awt.Color(153, 255, 204));
        ddSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Search by Age bracket", "Search by Community", " " }));
        ddSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddSortActionPerformed(evt);
            }
        });

        txtMinAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMinAgeActionPerformed(evt);
            }
        });

        txtMaxAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaxAgeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Patient Encounter Detail");

        jLabel3.setText("Age Group");

        jLabel4.setText("Community");

        txtCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommunityActionPerformed(evt);
            }
        });

        jLabel5.setText("Min Age");

        jLabel6.setText("Max Age");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ddSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(40, 40, 40)
                                .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMinAge, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(txtMaxAge, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btnSearch)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(ddSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMinAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaxAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnSearch)
                .addContainerGap(114, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        ArrayList<Patient> listOfPatients = patientDirectory.getListOfPatients();
        if(selectText == "Search with Age bracket"){
            int minAge = Integer.parseInt(txtMinAge.getText());
            int maxAge = Integer.parseInt(txtMaxAge.getText());
            List<Patient> newListPatient = listOfPatients.stream().filter(a -> a.getAgeOfPerson() >= minAge && a.getAgeOfPerson() <= maxAge && a.isIsStable() == false).collect(Collectors.toList());
            displayPatientTable(newListPatient);
        }
        
        else if(selectText == "Search by Community"){
            String nameOfCommunity = txtCommunity.getText();
            List<Patient> newListPatient = listOfPatients.stream().filter(a -> a.getHouse().getNameOfCommunity().contains(nameOfCommunity) && a.isIsStable() == false).collect(Collectors.toList());
            displayPatientTable(newListPatient);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtMinAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMinAgeActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtMinAgeActionPerformed

    private void ddSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddSortActionPerformed
        // TODO add your handling code here:
        selectText = ddSort.getSelectedItem().toString();
    }//GEN-LAST:event_ddSortActionPerformed

    private void txtMaxAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaxAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaxAgeActionPerformed

    private void txtCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommunityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommunityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> ddSort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblPatientHistory;
    private javax.swing.JTable tblPatients;
    private javax.swing.JTextField txtCommunity;
    private javax.swing.JTextField txtMaxAge;
    private javax.swing.JTextField txtMinAge;
    // End of variables declaration//GEN-END:variables

    private void displayEncounterHistory(){
        DefaultTableModel model = (DefaultTableModel) tblPatientHistory.getModel();
        model.setRowCount(0);
        for(Encounter encounter: encounterHistory.getListOfEncounter()){
            Object[]row = new Object[4];
            row[0] = encounter.getPatientID();
            row[1] = encounter.getVitalSigns().getBloodPressure();
            row[2] = encounter.isIsStable() ? "Healthy" : "Not Healthy";
            row[3] = encounter.getDateOfVisit();
            model.addRow(row);
        }
    }
    
    private void displayPatientTable(List<Patient> patientList){
        DefaultTableModel model = (DefaultTableModel) tblPatients.getModel();
        model.setRowCount(0);
        for (Patient patient : patientList){
            Object[] row = new Object[10];
            row[0] = patient.getPatientD();
            row[1] = patient.getNameOfPerson();
            row[2] = patient.getAgeOfPerson();
            row[3] = patient.getHouse().getNameOfCity();
            row[4] = patient.getHouse().getNameOfCommunity();
            row[5] = patient.getVitalSigns().getBloodPressure();
            row[6] = patient.isIsStable();
            row[7] = patient.getIdOfPerson();
            row[8] = patient.getHouse().getApartmentNumber();
            model.addRow(row);
        }
    }
}

