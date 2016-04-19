package models

/**
  * Created by hswietlicki on 2016-04-13.
  */

trait Module1 {
  def stringFromModule1: String
}


class Module1Impl extends Module1 {
  override def stringFromModule1: String = "String from module 1"
}
