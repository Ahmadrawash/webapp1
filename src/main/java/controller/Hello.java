package controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/app")
public class Hello {
    @ResponseBody
    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public String printHello(@RequestParam(value = "name", defaultValue = "myname") String name,
                             @RequestParam(value = "password", defaultValue = "mypassword") String password)
    {
        try
        {
            return "hello " + name + " with password: " + password;

        }
        catch (Exception exc)
        {
            System.out.println("exception: " + exc.getMessage());
            exc.printStackTrace();;
        }
        return "error";
    }
}
