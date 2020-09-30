package swapi.tests.planet;

import org.junit.Test;

import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.*;

public class PlanetDataTest {
    @Test
    public void thirdPlanetData() {
        when().get("https://swapi.dev/api/planets/3").
                then().statusCode(200).
                assertThat().
                body("climate", containsString("tropical")).
                body( "name", equalTo("Yavin IV"));
    }
}
