package com.courses.spalah.mvc;

import com.courses.spalah.domain.Person;
import com.courses.spalah.service.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @author Ievgen Tararaka
 */
@RestController
@RequestMapping(value = "/persons",  produces = MediaType.APPLICATION_JSON_VALUE)
public class PersonController {
    @Autowired
    private SimpleService personService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Person> getPerson(@RequestParam long id) {
        Person person = (Person) personService.getById(id);
        return new ResponseEntity<>(person, HttpStatus.OK);
    }

    @RequestMapping(value = "getall",  method = RequestMethod.GET)
    public ResponseEntity<Collection> getPersons(@RequestParam long allid) {
        Collection<Person> person = personService.getAll();
        return new ResponseEntity<Collection>(person, HttpStatus.OK);
    }
    @RequestMapping(
            //value = "save",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE) //headers = "Accept=application/json"
    @ResponseBody
    public ResponseEntity<Person> savePerson(@RequestBody Person person) {
        Person savedPerson = (Person) personService.save(person);
        return new ResponseEntity<>(savedPerson, HttpStatus.OK);
    }
}
