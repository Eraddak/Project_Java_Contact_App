package app.model;

import javafx.beans.property.*;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicLong;

public class Person {

    private static final AtomicLong ID_FACTORY = new AtomicLong();
    private final long id;
    private StringProperty lastName;
    private StringProperty firstName;
    private StringProperty nickName = null;
    private StringProperty phoneNumber = null;
    private StringProperty address = null;
    private StringProperty emailAddress = null;
    private ObjectProperty<LocalDate> birthDate = null;


    public Person() {
        this.id = ID_FACTORY.getAndIncrement();
    }

    public Person(String lastName, String firstName, String nickName, String phoneNumber, String address, String emailAddress, LocalDate birthDate) {
        this.id = ID_FACTORY.getAndIncrement();
        this.lastName = new SimpleStringProperty(lastName);
        this.firstName = new SimpleStringProperty(firstName);
        this.nickName = new SimpleStringProperty(nickName);
        this.phoneNumber = new SimpleStringProperty(phoneNumber);
        this.address = new SimpleStringProperty(address);
        this.emailAddress = new SimpleStringProperty(emailAddress);
        this.birthDate = new SimpleObjectProperty<>(birthDate);
    }

    @Override
    public String toString() {
        return "app.model.Person{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

    // Getters and Setters
    public long getId() {
        return id;
    }

    public String getLastName() {
        return lastName.get();
    }
    public StringProperty lastNameProperty() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public String getFirstName() {
        return firstName.get();
    }
    public StringProperty firstNameProperty() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public String getNickName() {
        return nickName.get();
    }
    public StringProperty nickNameProperty() {
        return nickName;
    }
    public void setNickName(String nickName) {
        this.nickName.set(nickName);
    }

    public String getPhoneNumber() {
        return phoneNumber.get();
    }
    public StringProperty phoneNumberProperty() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber.set(phoneNumber);
    }

    public String getAddress() {
        return address.get();
    }
    public StringProperty addressProperty() {
        return address;
    }
    public void setAddress(String address) {
        this.address.set(address);
    }

    public String getEmailAddress() {
        return emailAddress.get();
    }
    public StringProperty emailAddressProperty() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress.set(emailAddress);
    }

    public LocalDate getBirthDate() {
        return birthDate.get();
    }
    public ObjectProperty<LocalDate> birthDateProperty() {
        return birthDate;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate.set(birthDate);
    }
}
