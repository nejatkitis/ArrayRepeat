import java.util.Arrays;

public class ArrayRepeat {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        Arrays.sort(list);
        int[] counter = new int[list.length];
        Arrays.fill(counter,1);
        for (int i=0;i<list.length;i++){
            for (int j=0;j< list.length;j++){
                if ((i!=j)&&(list[i]==list[j])){
                    counter[i]++;
                }
            }
        }
        for (int i=1;i<list.length;i++){
            if (list[i]==list[i-1]){
                continue;
            } else {
                System.out.println(list[i]+" , "+counter[i]+" defa tekrar etti.");
            }
        }
    }
}
