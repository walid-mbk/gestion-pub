package com.example.gestionpub.services;

import com.example.gestionpub.models.Publicite;

import java.util.List;

public interface PubliciteService {

    List<Publicite> RetreiveAllPublicite ();
    Publicite Addpublicite (Publicite publicite);
    public void Deletepublicite(Long id);
    Publicite findById (Long id);
    Publicite updatePublicite( Publicite publicite, Long id);
    int countPub();
}
