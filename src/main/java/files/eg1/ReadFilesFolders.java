package files.eg1;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFilesFolders {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> al = new ArrayList<String>();

    try {
      Files.lines(new File("/").toPath(), StandardCharsets.UTF_8).map(line -> al.add(line));
    } catch (IOException e) {
      e.printStackTrace();
    } finally {

    }
  }
}
