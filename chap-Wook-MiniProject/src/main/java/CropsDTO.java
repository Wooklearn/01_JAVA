public class CropsDTO {

    private String name;    // 작물 이름
    private int price;   // 작물 가격
    private Crop selectedCrop;    // 작물 선택
    private int waterLevel;    // 물주기 상태
    private int growthStage; // 성장 단계
    private int gold;    // 골드


    // 기본생성자
    public CropsDTO () {}

    // 오버라이딩 된 생성자


    public CropsDTO(String name, int price, Crop selectedCrop, int waterLevel, int growthStage, int gold) {
        this.name = name;
        this.price = price;
        this.selectedCrop = selectedCrop;
        this.waterLevel = waterLevel;
        this.growthStage = growthStage;
        this.gold = gold;
    }

    // getter,setter


    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Crop getSelectedCrop() {
        return selectedCrop;
    }

    public int getWaterLevel() {
        return waterLevel;
    }

    public int getGrowthStage() {
        return growthStage;
    }

    public int getGold() {
        return gold;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setSelectedCrop(Crop selectedCrop) {
        this.selectedCrop = selectedCrop;
    }

    public void setWaterLevel(int waterLevel) {
        this.waterLevel = waterLevel;
    }

    public void setGrowthStage(int growthStage) {
        this.growthStage = growthStage;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    // 오버라이딩
    @Override
    public String toString() {
        return "CropsDTO{" +
                "name='" + name + '\'' +
                ", growthStage=" + growthStage +
                ", price=" + price +
                '}';
    }
}
