package co.solver.mongoRepository.workDay.adapter;

import co.solver.mapper.ObjectMapper;
import co.solver.mongoRepository.workDay.data.WorkDayDTO;
import co.solver.workDay.entity.WorkDay;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WorkDayConverter {
    private final ObjectMapper mapper;

    public WorkDayDTO toData(WorkDay workDay) {
        return mapper.map(workDay, WorkDayDTO.class);
    }

    public WorkDay toEntity(WorkDayDTO workDayDTO) {
        return mapper.map(workDayDTO, WorkDay.class);
    }
}
