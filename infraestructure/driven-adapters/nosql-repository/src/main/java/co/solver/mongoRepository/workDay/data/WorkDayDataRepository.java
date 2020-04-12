package co.solver.mongoRepository.workDay.data;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface WorkDayDataRepository extends ReactiveCrudRepository<WorkDayDTO, String> {
}
