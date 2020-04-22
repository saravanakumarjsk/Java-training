import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		System.out.println("Enter Drive Name:");
		String x = new Scanner(System.in).next();
		File drive = new File(x);
		File[] listdrive = drive.listFiles();
		int count1 = 0;
		int count2 = 0;
		ArrayList<File> directories = new ArrayList();
		ArrayList<File> files = new ArrayList();
		for (int i = 0; i < listdrive.length; i++) {
			if (listdrive[i].isDirectory()) {
				count1++;
				directories.add(listdrive[i]);
			} else if (listdrive[i].isFile()) {
				count2++;
				files.add(listdrive[i]);
			}
		}
		System.out.println("Number of directories:" + count1);
		for (File e : directories) {
			System.out.println(e.getName());
		}
		System.out.println("Number of files:" + count2);
		for (File f : files) {
			System.out.println(f.getName());
		}
	}

}
