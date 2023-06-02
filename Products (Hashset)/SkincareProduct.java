public class SkincareProduct extends Product{
    private String skintype;
    private String TargetConcerns;
    private boolean fragrance;

    public String getSkintype() {
        return skintype;
    }

    public void setSkintype(String skintype) {
        this.skintype = skintype;
    }

    public String getTargetConcerns() {
        return TargetConcerns;
    }

    public void setTargetConcerns(String targetConcerns) {
        TargetConcerns = targetConcerns;
    }

    public boolean isFragrance() {
        return fragrance;
    }

    public void setFragrance(boolean fragrance) {
        this.fragrance = fragrance;
    }

    public boolean isFragrancefree() {
        return fragrance;
    }

    public void setFragrancefree(boolean fragnancefree) {
        this.fragrance = fragnancefree;
    }

    public SkincareProduct( String skintype, String targetConcerns, boolean fragrance) {
        super();
        this.skintype = skintype;
        this.TargetConcerns = targetConcerns;
        this.fragrance = fragrance;
    }

    public void print_info(){
        super.print_info();
        System.out.println("Skin Type: "+this.skintype);
        System.out.println("Target Concerns: "+this.TargetConcerns);
        if (this.fragrance) {
            System.out.println("Fragrance Free: Yes");
        }else
            System.out.println("Fragrance Free: No");
    }
}
