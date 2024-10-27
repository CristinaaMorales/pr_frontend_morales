package pe.cibertec.edu.pr_frontend_morales.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class IntegranteService {

    private final RestTemplate restTemplate = new RestTemplate();
    private final String url = "http://localhost:8085/api/get-integrantes";

    public List<String> obtenerIntegrantes() {
        return restTemplate.getForObject(url, List.class);
    }
}
