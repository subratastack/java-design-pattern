package designpattern.creational.builder;

class People {

    private String name;
    private String city;
    private String education;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", education='" + education + '\'' +
                '}';
    }
}

class PeopleBuilder<SELF extends PeopleBuilder<SELF>> {

    People people = new People();

    public PeopleBuilder() {}

    public SELF withName(String name) {
        people.setName(name);
        return self();
    }

    public SELF withCity(String city) {
        people.setCity(city);
        return self();
    }

    protected SELF self() {
        return (SELF) this;
    }

    public People build() {
        return people;
    }
}

class EducationBuilder extends PeopleBuilder<EducationBuilder> {

    public EducationBuilder withDegree(String degree) {
        people.setEducation(degree);
        return self();
    }

    @Override
    protected EducationBuilder self() {
        return this;
    }
}

public class BuilderPatternWithRGExample {

    public static void main(String[] args) {

        // Let's create a people
        People people1 = new PeopleBuilder()
                .withName("John")
                .withCity("New York")
                .build();
        System.out.println(people1);

        // Let's create a people with some degree
        People people2 = new EducationBuilder()
                .withName("Mark")
                .withDegree("ABC")
                .withCity("Dubai")
                .build();
        System.out.println(people2);
    }
}
