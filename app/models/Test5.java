package models;

import com.google.inject.Inject;
import play.Logger;

/**
 * Created by hswietlicki on 2016-04-13.
 */
public class Test5 {

    private Module5 module5;

    @Inject
    public Test5(Module5 module5) {
        this.module5 = module5;
    }

    public void run() {
        Logger.info("Test 5 Run");
        Logger.info(module5.stringFromModule5());

    }

}
