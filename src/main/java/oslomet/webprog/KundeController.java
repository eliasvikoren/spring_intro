package oslomet.webprog;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class KundeController {
    @GetMapping("/")
    public Kunde returKunde(Kunde innKunde){
        return innKunde;
    }
}
