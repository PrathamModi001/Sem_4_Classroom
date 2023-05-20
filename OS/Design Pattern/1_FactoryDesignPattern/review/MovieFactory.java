package review;

public class MovieFactory {
    public IMDB getMovies(String movie){
        
        if(movie.equals("Interstellar")){
            return new Interstellar();
        }

        else if (movie.equals("Joker")){
            return new Joker();
        }

        else if (movie.equals("ThePrestige")){
            return new ThePrestige();
        }
        
        else{
            return null;
        }        
    }
}
