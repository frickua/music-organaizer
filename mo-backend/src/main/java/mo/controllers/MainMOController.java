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
    @ResponseBody
    public String getHelloMessage() {
        return "<html><H1>Hello!:)</H1><H3>I am Your Music Organaizer.</H3></html>";
    }
}
