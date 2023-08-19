public class Main {
    public static void main(String[] args) {
        Person person1 = new Person.Builder("Ana", "Dumitru")
                .age(30)
                .address("Bucuresti")
                .build();

        Person person2 = new Person.Builder("Ioana", "Simionescu")
                .age(25)
                .build();

        System.out.println("Person 1:");
        System.out.println("Name: " + person1.getFirstName() + " " + person1.getLastName());
        System.out.println("Age: " + person1.getAge());

        System.out.println("------------------------------------------------------");

        System.out.println("Person 2:");
        System.out.println("Name: " + person2.getFirstName() + " " + person2.getLastName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Address: " + person2.getAddress());
    }
}
