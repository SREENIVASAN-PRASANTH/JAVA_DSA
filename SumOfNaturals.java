public class SumOfNaturals {
    int num;
    public SumOfNaturals(int num){
        this.num = num;
    }

    public int getSumOfNumbers(){
        int sum = 0;
        for(int i = 1;i <= num; i++){
            sum += i;
        }

        return sum;
    }
}
