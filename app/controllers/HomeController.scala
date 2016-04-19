package controllers

import javax.inject._

import models._
import play.api._
import play.api.inject.Injector
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject() (module1: Module1, module5: Module5)(implicit injector: Injector) extends Controller {

  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index = Action {
    Logger.info("Start Testow")
    val test1 = new Test1(module1)
    test1.run()

    val test2 = new Test2
    test2.run()

    val test3 = injector.instanceOf[Test3]
    test3.run()

    val test4 = new Test4
    test4.run()

    val test5 = new Test5(module5)
    test5.run()

    val test6 = injector.instanceOf[Test6]
    test6.run()

    Ok("")
  }

}
