package com.courses.spalah.mvc;

import com.courses.spalah.domain.Person;
import com.courses.spalah.domain.Plane;
import com.courses.spalah.service.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Artem Uskov on 19.11.2016.
 */

@RestController
@RequestMapping(value = "/plane",  produces = MediaType.APPLICATION_JSON_VALUE)
public class PlaneController {

    @Autowired
    private PlaneService planeService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Plane> getPlane(@RequestParam long id) {
        Plane plane = planeService.getById(id);
        return new ResponseEntity<Plane>(plane,HttpStatus.OK);
    }

    @RequestMapping(value = "save", method = RequestMethod.GET)
    public ResponseEntity<Plane> savePlane(@RequestParam String model) {
        Plane newPlane = new Plane();
        newPlane.setPlaneName(model);

        Plane savedPlane = planeService.save(newPlane);
        return new ResponseEntity<>(savedPlane, HttpStatus.OK);
    }

//    @RequestMapping(value = "/requestmethod", method = RequestMethod.POST)
//    public String requestMethodPost(Model model) {
//        model.addAttribute("method", "post");
//        return "request_method";


}
