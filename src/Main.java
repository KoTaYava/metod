public class Main {
    static boolean leap(int year) {
        if ((year % 4 == 0) && (year % 100 != 0)) {
            return true;

        } else if (year % 400 == 0) {

            return false;
        } else {
            return false;
        }

    }
    public static void distan(int deliveryDistance){
        int day = 1;
        int delivery = 20;
        if(deliveryDistance <=delivery){
            System.out.println("Потребуется дней: " + day  );
        } else if (deliveryDistance > delivery && deliveryDistance < 60 ) {
            System.out.println("Потребуется дней: " + (2 * day)  );
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + (3 * day) );
        } else {
            System.out.println("Доставки нет ");
        }
    }

    public static void vers(int os, int year){
       int year2 = 2015;
        if (os == 1 && year <= year2) {
            System.out.println("Установите облегченную версию для IOS");
        } else if (os == 1 && year > year2){
            System.out.println("Установите приложение для IOS");
        } else if (os == 0 && year <= year2) {
            System.out.println("Установите облегченную версию для Android");
        } else {
            System.out.println("Установите приложенеи для Android");
        }
    }


    public static void main(String[] args)  {

        System.out.println("Задача 1");
        int curentYear = 2021;
        boolean leapYear = true;
        leapYear = leap(curentYear);
        if (leapYear) {
            System.out.println("Год " + curentYear +  " високосный"  );
        }else {
            System.out.println("Год " + curentYear + " не високосный ");
        }
        System.out.println("Задача 2");
        int year = 2008;
        int os = 1;
        vers(os,year);
        System.out.println("Задача 3");


        distan(95);


    }


}











