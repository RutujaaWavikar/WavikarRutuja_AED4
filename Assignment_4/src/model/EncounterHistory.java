/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;

/**
 *
 * @author Rutuja
 */
public class EncounterHistory {
    private ArrayList<Encounter> listOfEncounter;
    
    public EncounterHistory(){
        this.listOfEncounter = new ArrayList<Encounter>();
    }

    public ArrayList<Encounter> getListOfEncounter() {
        return listOfEncounter;
    }

    public void setListOfEncounter(ArrayList<Encounter> listOfEncounter) {
        this.listOfEncounter = listOfEncounter;
    }
    
    public void addEncounter(Encounter encounter){
        this.listOfEncounter.add(encounter);
    }
}
