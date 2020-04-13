package co.solver.file.entity;

import co.solver.workDay.entity.WorkDay;

public interface ProjectFileFactory {
    default ProjectFile createFile(Integer days, WorkDay[] workDays) {
        return ProjectFile.builder()
                .days(days)
                .workDays(workDays)
                .build();
    }
}
