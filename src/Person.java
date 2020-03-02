public class Person {
    private int age;
    private String name;

    public Person(int age, String name){
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String print = "";
        print += ("Name: " + name + "\n");
        print += ("Age: " + age);
        return print;
    }
}
