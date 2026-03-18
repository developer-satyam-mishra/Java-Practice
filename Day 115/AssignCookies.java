import java.util.Arrays;

class AssignCookies {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        
        int i = 0;
        int j = 0;  
        
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                i++;
            }
            j++;
        }
        
        return i;
    }

    public static void main(String[] args) {
        AssignCookies sol = new AssignCookies();
        
        int[] g = {1, 2, 3};
        int[] s = {1, 1};
        
        int result = sol.findContentChildren(g, s);
        System.out.println("Content children: " + result);
    }
}