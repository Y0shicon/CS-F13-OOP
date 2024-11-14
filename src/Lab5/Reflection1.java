package Lab5;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void greet() {
        System.out.println("Hello, my name is " + name);
    }
}

public class Reflection1 {
    public static void main(String[] args) {
        try {
// Obtain the Class object for the Person class
            Class<?> personClass = Person.class;
// Print the class name
            System.out.println("Class Name: " + personClass.getName());
// Get and print all declared fields(private, public, etc.)
            Field[] fields = personClass.getDeclaredFields();
            System.out.println("\nDeclared Fields:");
            for (Field field : fields) {
                System.out.println(field.getName() + " of type " + field.getType());
            }
// Get and print all declared methods
            Method[] methods =
                    personClass.getDeclaredMethods();
            System.out.println("\nDeclared Methods:");
            for (Method method : methods) {
                System.out.println(method.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
