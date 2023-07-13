package Day08;

/**
 * @BelongsProject: 第一阶段案例
 * @BelongsPackage: Day08
 * @Author: Jove
 * @CreateTime: 2023-02-23  19:50
 * @Description: TODO
 */

public class Student {
    private String name;
    private int chineseScore;
    private int mathScore;
    private int englishScore;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChineseScore() {
        return chineseScore;
    }

    public void setChineseScore(int chineseScore) {
        this.chineseScore = chineseScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }
    //获取总分的方法
    public int getTotalScore() {
        return chineseScore+mathScore+englishScore;
    }
}




