package polymorphism;




public class Main {
    public static void main(String[] args) {

        Movie movie = new Movie("Game of Thrones");
        Movie adventureMovie = new Adventure("Star Wars");
        Movie comedyMovie = new Comedy("RecepVedic");
        /* Method name is the same, but all of them doing different thing this is polymorphism */
        movie.watchMovie();
        adventureMovie.watchMovie();
        comedyMovie.watchMovie();
    }


}


