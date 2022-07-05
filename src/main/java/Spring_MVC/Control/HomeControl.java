package Spring_MVC.Control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeControl {
	@RequestMapping( value ={"/", "/home"}, method = RequestMethod.GET)
	public String index() {
		return "user/index";
	}
}
