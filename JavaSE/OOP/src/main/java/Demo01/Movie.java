package Demo01;

/**
 * @BelongsProject: JavaSE
 * @BelongsPackage: Demo01
 * @Author: Jove
 * @CreateTime: 2023-07-20  10:10
 * @Description: TODO
 */

public class Movie {
    private int id;
    private String name;
    private String director;
    private String actor;
    private String info;
    private int price;
    private int score;

    public Movie() {
    }

    public Movie(int id, String name, String director, String actor, String info, int price, int score) {
        this.id = id;
        this.name = name;
        this.director = director;
        this.actor = actor;
        this.info = info;
        this.price = price;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}


