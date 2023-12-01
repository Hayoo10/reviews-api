package com.reviews.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reviews.BLL.ReviewsBLL;
import com.reviews.model.Anime;
// import com.reviews.model.Review;
import com.reviews.model.Users;

@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping(value = "/api")
@RestController
public class ReviewsAPIController {
     @Autowired
    ReviewsBLL bll;

    // Read (Read)
    // @GetMapping("/animes/getall/{user_id}")
    // public List<Anime> index(@PathVariable Long user_id) {

    //     System.out.println(user_id);
    //     System.out.println(bll.getAllAnimes(user_id));

    //     return bll.getAllAnimes(user_id);
    // }

    // Read One
    @GetMapping("/animes/{id}")
    public ResponseEntity<?> view(@PathVariable Long id) {

        Optional<Anime> b = bll.getAnime(id);
        if (b.isPresent())
            return new ResponseEntity<Anime>(b.get(), HttpStatus.OK);
        else
            return new ResponseEntity<>("Not Found", HttpStatus.NOT_FOUND);
    }

    // Add (Create)
    @PostMapping("/animes")
    public ResponseEntity<?> store(@RequestBody Anime anime) {

        return new ResponseEntity<Anime>(bll.addAnime(anime), HttpStatus.OK);
    }

    // Update (Update)
    @PatchMapping("/animes")
    public ResponseEntity<?> update(@RequestBody Anime anime) {

        return new ResponseEntity<Anime>(bll.updateAnime(anime), HttpStatus.OK);
    }

    // Delete (Delete)
    @DeleteMapping("/anime/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {

        Optional<Anime> b = bll.getAnime(id);
        if (b.isPresent()) {
            bll.deleteAnime(id);
            return new ResponseEntity<>("Successfully Deleted.", HttpStatus.OK);
        } else
            return new ResponseEntity<>("Not Found", HttpStatus.NOT_FOUND);

    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Login Check Credentials
    @PostMapping("/login")
    public ResponseEntity<?> checkLogin(@RequestBody Users user) {
        // System.out.println(user);

        return new ResponseEntity<>(bll.checkLogin(user), HttpStatus.OK);
    }

    // Register Check Credentials
    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody Users user) {
        // System.out.println(user);

        if(bll.checkSignup(user))
            return new ResponseEntity<>("Success, User Created.", HttpStatus.OK);
        else
            return new ResponseEntity<>("Username Already Exists.", HttpStatus.OK);
    }







}

    

