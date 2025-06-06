public class PosterManager {
    private String[] movies = new String[0];
    private int limit;

    public PosterManager() {
        this.limit =5;
    }

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public void addMovie(String newMovie) {
        String[]tmp = new String[movies.length +1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = newMovie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLength;
        if (movies.length < limit) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }
}
