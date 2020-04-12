package co.solver.mongoRepository.file.data;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface FileDataRepository extends ReactiveCrudRepository<FileDTO, String> {
}
