package co.solver.reactiveWeb.file;

import co.solver.file.adapter.ProjectFileHandler;
import co.solver.file.entity.ProjectFile;
import co.solver.workDay.entity.WorkDay;
import lombok.RequiredArgsConstructor;
import org.springframework.http.codec.multipart.FilePart;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("file")
@CrossOrigin(value = "*")
@RequiredArgsConstructor
public class ProjectFileController {
    private final ProjectFileHandler projectFileHandler;

    @PostMapping()
    public Mono<File> createFile(@RequestPart("file") FilePart file) throws IOException {
        return downloadFile(projectFileHandler.readFile(file));
    }

    private Mono<File> downloadFile(List<WorkDay> workDays) throws IOException {
        return Mono.just(projectFileHandler.downloadFile(workDays));
    }
}
