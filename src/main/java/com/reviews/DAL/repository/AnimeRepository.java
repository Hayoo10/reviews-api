package com.reviews.DAL.repository;
import com.reviews.model.Anime;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;



public interface AnimeRepository extends JpaRepository<Anime, Long> {
    // List<Anime> findAllByUserId(Long userId);
}

