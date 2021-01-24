package com.udea.petcare.Services;

import com.udea.petcare.Models.Publication;
import com.udea.petcare.Models.User;
import com.udea.petcare.Repositories.PublicationRepository;
import com.udea.petcare.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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

    public Publication findById(Integer id){
        return  publicationRepository.findById(id).orElse(null);
    }

    public Publication createPublication(Publication publication){
        LocalDateTime date= LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
        String formattedDateTime = date.format(formatter);

        publication.setDate(formattedDateTime);
        return publicationRepository.save(publication);

    }
    public void deletePublication(Publication publication){
        publicationRepository.delete(publication);
    }


}
