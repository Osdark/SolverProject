package co.solver.workDay;

import co.solver.workDay.entity.WorkDay;
import co.solver.workDay.gateway.WorkDayRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class WorkDayUseCase {

    private final WorkDayRepository workDayRepository;

    public Mono<WorkDay> createWorkDay(WorkDay workDay) {
        return workDayRepository.createWorkDay(workDay);
    }

    public Flux<WorkDay> getAllWorkDays() {
        return workDayRepository.getAllWorkDays();
    }
}
