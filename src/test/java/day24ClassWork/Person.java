package day24ClassWork;

public class Person {

    private String name;
    private String surname;
    private int age;
    private double salary;
    private String sex;
    private String jobTitle;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getSex() {
        return sex;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public static class Builder {

        private Person newPerson = new Person();

        public Builder setName(String name) {
            newPerson.name = name;
            return this;
        }

        public Builder setSurname(String surname) {
            newPerson.surname = surname;
            return this;
        }

        public Builder setAge(int age) {
            newPerson.age = age;
            return this;
        }

        public Builder setSalary(double salary) {
            newPerson.salary = salary;
            return this;
        }

        public Builder setSex(String sex) {
            newPerson.sex = sex;
            return this;
        }

        public Builder setJobTitle(String jobTitle) {
            newPerson.jobTitle = jobTitle;
            return this;
        }

        public Person build() {
            return newPerson;
        }
    }
}
