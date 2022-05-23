package com.codeup.springblog.controllers;

import com.codeup.springblog.services.MathService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {
    MathService mathService = new MathService();

    @RequestMapping(path = "/add100To/{number}", method = RequestMethod.GET)
    @ResponseBody
    public String addOneHundred(@PathVariable int number){
        return number + " + 100 = " + (number + 100);
    }

    @RequestMapping(path = "/addTwoNumbers/{number}/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public String addTwoNumbers(@PathVariable int number,@PathVariable int number2){
        return number + " + " + number2 + " = " + mathService.add(number,number2)  ;
    }

    @RequestMapping(path = "/subtractTwoNumbers/{number}/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public String subtractTwoNumbers(@PathVariable int number,@PathVariable int number2){
        return number + " - " + number2 + " = " + mathService.subtract(number,number2)  ;
    }

    @RequestMapping(path = "/multiplyTwoNumbers/{number}/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public String multiplyTwoNumbers(@PathVariable int number,@PathVariable int number2){
        return number + " X " + number2 + " = " + mathService.multiply(number,number2)  ;
    }

    @RequestMapping(path = "/divideTwoNumbers/{number}/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public String divideTwoNumbers(@PathVariable double number,@PathVariable double number2){
        return number + " / " + number2 + " = " + mathService.divide(number,number2);
    }

    @GetMapping("/math")
    public String math(){
        return "math/index";
    }

    @PostMapping("/math")
    public String doMath(
        @RequestParam(name = "inputA") double inputA,
        @RequestParam(name = "inputB") double inputB,
        @RequestParam(name = "operation") String operation,
        Model model) {
        double total = mathService.doOperation(operation,inputA,inputB);
        model.addAttribute("total", total);
        return "math/index";
    }

}
