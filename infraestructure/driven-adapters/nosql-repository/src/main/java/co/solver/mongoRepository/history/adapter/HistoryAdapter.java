package co.solver.mongoRepository.history.adapter;

import co.solver.history.entity.History;
import co.solver.history.gateway.HistoryRepository;
import co.solver.mongoRepository.history.data.HistoryDataRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
@RequiredArgsConstructor
public class HistoryAdapter implements HistoryRepository {
    private final HistoryDataRepository historyDataRepository;
    private final HistoryConverter converter;

    @Override
    public Mono<History> createHistory(History history) {
        return Mono.just(history)
                .map(converter::toData)
                .flatMap(historyDataRepository::save)
                .map(converter::toEntity);
    }

    @Override
    public Flux<History> getAllHistory() {
        return historyDataRepository.findAll()
                .map(converter::toEntity);
    }
}
