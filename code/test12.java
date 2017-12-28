import java.io.*;

public class test{
	public static void main(String[] args) {
		try {
			File f1 = new File("a.txt");
			if (f1.createNewFile()) {
				System.out.println("Creat Successfully");
			} else {
				System.out.println(f1.getPath() + "Creat Failed!" );
			}
			FileWriter f2 = new FileWriter(f1);
			f2.write("asdfasdfasdfasdfkasdjhkfkasdhfjklasdhjhasdkjlhkj");
			f2.close();
			FileReader reader = new FileReader(f1);
			char[] b = new char[1024];
			reader.read(b);
			reader.close();
			System.out.println(b);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
