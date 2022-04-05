package program;

import entities.Candidate;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Application {

    public static void main(String[] args) {
        Path path = Paths.get("D:\\Project\\in.txt");
        Map<String, Integer> votes = new LinkedHashMap<>();
        List<Candidate> candidates = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path.toFile()))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                int count = Integer.parseInt(fields[1]);
                if (votes.get(name) == null) {
                    votes.put(name, count);
                } else {
                    votes.put(name, count + votes.get(name));
                }
                line = br.readLine();
            }


            for (String key : votes.keySet()) {
                Candidate candidate = new Candidate(key, votes.get(key));
                candidates.add(candidate);
                System.out.println(key + ": " + votes.get(key));
            }


            for (Candidate a : candidates) {
                System.out.println(a);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
