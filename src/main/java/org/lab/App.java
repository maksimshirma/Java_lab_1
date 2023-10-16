package org.lab;

import java.util.Scanner;

/**
 * The main class
 */
public class App {

    /**
     * The method, that asks the user for a number of action.
     * @return action - the number of the action.
     */
    public static int getAction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Команды:");
        System.out.println("1.Добавить элемент слева");
        System.out.println("2.Добавить элемент справа");
        System.out.println("3.Удалить элемент");
        System.out.println("4.Проверить существует ли элемент");
        System.out.println("5.Вывести список");
        System.out.println("6.Закончить");
        System.out.print("Введите номер команды: ");
        int action;
        for (action = scanner.nextInt(); action <= 0 || action > 6; action = scanner.nextInt()) {
            System.out.println("Ошибка, попробуйте снова.");
        }
        return action;
    }

    /**
     * The main method.
     * @param args - arguments of the main method.
     */
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        MyLinkedList<Integer> list = new MyLinkedList<>();

        int action;
        do {
            action = getAction();
            if (action == 1) {
                System.out.print("Вы выбрали добавить элемент слева, введите эелемент: ");
                int num = scanner.nextInt();
                list.addToHead(num);
            } else if (action == 2) {
                System.out.print("Вы выбрали добавить элемент справа, введите эелемент: ");
                int num = scanner.nextInt();
                list.addToEnd(num);
            } else if (action == 3) {
                System.out.print("Вы выбрали удалить элемент, введите эелемент: ");
                int num = scanner.nextInt();
                list.delete(num);
            } else if (action == 4) {
                System.out.print("Вы выбрали проверить существует ли элемент, введите эелемент: ");
                int num = scanner.nextInt();
                boolean isInList = list.has(num);
                if (isInList) {
                    System.out.println("Элемент находится в списке.");
                } else {
                    System.out.println("Элемент не находится в списке.");
                }
            } else if (action == 5) {
                System.out.println("Вы выбрали вывести список.");
                System.out.println(list);
            } else if (action == 6) {
                System.out.println("Вы выбрали закончить.");
            }
            System.out.print("\n");
        } while (action != 6);
    }
}
