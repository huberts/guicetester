package models

/**
  * Created by hswietlicki on 2016-04-13.
  */
trait Module2 {
  def stringFromModule2: String
}

class Module2Impl extends Module2 {
  override def stringFromModule2: String = "String from module 2"
}

