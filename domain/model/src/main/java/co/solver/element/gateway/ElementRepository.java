package co.solver.element.gateway;

import co.solver.element.entity.Element;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ElementRepository {
    Mono<Element> createElement(Element element);

    Flux<Element> getAllElements();
}
