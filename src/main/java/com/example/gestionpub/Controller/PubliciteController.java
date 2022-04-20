package com.example.gestionpub.Controller;

import com.example.gestionpub.models.Category;
import com.example.gestionpub.models.Publicite;
import com.example.gestionpub.repository.PubliciteRepository;
import com.example.gestionpub.services.PubliciteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class PubliciteController {
    @Autowired
    PubliciteRepository publiciteRepository;
    @Autowired
    private PubliciteServiceImpl publiciteService;

    @GetMapping("/pub")
    @ResponseBody
    public List<Publicite> getAllPub() {
        List<Publicite> list = publiciteService.RetreiveAllPublicite();
        return list;
    }
    @DeleteMapping("/pub/{pub-id}")
    @ResponseBody
    public void removePub(@PathVariable("pub-id") Long id) {
        publiciteService.Deletepublicite(id);
    }
    @GetMapping("/getpub/{pub-id}")
    @ResponseBody
    public Publicite getPubById(@PathVariable("pub-id")Long id)
    {
        return publiciteService.findById(id);
    }
    @PostMapping("/Add-pub")
    @ResponseBody
    public Publicite addPub(@RequestBody Publicite publicite){
        return publiciteService.Addpublicite(publicite);
    }
    @PutMapping(value="/updatepub/{pub-id}")
    public Publicite modify(@PathVariable (name="pub-id") Long id, @RequestBody Publicite publicite){

        return publiciteService.updatePublicite(publicite, id);
    }

    @GetMapping("/findPub/{category}")
    public List<Publicite> findPub(@PathVariable (value = "category") Category category){
        return publiciteService.findPubbyCat(category);
    }
    @GetMapping("/countpub")
    @ResponseBody
    public int CountPub() {
        return publiciteService.countPub();
    }

}
