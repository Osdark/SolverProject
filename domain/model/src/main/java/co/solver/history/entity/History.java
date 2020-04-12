package co.solver.history.entity;

import co.solver.file.entity.File;
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
    private File file;
    private String userId;
}
