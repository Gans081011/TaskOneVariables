public class TaskTwoVariables {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println();
        // Задание 1
byte b = 8;
short s = 100;
int i = 32;
long l = 1251L;
float f = 1.5f;
double d = 3.0d; // больше float вдвое, а значит точнее
var box = 10;
System.out.println(b);// Проверка на то, что код работает и инициализация выполнена верно
System.out.println(s);
System.out.println(i);
System.out.println(l);
System.out.println(f);
System.out.println(d);
System.out.println(box);
            System.out.println(" ");
        System.out.println("Задание 2");


// Задание 2
        float firstBoxerWeight = 78.2f;
        float secondBoxerWeight = 82.7f;
        float allWeight = firstBoxerWeight + secondBoxerWeight;
        float differenceWeight = secondBoxerWeight-firstBoxerWeight;
        System.out.println("Общий вес двоих боксеров: "+  allWeight);
        System.out.println("Разница боксеров в весе : "+  differenceWeight);
            System.out.println(" ");
        System.out.println("Задание 3");


        // Задание 3
        int bananas = 5;
        int weightOneBanana = 80;
        int milk = 200;
        int valueMilkOnePortion = 100;
        int weightOnePortionMilk = 105;
        int iceCream = 2;
        int weightIceCream = 100;
        int eggs = 4;
        int eggsWeight = 70;
        int weightMilkAllPortion = milk* weightOnePortionMilk/valueMilkOnePortion;
             //System.out.println("Количество молока на порцию в 200 мл : " + weightMilkAllPortion + "грамм");

        int allWeightBreakfast = (bananas * weightOneBanana)+ (iceCream*weightIceCream )+ (eggs*eggsWeight)+ weightMilkAllPortion;
            System.out.println("Вес завтрака : " + allWeightBreakfast + " грамм");
            float m = 1000f;  // 1 киллограмм = 1000 грамм
            float  allWeightBreakfastKg = allWeightBreakfast/ m;
        System.out.println("Вес завтрака "+ allWeightBreakfastKg+ " килограмм");
        System.out.println();
          System.out.println("Задание 4");

       int leftWeightAll = 7;     // кол-во кг надо потерять
        int leftWeightOne = 250;  // потеря веса число граммов номер 1
        int leftWeightTwo = 500;  // потеря веса число граммов номер 2
        int leftWeightAllGrams =leftWeightAll * 1000;  // задал переменную с посчитанным количеством граммов в 7 килограммах.
        int leftDaysOne = leftWeightAllGrams/leftWeightOne; // кол-во дней при первой диете
        System.out.println(leftDaysOne + " дней");
        int leftDaysTwo = leftWeightAllGrams/leftWeightTwo; // кол-во дней при первой диете
        System.out.println(leftDaysTwo + " дней");
      int averageDays = (leftDaysOne+leftDaysTwo)/2;
        System.out.println(averageDays + " день в среднем");
        System.out.println();
        System.out.println("Задание 5 ");

        int salaryMasha = 67760;
        int salaryDenis = 83690 ;
        int salaryKristina = 76230 ;
        int month = 12;
        int indexing = 10; // 10 процентов индексация ежегодная
        int salaryYearOldMasha = (salaryMasha * month);
        int salaryYearOldDenis = salaryDenis * month;
        int salaryYearOldKristina = salaryKristina * month;

        System.out.println(salaryYearOldMasha + " Получала Маша до индексации за год");
        System.out.println(salaryYearOldDenis+ " Получал Денис до индексации за год");
        System.out.println(salaryYearOldKristina + " Получала Кристина до индексации за год");

        int salaryYearNewMasha = (salaryMasha * month *indexing)/100 + salaryYearOldMasha;
        int salaryYearNewDenis = (salaryDenis * month* indexing ) /100 + salaryYearOldDenis;
        int salaryYearNewKristina = (salaryKristina * month* indexing) /100 + salaryYearOldKristina;
        System.out.println();
        System.out.println(salaryYearNewMasha+ " Получает  Маша с учетом индексации за год");
        System.out.println(salaryYearNewDenis+ " Получает  Денис с учетом индексации за год");
        System.out.println(salaryYearNewKristina+ " Получает  Кристина с учетом индексации за год");

        int differenceSalaryMasha = salaryYearNewMasha - salaryYearOldMasha;
        int differenceSalaryDenis = salaryYearNewDenis - salaryYearOldDenis;
        int differenceSalaryKristina = salaryYearNewKristina - salaryYearOldKristina;

        System.out.println();
        System.out.println(differenceSalaryMasha + " Раница между доходами до и после повышения Маши");
        System.out.println(differenceSalaryDenis+ " Раница между доходами до и после повышения Дениса");
        System.out.println(differenceSalaryKristina + " Раница между доходами до и после повышения Кристины");

        int newSalaryMasha = salaryYearNewMasha/ month;
        int newSalaryDenis = salaryYearNewDenis/ month;
        int newSalaryKristina = salaryYearNewKristina/ month;
        System.out.println();
        System.out.println(newSalaryMasha+ " новая зарплата Маши в месяц");
        System.out.println(newSalaryDenis+ " новая зарплата Дениса в месяц");
        System.out.println(newSalaryKristina+ " новая зарплата Кристины в месяц");









    }
}
