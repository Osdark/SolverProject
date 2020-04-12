package co.solver.mongoRepository.workDay.adapter;

import co.solver.mongoRepository.workDay.data.WorkDayDataRepository;
import co.solver.workDay.entity.WorkDay;
import co.solver.workDay.gateway.WorkDayRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
@RequiredArgsConstructor
public class WorkDayAdapter implements WorkDayRepository {
    private final WorkDayDataRepository workDayDataRepository;
    private final WorkDayConverter converter;

    @Override
    public Mono<WorkDay> createWorkDay(WorkDay workDay) {
        return Mono.just(workDay)
                .map(converter::toData)
                .flatMap(workDayDataRepository::save)
                .map(converter::toEntity);
    }

    @Override
    public Flux<WorkDay> getAllWorkDays() {
        return workDayDataRepository.findAll()
                .map(converter::toEntity);
    }
}
