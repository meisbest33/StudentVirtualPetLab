// Part B
public class VirtualPetB {
    private String name;
    private int energyLvl, happyLvl, weight, ageYear, ageMonth;


    public VirtualPetB(String name){
        this.name = name;
        weight = 5;
        energyLvl = 0;
        happyLvl = 0;
        ageYear = 0;
        ageMonth = 0;
    }

    public String getName(){
        return name;
    }
    public String toString(){
        return name + "'s status: Energy level: " + energyLvl + " Happiness level: " + happyLvl + " Weight: " + weight + " Age: " + ageYear + "years(s) and " + ageMonth + "months(s)";
    }

    public void feed(Food other){
        energyLvl += other.getEnergyRating();
        happyLvl += other.getHappinessRating();
        weight += other.getWeightGain();

        if(energyLvl > 10){
            energyLvl = 10;
        }
        if(energyLvl < 0){
            energyLvl = 0;
        }
        if(happyLvl > 10){
            happyLvl = 10;
        }
        if(happyLvl < 0){
            happyLvl = 0;
        }
        if(weight < 5){
            weight = 5;
        }
    }

    public int getEnergyLevel(){
        return energyLvl;
    }

    public int getHappinessLevel(){

        return happyLvl;
    }

    public boolean play(Game other){
        boolean won = other.isWinner();

        weight -= other.getWeightLoss();

        if(won){
            happyLvl += other.getHappinessIncr();
        }
        else{
            happyLvl -= other.getHappinessIncr();
        }

        if(weight < 5){
            weight = 5;
        }
        if(happyLvl > 10){
            happyLvl = 10;
        }
        if(happyLvl < 0){
            happyLvl = 0;
        }
        return won;
    }

    public void updateStatus(){
        if(happyLvl>=1){
            happyLvl--;
        }
        if(energyLvl>=1){
            energyLvl--;
        }
        ageMonth++;
        if(ageMonth>=12){
            ageMonth-=12;
            ageYear++;
        }
    }
}
