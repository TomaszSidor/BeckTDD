public class Franc extends Money{


    Franc(int amount, String currency){
       super(amount, currency);

    }

//    Money times (int multiplier) {
//
//        return new Money(amount * multiplier, currency );
//    }

    String currency(){
        return currency;
    }
}
