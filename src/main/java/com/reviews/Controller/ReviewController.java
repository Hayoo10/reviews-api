package com.reviews.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.reviews.BLL.ReviewsBLL;


@Controller
public class ReviewController {

    @Autowired
    ReviewsBLL bll;

    @GetMapping("/animes")
    public ModelAndView anime() {
        ModelAndView m = new ModelAndView("animes"); // html file

    

        return m;
    }
}
































// import com.reviews.DAL.repository.ReviewRepository;
// import com.reviews.model.Review;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// @CrossOrigin(origins = "http://localhost:3306")
// @RestController
// @RequestMapping("/api/reviews")
// public class ReviewController {
    
//     @Autowired
//     private ReviewRepository reviewRepository;

//     @PostMapping
//     public ResponseEntity<Review> saveReview(@RequestBody Review review) {
//         Review savedReview = reviewRepository.save(review);
//         return ResponseEntity.ok(savedReview);
//     }
// }