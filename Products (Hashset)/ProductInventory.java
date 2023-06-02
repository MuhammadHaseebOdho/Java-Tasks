
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProductInventory {
    private Set<Product> products;

     Scanner sc=new Scanner(System.in);


    public ProductInventory(){
        products=new HashSet<>();
    }

    public boolean addProduct(Product product){
        return products.add(product);
    }
    public boolean removeProduct(Product product){
       return products.remove(product);
    }
    public boolean searchProduct(String search){
        //boolean found=false;
        for(Product products: products){
            if(products.getName().equalsIgnoreCase(search)){

                if(products.getType().equalsIgnoreCase("Clothing")){
                    products.getClothingProduct().print_info();
                } else if (products.getType().equalsIgnoreCase("Plant") ){
                    products.getPlantProduct().print_info();
                } else if (products.getType().equalsIgnoreCase("Skincare") ){
                    products.getSkincareProduct().print_info();
                } else if (products.getType().equalsIgnoreCase("Cleaning") ){
                    products.getCleaningProduct().print_info();
                } else if (products.getType().equalsIgnoreCase("Electronic") ){
                    products.getElectronicProduct().print_info();
                }
                return true;
            } else if (!products.getName().equalsIgnoreCase(search)) {
                System.out.println("Product Not Found ");
                return false;

            }
        }
        return false;
    }

    public void ecoFriendlyInfo(String type) {
        for (Product product : products) {
            if (product.getType().equals(type) && product.getEco_friendly()) {
                product.print_info();
                System.out.println();

            }
        }
    }
}

