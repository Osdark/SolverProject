package co.solver.file.entity;

import co.solver.workDay.entity.WorkDay;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class ProjectFile {
    private List<WorkDay> workDays;
}
