package co.solver.element.entity;

public interface ElementFactory {
    default Element createElement(Integer weight) {
        return Element.builder()
                .weight(weight)
                .build();
    }
}
