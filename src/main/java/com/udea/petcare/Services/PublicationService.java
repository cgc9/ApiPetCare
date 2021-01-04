package com.udea.petcare.Services;

import com.udea.petcare.Models.Publication;
import com.udea.petcare.Models.User;
import com.udea.petcare.Repositories.PublicationRepository;
import com.udea.petcare.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PublicationService {

    @Autowired
    private PublicationRepository publicationRepository;

    public List<Publication> findAllPublications(){
        return publicationRepository.findAll();
    }

    public  List<Publication>findAllOderByDate(){
        return publicationRepository.findByOrderByDateDesc();
    }

    public  List<Publication>findAllByType(String type ){
        return publicationRepository.findByType(type);
    }

    public Publication createPublication(Publication publication){
        LocalDateTime date= LocalDateTime.now();
        publication.setDate(date);
        return publicationRepository.save(publication);

    }
    public void deletePublication(Integer id){
        publicationRepository.deleteById(id);
    }


}
