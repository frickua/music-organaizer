package mo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Anton_Solianyk on 22-May-17.
 */
@Controller
public class MainMOController {
    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "text/html")
    public String getHelloMessage() {
        return "redirect:/jsondoc-ui.html?url=jsondoc";
    }
}
