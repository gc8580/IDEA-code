package Day08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class fight_against_landlords {

    public static List<card> allcards = new ArrayList<>();

    static {
        String[] sizes = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        String[] colors={"♥","♠","♦","♣"};

        int index=0;//记录牌的大小
        for (String size : sizes) {
            index++;
            for (String color : colors) {
                //6.封装为牌对象
                card c=new card(size,color,index);
                //7.添加到集合中
                allcards.add(c);
            }
        }
        //封装大小王，存入集合
        card c1=new card("","小王",++index);
        card c2=new card("","大王",++index);
        Collections.addAll(allcards,c1,c2);
        System.out.println("新牌："+allcards);

    }

    public static void main(String[] args) {
        Collections.shuffle(allcards);
        System.out.println("洗牌后："+allcards);

        ArrayList<card> zhangsan = new ArrayList<>();
        ArrayList<card> lisi = new ArrayList<>();
        ArrayList<card> wangwu = new ArrayList<>();

        for(int i=0; i< allcards.size() - 3; i++){
            card c = allcards.get(i);
            if(i%3==0){
                zhangsan.add(c);
            }else if (i%3==1){
                lisi.add(c);
            }else if (i%3==2){
                wangwu.add(c);
            }
        }

        List<card> lastThreeCards = allcards.subList(allcards.size() - 3, allcards.size());

        sortCards(zhangsan);
        sortCards(lisi);
        sortCards(wangwu);

        System.out.println("张三："+zhangsan);
        System.out.println("李四："+lisi);
        System.out.println("王五："+wangwu);
        System.out.println("三张底牌："+lastThreeCards);


    }

    private static void sortCards(List<card> cards) {
        Collections.sort(cards, new Comparator<card>() {
            @Override
            public int compare(card o1, card o2) {
                return o2.getIndex()-o1.getIndex();//降序
            }
        });
    }
}
class card{
    private String size;
    private String color;
    private int index;

    public card() {
    }

    public card(String size, String color, int index) {
        this.size = size;
        this.color = color;
        this.index = index;
    }

    @Override
    public String toString() {
        return color+size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
