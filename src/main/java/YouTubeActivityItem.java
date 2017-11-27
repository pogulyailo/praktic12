import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class YouTubeActivityItem {
        public String videolId;

        public Thumbnails thumbnails;
    }
