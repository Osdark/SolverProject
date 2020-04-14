package co.solver.file.adapter;

import co.solver.file.gateway.ProjectFileRepository;
import co.solver.workDay.entity.WorkDay;
import org.springframework.http.codec.multipart.FilePart;
import org.springframework.stereotype.Repository;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class ProjectFileHandler implements ProjectFileRepository {

    @Override
    public List<WorkDay> readFile(FilePart file) throws IOException {
        List<String> fileString = new ArrayList<>();
        String fileName = "input.txt";
        File inputFile = new File(fileName);
        file.transferTo(inputFile);
        if (inputFile.exists()) {
            FileReader fr = new FileReader(inputFile);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                fileString.add(line);
            }
        }
        return createProjectFile(fileString);
    }

    @Override
    public File downloadFile(List<WorkDay> workDays) throws IOException {
        return createFile(workDays);
    }

    private File createFile(List<WorkDay> workDays) throws IOException {
        String fileName = "lazy_loading_output.txt";
        FileWriter fw = new FileWriter(fileName);
        File output = new File(fileName);
        for (int i = 0; i < workDays.size(); i++) {
            fw.write("Case#" + (i + 1) + ": " + processDays(workDays.get(i)) + "\r\n");
        }
        fw.close();
        return output;
    }

    private Integer processDays(WorkDay day) {
        System.out.println(day);
        Collections.sort(day.getElements(), Collections.reverseOrder());
        List<Integer> dayRide = day.getElements();
        Integer totalRides = countRides(0, dayRide);
        return totalRides;
    }

    private Integer countRides(Integer totalRides, List<Integer> dayRide) {
        Integer counter = 2;
        for (int i = 0; i < dayRide.size(); i++) {
            System.out.println(dayRide.get(i));
            /*while (dayRide.get(i) * counter >= 50) {
                dayRide.remove(dayRide.size() - 1);
                totalRides++;
                counter++;
            }*/
            if (dayRide.get(i) >= 50) {
                totalRides++;
            } else if (dayRide.get(i) * counter >= 50) {
                if (dayRide.size() > i+1) {
                    dayRide.remove(dayRide.size() - 1);
                    totalRides++;
                    counter = 2;
                }
                System.out.println(dayRide);
            } else {
                dayRide.remove(dayRide.size() - 1);
                i--;
                counter++;
            }
        }
        return totalRides;
    }

    private List<WorkDay> createProjectFile(List<String> input) {
        List<WorkDay> workDays = new ArrayList<>();
        List<String> tempInput = input.subList(1, input.size());
        fillWorkDays(tempInput, workDays);
        return workDays;
    }

    private void fillWorkDays(List<String> tempInput, List<WorkDay> workDays) {
        while (tempInput.size() > 1) {
            int listSize = Integer.parseInt(tempInput.get(0));
            List<Integer> elements = new ArrayList<>();
            for (int j = 1; j < listSize + 1; j++) {
                elements.add(Integer.parseInt(tempInput.get(j)));
            }
            WorkDay workDay = new WorkDay(elements);
            workDays.add(workDay);
            tempInput = tempInput.subList(listSize + 1, tempInput.size());
        }
    }
}
