package JavaMainPackage.Controller;

import JavaMainPackage.Service.WsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "MyAPI")
public class WsController {

    @Autowired
    WsService service;

    @RequestMapping(value = "/SayHello/", method = RequestMethod.GET, produces = "text/plain")
    public String publishData(){
        return service.sayHello();
    }
}
