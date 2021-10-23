import java.util.ArrayList;
import java.util.List;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/9/25   21:01
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        //String str0 = "hello";
        //
        //String str1 = "word";
        //
        //String str3 = "helloword";
        //
        //String str4= "hello"+"word";
        //
        //String str5= str0 + str1;
        //
        //String str6 = new String ("hello world");
        //
        //String str7 = str0 + "word";
        //
        //System.out.println("str3 == str4\t" + (str3 == str4));//true
        //System.out.println("str3 equals str4\t" + (str3.equals(str4)));//true
        //System.out.println("str3 == str5\t" + (str3 == str5));//false
        //System.out.println("str3 equals str5\t" + (str3.equals(str5)));
        //System.out.println("str3 == str6\t" + (str3 == str6));
        //System.out.println("str3 equals str6\t" + (str3.equals(str6)));
        //System.out.println("str3 == str7\t" + (str3 == str7));
        //System.out.println("str3 equals str7\t" + (str3.equals(str7)));
        //
        //
        //System.out.println("str4 == str5\t" + (str4 == str5));
        //System.out.println("str4 equals str5\t" + (str4.equals(str5)));
        //System.out.println("str4 == str6\t" + (str4 == str6));
        //System.out.println("str4 equals str6\t" + (str4.equals(str6)));
        //System.out.println("str4 == str7\t" + (str4 == str7));
        //System.out.println("str4 equals str7\t" + (str4.equals(str7)));
        //
        //
        //System.out.println("str5 == str6\t" + (str5 == str6));
        //System.out.println("str5 equals str6\t" + (str4.equals(str6)));
        //System.out.println("str5 == str7\t" + (str5 == str7));
        //System.out.println("str5 equals str7\t" + (str5.equals(str7)));
        //
        //System.out.println("str6 == str7\t" + (str6 == str7));
        //System.out.println("str6 equals str7\t" + (str6.equals(str7)));

        //public static void main(String[] args){
        //    List<String> list = new ArrayList<String>();
        //    list.add("保护环境");  //向列表中添加数据
        //    list.add("爱护地球");  //向列表中添加数据
        //    list.add("从我做起");  //向列表中添加数据
        //    list.add(1,"从我做起");  //在第1+1个元素的位置添加数据
        //    List<String>list_ad = new ArrayList<String>();
        //    list_ad.add("公益广告");  //将list中的全部元素添加到list_ad中
        //    System.out.println("是否添加成功:"+list_ad.addAll(0,list));  //通过循环输出列表中的内容
        //    for(int i=0;i<list_ad.size();i++){
        //        System.out.println(i+":"+list_ad.get(i));
        //    }
        //}

        System.out.println(new Test().constructRectangle(122122));
    }
    public int[] constructRectangle(int area) {
        int res[] = new int[]{area,1};
        int min = area -1;
        for(int i = 1; i <= area/2; i++){
            int m = area % i;
            if(m == 0){
                int L = area / i;
                int W = i;
                if(min > (L - W) &&  L > W){
                    res[0] = L;
                    res[1] = W;
                    min = L - W;
                }
            }
        }
        return res;
    }
}
