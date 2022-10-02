public class Main {
    public static void main(String[] args) {
        //Задача 1
        int clientOS = 1;
        if(clientOS == 1) System.out.println("Установите версию приложения для Android по ссылке");
        else System.out.println("Установите версию приложения для iOS по ссылке");
        //Задача 2
        int clientDeviceYear = 2015;
        if(clientOS == 1 && clientDeviceYear<2015) System.out.println("Установите облегченную версию приложения для Android по ссылке");
        if(clientOS == 0 && clientDeviceYear<2015) System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        //Задача 3
        int year = 2100;
        if((year%4 == 0 && year%100 != 0) || year%400 ==0 ) System.out.println(year + " год является високосным");
        else System.out.println(year + " год не является високосным");
        //Задача 4
        int deliveryDistance = 21;
        int deliveryDays = 1;
        if(deliveryDistance>20) deliveryDays++;
        if(deliveryDistance>60) deliveryDays++;
        System.out.println("Потребуется дней: " +deliveryDays);
        //Задача 5
        int monthNumber = 1;
        String monthString;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:  monthString = "Зима";
                break;
            case 3:
            case 4:
            case 5:  monthString = "Весна";
                break;
            case 6:
            case 7:
            case 8:  monthString = "Лето";
                break;
            case 9:
            case 10:
            case 11: monthString = "Осень";
                break;
            default: monthString = "Не знаем такого";
        }
            System.out.println(monthString);

    }
}