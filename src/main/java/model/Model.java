package model;

import model.entities.Uni;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Model {

    public Uni createUni(double d) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?>[] paramType = new Class<?>[]{double.class};
        Constructor<?> constructor = model.entities.Uni.class.getConstructor(paramType);
        return (Uni) constructor.newInstance(d);
    }

    public Uni createUni(int i) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?>[] paramType = new Class<?>[]{int.class};
        Constructor<?> constructor = model.entities.Uni.class.getConstructor(paramType);
        return (Uni) constructor.newInstance(i);
    }

    public void increment(Uni uni) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = uni.getClass().getMethod("increment");
        method.invoke(uni);

    }

    public void change(Uni uni) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = uni.getClass().getMethod("change");
        method.invoke(uni);

    }

    public String getString(Uni uni) throws IllegalAccessException, NoSuchFieldException {
        Field field = uni.getClass().getDeclaredField("aDouble");
        field.setAccessible(true);
        return field.get(uni).toString();
    }
}
