
import pl.com.jnachyla.amountcounter.AmountCounter;
import pl.com.jnachyla.amountcounter.DataReader;

public class Main {

    public static void main(String[] args) {

        DataReader dataReader = new DataReader(args[0]);

        AmountCounter ac = new AmountCounter(dataReader.getList());

        System.out.println("Suma kwot  = " + ac.computeSumAmmounts());
    }
}
