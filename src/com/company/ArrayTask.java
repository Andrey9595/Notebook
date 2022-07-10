package com.company;

import java.util.ArrayList;

public class ArrayTask {

    public static void addArrayTask(ArrayList<String> arrayList) {
        System.out.println("Введите новую задачу");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(i + 1 + arrayList.get(i));
        }
    }
}
