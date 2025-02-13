package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {


    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", required = false,defaultValue = "5") int count, Model model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota Camry", 25000, "Black"));
        cars.add(new Car("Honda Accord", 27000, "White"));
        cars.add(new Car("Ford Mustang", 35000, "Red"));
        cars.add(new Car("Toyota Camry", 25000, "Red"));
        cars.add(new Car("Honda Accord", 27000, "Black"));

        if (count >= 5) {
            model.addAttribute("cars", cars);
        } else {
            model.addAttribute("cars", cars.subList(0, count));
        }

        return "cars";
    }
}
