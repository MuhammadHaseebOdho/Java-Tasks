public class Main {

    ProductInventory productInventory_obj=new ProductInventory();

    // Test Case 1
    public void testAddProduct(Product pr) {
        if (productInventory_obj.addProduct(pr)) {
            System.out.println("Test Case 1: Pass");
        } else
            System.out.println("Test Case 1: Fail");
    }

    // Test Case 2
    public void testRemoveProduct(Product pr) {
        if (productInventory_obj.removeProduct(pr)) {
            System.out.println("Test Case 2: Pass");
        } else
            System.out.println("Test Case 2: Fail");
    }

    // Test Case 3
    public void testSearchProductForExitingProduct(String name) {
        if (productInventory_obj.searchProduct(name) ) {
            System.out.println("\nTest Case 3: Pass");

        } else
            System.out.println("Test Case 3: Fail");
    }

    // Test Case 4
    public void testSearchProductForNonExitingProduct(String name) {
        if (productInventory_obj.searchProduct(name) ) {
            System.out.println("\nTest Case 4: Pass");

        } else
            System.out.println("Test Case 4: Fail");
    }

    // Test Case 5
    public void testPrintInfoOfClothing(ClothingProduct clothing) {
        clothing.print_info();
        System.out.println("Test Case 5: Pass\n");
    }

    // Test Case 6
    public void testPrintInfoOfSkincare(SkincareProduct skincare) {
        skincare.print_info();
        System.out.println("Test Case 6: Pass\n");
    }

    // Test Case 7
    public void testPrintInfoOfCleaning(CleaningProduct cleaning) {
        cleaning.print_info();
        System.out.println("Test Case 7: Pass\n");
    }

    // Test Case 8
    public void testPrintInfoOfElectronic(ElectronicProduct electronic) {
        electronic.print_info();
        System.out.println("Test Case 8: Pass\n");
    }

    // Test Case 9
    public void testPrintInfoOfPlant(PlantProduct plant) {
        plant.print_info();
        System.out.println("Test Case 9: Pass\n");
    }

    // Test Case 10
    public void testEcoFriendlyClothingInfo(String type) {
        productInventory_obj.ecoFriendlyInfo(type);
    }

    // Test Case 11
    public void testEcoFriendlySkincareInfo(String type) {
        productInventory_obj.ecoFriendlyInfo(type);
    }

    // Test Case 12
    public void testEcoFriendlyCleaningInfo(String type) {
        productInventory_obj.ecoFriendlyInfo(type);
    }



    public static void main(String[] args) {

        ClothingProduct clothing_obj1 = new ClothingProduct("M", "Organic Cotton", "Green", "Casual");
        Product pr_obj1= new Product("Eco T-Shirt", "OrganicWear", 25.99f, "Clothing", true, clothing_obj1);

        SkincareProduct skincareProduct_obj1 = new SkincareProduct("Normal", "None", false);
        Product pr_obj2 = new Product("Shampoo", "Pantene", 8.99f, "Skincare", false, skincareProduct_obj1);
        CleaningProduct cln1 = new CleaningProduct("Multi-Surface", "Lavender", false);
        Product pr_obj3 = new Product("All-Purpose Cleaner", "Clorox", 4.99f, "Cleaning", false, cln1);
        ElectronicProduct el1 = new ElectronicProduct("AC", true, true);
        Product pr_obj4 = new Product("Smart Speaker", "Amazon", 99.99f, "Electronic", false, el1);
        PlantProduct pl1 = new PlantProduct("Ceramic", "Low", "Succulent");
        Product pr_obj5 = new Product("Snake Plant", "Plants R Us", 24.99f, "Plant", true, pl1);

        Main main_obj=new Main();
        main_obj.testAddProduct(pr_obj1);
        main_obj.testAddProduct(pr_obj2);
        main_obj.testAddProduct(pr_obj3);
        main_obj.testAddProduct(pr_obj4);
        main_obj.testAddProduct(pr_obj5);
        main_obj.testRemoveProduct(pr_obj5);
        main_obj.testSearchProductForExitingProduct("Shampoo");
        main_obj.testSearchProductForNonExitingProduct("Snake Plant");
        main_obj.testPrintInfoOfClothing(clothing_obj1);
        main_obj.testPrintInfoOfSkincare(skincareProduct_obj1);
        main_obj.testPrintInfoOfCleaning(cln1);
        main_obj.testPrintInfoOfElectronic(el1);
        main_obj.testPrintInfoOfPlant(pl1);
        main_obj.testEcoFriendlyClothingInfo("clothing");
        main_obj.testEcoFriendlyCleaningInfo("Cleaning");
        main_obj.testEcoFriendlySkincareInfo("skincare");
    }
}