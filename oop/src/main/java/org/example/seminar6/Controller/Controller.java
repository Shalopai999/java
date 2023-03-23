package org.example.seminar6.Controller;

import org.example.seminar6.Model.Model;
import org.example.seminar6.View.View;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void setFirstName(String firstName) {
        model.setFirstName(firstName);
    }

    public void setLastName(String lastName) {
        model.setFirstName(lastName);
    }

    public void setAge(int age) {
        model.setAge(age);
    }

    public String getFirstName() {
        return model.getFirstName();
    }

    public String getLastName() {
        return model.getLastName();
    }

    public int getAge() {
        return model.getAge();
    }

    public void view() {
        view.printHuman(model.getFirstName(), model.getLastName(), model.getAge());
    }
}
