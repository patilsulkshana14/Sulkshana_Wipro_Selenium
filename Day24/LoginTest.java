package TestNG_Project;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest {
  @Test
  @Parameters({"username", "password"})
  public void loginTest(@Optional("admin") String user, @Optional("admin123") String pass) 
  {
	  System.out.println("Enter username and password: ");
	  
	  System.out.println("Username:"+user);
	  System.out.println("Password:"+pass);
	  
	  if(user.equals("admin") && pass.equals("admin123"))
	  {
		  System.out.println("Login Successful");
	  }
	  else
	  {
		  System.out.println("Login Failed");
	  }
  }
}
