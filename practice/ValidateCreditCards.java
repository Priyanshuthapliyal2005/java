
import java.util.Scanner;

class CreditCard {
    String cardNumber;

    CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    boolean isValid() {
        return false;
    }
}

class MasterCard extends CreditCard {
    MasterCard(String cardNumber) {
        super(cardNumber);
    }

    @Override
    boolean isValid() {
        return cardNumber.matches("^5[1-5]\\d{14}$");
    }
}

class Visa extends CreditCard {
    Visa(String cardNumber) {
        super(cardNumber);
    }

    @Override
    boolean isValid() {
        return cardNumber.matches("^4\\d{12}(\\d{3})?$");
    }
}

class AmericanExpress extends CreditCard {
    AmericanExpress(String cardNumber) {
        super(cardNumber);
    }

    @Override
    boolean isValid() {
        return cardNumber.matches("^3[47]\\d{13}$");
    }
}

public class ValidateCreditCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input credit card numbers
        System.out.print("Enter MasterCard number: ");
        String masterCardNumber = scanner.nextLine();

        System.out.print("Enter Visa number: ");
        String visaNumber = scanner.nextLine();

        System.out.print("Enter American Express number: ");
        String amexNumber = scanner.nextLine();

        scanner.close();

        // Validate credit cards
        CreditCard masterCard = new MasterCard(masterCardNumber);
        CreditCard visa = new Visa(visaNumber);
        CreditCard amex = new AmericanExpress(amexNumber);

        // Display validation results
        System.out.println("MasterCard valid? " + masterCard.isValid());
        System.out.println("Visa valid? " + visa.isValid());
        System.out.println("American Express valid? " + amex.isValid());

        // Display credits
        System.out.println("\n");
        System.out.println("********************************************************************");
        System.out.println("Implemented by : Priyanshu Thapliyal \tBtech CSE\tA2\t 46");
        System.out.println("********************************************************************");
        System.out.println("\n");
    }
}
