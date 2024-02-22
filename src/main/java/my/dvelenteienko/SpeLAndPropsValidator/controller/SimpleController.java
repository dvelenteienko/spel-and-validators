package my.dvelenteienko.SpeLAndPropsValidator.controller;

import jakarta.validation.Valid;
import my.dvelenteienko.SpeLAndPropsValidator.config.PropsConfig;
import my.dvelenteienko.SpeLAndPropsValidator.model.Simples;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("validate")
public class SimpleController {

    protected final PropsConfig propsConfig;

    @Autowired
    public SimpleController(PropsConfig propsConfig) {
        this.propsConfig = propsConfig;
    }

    @Value("#{propsConfig.getNotEmptyProperty()}")
    private String prop;

    @GetMapping(path = "/simples", produces = "application/json")
    public Simples getBook() {
        return new Simples(this.prop, 32);
    }
}
