import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
private static List<String> crops = new ArrayList<>();

public class Crops {

    public static void selectCrop(Scanner sc) {
        System.out.println("작물을 선택하세요.");
        for (int i = 0; i < crops.size(); i++) {
            System.out.println((i + 1) + ". " + crops.get(i));
        }
        System.out.println("작물 번호를 입력하세요.");
        int cropChoice = sc.nextInt();

        if (cropChoice >= 1 && cropChoice <= crops.size()) {
            selectCrop = crops.get(cropChoice - 1);
            System.out.println("선택한 작물 : " + selectCrop);
        } else {
            System.out.println("잘못된 선택입니다. 다시시도하세요.");
        }
    }

}

