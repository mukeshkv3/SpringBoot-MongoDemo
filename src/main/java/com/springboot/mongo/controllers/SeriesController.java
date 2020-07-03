package com.springboot.mongo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.mongo.entities.Series;
import com.springboot.mongo.repositories.SeriesRepository;


@RestController
public class SeriesController {
	
	@Autowired
	private SeriesRepository seriesRepostory;

	@PostMapping("/addSeries")
	public String addSeries(@RequestBody Series series) {
		seriesRepostory.save(series);
		return "Added Series Successfully of id "+ series.getSeriesId();
	}
	
	@GetMapping("/getAllSeries")
	public List<Series> getAllSeries() {
		return seriesRepostory.findAll();
	}

	@GetMapping("/getSeriesById/{seriesId}")
	public Optional<Series> getSeries(@PathVariable int seriesId) {
		return seriesRepostory.findById(seriesId);
	}

	@DeleteMapping("/delete/{seriesId}")
	public String deleteSeries(@PathVariable int seriesId) {
		seriesRepostory.deleteById(seriesId);
		return "Series deleted with id : " + seriesId;
	}
}
