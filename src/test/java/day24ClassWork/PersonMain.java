package day24ClassWork;

public class PersonMain {
    public static void main(String[] args) {

        Person person = new Person.Builder()
                .setName("Lida")
                .setSurname("Malo")
                .setSex("F")
                .setAge(30)
                .setJobTitle("Sexy")
                .setSalary(500)
                .build();

        System.out.println(person);
    }
}
