package polymorphism;




public class Main {
    public static void main(String[] args) {

        Movie movie = new Movie("Game of Thrones");
        Movie adventureMovie = new Adventure("Game of Thrones");
        movie.watchMovie();
        adventureMovie.watchMovie();



    }
}


