package cn.com.bosi.itms.web.vo;

public class Response<T> {

    private int status = 1000;
    private String message;
    private T data;
    private long timestamp;

    public Response() {
        this.message = "success";
        this.timestamp = System.currentTimeMillis();
    }

    public Response(T data) {
        this.message = "success";
        this.data = data;
        this.timestamp = System.currentTimeMillis();
    }

    public Response(T data, String message) {
        this.message = message;
        this.data = data;
        this.timestamp = System.currentTimeMillis();
    }

    public int getStatus() {
        return this.status;
    }

    public String getMessage() {
        return this.message;
    }

    public T getData() {
        return this.data;
    }

    public long getTimestamp() {
        return this.timestamp;
    }
}
