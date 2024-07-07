class Solution {
    public long maximumPoints(int[] enemyEnergies, int currentEnergy) {
        int n = enemyEnergies.length;
        int min = enemyEnergies[0];
        for(int i = 1; i < n; i++) {
            min = Math.min(min, enemyEnergies[i]);
        }
        if(currentEnergy == 0 || currentEnergy < min) {
            return 0;
        }
        

        long sum = (long)currentEnergy;
        
        for(int i = n - 1; i >= 0; i--) {
            sum += enemyEnergies[i];   
        }
        sum -= min;
        return sum / min;

    }
}