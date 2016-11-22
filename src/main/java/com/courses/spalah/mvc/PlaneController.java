package com.courses.spalah.mvc;

import com.courses.spalah.domain.Plane;
import com.courses.spalah.service.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

//    @RequestMapping(value = "save", method = RequestMethod.GET)
//    public ResponseEntity<Plane> savePlane(@RequestParam String model) {
//        Plane newPlane = new Plane();
//        newPlane.setPlaneName(model);
//        Plane savedPlane = planeService.save(newPlane);
//        return new ResponseEntity<>(savedPlane, HttpStatus.OK);
//    }

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<Plane> savePlane(@RequestBody Plane plane) {
        Plane newPlane = planeService.save(plane);
        return new ResponseEntity<>(newPlane, HttpStatus.OK);
    }

    @RequestMapping(value = "all", method = RequestMethod.GET)
    public ResponseEntity<List<Plane>> getAllPlanes() {
            List<Plane> planes = planeService.getAll();
            return new ResponseEntity<List<Plane>>(planes, HttpStatus.OK);
    }

    @RequestMapping(value = "delete", method = RequestMethod.GET)
    public ResponseEntity<Plane> deletePlane(@RequestParam long id) {
        Plane deletedPlane = planeService.delete(id);
        return new ResponseEntity<Plane>(deletedPlane,HttpStatus.OK);
    }

//    @RequestMapping(value = "update", method = RequestMethod.GET)
//    public ResponseEntity<Plane> updatePlane(@RequestParam long id, @RequestParam String model) {
//        Plane updatedPlane = planeService.getById(id);
//        updatedPlane.setPlaneName(model);
//        planeService.update(updatedPlane);
//        return new ResponseEntity<Plane>(updatedPlane, HttpStatus.OK);
//    }

    @RequestMapping(value = "update", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<Plane> updatePlane(@RequestParam long id, @RequestBody Plane plane) {
        Plane updatedPlane = planeService.getById(id);
        updatedPlane = plane;
        planeService.update(updatedPlane);
        return new ResponseEntity<Plane>(updatedPlane, HttpStatus.OK);
    }
}
