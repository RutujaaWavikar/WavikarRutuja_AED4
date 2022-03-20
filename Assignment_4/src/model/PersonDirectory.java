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
public class PersonDirectory {
    
    private ArrayList<Person> listOfPerson;
    
    public PersonDirectory(){
        this.listOfPerson = new ArrayList<Person>();
    }

    public ArrayList<Person> getListOfPerson() {
        return listOfPerson;
    }

    public void setListOfPerson(ArrayList<Person> listOfPerson) {
        this.listOfPerson = listOfPerson;
    }
    
    public Person addNewPerson(){
        House house = new House();
        Person newPerson = new Person("",0, "", house);
        listOfPerson.add(newPerson);
        return newPerson;
    }
    
    public void deletePerson(Person person){
        listOfPerson.remove(person);
    }
}
