package by.academy.classwork.lesson16;

public class HeavyBox implements Comparable <HeavyBox> {
   private int weight;
    private int width;
    private int height;
    private int depth;

   public HeavyBox(int w, int h, int d, int m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
     @Override
    public  int compareTo(HeavyBox hb){
       return -(weight - hb.weight);
     }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                ", width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }
}