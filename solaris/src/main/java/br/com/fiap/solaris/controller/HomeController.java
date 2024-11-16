package br.com.fiap.solaris.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController{
  @GetMapping
  public String home(){
    return "home";
  }
}
