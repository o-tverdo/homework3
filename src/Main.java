public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int middle = 3000000;
        System.out.println("Значение переменной middle с типом int равно " + middle);
        byte micro = 110;
        System.out.println("Значение переменной micro с типом byte равно " + micro);
        short mini = 25000;
        System.out.println("Значение переменной mini с типом short равно " + mini);
        long longg = 822337203869736L;
        System.out.println("Значение переменной longg с типом long равно " + longg);
        float floatt = 4.67f;
        System.out.println("Значение переменной floatt с типом float равно " + floatt);
        double doublee = 6.9874257;
        System.out.println("Значение переменной doublee с типом double равно " + doublee);
    }

    public static void task2() {
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987678965549L;
        float v = 2.786f;
        short g = 569;
        short d = -159;
        short r = 27897;
        byte h = 67;
    }

    public static void task3() {
        System.out.println("Задача 3");
        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ecaterinaAndreevna = 30;
        short boutghInAll = 480;
        byte quantityClass = 3;
        int paperToOneStudent = 480 / (ludmilaPavlovna + annaSergeevna + ecaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано " + paperToOneStudent + " листов бумаги");
    }

    public static void task4() {
        System.out.println("Задача 4");
        byte capacityMachineForTwoMin = 16;
        int capacityMachineForOneMin = capacityMachineForTwoMin / 2;
        int capacityForTwenty = capacityMachineForOneMin * 20;
        System.out.println("За 20 минут машина произвела " + capacityForTwenty + " штук бутылок");
        int capacityForDay = capacityMachineForOneMin * 1440;
        System.out.println("За сутки машина произвела " + capacityForDay + " штук бутылок");
        int capacityForThreeDays = capacityForDay * 3;
        System.out.println("За 3-ое суток машина произвела " + capacityForThreeDays + " штук бутылок");
        int capacityForOneMonth = capacityForDay * 30;
        System.out.println("За месяц машина произвела " + capacityForOneMonth + " штук бутылок");
    }

    public static void task5() {
        System.out.println("Задача 5");
        short totalPaint = 120;
        byte oneClassWhitePaint = 2;
        byte oneClassBrownPaint = 4;
        int quantityClass = totalPaint / (oneClassBrownPaint + oneClassWhitePaint);
        int totalWhitePaint = quantityClass * oneClassWhitePaint;
        int totalBrownPaint = quantityClass * oneClassBrownPaint;
        System.out.println("В школе, где " + quantityClass + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски.");

    }

    public static void task6() {
        System.out.println("Задача 6");
        byte bananas = 5;
        short weightOneBananasInGramms = 80;
        short milkInMl = 200;
        short oneHundredMlMilkInG = 105;
        byte iceCreamPlombir = 2;
        short iceCreamInG = 100;
        byte egg = 4;
        short eggInG = 70;
        int allWeight = (bananas * weightOneBananasInGramms) + ((milkInMl / 100) * oneHundredMlMilkInG) + (iceCreamPlombir * iceCreamInG) + (egg * eggInG);
        float allWeightInKg = allWeight / 1000f;
        System.out.println(allWeightInKg);
    }

    public static void task7() {
        System.out.println("Задача 7");
        byte haveToLoseWeightInKg = 7;
        int haveToLoseWeigthInG = haveToLoseWeightInKg * 1000;
        int daysNeedIfTwoHFeefty = haveToLoseWeigthInG / 250;
        System.out.println("Eсли спортсмен будет терять по 250 грамм, ему понадобится " + daysNeedIfTwoHFeefty + " дней");
        int daysNeedIfFeeftyHandredGLose = haveToLoseWeigthInG / 500;
        System.out.println("Eсли спортсмен будет терять по 500 грамм, ему понадобится " + daysNeedIfFeeftyHandredGLose + " дней");
        int oneAParDaysNeed = (daysNeedIfTwoHFeefty + daysNeedIfFeeftyHandredGLose) / 2;
        System.out.println("В среднем спортсмену понадобиться " + oneAParDaysNeed + " день");
    }

    public static void task8() {
        System.out.println("Задача 8");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int cristinaSalary = 76230;

        int mashaSalary2 = (mashaSalary/100)*10 + mashaSalary;
        int differenceMasha = mashaSalary2 - mashaSalary;
        System.out.println("Маша теперь получает " + mashaSalary2 + " рублей. Годовой доход вырос на " + differenceMasha + " рублей");
        int denisSalary2 = (denisSalary/100) * 10 + denisSalary;
        int differenceDenis = denisSalary2 - denisSalary;
        System.out.println("Денис теперь получает " + denisSalary2 + " рублей. Годовой доход вырос на " + differenceDenis + " рублей");
        int cristinaSalary2 = (cristinaSalary/100) * 10 + cristinaSalary;
        int differenceCristina = cristinaSalary2 - cristinaSalary;
        System.out.println("Кристина теперь получает " + cristinaSalary2 + " рублей. Годовой доход вырос на " + differenceCristina + " рублей");


    }
}