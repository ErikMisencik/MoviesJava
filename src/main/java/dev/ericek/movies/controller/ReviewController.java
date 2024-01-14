package dev.ericek.movies.controller;

import dev.ericek.movies.model.Review;
import dev.ericek.movies.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;


    //it gets data from my Postman creatingReview body, which is matching payload in ""
    //then it converts to Map with String, String value
    @PostMapping
    public ResponseEntity<Review> createReview(@RequestBody Map<String, String> payload){
           return new ResponseEntity<Review>(reviewService.createReview(payload.get("reviewBody"), payload.get("imdbId")), HttpStatus.CREATED);
    }
}
