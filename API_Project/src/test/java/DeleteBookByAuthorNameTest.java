import Response.AddBookResponse;
import Response.GetBookResponse;
import Response.DeleteBookResponse;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteBookByAuthorNameTest {
    @Test
    public void verifyDeleteBookByAuthorName(){
        AddGetAndDelete book = new AddGetAndDelete();
        String strAisle1 = book.getRandomString();
        String strAisle2 = book.getRandomString();
        String strAisle3 = book.getRandomString();

        AddBookResponse[]addBookResponse = new AddBookResponse[3];
        addBookResponse[0] = book.add("New Rest API","123",strAisle1,
                "boxomAsh");
        Assert.assertEquals(addBookResponse[0].getMsg(),"successfully added",
                "Add Book msg is incorrect");

        addBookResponse[1] = book.add("Rest API","231",strAisle2,
                "boxomAsh");
        Assert.assertEquals(addBookResponse[1].getMsg(),"successfully added",
                "Add Book msg is incorrect");

        addBookResponse[2] = book.add("API","312",strAisle3,
                "boxomAsh");
        Assert.assertEquals(addBookResponse[2].getMsg(),"successfully added",
                "Add Book msg is incorrect");

        Response getBookResponse = book.get("AuthorName","boxomAsh");
        GetBookResponse[] bookByAuthor= getBookResponse.as(GetBookResponse[].class);
        for( GetBookResponse res :bookByAuthor) {
            System.out.println("Book name :" + res.getName());
        }
        Assert.assertEquals(bookByAuthor.length,3);

        DeleteBookResponse deleteBookResponse = book.deleteBook(addBookResponse[0].getId());
        System.out.println("deleteBookResponse:"+deleteBookResponse.getMsg() );
        Assert.assertEquals(deleteBookResponse.getMsg(),"book is successfully deleted", "Delete Book msg is incorrect");

        Response getCurrentBookResponse = book.get("AuthorName","boxomAsh");
        GetBookResponse[] currentBookByAuthor= getCurrentBookResponse.as(GetBookResponse[].class);
        for( GetBookResponse res :currentBookByAuthor) {
            System.out.println("Book name :" + res.getName());
        }

        Assert.assertEquals(currentBookByAuthor.length,2);

        //Deleting all the books created in this test for clean-up
        DeleteBookResponse deleteBookResponse1 = book.deleteBook(addBookResponse[1].getId());
        DeleteBookResponse deleteBookResponse2 = book.deleteBook(addBookResponse[2].getId());

    }
}
