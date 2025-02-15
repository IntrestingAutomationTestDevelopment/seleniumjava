/*
 * package testksrabhilash; import static org.testng.Assert.assertEquals; import
 * org.testng.annotations.Test; import Utilities.Base; import
 * io.restassured.RestAssured; import io.restassured.http.ContentType; import
 * io.restassured.response.Response; //import org.junit.jupiter.api.Test;
 * //import static org.junit.jupiter.api.Assertions.assertEquals;
 * 
 * public class PostRequestTesting { //extends Base {
 * 
 * public static void main(String[] args) { testPostRequest(); } //@Test public
 * static void testPostRequest() { // Define the API URL String url =
 * "https://jsonplaceholder.typicode.com/posts";
 * 
 * // Prepare JSON data to send in the POST request String requestBody = "{\n" +
 * "  \"title\": \"foo\",\n" + "  \"body\": \"bar\",\n" + "  \"userId\": 1\n" +
 * "}";
 * 
 * // Send POST request Response response =
 * RestAssured.given().contentType(ContentType.JSON).body(requestBody).post(url)
 * ;
 * 
 * // Assert status code is 201 (Created) assertEquals(201,
 * response.statusCode(), "Expected status code 201");
 * 
 * // Assert response contains the expected 'title' assertEquals("foo",
 * response.jsonPath().getString("title"), "Expected title to be 'foo'");
 * 
 * System.out.println("POST Request Test Passed!"); } }
 */