public abstract  class Person {
   private String firstName;
   private String lastName;
   private int age;
   private String email;
   private int phoneNumber;

    public Person(String firstName, String lastName, int age, String  email, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String  getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
    public abstract void parentMethod();

    public abstract void getEmailfromParametr(String email);


    @Override
    public String toString() {
        return "Person: \n" +
                "firstName: " + firstName + '\'' +
                ", lastName: " + lastName + '\'' +
                ", age: " + age +
                ", email: " + email +
                ", phoneNumber: " + phoneNumber +
                '}';
    }
}
