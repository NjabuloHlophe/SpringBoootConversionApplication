package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

@RestController()
public class AppController
{

	//public static final String template = "Hello, %s!";
	//private final AtomicLong counter = new AtomicLong();
	
	
	@RequestMapping("/index.html")
	public ModelAndView welcomePage()
	{
		return new ModelAndView("index");

	}
	

	@RequestMapping(path = "/index.html" , method=RequestMethod.POST )
	public ModelAndView process(WebRequest request) {
		 
		 String from ="--Please choose an option--";
		 String to ="--Please choose an option--";
		 String fromTemp ="--Please choose an option--";
		 String toTemp ="--Please choose an option--";
		 String fromMass ="--Please choose an option--";
		 String toMass ="--Please choose an option--";
		 double output = 0;
		 double input = 0;
		 double outputTemp = 0;
		 double inputTemp = 0;
		 double outputMass = 0;
		 double inputMass = 0;
		 
		 String type = request.getParameter( "usersubmit"); 
		
		 if (type.equals("Convert Length")) {
			 from = request.getParameter( "From-select"); // select form for length conversions
			 to = request.getParameter( "To-select"); 
			 String str = request.getParameter("input"); 
			 input =  Double.parseDouble(str);
			 output = Convert.ConvertLength(input,from,to);
		 }
		
		 if (type.equals("Convert Temperature")) {
			 fromTemp = request.getParameter( "From-selectTemp"); // select form for length conversions
			 toTemp = request.getParameter( "To-selectTemp"); 
			 String str = request.getParameter("inputTemp"); 
			 inputTemp =  Double.parseDouble(str);
			 outputTemp = Convert.ConvertTemperature(inputTemp,fromTemp,toTemp);
			
		 }
		 if (type.equals("Convert Mass")) {
			 fromMass = request.getParameter( "From-selectMass"); // select form for length conversions
			 toMass = request.getParameter( "To-selectMass"); 
			 String str = request.getParameter("inputMass"); 
			 inputMass =  Double.parseDouble(str);
			 outputMass = Convert.massconversion(inputMass,fromMass,toMass);
			
		 }
		 
	

		
		ModelAndView view = new ModelAndView();
		Map<String, String> message = new HashMap<String, String>();
		
		message.put("input", String.valueOf(input));
		message.put("output", String.valueOf(output));
		
		message.put("inputTemp", String.valueOf(inputTemp));
		message.put("outputTemp", String.valueOf(outputTemp));
		
		message.put("inputMass", String.valueOf(inputMass));
		message.put("outputMass", String.valueOf(outputMass));
		
	    message.put("from", String.valueOf(from));
	    message.put("to", String.valueOf(to));
	    message.put("fromTemp", String.valueOf(fromTemp));
	    message.put("toTemp", String.valueOf(toTemp));
	    message.put("fromMass", String.valueOf(fromMass));
	    message.put("toMass", String.valueOf(toMass));
	    
	    
		
		
		view.setViewName("/result");
		
		
		view.addObject("message",message);
		
		
		
		return view;
	}	
	
}
