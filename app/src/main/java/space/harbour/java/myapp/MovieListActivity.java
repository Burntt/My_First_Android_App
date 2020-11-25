//package space.harbour.java.myapp;
//
//import android.os.Bundle;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.List;
//
//public class MovieListActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_movie_list);
//
//        List<Movie> movieList = List.of(
//            new Movie("Django Unchained", "Quentin Tarantino", 2012, "https://cdn.shopify.com/s/files/1/0969/9128/products/Django_Unchained_-_Fan_Art_-_Quentin_Tarantino_-_Hollywood_Movie_Poster_Collection_c888b077-cc07-40be-9601-6f720cd5633d.jpg?v=1573214217"),
//            new Movie("Kill Bill", "Quentin Tarantino", 2003, "https://images-na.ssl-images-amazon.com/images/I/61%2BA2IymvWL._AC_SL1055_.jpg"),
//            new Movie("Inglorious Bastards", "Quentin Tarantino", 2009, "https://images-na.ssl-images-amazon.com/images/I/61PXdxTJGPL._AC_SL1022_.jpg")
//        );
//
//        RecyclerView list = (RecyclerView) findViewById(R.id.movies_list);
//        list.setAdapter(new MovieListAdapter(movieList));
//
//    }
//
//}
