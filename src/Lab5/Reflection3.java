package Lab5;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Reflection3 {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class <?> personClass = Person.class;
        Constructor<?>[] constructor = personClass.getConstructors();

        Class <?> [] parametersType = {java.lang.String.class, int.class};
        Constructor<?> constructor1 = personClass.getConstructor(parametersType);
        Constructor<?> constructor2 = personClass.getConstructor(new Class[]{String.class, int.class});

        Object obj = (Person) constructor1.newInstance("hello", 2);
        System.out.println("Class of new instance" + obj.getClass().getName());

//        System.out.println(Arrays.toString(constructor));
//        System.out.println(Arrays.toString(parametersType));
//        System.out.println(constructor1.toString() + "\n" + constructor2.toString());
//        System.out.println(constructor1);
    }
}
