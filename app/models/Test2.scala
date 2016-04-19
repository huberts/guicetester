package models

import play.api.Logger

/**
  * Created by hswietlicki on 2016-04-13.
  */
class Test2 {
  def run() = {
    Logger.info("Test 2 Run")
    val module2 = new Module2Impl
    Logger.info(module2.stringFromModule2)
  }
}
