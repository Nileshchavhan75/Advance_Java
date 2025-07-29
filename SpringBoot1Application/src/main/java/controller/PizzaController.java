package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.PizzaService;

@RestController
public class PizzaController {

    private final PizzaService pizzaService;

    // Constructor Injection using @Autowired
    public PizzaController(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }

    @GetMapping("/pizza")
    public String getPizza() {
        return pizzaService.servePizza();
    }
}
