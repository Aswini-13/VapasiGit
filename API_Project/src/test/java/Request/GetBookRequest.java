package Request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetBookRequest {
    @JsonProperty("ID")
    private String id;
    @JsonProperty("AuthorName")
    private String author;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}

