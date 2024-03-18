package com.example.tu_dien.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    private Map<String, String> dictionary;

    public DictionaryController() {
        dictionary = new HashMap<>();
        dictionary.put("hello", "xin chào");
        dictionary.put("goodbye", "tạm biệt");
        dictionary.put("thank you", "cảm ơn");
        dictionary.put("you are welcome", "không có gì");
        dictionary.put("information", "thông tin");
        dictionary.put("good morning", "chào buổi sáng");
        dictionary.put("sister", "chị,em gái");
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public ModelAndView index() {
        return new ModelAndView("index");
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public ModelAndView search(String word) {
        ModelAndView modelAndView = new ModelAndView("index");
        String meaning = dictionary.get(word);
        if (meaning != null) {
            modelAndView.addObject("meaning", meaning);
        } else {
            modelAndView.addObject("message", "Từ \"" + word + "\" không tìm thấy!");
        }
        return modelAndView;
    }

}
