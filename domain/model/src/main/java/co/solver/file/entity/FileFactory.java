package co.solver.file.entity;

import co.solver.workDay.entity.WorkDay;

public interface FileFactory {
    default File createFile(Integer days, WorkDay[] workDays) {
        return File.builder()
                .days(days)
                .workDays(workDays)
                .build();
    }
}
