package Demo01;

/**
 * @BelongsProject: JavaSE
 * @BelongsPackage: Demo01
 * @Author: Jove
 * @CreateTime: 2023-07-20  10:14
 * @Description: TODO
 */

public class MovieOperator {
    private Movie[] movies;
    public MovieOperator(Movie[] movies){
        this.movies = movies;
    }

    public void  printAllMovies(){
        System.out.println("系统全部电影信息如下：");
        for (int i = 0; i < movies.length; i++) {

            Movie m = movies[i];
            System.out.println("编号：" + m.getId());
            System.out.println("名称：" + m.getName());
            System.out.println("价格：" + m.getPrice());
            System.out.println();
        }
    }

    public void searchMovieById(int id){
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            if(m.getId() == id){
                System.out.println("电影详情信息如下：");
                System.out.println("编号：" + m.getId());
                System.out.println("名称：" + m.getName());
                System.out.println("价格：" + m.getPrice());
                System.out.println("导演：" + m.getDirector());
                System.out.println("主演：" + m.getActor());
                System.out.println("得分：" + m.getScore());
                System.out.println("其他：" + m.getInfo());
                return;
            }
        }
        System.out.println("没有所查询的电影信息。");
    }
}


