/*
 *Данный пакет выполняет задание 8.2.
 *
 * версия 2.0 - 27.10.2019
 *
 * Автор Тимофей
 */
package com.company;
import java.util.Scanner;
import java.util.Random;

/**
 * Main - выполняет программу по заданию 8.2.
 *
 *@version  V 2.0  -  27.10.2019
 *@author  Timofey Kalinin
 */
 public class Main {

    /**
     * Класс выполняющий программу.
     * @version 2.0 Oct 2019
     * @author Timofey Kalinin
     */
    public static void main(final String[] args) {

        Scanner in = new Scanner(System.in, "ISO-8859-1");
        System.out.print("Input text");           //Вывод текста через метот класса Utils
        String text = in.nextLine();
        Utils.print(text);

        System.out.print("Input Colors");         //Покраска текста в заданый цвет
        String text2 = in.nextLine();             //с помощью метода Utils
        Utils.print(text, Color.valueOf(text2));

        Random rnd = new Random();
        Color[] colors = Color.values();          //Вывод случайного объекта Enam
        final int max = colors.length + 1;            //с помощью статического метода Enam
        final int rnd1 = rnd.nextInt(max);

        System.out.println(colors[rnd1]);
    }
}

