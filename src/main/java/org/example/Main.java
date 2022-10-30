package org.example;

public class Main {
    public static void main(String[] args) {
        StringList stringList = new StringListImpl();

        stringList.addString(0, "Понедельник");
        stringList.addString(1, "Вторник");
        stringList.addString(2, "Среда");
        stringList.addString(3, "Четверг");
        stringList.addString(4, "Пятница");
        stringList.addString(5, "Суббота");
        stringList.addString(6, "Воскресенье");
        stringList.addString(7, "Январь");
        stringList.addString(8, "Февраль");
        stringList.addString(9, "Март");
        stringList.addString(10, "Апрель");
        stringList.addString(11, "Май");
        stringList.addString(12, "Июнь");
        stringList.addString(13, "Июль");
        stringList.addString(14, "Август");
        stringList.addString(15, "Сентябрь");
        stringList.addString(16, "Октябрь");
        stringList.addString(17, "Ноябрь");
        stringList.addString(18, "Декабрь");

        stringList.display();
    }
}