package pe.cibertec.edu.pr_frontend_morales.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pe.cibertec.edu.pr_frontend_morales.dto.CredencialesDTO;

@FeignClient(name = "authClient", url = "https://pr-backend-morales-agbeb4hxbyd6ctgd.canadacentral-01.azurewebsites.net/api")

public interface AuthClient {

    @PostMapping("/autenticar")
    ResponseEntity<Boolean> autenticar(@RequestBody CredencialesDTO credenciales);
}
