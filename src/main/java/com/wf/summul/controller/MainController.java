/**
 * 
 */
package com.wf.summul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.wf.summul.service.CalculationService;

/**
 * @author Saptarshi
 *
 */
@Controller
public class MainController {

	@Autowired
	@Qualifier("SumServiceImpl")
	private CalculationService summation;

	@Autowired
	@Qualifier("MultiplyServiceImpl")
	private CalculationService multiplication;

	@RequestMapping("home")
	public String home() {
		System.out.println("Home page");
		return "home";
	}

	@ModelAttribute
	@RequestMapping(path = "sum", method = RequestMethod.POST)
	public String handleFormSum(@RequestParam("num1") String num1, @RequestParam("num2") String num2, Model model) {
		model.addAttribute("num1", num1);
		model.addAttribute("num2", num2);
		model.addAttribute("oprn", "Addition");
		model.addAttribute("opsn", "+");
		Integer res = summation.calculate(Integer.parseInt(num1), Integer.parseInt(num2));
		model.addAttribute("res", res);

		System.out.println(num1 + " + " + num2 + " = " + res);
		return "sum";
	}
	
	@ModelAttribute
	@RequestMapping(path = "multiply", method = RequestMethod.POST)
	public String handleFormMultiply(@RequestParam("num1") String num1, @RequestParam("num2") String num2, Model model) {
		model.addAttribute("num1", num1);
		model.addAttribute("num2", num2);
		model.addAttribute("oprn", "Multiplication");
		model.addAttribute("opsn", "x");
		Integer res = multiplication.calculate(Integer.parseInt(num1), Integer.parseInt(num2));
		model.addAttribute("res", res);

		System.out.println(num1 + " * " + num2 + " = " + res);
		return "multiply";
	}

}
