public class Main {
    public static void main(String[] args) {
        Product product=new Product(1,"Laptop","Asus Laptop",3000,2,"Kırmızı");
//        product.set_name("Laptop");
//        product.set_id(1);
//        product.set_description("Asus Laptop");
//        product.set_price(15000);
//        product.set_stockAmount(15);

        ProductManager productManager=new ProductManager();
        productManager.Add(product);
        System.out.println(product.get_kod());

    }
}