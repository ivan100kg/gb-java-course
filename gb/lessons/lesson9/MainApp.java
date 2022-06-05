package lessons.lesson9;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<Cat> classCat = Cat.class;
        Cat cat = new Cat();
        System.out.println(Arrays.toString(classCat.getDeclaredConstructors()));

        Method method = classCat.getDeclaredMethod("privateMeow");
        method.setAccessible(true);
        method.invoke(cat);

        Field field = classCat.getDeclaredField("privateField");
        field.setAccessible(true);
        field.set(cat, 10);

        System.out.println(field.getModifiers());
        System.out.println(method.getModifiers());

    }

}
