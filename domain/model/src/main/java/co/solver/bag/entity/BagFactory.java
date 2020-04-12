package co.solver.bag.entity;

import co.solver.element.entity.Element;

import java.util.List;
import java.util.UUID;

public interface BagFactory {
    default Bag createBag(List<Element> elements) {
        Integer weigherItem = 0;
        for (Element element : elements) {
            weigherItem = element.getWeight() > weigherItem ? element.getWeight() : weigherItem;
        }
        Integer weight = weigherItem * elements.size();
        return Bag.builder()
                .id(UUID.randomUUID().toString())
                .elements(elements)
                .weight(weight)
                .build();
    }
}
