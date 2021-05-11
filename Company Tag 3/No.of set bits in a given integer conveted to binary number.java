/*
editorial & Practice : https://practice.geeksforgeeks.org/problems/set-bits0143/1/?company[]=Juniper%20Networks&company[]=Juniper%20Networks&page=1&query=company[]Juniper%20Networkspage1company[]Juniper%20Networks#
*/
class Solution {
    static int setBits(int n) {
        // code here
        StringBuilder sb = new StringBuilder();
        while(n != 0) {
            int r = n%2;
            sb.append(r);
            n = n/2;
        }
        int count = 0;
        for(int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}