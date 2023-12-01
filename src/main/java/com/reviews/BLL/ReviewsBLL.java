package com.reviews.BLL;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reviews.DAL.ReviewsDAL;
import com.reviews.model.Anime;
// import com.reviews.model.Review;
import com.reviews.model.Users;

@Service
public class ReviewsBLL {
    @Autowired
    ReviewsDAL dal;

    // public List<Anime> getAllAnimes(Long user_id){
    //     return dal.queryAllAnimes(user_id);
    // }

    // get one anime
    public Optional<Anime> getAnime(long id){
        return dal.getAAnime(id);
    } 

    public Anime addAnime(Anime anime){
        return dal.insertAnime(anime);
    }

    public void deleteAnime(Long id){
        dal.deleteAnime(id);
    } 
    
    public Anime updateAnime(Anime anime){
        return dal.updateAnime(anime);
    } 
    
 // USER METHODS
    public long checkLogin(Users user){
        return dal.loginCheck(user);
    }

    public boolean checkSignup(Users user){
        return dal.signUpCheck(user);
    }
}


    // REVIEW METHODS

//     public List<Review> getAllReviewsForAnime(Long animeId) {
//         return dal.getAllReviewsForAnime(animeId);
//     }
    

//     public Optional<Review> getReview(long id){
//         return dal.getReviewById(id);
//     }
    

//     public Review addReview(Review review){
//         return dal.insertReview(review);
//     }

//     public void deleteReview(Long reviewId) {
//         dal.deleteReview(reviewId);
//     }
    
//     public Review updateReview(Review review){
//         return dal.updateReview(review);
//     } 

// }

    

