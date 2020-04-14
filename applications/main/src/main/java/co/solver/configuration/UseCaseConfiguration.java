package co.solver.configuration;

import co.solver.file.ProjectFileUseCase;
import co.solver.file.gateway.ProjectFileRepository;
import co.solver.history.HistoryUseCase;
import co.solver.history.gateway.HistoryRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.reactivecommons.utils.ObjectMapperImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfiguration {

    @Bean
    public ProjectFileUseCase projectFileUseCase(ProjectFileRepository projectFileRepository) {
        return new ProjectFileUseCase(projectFileRepository);
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
