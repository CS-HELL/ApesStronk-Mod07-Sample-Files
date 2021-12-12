import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Solutions Class
 */
public class Solutions {

    /**
     * Main Method used to run other methods.
     *
     * @param args template.
     */
    public static void main(String[] args) {
        System.out.println("Watermelon Test");
        System.out.println(Solutions.Watermelon(8));
        System.out.println();

        System.out.println("Digits Sum Test");
        System.out.println(Arrays.toString(Solutions.DigitsSum(5, new int[]{1, 9, 10, 34, 880055535})));
        System.out.println();

        System.out.println("In Search Of An Easy Problem Test");
        System.out.println(Solutions.InSearchOfFanEasyProblem(3, new int[]{0,0,1}));
        System.out.println();

        System.out.println("Vus The Cos Sack and A Contest Test");
        System.out.println(Solutions.VusTheCossackAndAContest(4,4,5));
        System.out.println();

        System.out.println("Word Correction Test");
        System.out.println(Solutions.WordCorrection(4, "word"));
        System.out.println();

        System.out.println("Binary Decimal Test");
        System.out.println(Solutions.BinaryDecimal(3, new int[]{121, 5, 1000000000}));
        System.out.println();

        System.out.println("New Year and Counting Test");
        System.out.println(Solutions.NewYearAndCountingCard("ee"));
        System.out.println();

        System.out.println("I am Bored with LIFE Test");
        System.out.println(Solutions.IAmBoredWithLife(3, 4));
        System.out.println();

        System.out.println("Way Too Long Words Test");
        System.out.println(Arrays.toString(Solutions.WayTooLongWords(4, new String[]{"word", "localization", "internationalization", "pneumonoultramicroscopicsilicovolcanoconiosis"})));
        System.out.println();

        System.out.println("\nBoy Or Girl Test");
        System.out.println(Solutions.BoyOrGirl("wjmzbmr"));
        System.out.println("\n");

        System.out.println("Luck Ticket Test");
        System.out.println(Solutions.LuckyTicket(6, 474747));
        System.out.println();

        System.out.println("Fake News Test");
        System.out.println(Solutions.FakeNews("heidi"));
        System.out.println();

        System.out.println("Domino Piling Test");
        System.out.println("Test 1:");
        System.out.println(Solutions.DominoPiling(2,4));
        System.out.println("\nTest 2:");
        System.out.println(Solutions.DominoPiling(3,3));
        System.out.println("\n");

        System.out.println("\nBall Game Test");
        System.out.println("Test 1:");
        System.out.println(Solutions.BallGame(10));
        System.out.println("\nTest 2:");
        System.out.println(Solutions.BallGame(3));
        System.out.println("\n");
    }

    /**
     * Codeforces Problem #1553A - Digits Sum
     *
     * @param t     is the total space.
     * @param input is the user inputs.
     * @return output int array.
     */
    static int[] DigitsSum(int t, int[] input) {
        int[] output = new int[t];
        for (int i = 0; i < t; i++) {
            int k = input[i];
            int j = (k + 1) / 10;
            System.out.println(j);
            output[i] = j;
        }
        return output;
    }

    /**
     * Codeforces Problem #4A - Watermelon
     *
     * @param x is the input.
     * @return the string yes or no.
     */
    static String Watermelon(int x) {
        if (x % 2 == 0 && x > 2) {
            System.out.println("YES");
            return "YES";
        } else {
            System.out.println("NO");
            return "NO";
        }
    }

    /**
     * Codeforces Problem #1030A - In search of an easy problem
     *
     * @param t is the space.
     * @param c is the inputs.
     * @return string easy or hard.
     */
    static String InSearchOfFanEasyProblem(int t, int[] c) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < t; i++) {
            int k = c[i];
            if (k == 1) {
                System.out.print("HARD");
                return "HARD";
            }
        }
        System.out.print("EASY");
        return "EASY";
    }

    /**
     * Codeforces Problem #1530A - Binary Decimal
     *
     * @param t     is the space.
     * @param input is the inputs.
     * @return int array of outputs.
     */
    static int[] BinaryDecimal(int t, int[] input) {
        int[] output = new int[t];
        for (int i = 0; i < t; ++i) {
            int n = input[i];
            int ini = String.valueOf(n).chars().map(ch -> ch - '0').max().getAsInt();

            System.out.println(ini);

            output[i] = ini;
        }
        return output;
    }

    /**
     * Codeforces Problem #236A - Boy Or Girl
     *
     * @param s is the string
     * @return string chat with her or ignore him! Ara ara
     */
    static String BoyOrGirl(String s) {
        char test[];
        int arrayInt[];
        int count = 0;

        Scanner scan = new Scanner(System.in);
        test = s.toCharArray();
        arrayInt = new int[100];

        String Even = "CHAT WITH HER!";
        String Odd = "IGNORE HIM!";
        for (char c : test) {
            arrayInt[c - 'a']++;
        }
        for (int i : arrayInt) {
            if (i != 0) {
                count++;
            }
        }
        if (count % 2 == 0) {
            System.out.print(Even);
            return Even;
        } else {
            System.out.print(Odd);
            return Odd;
        }
    }

    /**
     * Codeforces Problem #71A - Way too long words
     *
     * @param t     is the space.
     * @param words is the array of word inputs.
     * @return string array outputs.
     */
    static String[] WayTooLongWords(int t, String[] words) {
        String[] output = new String[t];

        for (int i = 0; i < t; i++) {
            String word = words[i];

            int n = word.length();

            if (n < 11) {
                System.out.println(word);
                output[i] = word;
            } else {
                char ch = word.charAt(0);
                char ch1 = word.charAt(n - 1);
                System.out.print(ch);
                System.out.print(n - 2);
                System.out.println(ch1);
                output[i] = ch + "" + (n - 2) + ch1;
            }
        }
        return output;
    }

    /**
     * Codeforces Problem #938A - Word Correction
     *
     * @param n is the space.
     * @param s is the input.
     * @return the string.
     */
    public static String WordCorrection(int n, String s) {
        boolean lastIsVowel = false;
        Scanner scanner = new Scanner(System.in);
        while (s.length() != n) {
            s = scanner.next();
        }
        do {
            ArrayList<Character> characterArrayList = new ArrayList<>();
            StringBuilder stringBuilder = new StringBuilder();
            int i = 0;
            for (char c : s.toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'y' || c == 'u') {
                    if (lastIsVowel) {
                        //do something here
                    } else {
                        lastIsVowel = true;
                        i++;
                        characterArrayList.add(c);
                    }

                } else {
                    lastIsVowel = false;
                    characterArrayList.add(c);
                    i++;
                }
            }
            for (char c : characterArrayList) {
                stringBuilder.append(c);
                s = stringBuilder.toString();
            }
            if (i == s.length()) {
                s = stringBuilder.toString();
                System.out.println(s);
                return s;
            }
            lastIsVowel = false;
        } while (true);
    }

    /**
     * Codeforces Problem #1186A - Vus the Cossack and a Contest
     *
     * @param n is an input.
     * @param m is an input.
     * @param k is an input
     * @return string of yes or no.
     */
    public static String VusTheCossackAndAContest(int n, int m, int k) {
        if (m - n >= 0 && k - n >= 0) {
            System.out.println("Yes");
            return "Yes";
        } else {
            System.out.println("No");
            return "No";
        }
    }

    /**
     * Codeforces Problem #908A - New Year and Counting Cards
     *
     * @param s is an input.
     * @return string output.
     */
    public static String NewYearAndCountingCard(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case '1':
                case '3':
                case '5':
                case '7':
                case '9':
                    count++;
                    break;
                default:
                    //nothing
            }
        }
        System.out.println(count);
        return "" + count;
    }

    /**
     * Codeforces Problem #822A - I Am Bored With Life
     *
     * @param y is an input.
     * @param z is an input.
     * @return string output.
     */
    public static String IAmBoredWithLife(int y, int z) {
        int Afact = 1;
        for (int i = 1; i <= y; i++) {
            Afact = Afact * i;
        }

        int Bfact = 1;
        for (int i = 1; i <= z; i++) {
            Bfact = Bfact * i;
        }

        int gcd = 1;
        for (int i = 1; i <= Afact && i <= Bfact; i++) {
            if (Afact % i == 0 && Bfact % i == 0)
                gcd = i;
        }

        System.out.println(gcd);
        return "" + gcd;
    }

    /**
     * Codeforces Problem #146A - Lucky Ticket
     *
     * @param i is an input.
     * @param j is an input.
     * @return string output.
     */
    public static String LuckyTicket(int i, int j) {
        int tmp = 0;
        boolean lucky = false;
        int length = i / 2;
        int f = 0;
        int l = 0;
        while (j > 0) {
            tmp = j % 10;
            j /= 10;
            if (tmp == 4 || tmp == 7) {
                lucky = true;
                if (String.valueOf(j).length() < length) {
                    f = f + tmp;
                } else {
                    l = l + tmp;
                }
            } else {
                lucky = false;
                break;
            }
        }
        if (!lucky || i == 2) {
            System.out.println("NO");
            return "NO";
        } else {
            System.out.println("YES");
            return "YES";
        }
    }

    /**
     * Codeforces Problem #82G - Fake News (easy)
     *
     * @param s is an input.
     * @return string output.
     */
    public static String FakeNews(String s) {
        char[] heidiArray = new char[5];
        int i = 0;
        for (char c : s.toCharArray()) {
            if (c == 'h' || c == 'e' || c == 'i' || c == 'd') {
                heidiArray[i] = c;
                i++;
            }
        }
        String checker = Arrays.toString(heidiArray);
        checker = checker.replace(",", "");
        checker = checker.replace("[", "");
        checker = checker.replace("]", "");
        checker = checker.replace(" ", "");
        if (checker.equals("heidi")) {
            System.out.println("YES");
            return "YES";
        } else {
            System.out.println("NO");
            return "NO";
        }
    }

    /**
     * Codeforces Problem #50A - Domino Piling
     * @param a is an input.
     * @param b is an input.
     * @return the int answer.
     */
    static int DominoPiling(int a, int b) {
        int ans = (a*b)/2; // Should be 2
        System.out.print(ans);
        return ans;
    }

    /**
     * Codeforces Problem #50A - Domino Piling
     * @param n is an input.
     * @return the int answer.
     */
    static String BallGame(int n) {
        String output = null;
        String previous = "";
        int p=1; // Should be 1
        int c;

        for(c=1; c<=n-1;c++){
            p=p+c;
            if(p>n){
                p=p-n;

            }

            System.out.printf("%d ", p);
            output = previous + p + " ";
            previous = output;
        }
        return output.trim();
    }
}
