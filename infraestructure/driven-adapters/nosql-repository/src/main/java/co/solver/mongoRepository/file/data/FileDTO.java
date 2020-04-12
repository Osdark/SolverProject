package co.solver.mongoRepository.file.data;

import co.solver.workDay.entity.WorkDay;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "File")
public class FileDTO {
    @Id
    private String id;
    private Integer days;
    private WorkDay[] workDays;
}
