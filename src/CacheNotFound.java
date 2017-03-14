/**
 * Created by atava on 12/6/2016.
 */
public class CacheNotFound extends Exception {
    String query;

    CacheNotFound(String query){
        this.query=query;
    }
}
