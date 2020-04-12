package co.solver.mongoRepository.history.adapter;

import co.solver.history.entity.History;
import co.solver.mapper.ObjectMapper;
import co.solver.mongoRepository.history.data.HistoryDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HistoryConverter {
    private final ObjectMapper mapper;

    public HistoryDTO toData(History history) {
        return mapper.map(history, HistoryDTO.class);
    }

    public History toEntity(HistoryDTO historyDTO) {
        return mapper.map(historyDTO, History.class);
    }
}
