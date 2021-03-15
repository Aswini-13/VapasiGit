package Response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetBookResponse {
    @JsonProperty("book_name")
    private String bookName;
    private String isbn;
    private String aisle;
    @JsonProperty("author")
    private String authorName;

    public String getName() {
        return this.bookName;
    }
    public void setName(String bookName) {
        this.bookName = bookName;
    }
    public String getIsbn() {
        return this.isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getAisle() {
        return this.aisle;
    }
    public void setAisle(String aisle) {
        this.aisle = aisle;
    }
    public String getAuthor() {
        return this.authorName;
    }
    public void setAuthor(String authorName) {
        this.authorName = authorName;
    }
}
