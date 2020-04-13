package co.solver.file.gateway;

import co.solver.file.entity.ProjectFile;
import reactor.core.publisher.Mono;

public interface ProjectFileRepository {
    Mono<ProjectFile> Read(ProjectFile projectFile);
}
