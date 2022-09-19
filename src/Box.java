public class Box <T> {
    T name;

    public Box(T name) {
        this.name = name;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public static  <T> void method(T object) {
        System.out.println(object);
    }
}

