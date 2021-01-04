package com.udea.petcare.Repositories;

import com.udea.petcare.Models.Publication;
import com.udea.petcare.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PublicationRepository extends JpaRepository<Publication,Integer> {

    List<Publication> findByType(String type);
    List<Publication> findByOrderByDateDesc();
}
