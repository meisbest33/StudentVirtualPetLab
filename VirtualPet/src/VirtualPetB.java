// Part B

public class VirtualPetB {
    private String name;
    private int energyLvl, happyLvl, weight, ageYear, ageMonth;

    Food obj = new Food();

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

        int energy = 0;
        if(energy <=9) {
            energyLvl++;
        }
        weight ++;
    }

    public int getEnergyLevel(){

        return energyLvl;
    }

    public int getHappinessLevel(){

        return happyLvl;
    }

    public boolean play(Game other){
        int getWeight =
        if(happyLvl<=9){
            happyLvl++;
        }
        if(weight>=6){
            weight--;
        }


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