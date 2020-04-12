package co.solver.mongoRepository.bag.data;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface BagDataRepository extends ReactiveCrudRepository<BagDTO, String> {
}
