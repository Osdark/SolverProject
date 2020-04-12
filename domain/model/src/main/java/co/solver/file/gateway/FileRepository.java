package co.solver.file.gateway;

import co.solver.file.entity.File;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface FileRepository {
    Mono<File> createFile(File file);

    Flux<File> getAllFiles();
}
