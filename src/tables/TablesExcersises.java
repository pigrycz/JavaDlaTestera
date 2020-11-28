package tables;

public class TablesExcersises {

    public void excersises() {
//        int[] numbers = {1, 2, 3, 4, 5};
//        int first = numbers[0];
//        int last = numbers[4];
//        numbers[0] = last;
//        numbers[4] = first;
//
//        for (int number : numbers
//        ) {
//            System.out.println(number);
//        }
//
//        first = numbers[0];
//        numbers[0] = numbers[4];
//        numbers[4] = first;
//
//        for (int number : numbers
//        ) {
//            System.out.println(number);
//        }


//        int count = 0;
//        int count2 = 0;
//
//        int[] numbers = {2, 2, 3, 4, 5, 7, 7, 7, 8, 8, 2};
//        for (int number : numbers
//        ) {
//            if (number % 2 == 0) {
//                count++;
//            } else
//                count2++;
//        }
//
//        System.out.println(count + "     " + count2);

//        int[] numbers = {2, 4, 1, 9, 5, 2, 4, 0, 5, 8};
//
//        int min;
//
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = i + 1; j < numbers.length; j++) {
//                if (numbers[j] < numbers[i]) {
//                    min = numbers[j];
//                    numbers[j] = numbers[i];
//                    numbers[i] = min;
//                }
//            }
//        }
//
//        for (int number : numbers
//        ) {
//            System.out.println(number);
//        }


        int[] numbers = {2, 4, 1, 9, 5, 2, 4, 0, 5, 8};

        int max;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] > numbers[i]) {
                    max = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = max;
                }
            }
        }

        for (int number : numbers
        ) {
            System.out.println(number);
        }
    }
}