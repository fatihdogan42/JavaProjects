package javaforandroid;

public class JavaForAndroid {

    public static void main(String[] args) {
        // TODO code application logic here
        listProduct();
    }

    static void listProduct()
    {
        try {
            Product[] items = {
                    new Product(1, "Milk", 21.50),
                    new Product(2, "Butter", 15.99),
                    new Product(3, "Yogurt", 14.90),
                    new Product(4, "Toothpaste", 7.99),
                    new Product(5, "Ice Cream", 10.00),
            };

            for(Product p:items)
                System.out.println(p.toString());
        }
        catch (Exception ex)
        {
            System.out.println(ex.toString());
        }
    }
}
