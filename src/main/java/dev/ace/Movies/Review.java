package dev.ace.Movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
@Data
@AllArgsConstructor
public class Review {
    @Id
    private ObjectId id;

    private String userId;

    private String movieId;

    private String content;

    private int rating;
}
