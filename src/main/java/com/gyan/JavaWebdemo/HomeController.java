
package com.gyan.JavaWebdemo;

import com.gyan.JavaWebdemo.dsa.TwoSum;
import com.gyan.JavaWebdemo.dsa.OddEven;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {

        // Problem 1: Two Sum
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        TwoSum solution = new TwoSum();
        int[] result = solution.twoSum(nums, target);

        model.addAttribute(
            "twoSumResult",
            "[" + result[0] + ", " + result[1] + "]"
        );

        // Problem 2: Odd or Even
        int number = 15;

        OddEven checker = new OddEven();
        String oddEvenResult = checker.checkNumber(number);

        model.addAttribute("oddEvenResult", oddEvenResult);

        return "home";
    }
}
