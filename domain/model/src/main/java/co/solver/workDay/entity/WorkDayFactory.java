package co.solver.workDay.entity;

import co.solver.element.entity.Element;

public interface WorkDayFactory {
    default WorkDay createWorkDay(Element[] elements) {
        return WorkDay.builder()
                .elements(elements)
                .build();
    }
}
