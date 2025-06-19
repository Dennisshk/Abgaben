package worksheet8.task3;

import java.util.Comparator;
import java.util.stream.Stream;

public class Main3 {
    public static void main(String[] args){
        Movie[] movies = new Movie[5];
        movies[0] = new Movie("m1",9.8,1999);
        movies[1] = new Movie("m2",0.0,2028);
        movies[2] = new Movie("m3",5.1,1923);
        movies[3] = new Movie("m4",2.4,1620);
        movies[4] = new Movie("m5",0.3,1865);

        Stream.of(movies)
                .filter(m->m.getRating()>=8.5)
                .sorted(Comparator.comparing((m1, m2)->{
                    if(m1.getYear()==m2.getYear()) return 0;
                    if(m1.getYear()<m2.getYear()){
                        return -1;
                    }else{
                        return 1;
                    }
                }).thenComparing((m1,m2)->{
                    if(m1.getRating()==m2.getRating()) return 0;
                    if(m1.getRating()<m2.getRating()){
                        return -1;
                    }else{
                        return 1;
                    }
                }))
                .forEach(m->System.out::println);

    }
}
