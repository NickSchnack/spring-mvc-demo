package com.udemyspringhibernate.springmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld-confirmationPage";
    }

    @RequestMapping("/processFormVersionTwo")
    public String processFormVersionTwo(HttpServletRequest request, Model model) {

        // Read request parameter from HTML form
        String name = request.getParameter("studentName");

        // Convert name to uppercase
        name = name.toUpperCase();

        // Create a message
        String message = "Yo! " + name;

        // Add message to our model
        model.addAttribute("message", message);

        return "helloworld-confirmationPage";
    }

    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(
            @RequestParam("studentName") String name,
            Model model) {

        // Convert name to uppercase
        name = name.toUpperCase();

        // Create a message
        String message = "Hey! " + name;

        // Add message to our model
        model.addAttribute("message", message);

        return "helloworld-confirmationPage";
    }

}

