// Part B

public class Food {
    private String name;
    private int energyRating, happinessRating, weightGain;

    public Food(String name, int energyRating, int happinessRating, int weightGain){
        this.name = name;
        this.energyRating=energyRating;
        this.happinessRating=happinessRating;
        this.weightGain=weightGain;
    }
    public String getName() {

        return name;
    }
    public void setName(String name) {

        this.name = name;
    }
    public int getEnergyRating() {

        return energyRating;
    }
    public void setEnergyRating(int energyIncrease) {

        this.energyRating = energyIncrease;
    }
    public int getHappinessRating() {

        return happinessRating;
    }
    public void setHappinessRating(int happinessIncrease) {

        this.happinessRating = happinessIncrease;
    }
    public int getWeightGain() {

        return weightGain;
    }
    public void setWeightGain(int weightGain) {
        this.weightGain = weightGain;
    }
}
