package com.sviridova.web_labrab.controllers;

import com.sviridova.web_labrab.models.PrimeNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.apache.catalina.util.ServerInfo;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Controller
public class LabRab2Controller {

    @GetMapping("/lab_rab2")
    public String labrab2(Model model) {
        boolean check;
        Map<Integer, Boolean> map = new HashMap<>();
        model.addAttribute("title", "Работа 2");

        int limit = 30;
        for (int number = 2; number < limit; number++) {
            PrimeNumber prime = new PrimeNumber(number);
            check = prime.checkNum();
            map.put(number, check);
        }
        Iterator<Map.Entry<Integer, Boolean>> itr = map.entrySet().iterator();
        model.addAttribute("number", itr);

        Date dateNow = new Date();
        String formatForDateNow = String.format("Текущая дата и время: %tc", dateNow);
        model.addAttribute("datetime", formatForDateNow);

        ServerInfo info = new ServerInfo();
        model.addAttribute("server_name", info.	getServerInfo());
        return "lab_rab2";
    }
}
