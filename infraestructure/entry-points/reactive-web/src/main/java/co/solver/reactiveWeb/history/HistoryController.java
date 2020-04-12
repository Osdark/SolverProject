package co.solver.reactiveWeb.history;

import co.solver.history.HistoryUseCase;
import co.solver.history.entity.History;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("history")
@CrossOrigin(value = "*")
@RequiredArgsConstructor
public class HistoryController {
    private final HistoryUseCase historyUseCase;

    @PostMapping()
    public Mono<History> createHistory(@RequestBody History history) {
        return historyUseCase.createHistory(history);
    }

    @GetMapping()
    public Flux<History> getAllHistory() {
        return historyUseCase.getAllHistory();
    }
}
