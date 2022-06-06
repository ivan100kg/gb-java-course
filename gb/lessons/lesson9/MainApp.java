package lessons.lesson9;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        System.out.println("cat.privateField = " + field.get(cat));
        field.set(cat, 10);
        System.out.println("cat.privateField = " + field.get(cat));

        System.out.println(field.getModifiers());
        System.out.println(method.getModifiers());

        System.out.println("==============================");

        List<Method> executionList = new ArrayList<>();
        Class testClass = TestClass.class;
        Method[] methods = testClass.getDeclaredMethods();
        for (Method m : methods) {
            if (m.isAnnotationPresent(MyAnnotation.class)) {
                executionList.add(m);
            }
        }

        executionList.sort((a,b) -> b.getAnnotation(MyAnnotation.class).priority() -
                a.getAnnotation(MyAnnotation.class).priority());
       executionList.forEach(method1 -> {
           try {
               method1.invoke(null);
           } catch (IllegalAccessException | InvocationTargetException e) {
               e.printStackTrace();
           }
       });

    }

}
