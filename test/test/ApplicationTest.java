package test;

import org.junit.Test;
import play.twirl.api.Content;

import static org.fest.assertions.Assertions.assertThat;
import static play.test.Helpers.contentAsString;
import static play.test.Helpers.contentType;


/**
 * Simple (JUnit) tests that can call all parts of a play app.
 * If you are interested in mocking a whole application, see the wiki for more details.
 */
public class ApplicationTest {

  /**
   * Tests that 1+1 equals 2.
   */
  @Test
  public void simpleCheck() {
    int a = 1 + 1;
    assertThat(a).isEqualTo(2);
  }

  /**
   * Tests that the Index template renders correctly.
   */
  @Test
  public void renderIndexTemplate() {
    Content html = views.html.Index.render("A history of browsers");
    assertThat(contentType(html)).isEqualTo("text/html");
    assertThat(contentAsString(html)).contains("A history of browsers");
  }

  /**
   * Tests that the Firefox template renders correctly.
   */
  @Test
  public void renderFirefoxTemplate() {
    Content html = views.html.Firefox.render("A brief history of Mozilla Firefox");
    assertThat(contentType(html)).isEqualTo("text/html");
    assertThat(contentAsString(html)).contains("A brief history of Firefox");
  }

  /**
   * Tests that the Internet Explorer template renders correctly.
   */
  @Test
  public void renderIETemplate() {
    Content html = views.html.IE.render("A brief history of Internet Explorer");
    assertThat(contentType(html)).isEqualTo("text/html");
    assertThat(contentAsString(html)).contains("A brief history of IE");
  }

  /**
   * Tests that the Chrome template renders correctly.
   */
  @Test
  public void renderChromeTemplate() {
    Content html = views.html.Chrome.render("A brief history of Google Chrome");
    assertThat(contentType(html)).isEqualTo("text/html");
    assertThat(contentAsString(html)).contains("A brief history of Chrome");
  }

}
