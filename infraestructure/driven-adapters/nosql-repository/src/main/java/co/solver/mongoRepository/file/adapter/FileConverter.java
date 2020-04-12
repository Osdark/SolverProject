package co.solver.mongoRepository.file.adapter;

import co.solver.file.entity.File;
import co.solver.mapper.ObjectMapper;
import co.solver.mongoRepository.file.data.FileDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FileConverter {
    private final ObjectMapper mapper;

    public FileDTO toData(File file) {
        return mapper.map(file, FileDTO.class);
    }

    public File toEntity(FileDTO fileDTO) {
        return mapper.map(fileDTO, File.class);
    }
}
