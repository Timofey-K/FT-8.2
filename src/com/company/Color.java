package com.company;

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

    Color(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }


}
