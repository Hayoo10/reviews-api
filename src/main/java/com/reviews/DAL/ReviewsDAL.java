package com.reviews.DAL;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reviews.DAL.repository.AnimeRepository;
// import com.reviews.DAL.repository.ReviewRepository;
import com.reviews.DAL.repository.userRepository;
import com.reviews.model.Anime;
import com.reviews.model.Users;

@Service
public class ReviewsDAL {
    @Autowired
    AnimeRepository animeRepo;

    @Autowired
    userRepository userRepo;
    // @Autowired
    // private ReviewRepository reviewRepo;

    // public List<Anime> queryAllAnimes(Long user_id) {
    //     return animeRepo.findAllByUserId(user_id);
    // }

    public Optional<Anime> getAAnime(long id) {
        Optional<Anime> b = animeRepo.findById(id);
        return b;
    }

    public Anime insertAnime(Anime anime) {
        return animeRepo.save(anime);
    }

    public void deleteAnime(Long id) {
        animeRepo.deleteById(id);
    }

    public Anime updateAnime(Anime anime) {
        return animeRepo.save(anime);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public long loginCheck(Users user) {
        if (userRepo.findByUsername(user.getUsername()) == null) {
            return 0;
        } else {
            if (userRepo.findByUsername(user.getUsername()).getPassword().equals(user.getPassword())) {
                return userRepo.findByUsername(user.getUsername()).getUser_id();
            } else {
                // System.out.println("password not matching");
                return 0;
            }
        }
    }


    public boolean signUpCheck(Users user) {
        if (userRepo.findByUsername(user.getUsername()) == null) {
            userRepo.save(user);
            return true;
        } else {
            return false;
        }
    }

//     public List<Review> getAllReviewsForAnime(Long animeId) {
//         return reviewRepo.findAllByAnimeId(animeId);
//     }

//     public Optional<Review> getReviewById(long id) {
//         return reviewRepo.findById(id);
//     }

//     public Review insertReview(Review review) {
//         return reviewRepo.save(review);
//     }

//     public void deleteReview(Long id) {
//         reviewRepo.deleteById(id);
//     }

//     public Review updateReview(Review review) {
//         if(reviewRepo.existsById(review.getId())) {
//             return reviewRepo.save(review);
//         }
//         return null; // Or throw an exception to notify that the Review does not exist.
//     }

//     public List<Review> getAllReviewsForUser(Long userId) {
//         return reviewRepo.findAllByUserId(userId);
//     }
}

