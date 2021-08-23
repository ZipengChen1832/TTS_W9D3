package W9D3.controller;

import W9D3.service.WeatherService;
import W9D3.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

    @GetMapping
    public String getIndex(Model model){
        Response response = weatherService.getForecast("43210");
        model.addAttribute("data",response);
        return "index";
    }
}
