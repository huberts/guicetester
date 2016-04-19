package models

import com.google.inject.Inject
import play.api.Logger

/**
  * Created by hswietlicki on 2016-04-13.
  */
class Test1 @Inject() (module1: Module1) {

  def run() = {
    Logger.info("Test 1 Run")
    Logger.info(module1.stringFromModule1)
  }

}
