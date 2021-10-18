package utilites;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	
	String pathpo="./Configuration/config.properties";
	Properties pro;
	
	public ReadConfig()
	{
		
	File f=new File(pathpo);
	try{
		FileInputStream fs=new FileInputStream(f);
		pro.load(fs);
		
		
	}catch(Exception e){
		
		System.out.println("Exception is "+e.getMessage());
	}
		
	}
	
	public String getApplicationURL()
	{
		String url=pro.getProperty("Url");
		return url;
	}
	public String getUsername()
	
	{
		String Usr=pro.getProperty("username");
		return Usr;
	}
	public String getPassword()
	{
		String pass=pro.getProperty("password");
		return pass;
		
	}
	
	
	
	
	
	
	
	
	
}
