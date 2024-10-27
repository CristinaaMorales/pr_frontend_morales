package pe.cibertec.edu.pr_frontend_morales.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pe.cibertec.edu.pr_frontend_morales.service.IntegranteService;

@Controller
public class IntegrantesController {

    @Autowired
    private IntegranteService integranteService;

    @GetMapping("/integrantes")
    public String mostrarIntegrantes(Model model) {
        model.addAttribute("integrantes", integranteService.obtenerIntegrantes());
        return "integrantes";
    }

}
