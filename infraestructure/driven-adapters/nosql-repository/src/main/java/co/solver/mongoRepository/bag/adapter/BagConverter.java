package co.solver.mongoRepository.bag.adapter;

import co.solver.bag.entity.Bag;
import co.solver.mapper.ObjectMapper;
import co.solver.mongoRepository.bag.data.BagDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BagConverter {
    private final ObjectMapper mapper;

    public BagDTO toData(Bag bag) {
        return mapper.map(bag, BagDTO.class);
    }

    public Bag toEntity(BagDTO bagDTO) {
        return mapper.map(bagDTO, Bag.class);
    }
}
