import Response.AddBookResponse;
import Response.DuplicateBookResponse;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DuplicateBookTest {
    @Test
    public void verifyDuplicateBook(){
        AddGetAndDelete book = new AddGetAndDelete();
        String strAisle = book.getRandomString();

        AddBookResponse addBookResponse = book.add("New Rest API","12345",strAisle,
                "LudovicDewailly");
        Assert.assertEquals(addBookResponse.getMsg(),"successfully added",
                "Add Book msg is incorrect");

        Response getBookResponse = book.get("ID",addBookResponse.getId());
        Assert.assertEquals(getBookResponse.asString(),
                "[{\"book_name\":\"New Rest API\",\"isbn\":\"12345\",\"aisle\":\""+strAisle+"\",\"author\":\"LudovicDewailly\"}]");

        DuplicateBookResponse duplicateBookResponse = book.duplicate("New Rest API","12345",strAisle,
                "LudovicDewailly");
        Assert.assertEquals(duplicateBookResponse.getMsg(),"Add Book operation failed, looks like the book already exists", "Get Duplicate book msg is incorrect");

    }
}

