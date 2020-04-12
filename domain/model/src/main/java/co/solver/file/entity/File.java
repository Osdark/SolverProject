package co.solver.file.entity;

import co.solver.workDay.entity.WorkDay;
import lombok.*;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class File {
    private Integer days;
    private WorkDay[] workDays;
}
