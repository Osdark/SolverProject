package co.solver.reactiveWeb.bag;

import co.solver.bag.BagUseCase;
import co.solver.bag.entity.Bag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("bag")
@CrossOrigin(value = "*")
@RequiredArgsConstructor
public class BagController {
    private final BagUseCase bagUseCase;

    @PostMapping()
    public Mono<Bag> createBag(@RequestBody Bag bag) {
        return bagUseCase.createBag(bag);
    }

    @GetMapping()
    public Flux<Bag> getAllBags() {
        return bagUseCase.getAllBags();
    }

    @GetMapping("/{id}")
    public Mono<Bag> getBagById(@PathVariable String id) {
        return bagUseCase.getBagById(id);
    }
}
