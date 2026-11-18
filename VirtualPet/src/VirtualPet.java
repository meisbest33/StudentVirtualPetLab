// Part A

public class VirtualPet {
    private String name;
    private int energyLvl, happyLvl, weight, ageYear, ageMonth;

    public VirtualPet(String name){
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

    public void feed(){
        if(energyLvl <=9) {
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

    public void play(){
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


