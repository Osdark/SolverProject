package co.solver.history.entity;

import co.solver.file.entity.ProjectFile;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class History {
    private String id;
    private ProjectFile projectFile;
    private String userId;
}
