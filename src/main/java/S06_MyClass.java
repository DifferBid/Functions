
import org.example.S05MyClass;

public class S06_MyClass {

    public static void main(String[] args) {
        S05MyClass s05MyClass = new S05MyClass();
        s05MyClass.sayHello("Hello", "Kitty", "Cat");
        // Вывод: Hello Kitty Cat

        s05MyClass.sayHello("Hello", "Cat");
        // Вывод: Hello Kitty Cat
    }
}
