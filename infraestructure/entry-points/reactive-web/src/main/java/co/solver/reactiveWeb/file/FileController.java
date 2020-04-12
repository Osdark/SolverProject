package co.solver.reactiveWeb.file;

import co.solver.file.FileUseCase;
import co.solver.file.entity.File;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("file")
@CrossOrigin(value = "*")
@RequiredArgsConstructor
public class FileController {
    private final FileUseCase fileUseCase;

    @PostMapping()
    public Mono<File> createFile(@RequestBody File file) {
        return fileUseCase.createFile(file);
    }

    @GetMapping()
    public Flux<File> getAllFiles() {
        return fileUseCase.getAllFiles();
    }
}
