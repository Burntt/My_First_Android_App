package space.harbour.java.myapp;

import org.json.JSONException;
import org.json.JSONObject;

public class Movie {

    public String director;
    public String title;
    public Integer year;
    public String posterUrl;

    public Movie(String title, String director, Integer year, String posterUrl) {
        this.director = director;
        this.title = title;
        this.year = year;
        this.posterUrl = posterUrl;
    }

    public JSONObject toJsonObject() throws JSONException {
        JSONObject object = new JSONObject();
        object.put("director", director);
        object.put("title", title);
        object.put("year", year);
        object.put("posterUrl", posterUrl);
        return null;
    }

    public static Movie fromJsonObject(JSONObject object) throws JSONException {
        String director = object.getString("name");
        String title = object.getString("title");
        int year = object.getInt("year");
        String postUrl = object.getString("posterUrl");
        return new Movie(director, title, year, postUrl);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }


}
