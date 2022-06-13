class Solution {
    public double calculateTax(int[][] brackets, int income) {
       double totalTax = 0;
        for(int i = 0;i<brackets.length;i++){
            if(brackets[i][0] < income){
                if(i == 0){
                    totalTax += brackets[i][0] * brackets[i][1];
                    
                }
                else{
                    totalTax += (brackets[i][0] - brackets[i-1][0]) * brackets[i][1];
                }
            }
            else{
                if(i == 0){
                    totalTax += income * brackets[i][1];
                    break;
                    
                }
                else{
                    totalTax += (income - brackets[i-1][0]) * brackets[i][1];
                    break;
                }
            }
        }
        return totalTax/100;
    }
}