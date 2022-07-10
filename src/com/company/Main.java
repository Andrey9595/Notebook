package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static ArrayTask task = new ArrayTask();

    public static void main(String[] args) {
        ArrayList<String> arrayTask = new ArrayList<>();

        while (true) {
            System.out.println("Выберите операцию и введите её номер:\n" +
                    "1. Добавить задачу\n" +
                    "2. Вывести список задач\n" +
                    "3. Удалить задачу\n" +
                    "0. Завершить программу");

            int operation = scanner.nextInt();
            scanner.nextLine();
            switch (operation) {
                case 1:
                    System.out.println("Введите новую задачу");
                    arrayTask.add(scanner.nextLine());
                    break;
                case 2:
                    task.addArrayTask(arrayTask);
                    break;
                case 3:
                    System.out.println("Введите индекс задачи для удаления");
                    arrayTask.remove(scanner.nextInt() - 1);
                    break;
                case 0:
                    System.out.println("Программа завершена");
                    return;
                default:
            }

        }
    }
}
