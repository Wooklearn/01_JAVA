public class Crops {

    private String name;    // 작물 이름
    private int price;   // 작물 가격

    // 작물 이름과 가격을 저장
    private void crops(String name, int price) {
        this.name = name;
        this.price = price;

        Crops[] crops = {"쌀", "옥수수", "수박", "콩", "코코넛"};
        crops[0] = "쌀";
        crops[1] = "옥수수";
        crops[2] = "수박";
        crops[3] = "콩";
        crops[4] = "코코넛";


        for (int i = 0; i < crops.length; i++) {

            System.out.println(crops[i]);

        }

    }
}
//Crop[] crops = {
//        new Crop("당근", 20),
//        new Crop("옥수수", 15),
//        new Crop("토마토", 25)
//};