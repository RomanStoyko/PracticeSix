import controller.Controller;
import model.Model;
import view.View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {

        String string = null;
        String newString = null;
        try {
            string = "test";
            newString = "lol";
            Field field = string.getClass().getDeclaredField("value");
            field.setAccessible(true);
            System.out.println((char[]) field.get(string));
            field.set(string, newString.toCharArray());
            System.out.println("test");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        try {
            string = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            newString = bufferedReader.readLine();
            Field field = string.getClass().getDeclaredField("value");
            field.setAccessible(true);
            System.out.println((char[]) field.get(string));
            field.set(string, newString.toCharArray());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(string);

        Controller controller = new Controller(new View(), new Model());
        controller.work();
    }
}
