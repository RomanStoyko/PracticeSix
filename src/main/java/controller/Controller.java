package controller;

import model.Model;
import model.entities.Uni;
import view.View;

import java.lang.reflect.InvocationTargetException;

public class Controller {

    private View view;
    private Model model;

    public Controller() {
    }

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void work(){
        try {
            Uni uni = model.createUni(5);
            view.printMessage(model.getString(uni));
            model.increment(uni);
            view.printMessage(model.getString(uni));
            model.change(uni);
            view.printMessage(model.getString(uni));

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }


    }
}
