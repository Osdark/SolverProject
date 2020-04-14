package co.solver.file.adapter;

import co.solver.element.entity.Element;
import co.solver.file.data.ProjectFileDTO;
import co.solver.file.entity.ProjectFile;
import co.solver.file.gateway.ProjectFileRepository;
import co.solver.workDay.entity.WorkDay;
import lombok.RequiredArgsConstructor;
import org.springframework.http.codec.multipart.FilePart;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProjectFileReader implements ProjectFileRepository {
    private final ProjectFileConverter converter;

    @Override
    public ProjectFile readFile(FilePart file) throws URISyntaxException, IOException {
        List<String> fileString = new ArrayList<>();
        File inputFile = new File("input.txt");
        file.transferTo(inputFile);
        if (inputFile.exists()) {
            FileReader fr = new FileReader(inputFile);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                fileString.add(line);
            }
        }
        return converter.toEntity(createProjectFile(fileString));
    }

    private ProjectFileDTO createProjectFile(List<String> input) {
        ProjectFileDTO projectFileDTO = new ProjectFileDTO();
        List<WorkDay> workDays = new ArrayList<>();
        List<String> tempInput = input.subList(1, input.size());
        fillWorkDays(tempInput, workDays);
        projectFileDTO.setWorkDays(workDays);
        return projectFileDTO;
    }

    private void fillWorkDays(List<String> tempInput, List<WorkDay> workDays) {
        while (tempInput.size() > 1) {
            int listSize = Integer.parseInt(tempInput.get(0));
            List<Element> elements = new ArrayList<>();
            for (int j = 1; j < listSize + 1; j++) {
                elements.add(new Element(tempInput.get(j)));
            }
            WorkDay workDay = new WorkDay(elements);
            workDays.add(workDay);
            tempInput = tempInput.subList(listSize + 1, tempInput.size());
        }
    }
}
