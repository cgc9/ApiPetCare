package com.udea.petcare.Controllers;

import com.udea.petcare.Models.Publication;
import com.udea.petcare.Models.User;
import com.udea.petcare.Services.PublicationService;
import com.udea.petcare.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/publications")
public class PublicationController {

    @Autowired
    private PublicationService publicationService;

    @GetMapping(path="/allPublications")
    public List<Publication> getAllPublications() {
        return publicationService.findAllPublications();
    }

    @GetMapping(path = "/byType/{type}")
    public List<Publication> getPublicationByType(@PathVariable String type){
        return publicationService.findAllByType(type);
    }

    @GetMapping(path = "/date")
    public List<Publication> getAllByOrder(){
        return publicationService.findAllOderByDate();
    }

    @PostMapping("/createPublication")
    public Publication createPublication(@RequestBody Publication publication){
        return publicationService.createPublication(publication);
    }

    @DeleteMapping(path = "/deletePublication{id}")

    public void deletePublication(@PathVariable Integer id){
        publicationService.deletePublication(id);
    }



}
