import java.util.*;

class credit{
    String card;
    credit(String card){
        this.card=card;
    }
    boolean isValid(){
        return false;
    }
}

class Master extends credit{
    Master(String card){
        super(card);
    }
    boolean isValid(){
        if(card.length()==16 && card.charAt(0)== '5' && card.charAt(1)<='5' ){
            return true;
        }else{
            return false;
        }
    }
}

class visa extends credit{
    visa(String card){
        super(card);
    }
    @Override
    boolean isValid(){
        if(card.length()==16 && card.charAt(0)== '4'){
            return true;
        }else{
            return false;
        }
    }
}

class american extends credit{
    american(String card){
        super(card);
    }
    @Override
    boolean isValid(){
        if(card.length()==15 && (card.startsWith("34")||card.startsWith("37"))){
            return true;
        }
        else{
            return false;
        }
    }
}
public class valid {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter master number: ");
        String masterNumber = sc.nextLine();

        System.out.print("Enter visa number: ");
        String visaNumber = sc.nextLine();

        System.out.print("Enter American Express number: ");
        String amexNumber = sc.nextLine();

        
        // Validate credit cards
        credit master = new Master(masterNumber);
        credit visa = new visa(visaNumber);
        credit amex = new american(amexNumber);

        // Display validation results
        System.out.println("master valid? " + master.isValid());
        System.out.println("visa valid? " + visa.isValid());
        System.out.println("American Express valid? " + amex.isValid());

    }
}
