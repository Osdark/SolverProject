package co.solver.bag.entity;

import co.solver.element.entity.Element;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Bag {
    private String id;
    private List<Element> elements;
    private Integer weight;
}
