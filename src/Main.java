import java.io.FileNotFoundException;
import java.util.LinkedList;

/**
 * Created by atava on 12/5/2016.
 */
public class Main {
    public static void main(String[] args) throws UnsupportedFileExn, FileNotFoundException {
        LinkedList<String> init=new LinkedList<>();
        SearchEngine B= new SearchEngine(init);
        BrowserWindow C=new BrowserWindow(B);
        C.screen();
    }

}
