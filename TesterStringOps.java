import java.util.Arrays;

public class TesterStringOps {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java TesterStringOps <function_name> <input_number>");
            return;
        }

        String functionName = args[0];
        int inputNumber = Integer.parseInt(args[1]);

        switch (functionName) {
            case "capVowelsLowRest":
                testCapVowelsLowRest(inputNumber);
                break;
            case "camelCase":
                testCamelCase(inputNumber);
                break;
            case "allIndexOf":
                testAllIndexOf(inputNumber);
                break;
            default:
                System.out.println("Invalid function name.");
        }
    }

    private static void testCapVowelsLowRest(int inputNumber) {
        String[] testCases = {
                "Hello World",
                "One two tHRee world",
                "vowels are fun",
                "Intro",
                "yellow",
                // Add more test cases as needed
        };

        String result = StringOps.capVowelsLowRest(testCases[inputNumber - 1]);
        System.out.println(result);
    }

    private static void testCamelCase(int inputNumber) {
        String[] testCases = {
                "Hello World",
                "HELLO world",
                " tWo     wordS",
                "world",
                "   Intro to  coMPUter   	sCIEncE   ",
                // Add more test cases as needed
        };

        String result = StringOps.camelCase(testCases[inputNumber - 1]);
        System.out.println(result);
    }

    private static void testAllIndexOf(int inputNumber) {
        String[] strings = {
                "Hello world",
                "Hello worLd",
                "Hello world",
                "Hello world",
                "MMMM",
                // Add more test cases as needed
        };
        char[] characters = {'l', 'l', 'o', ' ', 'M', 'M'};
    
        int[][] expectedResults = {
                {2, 3, 9},
                {2, 3},
                {4, 7},
                {5},
                {0, 1, 2, 3}
        };
    
        int[] result = StringOps.allIndexOf(strings[inputNumber - 1], characters[inputNumber - 1]);
    
        System.out.println(Arrays.toString(result));
    }
}
