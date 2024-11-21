/*Nome:Cássio Eid Kobayashi Yonetsuka
Rm:99678

Nome: Allan Von Ivanov
Rm:98705 */
package br.com.fiap.solaris.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoginController {

    @GetMapping("/login")
    public ModelAndView login(){
        ModelAndView mv = new ModelAndView();
        return mv;
    }
}
