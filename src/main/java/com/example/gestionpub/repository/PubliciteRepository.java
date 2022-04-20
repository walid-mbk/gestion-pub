package com.example.gestionpub.repository;

import com.example.gestionpub.models.Category;
import com.example.gestionpub.models.Publicite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PubliciteRepository extends JpaRepository<Publicite,Long> {

    List<Publicite>findPubByCategory(Category category);


}
