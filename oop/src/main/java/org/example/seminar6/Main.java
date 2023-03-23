package org.example.seminar6;

import org.example.seminar6.Controller.Controller;
import org.example.seminar6.Model.Model;
import org.example.seminar6.View.View;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        List<Model> list = new ArrayList<>();
//        list.add(new Model("Роман", "Осовский", 25));
        Model model = human();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.view();
    }

    public static Model human(){
        Model human1 = new Model();
        human1.setFirstName("Роман");
        human1.setLastName("Осовский");
        human1.setAge(25);

        return human1;
    }
}
