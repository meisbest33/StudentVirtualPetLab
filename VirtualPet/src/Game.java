// Part B

public class Game {
    private String name;
    private int happinessIncr, weightLoss;

    public Game(String name, int happinessIncr, int weightLoss){
        this.name = name;
        this.happinessIncr=happinessIncr;
        this.weightLoss=weightLoss;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHappinessIncr() {
        return happinessIncr;
    }

    public void setHappinessIncr(int happinessIncr) {
        this.happinessIncr = happinessIncr;
    }

    public int getWeightLoss() {
        return weightLoss;
    }

    public void setWeightLoss(int weightDecr) {
        this.weightLoss = weightDecr;
    }

    public boolean isWinner(){
        if (Math.random() < .5) {
            return true;
        }
        else{
            return false;
        }
    }
}
