package co.solver.history.gateway;

import co.solver.history.entity.History;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface HistoryRepository {
    Mono<History> createHistory(History history);

    Flux<History> getAllHistory();
}
