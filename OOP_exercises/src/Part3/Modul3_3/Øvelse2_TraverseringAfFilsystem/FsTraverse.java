package Part3.Modul3_3.Øvelse2_TraverseringAfFilsystem;
import java.io.File;
import java.util.ArrayList;
public class FsTraverse {
    public void traverse(ArrayList<String> result, File file, String extension) {
        if (file.isDirectory()) {
            File[] contents = file.listFiles();

            if (contents == null) return;

            for(File newFile : contents) {
                traverse(result, newFile, extension);
            }

            } else {
                String path = file.getAbsolutePath();
                String elements[] = path.split("\\.");
                if (elements.length > 1 && elements[elements.length - 1].equals(extension)) {
                    result.add(path);
                }
            }

        }
    }
