package co.solver.mongoRepository.bag.data;

import co.solver.element.entity.Element;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Bag")
public class BagDTO {
    @Id
    private String id;
    private Element[] elements;
    private Integer weight;
}
