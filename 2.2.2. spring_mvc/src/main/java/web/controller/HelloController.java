package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.services.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@Autowired
	private CarService carService;

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I'm Spring MVC application");
		messages.add("5.2.0 version by sep'19 ");
		model.addAttribute("messages", messages);
		return "index";
	}

//	@GetMapping(value = "cars")
//	public String printCars(ModelMap model) {
//		List<Car> cars = carService.getAllCars();
//		model.addAttribute("smokeTest", cars);
//		return "cars";
//	}

	@GetMapping("cars")
	public String printByCountCars(ModelMap model, @RequestParam(name = "count", required = false) Integer count) {
		//List<Car> list = carService.getAllCars();
		if (count != null) {
			if (carService.getSize() < count) count = carService.getSize();
			model.addAttribute("smokeTest", carService.getSomeCars(count));
		} else {
			model.addAttribute("smokeTest", carService.getAllCars());
		}
		return "cars";
	}
	
}