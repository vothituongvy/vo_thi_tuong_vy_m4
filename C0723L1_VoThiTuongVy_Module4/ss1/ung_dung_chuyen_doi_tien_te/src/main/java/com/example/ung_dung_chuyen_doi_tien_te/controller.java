package com.example.ung_dung_chuyen_doi_tien_te;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequestMapping("/")
@CrossOrigin
public class controller {
    @RequestMapping(value = "/", method = RequestMethod.GET)
        public String index(Model model) {

            return "index";
        }

        @RequestMapping(value = "/convert", method = RequestMethod.POST)
        public String convert(
                @RequestParam("usd") double usd,
                @RequestParam("rate") double rate,
                Model model) {

            double vnd = usd * rate;
            model.addAttribute("vnd", vnd);
            return "result";
        }
    }




//@Controller
//@RequestMapping("/")
//public class controller {
//    @RequestMapping(value = "/convert", method = RequestMethod.GET)
//    public String convert(
//            @RequestParam("usd") double usd,
//            @RequestParam("rate") double rate,
//            Model model) {
//
//        double vnd = usd * rate;
//        model.addAttribute("vnd", vnd);
//        return "result";
//    }
//}
