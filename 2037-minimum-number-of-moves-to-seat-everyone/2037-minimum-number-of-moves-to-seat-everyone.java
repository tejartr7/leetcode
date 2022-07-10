class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int l=seats.length;
        int a[]=new int[l];
        int i;
        for(i=0;i<l;i++)
            a[i]=Math.abs(seats[i]-students[i]);
        int sum=0;
        for(i=0;i<l;i++)
            sum+=a[i];
        return sum;
    }
}