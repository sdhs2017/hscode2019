package member.Kristen.pattern.Builder.Demo1;

public class Tshirt extends Clothes {
    public float price;

    /**
     *
     * @return
     */
    public String name(){
        return "T恤";
    }

    /**
     * 实现clothes接口里的colour
     * @param i
     * @return
     */
    public String colour(int i){
      int c=i;
        String colour="无色";
      switch (c){
          case 1:
              //return
              colour="蓝色";
              break;

          case 2:
             // return "白色";
              colour="白色";
              break;

          case 3:
              colour="黑色";
              break;

          case 4:
              colour="自定义 得加钱！";
              //加十块钱
              price+=10;
      }
      return colour;
    }

    public float price(){
        price+=50;
        return price;
    }



}
