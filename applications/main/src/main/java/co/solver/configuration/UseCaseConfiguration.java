package co.solver.configuration;

import co.solver.bag.BagUseCase;
import co.solver.bag.gateway.BagRepository;
import co.solver.file.ProjectFileUseCase;
import co.solver.file.gateway.ProjectFileRepository;
import co.solver.history.HistoryUseCase;
import co.solver.history.gateway.HistoryRepository;
import co.solver.workDay.WorkDayUseCase;
import co.solver.workDay.gateway.WorkDayRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.reactivecommons.utils.ObjectMapperImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfiguration {

    @Bean
    public BagUseCase bagUseCase(BagRepository bagRepository) {
        return new BagUseCase(bagRepository);
    }

    @Bean
    public ProjectFileUseCase fileUseCase(ProjectFileRepository projectFileRepository) {
        return new ProjectFileUseCase(projectFileRepository);
    }

    @Bean
    public WorkDayUseCase workDayUseCase(WorkDayRepository workDayRepository) {
        return new WorkDayUseCase(workDayRepository);
    }

    @Bean
    public HistoryUseCase historyUseCase(HistoryRepository historyRepository) {
        return new HistoryUseCase(historyRepository);
    }

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapperImp();
    }

}
