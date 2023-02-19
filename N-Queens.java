class Solution {
    public List<List<String>> solveNQueens(int n) {
        if(n==2 || n==3) return new ArrayList<>();
        for (int i = 0; i < n - 1; i++) line.append('.');
        List<List<String>> result = new ArrayList<>();
        f(result, new int[n], 0, n, new boolean[5 * n - 2]);
        return result;
    }
    StringBuilder line = new StringBuilder();

    void f(List<List<String>> result, int[] s, int i, int n, boolean x[]) {
        if (i == n) {
            List<String> solution = new ArrayList<>();
            for (int k = 0; k < n; k++) {
                StringBuilder line0 = new StringBuilder(line);
                line0.insert(s[k], 'Q');
                solution.add(line0.toString());
            }
            result.add(solution);
        } else {
            for (int j = 0; j < n; j++) {
                int p1 = j - i + 2 * n - 1;
                int p2 = i + j + 3 * n - 2;
                if (!x[j] && !x[p1] && !x[p2]) {
                    boolean[] x0 = new boolean[x.length]; System.arraycopy(x, 0, x0, 0, x.length);
                    int[] s0 = new int[n]; System.arraycopy(s, 0, s0, 0, n);
                    x0[j] = x0[p1] = x0[p2] = true;
                    s0[i] = j;
                    f(result, s0, i + 1, n, x0);
                }
            }
        }
    }
}
