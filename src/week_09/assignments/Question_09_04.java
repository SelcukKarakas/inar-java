package week_09.assignments;

public class Question_09_04 {


        /** Main method */
        public static void main(String[] args) {
            // Create a Random object with seed 1000
            java.util.Random randomNumber = new java.util.Random(1000);

            // Displays the first 50 random integers between 0 and 100
            for (int i = 1; i <= 50; i++) {
                if (i % 10 == 0)
                    System.out.printf("%5d\n", randomNumber.nextInt(100));
                else
                    System.out.printf("%5d", randomNumber.nextInt(100));
            }
        }

}
