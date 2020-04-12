package co.solver.workDay.gateway;

import co.solver.workDay.entity.WorkDay;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface WorkDayRepository {
    Mono<WorkDay> createWorkDay(WorkDay workDay);

    Flux<WorkDay> getAllWorkDays();
}
