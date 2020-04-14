package co.solver.file.gateway;

import co.solver.file.entity.ProjectFile;
import co.solver.workDay.entity.WorkDay;
import org.springframework.http.codec.multipart.FilePart;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface ProjectFileRepository {
    List<WorkDay> readFile(FilePart file) throws IOException;

    File downloadFile(List<WorkDay> workDays) throws IOException;
}
