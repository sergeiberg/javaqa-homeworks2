public class Main {
    public static void main(String[] args) {

        int amound = 19_942; //сумма чека билетов
        int bonus = 20; //начисление 1 бонусной мили за каждые ... рублей в чеке
        int mili = amound / bonus;


        System.out.println(mili + " бонусная(-ых/-ые) миля(-ь/-и/)");

    }
}