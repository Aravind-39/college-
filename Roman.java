mport java.util.Scanner;

class Main {
    public static int getValue(char letter) {
        switch (letter) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static int romanToNumber(String roman) {
        int number = 0;
        for (int i = 0; i < roman.length(); i++) {
            int current = getValue(roman.charAt(i));
            if (i + 1 < roman.length() && current < getValue(roman.charAt(i + 1))) {
                number = number - current;
            } else {
                number = number + current;
            }
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Roman number: ");
        String roman = input.nextLine().toUpperCase();
        int result = romanToNumber(roman);
        System.out.println("Number is: " + result);
        input.close();
    }
}
