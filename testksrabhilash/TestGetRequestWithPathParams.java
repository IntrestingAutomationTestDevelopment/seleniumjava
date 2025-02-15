/*
 * package testksrabhilash;
 * 
 * import static org.testng.Assert.assertEquals;
 * 
 * 
 * import org.testng.annotations.Test;
 * 
 * import io.restassured.RestAssured; import io.restassured.response.Response;
 * //import org.junit.jupiter.api.Test; //import static
 * org.junit.jupiter.api.Assertions.assertEquals;
 * 
 * public class TestGetRequestWithPathParams {
 * 
 * @Test public void testGetRequestWithPathParam() { // Define the API URL with
 * a path parameter String url =
 * "https://jsonplaceholder.typicode.com/posts/{id}";
 * 
 * // Send GET request with path parameter Response response =
 * RestAssured.given().pathParam("id", 1) // Path parameter substitution
 * .get(url);
 * 
 * // Assert status code is 200 assertEquals(200, response.statusCode(),
 * "Expected status code 200");
 * 
 * // Assert response contains the expected 'id' as path parameter
 * assertEquals(1, response.jsonPath().getInt("id"), "Expected id to be 1");
 * 
 * System.out.println("GET Request with Path Parameter Test Passed!"); } }
 */
/**
*
**/