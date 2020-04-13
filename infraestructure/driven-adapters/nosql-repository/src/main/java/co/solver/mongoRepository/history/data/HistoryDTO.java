package co.solver.mongoRepository.history.data;

import co.solver.file.entity.ProjectFile;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "History")
public class HistoryDTO {
    private String id;
    private ProjectFile projectFile;
    private String userId;
}
