import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"name", "age", "address", "ownerPhoneNumber", "price"})
//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonPropertyOrder(alphabetic = true)
public class Dog {
    String name;

    int age;

    String address;

    int ownerPhoneNumber;

    double price;

    public Dog() {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name, int age, int ownerPhoneNumber, double price) {
        this.name = name;
        this.age = age;
        this.ownerPhoneNumber = ownerPhoneNumber;
        this.price = price;
    }

    public Dog(String name, int age, String address, int ownerPhoneNumber, double price) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.ownerPhoneNumber = ownerPhoneNumber;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @JsonProperty(value = "Home Address", required = true)
    public String getAddress() {
        return address;
    }

    public int getOwnerPhoneNumber() {
        return ownerPhoneNumber;
    }

    public double getPrice() {
        return price;
    }
}
