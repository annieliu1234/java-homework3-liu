

// java.lang.* 會自動匯入，這裡不需要另外寫 import
import java.lang.Math;
public class LangExample {
    public static void main(String[] args) {

        // String 類別：字串處理
        String name = "ChatGPT";
        int length = name.length();
        String upper = name.toUpperCase();

        // Math 類別：基本數學運算
        double radius = 3.0;
        double area = Math.PI * Math.pow(radius, 2);  // 面積 = πr^2

        // System 類別：輸出到主控台
        System.out.println("名字: " + name);
        System.out.println("字串長度: " + length);
        System.out.println("大寫: " + upper);
        System.out.println("半徑 = " + radius);
        System.out.println("圓面積 = " + area);
    }
}
