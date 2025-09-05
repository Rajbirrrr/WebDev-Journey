class Solution {
    public int getLeastFrequentDigit(int n) {
        int size= String.valueOf(n).length();
        int arr[] = new int[size];
        int freq[]= new int[10];
        int least=-1;
        int smallest= Integer.MAX_VALUE;
        int i=0;
        for(int s=0; s<arr.length; s++){
            int ld= n%10;
            arr[s]=ld;
            n=n/10;
        }
        for(int m=0 ; m<arr.length; m++){
            freq[arr[m]]++;
        }
        
        for(int j=0; j<freq.length ; j++){
            if(freq[j]>0 && freq[j]<smallest){
                smallest = freq[j];
                least=j;
                
            }
           
        }

       
        return least;
    }©leetcode