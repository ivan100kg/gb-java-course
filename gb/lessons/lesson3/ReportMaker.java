package lessons.lesson3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ReportMaker {
    public static void makePDFReport(String path, String data) throws IOException {
        FileOutputStream out = new FileOutputStream(path);
        out.write(data.getBytes(StandardCharsets.UTF_8));
        out.close();
    }
}
