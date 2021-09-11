class Solution {
    public int compareVersion(String version1, String version2) {
       
              String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int i = 0;
        int j = 0;
        while(i < v1.length || j < v2.length){
            int n1 = i < v1.length? Integer.parseInt(v1[i]): 0;
            int n2 = j < v2.length? Integer.parseInt(v2[j]): 0;
            i++;
            j++;
            if(n1 == n2) continue;
            if(n1 > n2) return 1;
            return -1;
        }
        
        return 0;
    }
}