package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.mariuszgromada.math.mxparser.Expression;

@Controller
public class CalculatorController {

    @GetMapping("/")  // Цей метод обробляє запит на кореневий шлях
    public String home() {
        return "index"; // Повертає HTML-шаблон
    }

    @PostMapping("/calculate")
    public String calculate(@RequestParam String expression, Model model) {
        Expression exp = new Expression(expression);
        double result = exp.calculate();
        model.addAttribute("result", result);
        model.addAttribute("expression", expression);
        return "index"; // Повертає той же шаблон з результатом
    }
}
