package week_10.assignments;

public class Question_10_10 {


        /** Main method */
        public static void main(String[] args) {
            // Create a Queue object
            Queue queue = new Queue();

            // Adds 20 numbers from 1 to 20 into the queue
            for (int i = 1; i <= 20; i++) {
                queue.enqueue(i);
            }

            // Removes these numbers and displays them
            while (!queue.empty()) {
                System.out.print(queue.dequeue() + " ");
            }
            System.out.println();
        }

}
