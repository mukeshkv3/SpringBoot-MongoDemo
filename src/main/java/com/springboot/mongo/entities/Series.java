package com.springboot.mongo.entities;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Series")
public class Series {
	@Id
	private int seriesId;
	private String seriesName;
	private String genre;
	private int seasons;
	private float imdb;
	private String stream;
	
	public int getSeriesId() {
		return seriesId;
	}
	public void setSeriesId(int seriesId) {
		this.seriesId = seriesId;
	}
	public String getSeriesName() {
		return seriesName;
	}
	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getSeasons() {
		return seasons;
	}
	public void setSeasons(int seasons) {
		this.seasons = seasons;
	}
	public float getImdb() {
		return imdb;
	}
	public void setImdb(float imdb) {
		this.imdb = imdb;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	
	@Override
	public String toString() {
		return "Series [seriesId=" + seriesId + ", seriesName=" + seriesName + ", genre=" + genre + ", seasons="
				+ seasons + ", imdb=" + imdb + ", stream=" + stream + "]";
	}
	
	
}
