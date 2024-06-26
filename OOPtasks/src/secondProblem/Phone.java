package secondProblem;
public class Phone {

    private final String model;
    private final int year;
    private final double price;
    private static int phoneCount = 0;

    {
        phoneCount++;
    }

    public Phone(String model, int year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public Phone(String model, int year) {
        this(model, year, 0.0); 
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }


    public double getPrice() {
        return price;
    }

    public static int getPhoneCount() {
        return phoneCount;
    }

    public void displayPhoneInfo() {
        System.out.println("Model: " + this.getModel());
        System.out.println("Year: " + this.getYear());
        System.out.println("Price: $" + this.getPrice());
    }

    public void displayPhoneInfo(boolean includePrice) {
        if (includePrice) {
            displayPhoneInfo();
        } else {
            System.out.println("Model: " + this.getModel());
            System.out.println("Year: " + this.getYear());
        }
    }

    public static void main(String[] args) {

        Phone phone1 = new Phone("iPhone 13", 2021, 799.99);
        Phone phone2 = new Phone("Galaxy S21", 2021, 699.99);
        Phone phone3 = new Phone("Pixel 6", 2021);

        phone1.displayPhoneInfo(true);
        phone2.displayPhoneInfo();
        phone3.displayPhoneInfo(false);

        System.out.println("Total phones in stock: " + Phone.getPhoneCount());
    }
}