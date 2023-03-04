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
    public static void task1(){
        System.out.println("Задача 1");
        int allSum = 0;
        int month = 0;
        while (allSum <2459000){
            allSum = allSum + 15000;
            month++;
            System.out.println("Месяц "+month+", сумма накоплений равна "+allSum+" рублей");
        }
        System.out.println("Потребуеться месяцев: "+ month);
    }
    public static void task2(){
        System.out.println("Задача 2");
        int i = 1;
        while (i<=10){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
        for (int m = 10;m>0;m--){
            System.out.print(m+" ");
        }
    }
    public static void task3(){
        System.out.println("Задача 3");
        int populationY = 12_000_000;
        int year = 2000;
        int birthRate = 17;
        int deathRate = 8;
        int camelCase = 0;
        for(int i = 10;i>0;i--){
            camelCase = populationY/1000*birthRate-populationY/1000*deathRate;
            populationY = populationY + camelCase;
            year++;
            System.out.println("Год "+year+", численность населения составляет "+populationY);
        }
    }
    public static void task4(){
        System.out.println("Задача 4");
        int amountDep = 15000;
        System.out.println("Первоначальная сумма вклада = "+ amountDep);
        for (int i =1;amountDep<12_000_000;i++){
            amountDep = amountDep + (amountDep/100*7);
            System.out.println("Месяц вклада: "+ i +". Сумма на счету: "+ amountDep);
        }
    }
    public static void task5(){
        System.out.println("Задача 5");
        int amountDep = 15000;
        System.out.println("Первоначальная сумма вклада = "+ amountDep);
        for (int i =1;amountDep<12_000_000;i++){
            amountDep = amountDep + (amountDep/100*7);
            if(i%6==0){
            System.out.println("Месяц вклада: "+ i +". Сумма на счету: "+ amountDep);}
        }
    }
    public static void task6(){
        System.out.println("Задача 6");
        int amountDep = 15000;
        int year = 9;
        System.out.println("Первоначальная сумма вклада = "+ amountDep);
        for (int i =1;i<=year*12;i++){
            amountDep = amountDep + (amountDep/100*7);
            if(i%6==0){
                System.out.println("Месяц вклада: "+ i +". Сумма на счету: "+ amountDep);}
        }
    }
    public static void task7(){
        System.out.println("Задача 7");
        int fDate = 1;
        for(int i =1;i<=30;i++){
            if((i-fDate)%7==0){
                System.out.println("Сегодня пятница, "+i+"-е число. Необходимо подготовить отчет");
            }
        }
    }
    public static void task8(){
        System.out.println("Задача 8");
        int firstYearComet = 1896;
        while (firstYearComet<2300){
                System.out.println("Сегодня "+firstYearComet+"-ый год. Будет пролетать комета");
                firstYearComet = firstYearComet + 79;
            System.out.println("В следующий раз когда она пролетит - "+firstYearComet+" год.");
            }
        }
}