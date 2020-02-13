package app.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Contacts {

    private ArrayList<Person> contacts = new ArrayList<Person>();

    public Contacts(){
    }

    public Contacts(ArrayList<Person> contacts) {
        this.contacts = contacts;
    }

    public void addPerson(Person... persons){
        if(persons == null || persons.length == 0) return;
        this.contacts.addAll(Arrays.asList(persons));
    }

    public void deletePerson(Person... persons){
        if(persons == null || persons.length == 0) return;
        this.contacts.removeAll(Arrays.asList(persons));
    }

    public void changeLastName(Person person, String newLastName){
        int index = this.contacts.indexOf(person);
        this.contacts.get(index).setLastName(newLastName);
    }
    public void changeLastName(int index, String newLastName){
        this.contacts.get(index).setLastName(newLastName);
    }

    public void changeFirstName(Person person, String newFirstName){
        int index = this.contacts.indexOf(person);
        this.contacts.get(index).setFirstName(newFirstName);
    }
    public void changeFirstName(int index, String newFirstName){
        this.contacts.get(index).setFirstName(newFirstName);
    }

    public void changeNickName(Person person, String newNickName){
        int index = this.contacts.indexOf(person);
        this.contacts.get(index).setNickName(newNickName);
    }
    public void changeNickName(int index, String newNickName){
        this.contacts.get(index).setNickName(newNickName);
    }

    public void changePhoneNumber(Person person, String newPhoneNumber){
        int index = this.contacts.indexOf(person);
        this.contacts.get(index).setPhoneNumber(newPhoneNumber);
    }
    public void changePhoneNumber(int index, String newPhoneNumber){
        this.contacts.get(index).setPhoneNumber(newPhoneNumber);
    }

    public void changeAddress(Person person, String newAddress){
        int index = this.contacts.indexOf(person);
        this.contacts.get(index).setAddress(newAddress);
    }
    public void changeAddress(int index, String newAddress){
        this.contacts.get(index).setAddress(newAddress);
    }

    public void changeEmailAddress(Person person, String newEmailAddress){
        int index = this.contacts.indexOf(person);
        this.contacts.get(index).setEmailAddress(newEmailAddress);
    }
    public void changeEmailAddress(int index, String newEmailAddress){
        this.contacts.get(index).setEmailAddress(newEmailAddress);
    }

    public void changeBirthDate(Person person, LocalDate newDate){
        int index = this.contacts.indexOf(person);
        this.contacts.get(index).setBirthDate(newDate);
    }
    public void changeBirthDate(int index, LocalDate newDate){
        this.contacts.get(index).setBirthDate(newDate);
    }

    // Getters
    public ArrayList<Person> getContacts() {
        return contacts;
    }

    // Setters
    public void setContacts(ArrayList<Person> contacts) {
        this.contacts = contacts;
    }
}
