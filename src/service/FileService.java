
package service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileService {

    public static String[] readFile(String url) throws Exception {
        return Files.readAllLines(Path.of(url)).toArray(new String[0]);
    }

    public static void writeFile(String url, String content) throws Exception {
        Files.write(Path.of(url), content.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND
        );
    }
}
