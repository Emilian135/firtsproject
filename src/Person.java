public class Person {


    // Attribute
    private String name;
    private int age;

    // Referenzen

    // Konstruktor
        public Person(String name, int age) {
        halloSagen();
    }
        this.name = name;
        this.age = age;
    // Methoden
    public void halloSagen() {
        System.out.println("Hi,my name is " + name +"and I am " + age + " years old");

    }

}