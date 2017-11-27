import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ThumbnailVideo {
    public String url;
    public int width;
    public int height;
}
