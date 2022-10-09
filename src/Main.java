public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1\n");
        int[] dailyExpenses;
        {
            int dayInMonth = 30,
                    minExpenses = 100_000, maxExpenses = 200_000,
                    rangeExpenses = maxExpenses - minExpenses + 1;
            dailyExpenses = generateRandomArray(dayInMonth, minExpenses, rangeExpenses);
            System.out.printf("Сумма трат за месяц составила %s рублей.\n", calculateSumm(dailyExpenses));
        }
        System.out.println("Задание 2\n");
        {
            System.out.printf("Минимальная сумма затрат за день составила %s рублей.\n" +
                            "Максимальная сумма затрат за день составила %s рублей.\n",
                    minDaylyExpenses(dailyExpenses), maxDaylyExpenses(dailyExpenses));

            System.out.println("Задание 3\n");
            System.out.printf("Средняя сумма трат за месяц составила %.2f рублей.\n",
                    averageExpenses(dailyExpenses));


        System.out.println("Задание 4\n");
            char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int i = reverseFullName.length - 1; i >= 0; i--)
                System.out.printf("%s", reverseFullName[i]);
        }

        System.out.println();
    }

    static int[] generateRandomArray(int arrayLenght, int minValue, int range) {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[arrayLenght];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(range) + minValue;
        }
        return arr;
    }
    // showAray()
/*    static void showArray(int[] someArray) {
        for (int i = 0; i < someArray.length - 1; i++) System.out.printf("%s, ", someArray[i]);
        System.out.printf("%s.\n", someArray[someArray.length - 1]);
    }*/
    static int calculateSumm(int[] expensesArray) {
        int summ = 0;
        for (int currentElement : expensesArray) summ += currentElement;
        return summ;
    }
    static int minDaylyExpenses(int[] dailyExpenses) {
        int min = dailyExpenses[0];
        for (int curentElement : dailyExpenses) if (curentElement < min) min = curentElement;
        return min;
    }
    static int maxDaylyExpenses(int[] dailyExpenses) {
        int max = dailyExpenses[0];
        for (int curentElement : dailyExpenses) if (curentElement > max) max = curentElement;
        return max;
    }
    static float averageExpenses(int[] dailyExpenses) {
        return calculateSumm(dailyExpenses) / dailyExpenses.length;
    }
}