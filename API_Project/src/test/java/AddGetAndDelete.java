import Request.AddBookRequest;
import Request.DeleteBookRequest;
import Response.AddBookResponse;
import Response.DuplicateBookResponse;
import Response.DeleteBookResponse;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.Random;

import static io.restassured.RestAssured.given;


public class AddGetAndDelete {

    public AddBookResponse add(String bookName, String isbn, String aisle, String authorName){
        RestAssured.baseURI = "http://216.10.245.166";
        AddBookRequest addBookRequest = new AddBookRequest();
        addBookRequest.setName(bookName);
        addBookRequest.setIsbn(isbn);
        addBookRequest.setAisle(aisle);
        addBookRequest.setAuthor(authorName);

        Response addResponse = given().header("Content-Type", "application/json")
                .body(addBookRequest)
                .when().post("/Library/Addbook.php")
                .then().log().all()
                .assertThat().statusCode(200).extract().response();
        return addResponse.body().as(AddBookResponse.class);
    }

    public Response get(String strKey, String strValue){
        Response getResponse = given().queryParam(strKey, strValue)
                .header("Content-Type", "application/json")
                .when().get("/Library/GetBook.php")
                .then().log().all()
                .assertThat().statusCode(200).extract().response();
        return getResponse;
    }

    public DuplicateBookResponse duplicate(String bookName, String isbn, String aisle, String authorName){
        RestAssured.baseURI = "http://216.10.245.166";
        AddBookRequest addBookRequest = new AddBookRequest();
        addBookRequest.setName(bookName);
        addBookRequest.setIsbn(isbn);
        addBookRequest.setAisle(aisle);
        addBookRequest.setAuthor(authorName);

        Response duplicateResponse = given().header("Content-Type", "application/json")
                .body(addBookRequest)
                .when().post("/Library/Addbook.php")
                .then().log().all()
                .assertThat().statusCode(404).extract().response();

        return duplicateResponse.body().as(DuplicateBookResponse.class);
    }

    public DeleteBookResponse deleteBook(String id){

        DeleteBookRequest deleteBookRequest = new DeleteBookRequest();
        deleteBookRequest.setId(id);
        Response deleteResponse = given().header("Content-Type", "application/json")
                .body(deleteBookRequest)
                .when().post("/Library/DeleteBook.php")
                .then()
                .assertThat().statusCode(200).extract().response();

        return deleteResponse.body().as(DeleteBookResponse.class);
    }
    public String getRandomString(){
        Random random = new Random();
        int intRandom = random.nextInt(1000);
        return ""+intRandom;
    }

}
