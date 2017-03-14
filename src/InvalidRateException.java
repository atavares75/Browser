/**
 * Created by atava on 12/14/2016.
 */
public class InvalidRateException extends Exception{
    Double rate;

    InvalidRateException(Double rate){
        this.rate=rate;
    }

}
