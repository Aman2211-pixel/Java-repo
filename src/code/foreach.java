package code;

public class foreach {
    public static void main(String[] args) {
        int[] numbersArray = new int[5];
        numbersArray[0] = 10;
        numbersArray[1] = 20;
        numbersArray[2] = 30;
        numbersArray[3] = 40;
        numbersArray[4] = 50;
        for (int number : numbersArray) {
            System.out.println(number);
        }
    }
}
