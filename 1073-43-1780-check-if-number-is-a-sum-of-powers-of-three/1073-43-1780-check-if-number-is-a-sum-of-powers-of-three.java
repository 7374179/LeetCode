class Solution {
    public boolean checkPowersOfThree(int n) {
        return checkPowerOfThreeHelper(0, n);
    }

    private boolean checkPowerOfThreeHelper(int power, int n){
        if(n==0) return true;
        if(Math.pow(3, power)>n) return false;

        boolean addPower = checkPowerOfThreeHelper(power+1, n-(int)Math.pow(3, power));
        boolean skipPower = checkPowerOfThreeHelper(power+1, n);

        return addPower || skipPower;
    }
}