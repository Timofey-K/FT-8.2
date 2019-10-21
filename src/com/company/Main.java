package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите текст");               //Вывод текста через метот класса Utils
        String text = in.nextLine();
        Utils.print(text);

        System.out.print("Введите цвет");               //Вывод текста и покраска его в заданный цвет
        String text2 = in.nextLine();                   //с помощью метода Utils
        Utils.print(text, Color.valueOf(text2));

        Color[] colors = Color.values();                //Вывод случайного объекта Enam
        final int max = colors.length;                  //с помощью статического метода Enam
        final int rnd1 = rnd(max);
        System.out.println(colors[rnd1]);
    }


  public static int rnd (int max){
    return (int) (Math.random() *++max);
    }
}

