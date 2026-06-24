

public class Main {
    public static void main(String[] args) {

     int a = -159;
     int a1 = 27897;
     byte b = 67;
     short c = 569;
     long d = 987678965549L;
     float e = 2.786f;
     double f = 27.12;

     System.out.println("int a = " + a);
     System.out.println("int a1 = " + a1);
     System.out.println("byte b = " + b);
     System.out.println("short c = " + c);
     System.out.println("long d = " + d);
     System.out.println("float e = " + e);
     System.out.println("double f = " + f);

     int pupilAmount1 = 23;
     int pupilAmount2 = 27;
     int pupilAmount3 = 30;
     int totalPaperSheets = 480;
     int totalPupilsAmount = (pupilAmount1 + pupilAmount2 + pupilAmount3);
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
     long amount3Days = (long) bottlesPerMinute * minutesIn3Days;
     System.out.println("За 3 дня машина произвела " + amount3Days + " штук бутылок. ");

     int minutesInMonth = minutesInDay * 30;
     long amountMonth = (long) bottlesPerMinute * minutesInMonth;
     System.out.println("За 1 месяц машина произвела " + amountMonth + " штук бутылок. ");

     int whitePerClass = 2;
     int brownPerClass = 4;
     int totalPaintCans = 120;
     int totalPerClass = whitePerClass + brownPerClass;
     int classAmount = totalPaintCans / totalPerClass;
     int totalWhite = classAmount * whitePerClass;
     int totalBrown = classAmount * brownPerClass;

     System.out.println("В школе,где " + classAmount + " классов,нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски.");

     int banana = 5;
     int milk = 2;
     int icecream = 2;
     int egg = 4;
     int bananaWeight = 80;
     int milkWeight = 105;
     int icecreamWeight = 100;
     int eggWeight = 70;
     int totalBananaWeight = banana * bananaWeight;
     int totalMilkWeight = milk * milkWeight;
     int totalIcecreamWeight = icecream * icecreamWeight;
     int totalEggWeight = egg * eggWeight;
     int breakfastWeight1 = totalBananaWeight + totalMilkWeight + totalIcecreamWeight + totalEggWeight;
     double breakfastWeight2 = breakfastWeight1 / 1000.0;

     System.out.println("Завтрак весит " + breakfastWeight1 + " грамм = " + breakfastWeight2 + " килограмм.");

     int weightLossGoal1 = 7;
     int weightLossGoal2 = weightLossGoal1 * 1000;
     int weightLossGoal2PerDay1 = 250;
     int weightLossGoal2PerDay2 = 500;
     int dayNumber1 = weightLossGoal2 / weightLossGoal2PerDay1;
     int dayNumber2 = weightLossGoal2 / weightLossGoal2PerDay2;
     int totaldayNumber = dayNumber1 + dayNumber2;
     int averageDays = totaldayNumber / 2;

     System.out.println(dayNumber1 + " -если по 250. " );
     System.out.println(dayNumber2 + " -если по 500. " );
     System.out.println(averageDays + " -в среднем. ");

     double currentMashaSalary = 67760.0;
     double currentDenisSalary = 83690.0;
     double currentCristineSalary = 76230.0;
     double bonusPersent = 10.0;
     int monthInYear = 12;
     double mashaSalaryIncrease = currentMashaSalary * (bonusPersent / 100.0);
     double denisSalaryIncrease = currentDenisSalary * (bonusPersent / 100.0);
     double cristineSalaryIncrease = currentCristineSalary * (bonusPersent / 100.0);
     double newMashaSalary = currentMashaSalary + mashaSalaryIncrease;
     double newDenisSalary = currentDenisSalary + denisSalaryIncrease;
     double newCristineSalary = currentCristineSalary + cristineSalaryIncrease;
     double oldYearMashaIncome = currentMashaSalary * monthInYear;
     double newYearMashaIncome = newMashaSalary * monthInYear;
     double mashaYearIncomeDifference = newYearMashaIncome - oldYearMashaIncome;
     double oldYearDenisIncome = currentDenisSalary * monthInYear;
     double newYearDenisIncome = newDenisSalary * monthInYear;
     double denisYearIncomeDifference = newYearDenisIncome - oldYearDenisIncome;
     double oldYearCristineIncome = currentCristineSalary * monthInYear;
     double newYearCristineIncome = newCristineSalary * monthInYear;
     double cristineYearIncomeDifference = newYearCristineIncome - oldYearCristineIncome;

     System.out.println("Маша теперь получает " + (int)newMashaSalary + " рублей. ");
     System.out.println("Годовой доход вырос на " + (int)mashaYearIncomeDifference + " рублей. ");

     System.out.println("Денис теперь получает " + (int)newDenisSalary + " рублей. ");
     System.out.println("Годовой доход вырос на " + (int)denisYearIncomeDifference + " рублей. ");

     System.out.println("Кристина теперь получает " + (int)newCristineSalary + " рублей. ");
     System.out.println("Годовой доход вырос на " + (int)cristineYearIncomeDifference + " рублей. ");























        }
    }
