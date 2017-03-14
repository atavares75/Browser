/**
 * Created by atava on 12/13/2016.
 */
public class LowerRateException extends Exception{
    Double oldRate;
    Double newRate;

    LowerRateException(Double oldRate, Double newRate){
        this.oldRate=oldRate;
        this.newRate=newRate;
    }

}
