package ru.skypro;

public class Main {
    public static void leapYearVerification(int annumInt){
         if (annumInt % 4==0 && annumInt % 100 !=0 || annumInt % 400 == 0){
             System.out.println("год "+annumInt + " является високосным");
         } else {
             System.out.println("год "+ annumInt + " не является високосным");
         }
    }
    public static void toFindOS (int clientOS, int clientDeviceYear) {
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Перейдите по ссылке и скачайте приложение для IOS!");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Перейдите по ссылке и скачайте облегченную версию приложения для IOS!");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Перейдите по ссылке и скачайте приложение для Android!  ");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Перейдите по ссылке и скачайте облегченную версию приложения для Android!  ");
        }
    }
    public static void deliveryOfBankCards(int deliveryDistance){
           if (deliveryDistance<=20) {
               System.out.println("Доставка займет 1 день!");
           } else if  (deliveryDistance<=60) {
               System.out.println("Доставка займет 2 дня!");
           } else if  (deliveryDistance<=100) {
               System.out.println("Доставка займет 3 дня!");
           }
       }
    public static void main(String[] args) {
	// write your code here
            int yearInt = 500;
        leapYearVerification(yearInt);
        int clOpSystem=0;
        int manYear=2017;
        toFindOS (clOpSystem,manYear);
        int Distance = 50;
        deliveryOfBankCards(Distance);
    }
}
