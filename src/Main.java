

public class Main {
    public static void main(String[] args) {


     int myInt = 45000;
     byte myByte = 12;
     short myShort = -159;
     long myLong = 9000000000L;
     float myFloat = 3.14f;
     double myDouble = 2.71828;


     System.out.println("Значение переменной myInt с типом int равно " + myInt );
     System.out.println("Значение переменной myByte с типом byte равно " + myByte );
     System.out.println("Значение переменной myShort c типом short равно " + myShort );
     System.out.println("Значение переменной myLong с типом long равно " + myLong );
     System.out.println("Значение переменной myFloat с типом float равно " + myFloat );
     System.out.println("Значение переменной myDouble типом double равно " + myDouble);

     double value1 = 27.12;
     long value2 = 987678965549L;
     float value3 = 2.786f;
     int value4 = 569;
     short value5 = -159;
     int value6 = 27897;
     byte value7 = 67;

     System.out.println(value1);
     System.out.println(value2);
     System.out.println(value3);
     System.out.println(value4);
     System.out.println(value5);
     System.out.println(value6);
     System.out.println(value7);


     int lyudmilaStudents = 23;
     int annaStudents = 27;
     int ekaterinaStudents = 30;
     int totalPaperSheets = 480;
     int totalPupilsAmount = (lyudmilaStudents + annaStudents + ekaterinaStudents);
     int sheetsPerPupil =  (totalPaperSheets / totalPupilsAmount);

     System.out.println("На каждого ученика рассчитано " + sheetsPerPupil + " листов бумаги. ");

     int bottlesMade = 16;
     int minutesSpent =2;
     int bottlesPerMinute = bottlesMade / minutesSpent;
     int minutes20 =20;
     int amount20Min = bottlesPerMinute * minutes20;
     System.out.println("За 20 минут машина произвела " + amount20Min + " штук бутылок. ");

     int minutesInDay = 24 * 60;
     int amount1Day = bottlesPerMinute * minutesInDay;
     System.out.println("За сутки машина произвела " + amount1Day + " штук бутылок. ");

     int minutesIn3Days = minutesInDay * 3;
     int amount3Days = bottlesPerMinute * minutesIn3Days;
     System.out.println("За 3 дня машина произвела " + amount3Days + " штук бутылок. ");

     int minutesInMonth = minutesInDay * 30;
     int amountMonth = bottlesPerMinute * minutesInMonth;
     System.out.println("За 1 месяц машина произвела " + amountMonth + " штук бутылок. ");

     int whitePerClass = 2;
     int brownPerClass = 4;
     int totalPaintCans = 120;
     int totalPerClass = whitePerClass + brownPerClass;
     int classNumber = totalPaintCans / totalPerClass;
     int totalWhite = classNumber * whitePerClass;
     int totalBrown = classNumber * brownPerClass;

     System.out.println("В школе,где " + classNumber + " классов,нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски.");

     int bananasWeight = 5 * 80;
     int milkWeight = (200 /100) * 105;
     int iceCreamWeight = 2 * 100;
     int eggsWeight = 4 * 70;
     int totalWeightInGrams = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
     float totalWeightInKg = totalWeightInGrams / 1000.0f;


     System.out.println("Общий вес завтрака в граммах: " + totalWeightInGrams + "гр " );
     System.out.println("Общий вес завтрака в килограммах: " + totalWeightInKg + "кг " );

     int targetKg = 7;
     int targetGrams = targetKg * 1000;
     int variantMinGrams = 250;
     int variantMaxGrams = 500;
     int daysAtMinSpeed = targetGrams / variantMinGrams;
     int daysAtMaxSpeed = targetGrams / variantMaxGrams;
     int averageDays = (daysAtMinSpeed + daysAtMaxSpeed) / 2;

     System.out.println("Если спортсмен будет терять по 250 г в день,уйдёт: " + daysAtMinSpeed + " дней. " );
     System.out.println("Если спортсмен будет терять по 500 грамм в день,уйдёт: " + daysAtMaxSpeed + " дней." );
     System.out.println("В среднем для достижения результата потребуется: " + averageDays + " день " );

     float currentMashaSalary = 67760.0f;
     float currentDenisSalary = 83690.0f;
     float currentCristineSalary = 76230.0f;
     float bonusPersent = 10.0f;
     int monthInYear = 12;
     float mashaSalaryIncrease = currentMashaSalary * (bonusPersent / 100.0f);
     float denisSalaryIncrease = currentDenisSalary * (bonusPersent / 100.0f);
     float cristineSalaryIncrease = currentCristineSalary * (bonusPersent / 100.0f);
     float newMashaSalary = currentMashaSalary + mashaSalaryIncrease;
     float newDenisSalary = currentDenisSalary + denisSalaryIncrease;
     float newCristineSalary = currentCristineSalary + cristineSalaryIncrease;
     float mashaAnnualIncomeGrowth = mashaSalaryIncrease * monthInYear;
     float denisAnnualIncomeGrowth = denisSalaryIncrease * monthInYear;
     float cristineAnnualIncomeGrowth = cristineSalaryIncrease * monthInYear;


     System.out.println("Маша теперь получает " + (int)newMashaSalary + " рублей. " );
     System.out.println("Годовой доход вырос на " + (int)mashaAnnualIncomeGrowth + " рублей. " );

     System.out.println("Денис теперь получает " + (int)newDenisSalary + " рублей. " );
     System.out.println("Годовой доход вырос на " + (int)denisAnnualIncomeGrowth + " рублей. " );

     System.out.println("Кристина теперь получает " + (int)newCristineSalary + " рублей. " );
     System.out.println("Годовой доход вырос на " + (int)cristineAnnualIncomeGrowth + " рублей. " );























        }
    }
