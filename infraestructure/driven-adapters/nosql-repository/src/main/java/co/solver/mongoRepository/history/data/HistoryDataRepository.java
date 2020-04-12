package co.solver.mongoRepository.history.data;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface HistoryDataRepository extends ReactiveCrudRepository<HistoryDTO, String> {
}
