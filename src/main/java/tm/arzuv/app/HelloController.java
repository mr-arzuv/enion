package tm.arzuv.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	@GetMapping
	public String sayHello(
			@RequestParam(name="name", required=false, defaultValue="world") String name,
			Model model) 
	{
		model.addAttribute("name", name);
		return "hello_world";
	}
}
