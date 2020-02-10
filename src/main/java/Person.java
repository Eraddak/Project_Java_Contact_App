import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

public class Person {

    private static final AtomicLong ID_FACTORY = new AtomicLong();
    private final long id;
    private String lastName;
    private String firstName;
    private String nickName = null;
    private String phoneNumber = null;
    private String address = null;
    private String emailAddress = null;
    private Date birthDate = null;


    public Person() {
        this.id = ID_FACTORY.getAndIncrement();
    }

    public Person(String lastName, String firstName, String nickName, String phoneNumber, String address, String emailAddress, Date birthDate) {
        this.id = ID_FACTORY.getAndIncrement();
        this.lastName = lastName;
        this.firstName = firstName;
        this.nickName = nickName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.emailAddress = emailAddress;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Person{" +
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

    // Getters
    public long getId() {
        return id;
    }
    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getNickName() {
        return nickName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getAddress() {
        return address;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public Date getBirthDate() {
        return birthDate;
    }

    // Setters
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

}
