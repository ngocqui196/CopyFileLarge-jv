import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    private static void CopyFileUsingJava7File(File source,File dest) throws IOException {
        Files.copy(source.toPath(),dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
//    private static void CopyFileUsingStream(File source, File dest) throws IOException{
//        InputStream is = null;
//        OutputStream os = null;
//        try {
//            is = new FileInputStream(source);
//            os = new FileOutputStream(dest);
//            byte[] buffer = new byte[2048];
//            int length;
//            while ((length = is.read(buffer)) != -1) {
//                os.write(buffer, 0, length);
//
//            }
//            is.close();
//            os.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);

        System.out.printf("Enter source file: ");
        String sourcePath = cs.nextLine();
        System.out.printf("Enter destination file: ");
        String destPath = cs.nextLine();

        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);

        try {
            CopyFileUsingJava7File(sourceFile, destFile);
            System.out.printf("Copy completed");
        } catch (IOException e) {
            System.out.println("Can't copy that file");
            System.out.println(e.getMessage());

        }
    }
}
