package co.solver.bag;

import co.solver.bag.entity.Bag;
import co.solver.bag.gateway.BagRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class BagUseCase {
    private final BagRepository bagRepository;

    public Mono<Bag> createBag(Bag bag) {
        return bagRepository.createBag(bag);
    }

    public Mono<Bag> getBagById(String id) {
        return bagRepository.getBagById(id);
    }

    public Flux<Bag> getAllBags() {
        return bagRepository.getAllBags();
    }
}
