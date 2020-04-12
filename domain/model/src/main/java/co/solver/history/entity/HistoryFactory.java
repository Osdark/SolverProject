package co.solver.history.entity;

import co.solver.file.entity.File;

public interface HistoryFactory {
    default History createHistory(File file, String userId) {
        return History.builder()
                .file(file)
                .userId(userId)
                .build();
    }
}
