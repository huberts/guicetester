package models;

import com.google.inject.Inject;
import play.Logger;

/**
 * Created by hswietlicki on 2016-04-13.
 */
public class Test6 {

    @Inject
    private Module6 module6;

    public void run() {
        Logger.info("Test 6 Run");
        Logger.info(module6.stringFromModule6());
    }
}
