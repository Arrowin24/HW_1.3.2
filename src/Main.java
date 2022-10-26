public class Main {
    public static void main(String[] args) {
        //Task1
        System.out.println("Task 1:");
        boolean clientOS = false;
        if(clientOS){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        //Task2
        System.out.println("Task 2:");
        int clientDeviceYear = 2015;
        if(clientOS){
            if(clientDeviceYear<2015)
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
            else System.out.println("Установите версию приложения для Android по ссылке");
        } else{
            if(clientDeviceYear<2015) {
                System.out.println("Установите облегченную версию приложения для iOSпо ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }

        //Task3
        System.out.println("Task 3:");
        int year =2021;
        boolean isLeapYear = (year%4==0)&&((year%400==0)||(year%100!=0));
        if(isLeapYear){
            System.out.println(year+" год является високосным");
        } else {
            System.out.println(year+ " год не является високосным");
        }

        //Task4
        System.out.println("Task 4:");
        double deliveryDistance = 95;
        int deliveryTime=1;
        if(deliveryDistance>=20&&deliveryDistance<60){
            deliveryTime+=1;
        } else if(deliveryDistance>=60&&deliveryDistance<100){
            deliveryTime+=2;
        }
        System.out.println("Потребуется дней: "+deliveryTime);

        //Task5
        System.out.println("Task 5:");
        int monthNumber = 12;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}