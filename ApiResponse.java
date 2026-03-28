import java.util.List;
import java.util.Map;

public class ApiResponse {

    public String status;
    public String request_id;
    public Parameters parameters;
    public Data data;

    public static class Parameters {
        public String asin;
        public String country;
        public String language;
    }

    public static class Data {
        public String asin;
        public String country;
        public String domain;
        public Map<String, Integer> rating_distribution;
        public List<Review> reviews;
    }

    public static class Review {
        public String review_id;
        public String review_title;
        public String review_comment;
        public String review_star_rating;
        public String review_link;
        public String review_author_id;
        public String review_author;
        public String review_author_url;
        public String review_author_avatar;

        public List<String> review_images;
        public String review_video;

        public String review_date;
        public boolean is_verified_purchase;
        public String helpful_vote_statement;

        public String reviewed_product_asin;
        public ReviewedProductVariant reviewed_product_variant;

        public boolean is_vine;
    }

    public static class ReviewedProductVariant {
        public String Size;
        public String Color;
        public String service_provider;
        public String product_grade;
    }
}