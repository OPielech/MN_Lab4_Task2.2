public class Main {


    public static void main(String[] args) {

        RegulaFalsi test = new RegulaFalsi(-1, 3, 0.01, 1000, 0.6, x -> x = Math.exp(-x) - x);
//        new FixedPointsIteration(10, 0.0001, 1000, x -> x = Math.exp(-x) - x).solver();
//        new NewtonRaphsonMethod(10, 0.0001, 1000, x -> x = Math.exp(-x) - x).solver();
//        new SecandMethod(10, 0.00001, 1000, x -> x = Math.exp(-x) - x).solver();

        float result = (float) test.solver();
        System.out.println(result);

    }//end of main
}
