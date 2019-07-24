package member.savilio.basic.keyword.this_test;

import java.util.ArrayList;
import java.util.List;

/**
 * 学生
 */
public class Person {

    List<Integer> english_score;        //英语成绩
    List<Integer> math_score;           //数学成绩

    Person(){
        english_score = new ArrayList<>();
        math_score = new ArrayList<>();
    }

    Person(List<Integer> list1,List<Integer> list2){

    }

    public void add_english_score(Integer score){
        english_score.add(score);
        speak();
    }

    public List<Integer> get_english_score(){
        return english_score;
    }

    public void add_math_score(Integer score){
        math_score.add(score);
    }

    public List<Integer> get_math_score(Integer score){
        return math_score;
    }

    public void speak(){
        System.out.println("英语分数："+this.get_english_score().get(0));
    }
}
