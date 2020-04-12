package co.solver.mongoRepository.file.adapter;

import co.solver.file.entity.File;
import co.solver.file.gateway.FileRepository;
import co.solver.mongoRepository.file.data.FileDataRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
@RequiredArgsConstructor
public class FileAdapter implements FileRepository {
    private final FileDataRepository fileDataRepository;
    private final FileConverter converter;

    @Override
    public Mono<File> createFile(File file) {
        return Mono.just(file)
                .map(converter::toData)
                .flatMap(fileDataRepository::save)
                .map(converter::toEntity);
    }

    @Override
    public Flux<File> getAllFiles() {
        return fileDataRepository.findAll()
                .map(converter::toEntity);
    }
}
