package Assignment3;

import java.util.ArrayList;
import java.util.List;

class RecentCounter {
    List<Integer> list;

    public RecentCounter() {
        this.list = new ArrayList<Integer>();
    }

    public int ping(int t) {
        this.list.add(t);
        int ans = 1;
        for (int i = list.size() - 2; i >= 0; i--) {
            if (list.get(i) >= t - 3000)
                ans++;
            else
                return ans;
        }
        return ans;
    }
}
