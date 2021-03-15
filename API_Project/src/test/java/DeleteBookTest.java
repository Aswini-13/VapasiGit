import Response.AddBookResponse;
import Response.DeleteBookResponse;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteBookTest {
    @Test
    public void verifyDeleteBook(){
        AddGetAndDelete book = new AddGetAndDelete();
        String strAisle = book.getRandomString();

        AddBookResponse addBookResponse = book.add("New Rest API","12345",strAisle,
                "LudovicDewailly");
        Assert.assertEquals(addBookResponse.getMsg(),"successfully added",
                "Add Book msg is incorrect");

        Response getBookResponse = book.get("ID",addBookResponse.getId());
        Assert.assertEquals(getBookResponse.asString(),
                "[{\"book_name\":\"New Rest API\",\"isbn\":\"12345\",\"aisle\":\""+strAisle+"\",\"author\":\"LudovicDewailly\"}]");

        DeleteBookResponse deleteBookResponse = book.deleteBook(addBookResponse.getId());
        System.out.println("deleteBookResponse:"+deleteBookResponse.getMsg() );
        Assert.assertEquals(deleteBookResponse.getMsg(),"book is successfully deleted", "Delete Book msg is incorrect");

        AddBookResponse reAddBookResponse = book.add("New Rest API","12345",strAisle,
                "LudovicDewailly");
        Assert.assertEquals(reAddBookResponse.getMsg(),"successfully added",
                "Add Book msg is incorrect");

        Response getBookResponse1 = book.get("ID",addBookResponse.getId());
        Assert.assertEquals(getBookResponse1.asString(),
                "[{\"book_name\":\"New Rest API\",\"isbn\":\"12345\",\"aisle\":\""+strAisle+"\",\"author\":\"LudovicDewailly\"}]");
    }
}
