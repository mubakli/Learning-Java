import java.util.ArrayList;
import java.util.List;

// Main sınıfı
public class Main {
    public static void main(String[] args) {
        // Örnek kullanım
        List<Customer> customers = new ArrayList<>();
        Customer customer1 = new Customer("Ahmet", "Yılmaz", "ahmet@example.com", "Premium");
        Customer customer2 = new Customer("Ayşe", "Kara", "ayse@example.com", "Silver");
        customers.add(customer1);
        customers.add(customer2);

        double totalPrice = 100.0;

        for (Customer customer : customers) {
            double discount = Discount.calculateDiscount(customer, totalPrice);
            double finalPrice = totalPrice - discount - Discount.calculateGeneralDiscount(totalPrice);
            String message = "Total Price: " + totalPrice + "\n" +
                    "Discount Applied: " + discount + "\n" +
                    "Final Price: " + finalPrice;
            MailSender.sendMail(customer.getEmail(), message);
        }
    }
}
class Customer {
    private String firstName;
    private String lastName;
    private String email;
    private String membershipType;

    // Constructor
    public Customer(String firstName, String lastName, String email, String membershipType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.membershipType = membershipType;
    }

    // Getter ve Setter metotları
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }
}

// İndirim (Discount) sınıfı
class Discount {
    private static final double PREMIUM_DISCOUNT_RATE = 0.20;
    private static final double GOLD_DISCOUNT_RATE = 0.15;
    private static final double SILVER_DISCOUNT_RATE = 0.10;
    private static final double GENERAL_DISCOUNT_RATE = 0.10;

    // İndirim hesaplama metotları
    public static double calculateDiscount(Customer customer, double totalPrice) {
        double discount = 0.0;
        if (customer.getMembershipType().equalsIgnoreCase("Premium")) {
            discount = totalPrice * PREMIUM_DISCOUNT_RATE;
        } else if (customer.getMembershipType().equalsIgnoreCase("Gold")) {
            discount = totalPrice * GOLD_DISCOUNT_RATE;
        } else if (customer.getMembershipType().equalsIgnoreCase("Silver")) {
            discount = totalPrice * SILVER_DISCOUNT_RATE;
        }
        return discount;
    }

    // Genel indirim metodu
    public static double calculateGeneralDiscount(double totalPrice) {
        return totalPrice * GENERAL_DISCOUNT_RATE;
    }
}

// MailSender sınıfı
class MailSender {
    // Mail gönderme metodu
    public static void sendMail(String email, String message) {
        // Burada gerçek bir mail gönderme işlemi yapılabilir.
        System.out.println("Mail sent to: " + email);
        System.out.println("Message: " + message);
    }
}