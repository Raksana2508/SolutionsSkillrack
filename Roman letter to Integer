class Solution {
    public int romanToInt(String s) {
        char[] arr = s.toCharArray();        
        int n = arr.length;
        if(n==0) return 0;
        else if(n==1) return getValue(arr[0]);
        
        int count = getValue(arr[0]);
        for(int i = 1;i<n;i++){
            int value = getValue(arr[i]);
            int preValue = getValue(arr[i-1]);
            
            count+=value;
            
            if(value > preValue){
                count-= preValue*2;
            }
        }
        
        return count;
    }

    private int getValue(char ch){
        switch(ch){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
