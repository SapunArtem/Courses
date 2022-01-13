package Course2.Generics.Igra;

public abstract class Partivipant {
    private String name;
    private int age;

    public Partivipant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
