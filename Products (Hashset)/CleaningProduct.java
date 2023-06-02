public class CleaningProduct extends Product{
    private String surfacetype;
    private String scent;
    private boolean biodegradable;

    public CleaningProduct(String surfacetype, String scent, boolean biodegradable) {
        super();
        this.surfacetype = surfacetype;
        this.scent = scent;
        this.biodegradable = biodegradable;
    }


    public String getSurfacetype() {
        return surfacetype;
    }

    public void setSurfacetype(String surfacetype) {
        this.surfacetype = surfacetype;
    }

    public String getScent() {
        return scent;
    }

    public void setScent(String scent) {
        this.scent = scent;
    }

    public boolean isBiodegradable() {
        return biodegradable;
    }

    public void setBiodegradable(boolean biodegradable) {
        this.biodegradable = biodegradable;
    }
    public void print_info(){
        super.print_info();
        System.out.println("Surface Type:"+this.surfacetype);
        System.out.println("Scent: "+this.scent);
        if(this.biodegradable){
            System.out.println("Biodegradable: Yes");
        }else System.out.println("Biodegradable: No");
    }
}
