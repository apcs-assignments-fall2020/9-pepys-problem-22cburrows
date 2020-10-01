public class MyMain {

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        double ave = 0;
        for (int i = 0; i < 10; i++){
            int probs = 0;
            for (int j = 0; j < 6; i ++){
                int num = (int) ((Math.random() * 6) + 1);
                if (num == 6){
                    probs += 1;
                }
                else{

                }
            ave = (double) ((ave + (probs/6)) / 2);
        }
        }
        return (ave * 100);
    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        double ave = 0;
        for (int i = 0; i < 10; i++){
            int probs = 0;
            for (int j = 0; j < 12; i ++){
                int num = (int) ((Math.random() * 6) + 1);
                if (num == 6){
                    probs += 1;
                }
                else{

                }
            ave = (double) ((ave + (probs/6)) / 2);
        }
        }
        return (ave * 100);
    }

    // Calculate the probability of rolling at least three 6's when rolling 
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        double ave = 0;
        for (int i = 0; i < 10; i++){
            int probs = 0;
            for (int j = 0; j < 18; i ++){
                int num = (int) ((Math.random() * 6) + 1);
                if (num == 6){
                    probs += 1;
                }
                else{

                }
            ave = (double) ((ave + (probs/6)) / 2);
        }
        }
        return (ave * 100);
    }


    public static void main(String[] args) {
        System.out.println(probabilityOneSix());
        System.out.println(probabilityTwoSixes());
        System.out.println(probabilityThreeSixes());
    }
}
