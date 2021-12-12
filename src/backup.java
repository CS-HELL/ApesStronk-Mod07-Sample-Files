import java.util.Scanner;

/**
 * Solutions Class
 */
public class backup {

    /**
     * Main Method used to run other methods.
     * @param args template
     */
    public static void main(String[] args){

    }

    /**
     * Codeforces Problem #1530A - Binary Decimal
     * @return
     */
    int BinaryDecimal(){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for (int i = 0; i < t; ++i) {
            int n = input.nextInt();
            System.out.println(String.valueOf(n).chars().map(ch -> ch - '0').max().getAsInt());
        }
        return t;
    }

    /**
     * Codeforces Problem #236A - Boy Or Girl
     */
    static void BoyOrGirl(){
        char test[];
        int arrayInt[];
        int count = 0;

        Scanner scan = new Scanner(System.in);
        test = scan.next().toCharArray();
        arrayInt = new int[100];

        String Even = "CHAT WITH HER!";
        String Odd = "IGNORE HIM!";
        for (char c: test) {
            arrayInt[c - 'a']++;
        }
        for (int i : arrayInt) {
            if (i != 0) {
                count++;
            }
        }
        if (count % 2 == 0) {
            System.out.print(Even);
        } else {
            System.out.print(Odd);
        }
    }

    /**
     * Codeforces Problem #1553A - Digits Sum
     * @return
     */
    static int[] DigitsSum(int t, int[] input){
        int[] output = new int[t];
        for(int i = 0; i < t; i++){
            int k = input[i];
            int j = (k+1)/10;
            System.out.println(j);
            output[i] = j;
        }
        return output;
    }

    /**
     * Codeforces Problem #1030A - In search of an easy problem
     */
    static void InSearchOfFanEasyProblem(){
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        for(int i=0; i<test; i++){
            int c;
            c = scan.nextInt();
            if(c==1){
                System.out.print("HARD");
                System.exit(0);
            }
        }
        System.out.print("EASY");
        return;
    }

    /**
     * Codeforces Problem #1598A - Computer Game
     */
    static void JavaGame(){
        Scanner scan = new Scanner(System.in);
        Scanner scanString = new Scanner(System.in);

        int iteration = scan.nextInt();

        for(int count = 0; count < iteration; count++){
            int column = scan.nextInt();
            String[][] level = new String[2][column];

            String rowValue = scanString.nextLine();
            char[] rowValueChar = rowValue.toCharArray();
            String rowValueTwo = scanString.nextLine();
            char[] rowValueCharTwo = rowValueTwo.toCharArray();


            for (int i = 0; i < column; i++) {
                level[0][i] = String.valueOf(rowValueChar[i]);
                level[1][i] = String.valueOf(rowValueCharTwo[i]);
            }
            boolean playerStatus = isTrapped(column, level);

            if(playerStatus){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }

    /**
     * Codeforces Problem #1555A - Pizza Forces
     */
    static void PizzaForces(){
        System.out.println("How many guests?");
        Scanner scan = new Scanner(System.in);
        int amountOfPizzaNeeded = scan.nextInt();
        System.out.println(quotientWholeNumber(amountOfPizzaNeeded));
    }

    /**
     * Codeforces Problem #4A - Watermelon
     */
    static void Watermelon(){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if(number >=1 && number <=100){
            if(number % 2 == 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }

    /**
     * Codeforces Problem #71A - Way too long words
     */
    static void WayTooLongWords(){
        Scanner scan = new Scanner(System.in);
        Scanner scanTwo = new Scanner(System.in);

        String word;
        String midLength;
        String finalWord;

        int iterations = scanTwo.nextInt();

        for (int count = 0; count < iterations; count++){

            word = scan.nextLine();

            if(word.length() >= 10){
                midLength = Integer.toString(word.length() - 2);
                finalWord = word.charAt(0) + midLength + word.charAt(word.length()-1);
                System.out.println(finalWord);
            }else{
                System.out.println(word);
            }
        }
    }


    /**
     * Continuation Method of Codeforces Problem #1598A - Computer Game
     * @param column is the first parameter.
     * @param level is the second parameter.
     * @return true or false.
     */
    public static boolean isTrapped (int column, String[][] level){

        String[][] currentPosition = level;

        currentPosition[0][0] = level[0][0];

        if(currentPosition[0][0].equals("1") || currentPosition[1][column-1].equals("1")){
            return true;
        }

        for(int count = 0; count < column; count++){

            if(currentPosition[0][count].equals(currentPosition[1][count]) && currentPosition[0][count].equals("1")){
                return true;
            }
        }
        return false;
    }

    /**
     * Continuation Method 1 of Codeforces Problem #1555A - Pizza Forces
     * @param amountOfPizzaNeeded is the first parameter.
     * @return total time.
     */
    public static int quotientWholeNumber(int amountOfPizzaNeeded){
        int time = 0;

        if(amountOfPizzaNeeded%6 == 0){
            return (amountOfPizzaNeeded/6)*15;
        }else if(amountOfPizzaNeeded%8 == 0 ){
            return (amountOfPizzaNeeded/8)*20;
        }else if(amountOfPizzaNeeded%10 == 0){
            return (amountOfPizzaNeeded/10)*25;
        }else{
            time = computation(amountOfPizzaNeeded);
        }
        return time;
    }
    /**
     * Continuation Method 2 of Codeforces Problem #1555A - Pizza Forces
     * @param mod is the first parameter.
     * @return total time.
     */
    public static int moduloChecker(int mod){
        int time = 0;

        if(mod <= 6){
            time= 15;
        }else if(mod <= 8 && mod > 6){
            time= 20;
        }else if(mod <= 10 && mod > 8){
            time=25;
        }
        return time;
    }
    /**
     * Continuation Method 3 of Codeforces Problem #1555A - Pizza Forces
     * @param amountOfPizzaNeeded is the first parameter.
     * @return total time.
     */
    public static int computation(int amountOfPizzaNeeded){

        int n1 = amountOfPizzaNeeded/6;
        int n2 = amountOfPizzaNeeded/8;
        int n3 = amountOfPizzaNeeded/10;
        int time = 0;

        if (n1 < n2 && n1 < n3){
            if(amountOfPizzaNeeded%6!=0){
                time = n1*15+moduloChecker(amountOfPizzaNeeded%6);
            }else{
                time = n1*15;
            }
        }else if(n2 < n1 && n2 < n3 || n1 == n2){

            if(amountOfPizzaNeeded%8!=0){
                time = n2*20+moduloChecker(amountOfPizzaNeeded%8);
            }else{
                time = n2*20;
            }
        }else if(n3 < n2 && n3 < n1 || n3 == n2){

            if(amountOfPizzaNeeded%10!=0){
                time = n3*25+moduloChecker(amountOfPizzaNeeded%10);
            }else{
                time = n3*25;
            }
        }
        return time;
    }
}