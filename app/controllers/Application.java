package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.Chrome;
import views.html.Index;
import views.html.IE;
import views.html.Firefox;

/**
 * Provides controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page.
   * @return The resulting home page.
   */
  public static Result index() {
    return ok(Index.render("A history of browsers."));
  }

  /**
   * Returns the IE page.
   *
   * @return The resulting IE page.
   *
   */

  public static Result ie() {
    return ok(IE.render("A brief history of Internet Explorer"));
  }

  /**
   * Returns the Firefox page.
   *
   * @return The resulting Firefox page.
   *
   */

  public static Result firefox() {
    return ok(Firefox.render("A brief history of Mozilla Firefox"));
  }

  /**
   * Returns the Chrome page.
   *
   * @return The resulting Chrome page.
   *
   */

  public static Result chrome() {
    return ok(Chrome.render("A brief history of Google Chrome"));
  }

}
