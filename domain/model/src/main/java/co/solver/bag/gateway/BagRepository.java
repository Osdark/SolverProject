package co.solver.bag.gateway;

import co.solver.bag.entity.Bag;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BagRepository {
    Mono<Bag> createBag(Bag bag);

    Mono<Bag> getBagById(String id);

    Flux<Bag> getAllBags();
}
