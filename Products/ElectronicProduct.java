public class ElectronicProduct extends Product{
    private String  powersource;
    private boolean energyefficient;
    private boolean smarthomecompatible;

    public String getPowersource() {
        return powersource;
    }

    public void setPowersource(String powersource) {
        this.powersource = powersource;
    }

    public boolean isEnergyefficient() {
        return energyefficient;
    }

    public void setEnergyefficient(boolean energyefficient) {
        this.energyefficient = energyefficient;
    }

    public boolean isSmarthomecompatible() {
        return smarthomecompatible;
    }

    public void setSmarthomecompatible(boolean smarthomecompatible) {
        this.smarthomecompatible = smarthomecompatible;
    }

    public ElectronicProduct(String powersource, boolean energyefficient, boolean smarthomecompatible) {
        super();
        this.powersource = powersource;
        this.energyefficient = energyefficient;
        this.smarthomecompatible = smarthomecompatible;
    }

    public void print_info(){
        super.print_info();
        System.out.println("Power source: "+this.powersource);
        if(this.energyefficient){
            System.out.println("Energy Sufficient: Yes");
        }else System.out.println("Energy Sufficient: No");

        if(this.smarthomecompatible){
            System.out.println("Smart Home Compatible: Yes");
        }else System.out.println("Smart Home Compatible: No");
    }
}
