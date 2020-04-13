package co.solver.history.entity;

import co.solver.file.entity.ProjectFile;

public interface HistoryFactory {
    default History createHistory(ProjectFile projectFile, String userId) {
        return History.builder()
                .projectFile(projectFile)
                .userId(userId)
                .build();
    }
}
