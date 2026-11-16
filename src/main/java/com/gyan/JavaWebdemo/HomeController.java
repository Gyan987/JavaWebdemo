
package com.gyan.JavaWebdemo;

import com.gyan.JavaWebdemo.dsa.TwoSum;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {

        // Input for Two Sum
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Create TwoSum object
        TwoSum solution = new TwoSum();

        // Execute the algorithm
        int[] result = solution.twoSum(nums, target);

        // Send result to HTML
        model.addAttribute("message",
                "Two Sum Result: [" + result[0] + ", " + result[1] + "]");

        return "home";
    }
}
