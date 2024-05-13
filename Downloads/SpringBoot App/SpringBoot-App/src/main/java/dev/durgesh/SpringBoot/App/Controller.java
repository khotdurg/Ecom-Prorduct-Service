package dev.durgesh.SpringBoot.App;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/get")
    public void getBody(){
        Person ob = createPerson();
        System.out.println(ob);
    }


    @PostMapping("/get")
    public void getBody(@RequestBody Person ob){
        // Print and display the person object
        System.out.println(ob);
    }


    private Person createPerson(){
        //create and return new person object
        return new Person(1, "Durgesh", 5);
    }
}
