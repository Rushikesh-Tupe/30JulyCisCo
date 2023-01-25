package EcommerceConfiguration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfiguration  {
     Properties pro;
	
	public ReadConfiguration()
	{
		File src=new File("G:\\Testing\\MavenFramework\\src\\main\\java\\EcommerceConfiguration\\Config.Properties");
		
		FileInputStream fis;
		try {
			fis=new FileInputStream(src);
			pro=new Properties();
			try {
				pro.load(fis);
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public String getBaseurl()
	{
		String url=pro.getProperty("BaseURL");
		return url;
		}
	public String getusername()
	{
		String username=pro.getProperty("username");
		return username;
		}
	public String getpassword()
	{
		String password=pro.getProperty("password");
		return password;
		}
	public String getchromepath()
	{
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}

	public String Geckodriver() {
		String geckodriver=pro.getProperty("firefoxpath");
		return geckodriver;
	}
}
