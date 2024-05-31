package designpattern.creational.builder;

class CompanyStaff {
    private String name;
    private int age;
    private String street;
    private String houseNo;
    private String designation;
    private float salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "CompanyStaff{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", street='" + street + '\'' +
                ", houseNo='" + houseNo + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class CompanyStaffBuilder {
    CompanyStaff companyStaff = new CompanyStaff();

    public CompanyStaffPersonalBuilder personal() {
        return new CompanyStaffPersonalBuilder(companyStaff);
    }

    public CompanyStaffAddressBuilder address() {
        return new CompanyStaffAddressBuilder(companyStaff);
    }

    public CompanyStaffWorkBuilder work() {
        return new CompanyStaffWorkBuilder(companyStaff);
    }

    public CompanyStaff build() {
        return companyStaff;
    }
}

class CompanyStaffPersonalBuilder extends CompanyStaffBuilder {

    public CompanyStaffPersonalBuilder(CompanyStaff companyStaff) {
        this.companyStaff = companyStaff;
    }

    public CompanyStaffPersonalBuilder withName(String name) {
        companyStaff.setName(name);
        return this;
    }

    public CompanyStaffPersonalBuilder withAge(int age) {
        companyStaff.setAge(age);
        return this;
    }
}

class CompanyStaffAddressBuilder extends CompanyStaffBuilder {

    public CompanyStaffAddressBuilder(CompanyStaff companyStaff) {
        this.companyStaff = companyStaff;
    }

    public CompanyStaffAddressBuilder withStreet(String street) {
        companyStaff.setStreet(street);
        return this;
    }

    public CompanyStaffAddressBuilder withHouseNo(String houseNo) {
        companyStaff.setHouseNo(houseNo);
        return this;
    }
}



class CompanyStaffWorkBuilder extends CompanyStaffBuilder {

    public CompanyStaffWorkBuilder(CompanyStaff companyStaff) {
        this.companyStaff = companyStaff;
    }

    public CompanyStaffWorkBuilder withDesignation(String designation) {
        companyStaff.setDesignation(designation);
        return this;
    }

    public CompanyStaffWorkBuilder withSalary(float salary) {
        companyStaff.setSalary(salary);
        return this;
    }
}

public class FacetedBuilderExample {

    public static void main(String[] args) {

        CompanyStaff companyStaff = new CompanyStaffBuilder()
                .personal()
                    .withName("John")
                    .withAge(24)
                .address()
                    .withStreet("123, Hillside")
                    .withHouseNo("123ABC")
                .work()
                    .withDesignation("Software Engineer")
                    .withSalary(12252.00f)
                .build();
        System.out.println(companyStaff);
    }
}
