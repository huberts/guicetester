package models

import com.google.inject.Inject
import play.api.Logger

/**
  * Created by hswietlicki on 2016-04-13.
  */
class Test3 @Inject()(module3: Module3) {
  def run() = {
    Logger.info("Test 3 Run")
    Logger.info(module3.stringFromModule3)


  }

}
