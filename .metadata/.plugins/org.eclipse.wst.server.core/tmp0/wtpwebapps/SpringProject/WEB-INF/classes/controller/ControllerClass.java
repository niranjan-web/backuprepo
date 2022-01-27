package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerClass {
	@RequestMapping("/display")
	public void displayMethod()
	{
		System.out.println("this is a display method");
	}
	 @RequestMapping("/home")  // Request Handler
     public String home()
     {
           return "home";
     }

}
