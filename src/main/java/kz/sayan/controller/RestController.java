package kz.sayan.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping(value = "/")
public class RestController {

    private final Logger logger = LoggerFactory.getLogger(RestController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Map<String, Object> model) {
        logger.debug("index is executed!");

        model.put("title", "Some TITLE");
        model.put("msg", "Some description for this project");

        return "hello";
    }

    @RequestMapping(value = "/name", method = RequestMethod.GET)
    public String hello() {
        ModelAndView model = new ModelAndView("print");
        logger.debug("hello is executed - $name {}");
        model.addObject("title", "Den");
        model.addObject("msg", "Some description for this project");

        return "print";

    }

}
