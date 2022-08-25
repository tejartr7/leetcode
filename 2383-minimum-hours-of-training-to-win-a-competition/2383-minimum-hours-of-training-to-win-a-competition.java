class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int energytotal=initialEnergy;
        int i;
        int count=0;
        int n=energy.length;
        int sum=0;
        for(i=0;i<n;i++)
        {
            sum+=energy[i];
        }
       if(energytotal<=sum)
       {
           count+=sum-energytotal+1;
       }
        for(i=0;i<experience.length;i++)
        {
            if(experience[i]<initialExperience)
            {
                initialExperience+=experience[i];
            }
            else{
                int k=experience[i]-initialExperience;
                initialExperience+=k+1+experience[i];
                count+=k+1;
                
            }
        }
        return count;
    }
}