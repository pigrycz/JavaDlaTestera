package tables;

public class MyOwnSolutions {

    public void exerciseOne() {

        int[] numbers = {1, 2, 3, 4, 5, 6};

        int change;

        for (int i = 0; i <= (numbers.length - 1) / 2; i++) {
            change = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = change;
            for (int number : numbers
            ) {
                System.out.println(number);
            }
            System.out.println("");
        }
    }

    public void exerciseTwo() {
        int[] numbers = {1, 2, 4, 6, 7, 8, 122, 145, 1580, 12345};

        int odd = 0;
        int even = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                odd++;
            } else {
                even++;
            }
        }
        System.out.println(odd);
        System.out.println(even);
    }

    public void exerciseThree() {
        int[] numbers = {1, 0, 5, 90, 23, 34, 5, 112, -3};
        int min;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[i]) {
                    min = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = min;
                }
            }
        }

        for (int number : numbers
        ) {
            System.out.println(number);
        }
    }

    public void homework() {
        int[] numbers = {1, 0, 5, 90, 23, 34, 5, 112, -3, 1000, 23, 445, 123, 123111};
        int min;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] > numbers[i]) {
                    min = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = min;
                }
            }
        }

        for (int number : numbers
        ) {
            System.out.println(number);
        }
    }
}
