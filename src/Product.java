import java.util.Comparator;

public class Product {
    private String id;
    private String name;
    private double price;
    public static Comparator<Product> comparator = (o1, o2) -> {
        double price1 = o1.getPrice();
        double price2 = o2.getPrice();
        return Double.compare(price1, price2);
    };

    public Product(String id, String name, double price){
            this.id = id;
            this.name = name;
            this.price = price;
        }

        public String getId () {
            return id;
        }

        public void setId (String id){
            this.id = id;
        }

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public double getPrice () {
            return price;
        }

        public void setPrice ( double price){
            this.price = price;
        }

        @Override
        public String toString () {
            return "Product{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
