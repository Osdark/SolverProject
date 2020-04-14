package co.solver.file;

import co.solver.file.entity.ProjectFile;
import co.solver.file.gateway.ProjectFileRepository;
import co.solver.workDay.entity.WorkDay;
import lombok.RequiredArgsConstructor;
import org.springframework.http.codec.multipart.FilePart;

import java.io.File;
import java.io.IOException;
import java.util.List;

@RequiredArgsConstructor
public class ProjectFileUseCase {
    private final ProjectFileRepository projectFileRepository;

    public List<WorkDay> readFile(FilePart file) throws IOException {
        return projectFileRepository.readFile(file);
    }

    public File downloadFile(List<WorkDay> workDays) throws IOException {
        return projectFileRepository.downloadFile(workDays);
    }
}
