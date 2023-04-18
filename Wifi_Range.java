class Solution {
    boolean wifiRange(int N, String S, int X) {
        boolean[] isWifi = new boolean[N];
        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == '1') {
                // If there is wifi in ith room, mark all rooms within its range as wifi coverage areas
                for (int j = Math.max(0, i - X); j <= Math.min(N - 1, i + X); j++) {
                    isWifi[j] = true;
                }
            }
        }
        // Check if all rooms are covered by at least one wifi coverage area
        for (int i = 0; i < N; i++) {
            if (!isWifi[i]) {
                return false;
            }
        }
        // All rooms are covered by wifi
        return true;
    }
}
