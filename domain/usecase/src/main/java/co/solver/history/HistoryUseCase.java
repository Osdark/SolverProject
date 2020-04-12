package co.solver.history;

import co.solver.history.entity.History;
import co.solver.history.gateway.HistoryRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class HistoryUseCase {
    private final HistoryRepository historyRepository;

    public Mono<History> createHistory(History history) {
        return historyRepository.createHistory(history);
    }

    public Flux<History> getAllHistory() {
        return historyRepository.getAllHistory();
    }
}
