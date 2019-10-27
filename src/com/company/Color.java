/*
 * Enam - указывает списокок цветов которые можно использовать
 *
 * V 2.0  -  27.10.2019
 *
 * Timoxa
 */
package com.company;


/**
 *Список возможных цветов.
 *@version 2.0 Oct 2019
 *@author Timofey Kalinin
 */
public enum Color {
    BLACK("Чёрный"),
    RED("Красный"),
    GREEN("Зелёный"),
    YELLOW("Жёлтый"),
    BLUE("Синий"),
    PURPLE("Фиолетовый"),
    CYAN("Голубой"),
    WHITE("Белый");

    private String color;

    Color(final String ccolor) {
        this.color = ccolor;
    }

    public String getColor() {
        return color;
    }


}
