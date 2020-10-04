package 泛型编程;

public class Person<E>{
    private E name;

    public Person(E name) {
        this.name = name;
    }

    public Person() {
    }

    public E getName() {
        return name;
    }
}
