package live.socialmedia.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LiveStatus {

    private String timestamp;
    private boolean available;

    public LiveStatus(String timestamp, boolean available) {
        this.timestamp = timestamp;
        this.available = available;
    }

    @JsonProperty(value = "timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty(value = "available")
    public String isAvailable() {
        return available ? "yes" : "no";
    }

}
