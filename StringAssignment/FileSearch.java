package dayfive.ioexample;
import java.io.*;  
class MyFilenameFilter implements FilenameFilter {
	
	String path;
	public MyFilenameFilter(String path)
	{
		this.path = path;
	}
	public boolean accept(File dir, String name)
	{
		return name.startsWith(path);
	}
}
 
public class FileSearch {
	
	public static void main(String[] args)
	{
		File directory = new File("D:\\");
		MyFilenameFilter filter = new MyFilenameFilter("abc.txt");
		String[] flist = directory.list(filter);
		if (flist == null) {
			System.out.println(
				"Empty directory or directory does not exists.");
		}
		else {  
			for (int i = 0; i < flist.length; i++) {
				System.out.println(flist[i]+" found");
			}
		}
	}
}