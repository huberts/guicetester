package models

import com.google.inject.Inject
import play.api.Logger
import play.api.inject.Injector

/**
  * Created by hswietlicki on 2016-04-13.
  */
class Test4 @Inject()(implicit injector: Injector) {
  def run() = {
    Logger.info("Test 4 Run")
    val module4 = injector.instanceOf[Module4]
    Logger.info(module4.stringFromModule4)


  }

}
