package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @RequestMapping(path = "/add100To/{number}", method = RequestMethod.GET)
    @ResponseBody
    public String addOneHundred(@PathVariable int number){
        return number + " + 100 = " + (number + 100);
    }

    @RequestMapping(path = "/addTwoNumbers/{number}/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public String addTwoNumbers(@PathVariable int number,@PathVariable int number2){
        return number + " + " + number2 + " = " + (number+number2)  ;
    }

    @RequestMapping(path = "/subtractTwoNumbers/{number}/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public String subtractTwoNumbers(@PathVariable int number,@PathVariable int number2){
        return number + " - " + number2 + " = " + (number-number2)  ;
    }

    @RequestMapping(path = "/multiplyTwoNumbers/{number}/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public String multiplyTwoNumbers(@PathVariable int number,@PathVariable int number2){
        return number + " X " + number2 + " = " + (number*number2)  ;
    }

    @RequestMapping(path = "/divideTwoNumbers/{number}/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public String divideTwoNumbers(@PathVariable double number,@PathVariable double number2){
        return number + " / " + number2 + " = " + (number/number2);
    }

}
