package designpattern.creational;

class User {
    public String street;
    public String houseNo;
    public String companyName;
    public String position;
    public int salary;

    @Override
    public String toString() {
        return "User{" +
                ", street='" + street + '\'' +
                ", houseNo='" + houseNo + '\'' +
                ", companyName='" + companyName + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class UserBuilder {

    protected User user = new User();

    public UserAddressBuilder lives() {
        return new UserAddressBuilder(user);
    }

    public UserEmployeeBuilder works() {
        return new UserEmployeeBuilder(user);
    }

    public User build() {
        return user;
    }
}

class UserAddressBuilder extends UserBuilder {

    public UserAddressBuilder(User user) {
        this.user = user;
    }

    public UserAddressBuilder street(String street) {
        user.street = street;
        return this;
    }

    public UserAddressBuilder house(String houseNo) {
        user.houseNo = houseNo;
        return this;
    }
}

class UserEmployeeBuilder extends UserBuilder {

    public UserEmployeeBuilder(User user) {
        this.user = user;
    }

    public UserEmployeeBuilder company(String company) {
        user.companyName = company;
        return this;
    }

    public UserEmployeeBuilder position(String position) {
        user.position = position;
        return this;
    }

    public UserEmployeeBuilder salary(int salary) {
        user.salary = salary;
        return this;
    }
}

public class FacetedBuilder {

    public static void main(String[] args) {
        UserBuilder ub = new UserBuilder();
        User user = ub
                .lives()
                    .street("ABC")
                    .house("25A")
                .works()
                    .company("Amazon")
                    .position("Developer")
                    .salary(2500)
                .build();
        System.out.println(user);
    }
}
