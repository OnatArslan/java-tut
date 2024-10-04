package oop;

public class Customer {
    private String name;
    private double creditLimit;
    private String email;

    /* Constructors */
    public Customer(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Customer(){
        this("unknown", 0, "unknown@example.com");
    }

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.creditLimit = 0;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", creditLimit=" + creditLimit +
                ", email='" + email + '\'' +
                '}';
    }
}
