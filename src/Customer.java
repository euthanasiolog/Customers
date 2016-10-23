/**
 * Created by Piatrok on 23.10.16.
 */
public class Customer implements Comparable
{
    String name;
    String lastName;
    String middleName;
    int id;
    long creditCardId;
    long bankAccount;
    String address;

    public Customer(String name, String lastName, String middleName, int id, long creditCardId, long bankAccount, String address)
    {
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.id = id;
        this.creditCardId = creditCardId;
        this.bankAccount = bankAccount;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getCreditCardId() {
        return creditCardId;
    }

    public void setCreditCardId(long creditCardId) {
        this.creditCardId = creditCardId;
    }

    public long getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(long bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", id=" + id +
                ", creditCardId=" + creditCardId +
                ", bankAccount=" + bankAccount +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        String fullName = name+lastName+middleName;

        return 0;
    }
}
