
package com.rockbible3.service.dto.Napster;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Links {

    @SerializedName("albums")
    @Expose
    private Albums albums;
    @SerializedName("images")
    @Expose
    private Images images;
    @SerializedName("posts")
    @Expose
    private Posts posts;
    @SerializedName("topTracks")
    @Expose
    private TopTracks topTracks;
    @SerializedName("genres")
    @Expose
    private Genres genres;
    @SerializedName("stations")
    @Expose
    private Stations stations;
    @SerializedName("contemporaries")
    @Expose
    private Contemporaries contemporaries;
    @SerializedName("followers")
    @Expose
    private Followers followers;
    @SerializedName("influences")
    @Expose
    private Influences influences;
    @SerializedName("relatedProjects")
    @Expose
    private RelatedProjects relatedProjects;

    public Albums getAlbums() {
        return albums;
    }

    public void setAlbums(Albums albums) {
        this.albums = albums;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public Posts getPosts() {
        return posts;
    }

    public void setPosts(Posts posts) {
        this.posts = posts;
    }

    public TopTracks getTopTracks() {
        return topTracks;
    }

    public void setTopTracks(TopTracks topTracks) {
        this.topTracks = topTracks;
    }

    public Genres getGenres() {
        return genres;
    }

    public void setGenres(Genres genres) {
        this.genres = genres;
    }

    public Stations getStations() {
        return stations;
    }

    public void setStations(Stations stations) {
        this.stations = stations;
    }

    public Contemporaries getContemporaries() {
        return contemporaries;
    }

    public void setContemporaries(Contemporaries contemporaries) {
        this.contemporaries = contemporaries;
    }

    public Followers getFollowers() {
        return followers;
    }

    public void setFollowers(Followers followers) {
        this.followers = followers;
    }

    public Influences getInfluences() {
        return influences;
    }

    public void setInfluences(Influences influences) {
        this.influences = influences;
    }

    public RelatedProjects getRelatedProjects() {
        return relatedProjects;
    }

    public void setRelatedProjects(RelatedProjects relatedProjects) {
        this.relatedProjects = relatedProjects;
    }

}
