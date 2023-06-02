public class Product {
    private String name;
    private String brand;
    private float price;
    private String type;
    private boolean eco_friendly;

    private ClothingProduct clothingProduct;
    private SkincareProduct skincareProduct;
    private  ElectronicProduct electronicProduct;
    private CleaningProduct cleaningProduct;
    private PlantProduct plantProduct;

    public Product() {

    }

    public SkincareProduct getSkincareProduct() {
        return skincareProduct;
    }

    public void setSkincareProduct(SkincareProduct skincareProduct) {
        this.skincareProduct = skincareProduct;
    }

    public ElectronicProduct getElectronicProduct() {
        return electronicProduct;
    }

    public void setElectronicProduct(ElectronicProduct electronicProduct) {
        this.electronicProduct = electronicProduct;
    }

    public CleaningProduct getCleaningProduct() {
        return cleaningProduct;
    }

    public void setCleaningProduct(CleaningProduct cleaningProduct) {
        this.cleaningProduct = cleaningProduct;
    }

    public PlantProduct getPlantProduct() {
        return plantProduct;
    }

    public void setPlantProduct(PlantProduct plantProduct) {
        this.plantProduct = plantProduct;
    }

    public ClothingProduct getClothingProduct() {
        return clothingProduct;
    }

    public void setClothingProduct(ClothingProduct clothingProduct) {
        this.clothingProduct = clothingProduct;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isEco_friendly() {
        return eco_friendly;
    }

    public void setEco_friendly(boolean eco_friendly) {
        this.eco_friendly = eco_friendly;
    }

    public Product(String name, String brand, float price, String type, boolean eco_friendly) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.type = type;
        this.eco_friendly = eco_friendly;
    }

    public Product(String name, String brand, Float price, String type, Boolean eco_friendly,
                   ClothingProduct clothing) {
        super();
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.type = type;
        this.eco_friendly = eco_friendly;
        this.clothingProduct = clothing;
    }

    public Product(String name, String brand, Float price, String type, Boolean eco_friendly,
                   SkincareProduct skincare) {
        super();
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.type = type;
        this.eco_friendly = eco_friendly;
        this.skincareProduct = skincare;
    }

    public Product(String name, String brand, Float price, String type, Boolean eco_friendly,
                   CleaningProduct cleaning) {
        super();
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.type = type;
        this.eco_friendly = eco_friendly;
        this.cleaningProduct = cleaning;
    }

    public Product(String name, String brand, Float price, String type, Boolean eco_friendly, PlantProduct plant) {
        super();
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.type = type;
        this.eco_friendly = eco_friendly;
        this.plantProduct = plant;
    }


    public Product(String name, String brand, Float price, String type, Boolean eco_friendly,
                   ElectronicProduct electronic) {
        super();
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.type = type;
        this.eco_friendly = eco_friendly;
        this.electronicProduct = electronic;
    }


    public void print_info(){
        System.out.println("Name: "+this.name);
        System.out.println("Brand: "+this.brand);
        System.out.println("Price: "+this.price);
        System.out.println("Type: "+this.type);
        if(this.eco_friendly){
            System.out.println("Eco-Friendly: Yes");
        }else System.out.println("Eco-Friendly: No");
    }

    public boolean getEco_friendly() {
        return eco_friendly;
    }
}
