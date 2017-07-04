package com.seeu.controller;

import com.seeu.service.CalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by neo on 04/07/2017.
 */
@RestController
@RequestMapping("/demo")
public class MyController {

    @RequestMapping("/guess-number")
    public String guess(@RequestParam("max") Integer max, @RequestParam("mynumber") Integer mynumber) {
        int answer = (int) (Math.random() * max);
        if (mynumber == answer) {
            return "你猜对了，answer = " + answer;
        } else {
            return "你猜错了，answer = " + answer;
        }
    }






    @Autowired
    CalculateService calculateService;


    @RequestMapping("/add-number")
    public Integer addNum(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
        int answer = calculateService.calADD(a,b);
        return answer;
    }

}
