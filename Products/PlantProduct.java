public class PlantProduct extends Product{
    private String pottype;
    private String sunlightneeds;
    private String typeofplant;

    public String getPottype() {
        return pottype;
    }

    public void setPottype(String pottype) {
        this.pottype = pottype;
    }

    public String getSunlightneeds() {
        return sunlightneeds;
    }

    public void setSunlightneeds(String sunlightneeds) {
        this.sunlightneeds = sunlightneeds;
    }

    public String getTypeofplant() {
        return typeofplant;
    }

    public void setTypeofplant(String typeofplant) {
        this.typeofplant = typeofplant;
    }

    public PlantProduct( String pottype, String sunlightneeds, String typeofplant) {
        super();
        this.pottype = pottype;
        this.sunlightneeds = sunlightneeds;
        this.typeofplant = typeofplant;
    }

    public void print_info(){
        super.print_info();
        System.out.println("Pot Type:"+this.pottype);
        System.out.println("Sun Light Needs: "+this.sunlightneeds);
        System.out.println("Plant Type: "+this.typeofplant);
    }
}
