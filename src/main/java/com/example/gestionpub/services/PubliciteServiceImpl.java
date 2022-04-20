package com.example.gestionpub.services;

import com.example.gestionpub.models.Category;
import com.example.gestionpub.models.Publicite;
import com.example.gestionpub.repository.PubliciteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class PubliciteServiceImpl implements PubliciteService {
    @Autowired
    PubliciteRepository publiciteRepository;
    @Override
    public List<Publicite> RetreiveAllPublicite() {
        return publiciteRepository.findAll();
    }

    @Override
    public Publicite Addpublicite(Publicite publicite) {
        return publiciteRepository.save(publicite);
    }

    @Override
    public void Deletepublicite(Long id) {
        publiciteRepository.deleteById(id);
    }

    @Override
    public Publicite findById(Long id) {
        return publiciteRepository.findById(id).get();

    }

    @Override
    public Publicite updatePublicite(Publicite publicite, Long id) {
        publicite.setId(id);
        return publiciteRepository.save(publicite);
    }

    @Transactional
    public List<Publicite> findPubbyCat(Category category) {
        return publiciteRepository.findPubByCategory(category);
    }

	@Override
	public int countPub() {
		int max=0;
        List<Publicite> pubs=(List<Publicite>) publiciteRepository.findAll();
        for(Publicite publicite:pubs) {
            max++;
        }
        return max;

	}

	
	


}
