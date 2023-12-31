package week_09.assignments;

public class QuadraticEquation {

    // Implement QuadradticEquation class

        /** Data fields */
        // represent three coeficients
        private double a;
        private double b;
        private double c;

        /** Constructor for the arguments for a, b, and c */
        QuadraticEquation(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }


        /** Returns a */
        public double getA() {
            return a;
        }

        /** Returns b */
        public double getB() {
            return b;
        }

        /** Returns c */
        public double getC() {
            return c;
        }

        /** Returns the discriminant */
        public double getDiscriminant() {
            return Math.pow(b, 2) - 4 * a * c;
        }

        /** Returns root1 */
        public double getRoot1() {
            return getDiscriminant() < 0 ? 0 :
                    ((-b) + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        }

        /** Returns root2 */
        public double getRoot2() {
            return getDiscriminant() < 0 ? 0 :
                    ((-b) - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        }

}
