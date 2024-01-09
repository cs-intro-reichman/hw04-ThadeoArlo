public class TesterArrayOps {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java TesterArrayOps <function_name> <input_number>");
            return;
        }

        String functionName = args[0];
        int inputNumber = Integer.parseInt(args[1]);

        switch (functionName) {
            case "findMissingInt":
                testFindMissingInt(inputNumber);
                break;
            case "secondMaxValue":
                testSecondMaxValue(inputNumber);
                break;
            case "containsTheSameElements":
                testContainsTheSameElements(inputNumber);
                break;
            case "isSorted":
                testIsSorted(inputNumber);
                break;
            default:
                System.out.println("Invalid function name.");
        }
    }

    private static void testFindMissingInt(int inputNumber) {
        int[][] testCases = {
                {0, 1, 2, 3, 4, 6},
                {2, 3, 1},
                {0},
                // Add more test cases as needed
        };

        int result = ArrayOps.findMissingInt(testCases[inputNumber - 1]);
        System.out.println(result);
    }

    private static void testSecondMaxValue(int inputNumber) {
        int[][] testCases = {
                {1, 2, 3, 4, 5},
                {2, 8, 3, 7, 8},
                {1, -2, 3, -4, 5},
                {-202, 48, 13, 7, 8},
                // Add more test cases as needed
        };

        int result = ArrayOps.secondMaxValue(testCases[inputNumber - 1]);
        System.out.println(result);
    }

    private static void testContainsTheSameElements(int inputNumber) {
        int[][] testCasesArray1 = {
                {1, 2, 3, 4, 5},
                {2, 2, 3, 7, 8, 3, 2},
                {1, 2, 3, -4, 5},
                {87, -48, 31, 23897, 5},
                {7},
                // Add more test cases as needed
        };
        int[][] testCasesArray2 = {
                {1, 2, 3, 4, 5},
                {8, 2, 7, 7, 3},
                {1, 3, -4, 5},
                {-22, 8, 13, 7},
                {8, -900, 7},
                // Add corresponding test cases as needed
        };

        boolean result = ArrayOps.containsTheSameElements(testCasesArray1[inputNumber - 1], testCasesArray2[inputNumber - 1]);
        System.out.println(result);
    }

    private static void testIsSorted(int inputNumber) {
        int[][] testCases = {
                {1, 2, 3},
                {3, 2, 1},
                {1, -2, 3},
                {1, 1, 3},
                // Add more test cases as needed
        };

        boolean result = ArrayOps.isSorted(testCases[inputNumber - 1]);
        System.out.println(result);
    }
}
