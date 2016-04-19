package models

/**
  * Created by hswietlicki on 2016-04-13.
  */
trait Module3 {
  def stringFromModule3: String
}

class Module3Impl extends Module3 {
  override def stringFromModule3: String = "String from module 3"
}

