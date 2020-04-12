package co.solver.configuration;

import co.solver.bag.BagUseCase;
import co.solver.bag.gateway.BagRepository;
import co.solver.file.FileUseCase;
import co.solver.file.gateway.FileRepository;
import co.solver.history.HistoryUseCase;
import co.solver.history.gateway.HistoryRepository;
import co.solver.mapper.ObjectMapper;
import co.solver.workDay.WorkDayUseCase;
import co.solver.workDay.gateway.WorkDayRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfiguration {

    @Bean
    public BagUseCase bagUseCase(BagRepository bagRepository) {
        return new BagUseCase(bagRepository);
    }

    @Bean
    public FileUseCase fileUseCase(FileRepository fileRepository) {
        return new FileUseCase(fileRepository);
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
        return new ObjectMapper() {
            @Override
            public <T> T map(Object src, Class<T> target) {
                return null;
            }

            @Override
            public <T> T mapBuilder(Object src, Class<T> target) {
                return null;
            }
        };
    }

}
