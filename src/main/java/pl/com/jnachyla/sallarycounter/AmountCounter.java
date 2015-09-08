package pl.com.jnachyla.sallarycounter;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jarek on 2015-09-08.
 */
public class AmountCounter {

    private List<Float> amounts = new ArrayList();

    public AmountCounter(List<String> records){
        createAmmounts(records);
    }

    private void createAmmounts(List<String> records) {

        for (String record : records){
            String[] attribites =  record.split("@");
            for (String attr : attribites){
                if (attr.contains("amount:")){
                    String amount = attr.substring(6, attr.length());
                    try {
                        amounts.add(Float.parseFloat(prepareAmoount(amount)));}
                    catch (Exception e){
                        System.out.println("Blad pobierania danych dla rekordu:"+record);
                    }
                }

            }
        }
    }

    private String prepareAmoount(String amount) {
        return amount.trim().replaceAll("PLN","");
    }

    ;


    public Float computeSumAmmounts(){
        Float sum  = 0.0f;
        for (Float ammount : amounts){
            sum += ammount;
        }
        return sum;
    };

}
