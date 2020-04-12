package co.solver.workDay.entity;

import co.solver.element.entity.Element;
import lombok.*;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class WorkDay {
    private Element[] elements;
}
