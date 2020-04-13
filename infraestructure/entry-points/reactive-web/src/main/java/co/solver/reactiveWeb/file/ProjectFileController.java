package co.solver.reactiveWeb.file;

import co.solver.file.ProjectFileUseCase;
import co.solver.file.entity.ProjectFile;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("file")
@CrossOrigin(value = "*")
@RequiredArgsConstructor
public class ProjectFileController {
    private final ProjectFileUseCase projectFileUseCase;

    @PostMapping()
    public Mono<ProjectFile> createFile(@RequestBody ProjectFile projectFile) {
        return projectFileUseCase.createFile(projectFile);
    }

    @GetMapping()
    public Flux<ProjectFile> getAllFiles() {
        return projectFileUseCase.getAllFiles();
    }
}
