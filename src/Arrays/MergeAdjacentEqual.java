package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MergeAdjacentEqual {
    public static List<Long> merge(int[] arr) {
        List<Long> ans = new ArrayList<>();
        int n = arr.length;

        for (int i=0; i<n; i++) {
            ans.add((long)arr[i]);
        }

        int ind = 0;
        while (ind < ans.size() - 1) {
            if (Objects.equals(ans.get(ind), ans.get(ind + 1))) {
                long sum = ans.get(ind) + ans.get(ind + 1);
                ans.set(ind, sum);
                ans.remove(ind + 1);
                ind = 0;
                continue;
            }
            ind++;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1,1,2,4,8,16,32,64,128,256,512,1024,2048,4096,8192,16384,32768,65536 };
        List<Long> ans = merge(arr);
        System.out.println(ans);
    }
}
