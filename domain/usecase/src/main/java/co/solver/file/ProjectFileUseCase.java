package co.solver.file;

import co.solver.file.entity.ProjectFile;
import co.solver.file.gateway.ProjectFileRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class ProjectFileUseCase {
    private final ProjectFileRepository projectFileRepository;

    public Mono<ProjectFile> createFile(ProjectFile projectFile) {
        return projectFileRepository.createFile(projectFile);
    }

    public Flux<ProjectFile> getAllFiles() {
        return projectFileRepository.getAllFiles();
    }
}
