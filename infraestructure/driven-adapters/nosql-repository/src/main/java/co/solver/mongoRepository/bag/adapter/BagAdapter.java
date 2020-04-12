package co.solver.mongoRepository.bag.adapter;

import co.solver.bag.entity.Bag;
import co.solver.bag.gateway.BagRepository;
import co.solver.mongoRepository.bag.data.BagDataRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
@RequiredArgsConstructor
public class BagAdapter implements BagRepository {
    private final BagDataRepository bagDataRepository;
    private final BagConverter converter;

    @Override
    public Mono<Bag> createBag(Bag bag) {
        return Mono.just(bag)
                .map(converter::toData)
                .flatMap(bagDataRepository::save)
                .map(converter::toEntity);
    }

    @Override
    public Mono<Bag> getBagById(String id) {
        return bagDataRepository.findById(id)
                .map(converter::toEntity);
    }

    @Override
    public Flux<Bag> getAllBags() {
        return bagDataRepository.findAll()
                .map(converter::toEntity);
    }
}
