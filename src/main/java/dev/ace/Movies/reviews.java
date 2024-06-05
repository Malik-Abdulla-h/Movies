package dev.ace.Movies;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="movies")
@AllArgsConstructor
@NoArgsConstructor
public class reviews {
    @Id
    private ObjectId id;
    private String body;
}

