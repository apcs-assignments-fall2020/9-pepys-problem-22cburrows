public class MyMain {

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        int probs = 0;
        for (int i = 0; i < 100000; i++){
            for (int j = 0; j < 6; j++){
                int num = (int) ((Math.random() * 6) + 1);
                if (num == 6){
                    probs += 1;
                    break;
                }
        }
        }
        return (probs/100000.0 * 100);
    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        int probs = 0;
        for (int i = 0; i < 100000; i++){
            int c = 0;
            for (int j = 0; j < 12; j++){
                int num = (int) ((Math.random() * 6) + 1);
                if (num == 6 && c == 1){
                    probs += 1;
                    break;
                }
                else if (num == 6){
                    c += 1;
                }
            }
        }
        return (probs/100000.0 * 100);
    }

    // Calculate the probability of rolling at least three 6's when rolling 
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        int probs = 0;
        for (int i = 0; i < 100000; i++){
            int c = 0;
            for (int j = 0; j < 18; j++){
                int num = (int) ((Math.random() * 6) + 1);
                if (num == 6 && c == 2){
                    probs += 1;
                    break;
                }
                else if (num == 6){
                    c += 1;
                }
            }
        }
        return (probs/100000.0 * 100);
    }


    public static void main(String[] args) {
        System.out.println("Probability of rolling at least one 6 when rolling six dice: " + probabilityOneSix());
        System.out.println("Probability of rolling at least two 6's when rolling twelve dice: " + probabilityTwoSixes());
        System.out.println("Probability of rolling at least three 6's when rolling eighteen dice: " + probabilityThreeSixes());
    }
}
