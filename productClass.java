public class productClass {
    public static class Product {
        int product_id;
        String product_name;
        float price;
        String category;
        
        public Product(int product_id, String product_name, float price, String category) {
            this.product_id = product_id;
            this.product_name = product_name;
            this.price = price;
            this.category = category;
        }

        public void displayProductInfo() {
            System.out.println(product_name + "'s price is " + price + " and it's category is " + category + ". ID: "+product_id);
        }
    }

    public static void main(String[] args) {
        Product product1 = new Product(0, "Table", 36000, "Furniture");
        Product product2 = new Product(1, "Chair", 30000, "Furniture");
        Product product3 = new Product(2, "Monitor", 300000, "Electronics");

        System.out.println("Displaying product 1");
        product1.displayProductInfo();
        System.out.println("Displaying product 2");
        product2.displayProductInfo();
        System.out.println("Displaying product 3");
        product3.displayProductInfo();

    }
}
