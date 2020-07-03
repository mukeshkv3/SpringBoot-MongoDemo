package com.springboot.mongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.mongo.entities.Series;

public interface SeriesRepository extends MongoRepository<Series, Integer> {

}
