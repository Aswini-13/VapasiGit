package Response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DuplicateBookResponse {
    @JsonProperty("msg")
    private String msg;
    @JsonProperty("ID")
    private String id;
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
}

