
class Recursion {
    
    public Recursion(){
 
    }
    public int sum(int k) {
        
        // Base case
        if (k <= 0) {
            return 0;
            // Recursive call
        } else {
            return k+=sum(k-1);
        }
    }

    public static void main(String[] args) {
        Recursion obj = new Recursion();
        
        System.out.println(obj.sum(5));
        

    }

}