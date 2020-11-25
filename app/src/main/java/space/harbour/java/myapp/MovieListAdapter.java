package space.harbour.java.myapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MovieListAdapter extends RecyclerView.Adapter {
    List<Movie> movieList;

    public MovieListAdapter(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public static class MovieViewHolder extends RecyclerView.ViewHolder {
        public TextView director;
        public TextView title;
        public TextView year;
        public ImageView posterUrl;

        public MovieViewHolder(View itemView) {
            super(itemView);
            director = itemView.findViewById(R.id.movie_director);
            title = itemView.findViewById(R.id.movie_title);
            year = itemView.findViewById(R.id.movie_view);
            posterUrl = itemView.findViewById(R.id.movie_posterUrl);
        }
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View listElement = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.movie_list_element, parent, false);
        return new MovieViewHolder(listElement);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MovieViewHolder movieViewHolder = (MovieViewHolder) holder;
        Movie movie = movieList.get(position);
        movieViewHolder.director.setText(movie.director);
        movieViewHolder.title.setText(movie.title);
        movieViewHolder.year.setText(movie.year);
        movieViewHolder.posterUrl.setImageResource(movie.posterUrl);

    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }


}
