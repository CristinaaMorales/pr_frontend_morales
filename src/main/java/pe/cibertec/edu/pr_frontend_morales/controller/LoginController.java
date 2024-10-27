package pe.cibertec.edu.pr_frontend_morales.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pe.cibertec.edu.pr_frontend_morales.client.AuthClient;
import pe.cibertec.edu.pr_frontend_morales.dto.CredencialesDTO;

@Controller
public class LoginController {

    private final AuthClient authClient;

    public LoginController(AuthClient authClient) {
        this.authClient = authClient;
    }

    @PostMapping("/login")
    public String login(@RequestParam String codigo, @RequestParam String password, Model model) {
        ResponseEntity<Boolean> response = authClient.autenticar(new CredencialesDTO(codigo, password));
        boolean autenticado = Boolean.TRUE.equals(response.getBody());

        if (!autenticado) {
            model.addAttribute("error", "Problemas en la autenticación");
            return "login";
        }
        return "redirect:/integrantes";
    }

    @GetMapping("/login")
    public String mostrarLogin() {
        return "login";
    }


}
