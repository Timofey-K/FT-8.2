/*
 * Enam - указывает списокок цветов которые можно использовать
 *
 * V 2.0  -  27.10.2019
 *
 * Timoxa
 */
package com.company;

/**
 * Utils - предоставляет методы вывода.
 *
 *@version  V 2.0  -  27.10.2019
 *@author  Timofey Kalinin
 */
public class Utils {

    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLACK = "\u001B[30m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_WHITE = "\u001B[37m";

    protected static void print(final String text) {
        System.out.println(text);
    }

    protected static void print(final String text, final Color color) {
       switch (color) {
           case BLACK:
               System.out.println(ANSI_BLACK + text + ANSI_RESET);
               break;
           case RED:
               System.out.println(ANSI_RED + text + ANSI_RESET);
               break;
           case GREEN:
               System.out.println(ANSI_GREEN + text + ANSI_RESET);
               break;
           case YELLOW:
               System.out.println(ANSI_YELLOW + text + ANSI_RESET);
               break;
           case BLUE:
               System.out.println(ANSI_BLUE + text + ANSI_RESET);
               break;
           case PURPLE:
               System.out.println(ANSI_PURPLE + text + ANSI_RESET);
               break;
           case CYAN:
               System.out.println(ANSI_CYAN + text + ANSI_RESET);
               break;
           case WHITE:
               System.out.println(ANSI_WHITE + text + ANSI_RESET);
               break;
           default:
               System.out.println("error");
               break;
       }
    }


}
