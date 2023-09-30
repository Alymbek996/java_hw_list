package com.company;

import java.util.*;

//#ДЗ 4-й урок
//        1) (Дэдлайн до урока)
//        a) Используйте цикл
//        b)  Написать приложение которое бы считывало сначала 5 строк которые вводит юзер и сохраняла бы их в Список А.
//        c)  Затем программа должна отобразить этот список
//        d)  Потом программа считывает еще 5 строк, которые вводит юзер и помещает их в Список Б. После также отображает его в консоли
//        e)  Объединить Список А со Списком Б в новый список С следующим образом {A1,B5,А2,Б4,А3,Б3,А4,Б2,А5,Б1}
//        f)  После объединения отобразить в консоли список С
//        g)   В конце отсортировать элементы списка С по длине слова, сначала идут String-и с наименьшим количеством символов, и распечатать отсортированный список С.
//
     //   2) Запустить новый проект в Андроид студио и скинуть фотку запущенного проекта.
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listA = new ArrayList<>();
        List<String> listB = new ArrayList<>();


        for (int i = 0; i < 5; i++) {
            System.out.print("Введите строку для списка A: ");
            String input = scanner.nextLine();
            listA.add(input);
        }


        System.out.println("Список A:");
        for (String item : listA) {
            System.out.println(item);
        }

         for (int i = 0; i < 5; i++) {
            System.out.print("Введите строку для списка B: ");
            String input = scanner.nextLine();
            listB.add(input);
        }


        System.out.println("Список B:");
        for (String item : listB) {
            System.out.println(item);
        }

         List<String> listC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(4 - i));
        }

         System.out.println("Список C:");
        for (String item : listC) {
            System.out.println(item);
        }

         listC.sort(Comparator.comparing(String::length));


        System.out.println("Отсортированный список C:");
        for (String item : listC) {
            System.out.println(item);
        }
    }
}




