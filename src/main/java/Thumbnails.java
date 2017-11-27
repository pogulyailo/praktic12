import com.fasterxml.jackson.annotation.JsonProperty;

public class Thumbnails {

        @JsonProperty("default")
        public ThumbnailVideo _default;
        public ThumbnailVideo medium;
        public ThumbnailVideo high;
        public ThumbnailVideo standard;
        public ThumbnailVideo maxres;
    }
