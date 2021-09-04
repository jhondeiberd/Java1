package main;

public class Student {
    // instance variables
    int id;
    String lastName;
    String firstName;
    int age;

    // constructor
    public Student(int id, String lastName, String firstName, int age) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }
    // getters / setters
    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student: " +
                "Id=" + id +
                ", FullName= " + firstName + ' ' + lastName +
                ", LastName= " + lastName +
                ", FirstName= " + firstName +
                ", Age= " + age;
    }

    //@Override
    public int compareTo(Student o) {
        return o.age - this.age;
    }


}
