package co.solver.file;

import co.solver.file.entity.File;
import co.solver.file.gateway.FileRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class FileUseCase {
    private final FileRepository fileRepository;

    public Mono<File> createFile(File file) {
        return fileRepository.createFile(file);
    }

    public Flux<File> getAllFiles() {
        return fileRepository.getAllFiles();
    }
}
