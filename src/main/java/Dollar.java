public class Dollar extends Money{


    Dollar(int amount, String currency){
        super(amount, currency);
    }

    Money times (int multiplier){

        return Money.dollar(amount * multiplier );
    }
    String currency(){
        return currency;
    }



    //todo Co z zaokrąglaniem
    //todo hashCode()

    //todo porownanie z nullem
    // todo porownanie z obiektem


    //todo 5USD + 10CHF = 10 USD przy kursie USD:CHF 2:1
}

