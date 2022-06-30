package lesson16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyWithNio implements CopyUtils{

    @Override
    public void copy(String from, String to) {
        Path pathFrom = Paths.get(from);
        Path pathTo = Paths.get(to);

        try {
            Files.copy(pathFrom,pathTo );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
