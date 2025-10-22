
class FunOver{
    public int sum(int a, int b){
        return a + b;
    }
    public float sum(float a, float b){
        return a + b;
    }
    public static void main(String[] args){
        
        FunOver f = new FunOver();
        int a = 10;
        int b = 25;
        float x = 5.5f;
        float y = 4.5f;

        System.out.println(f.sum(a, b));
        System.out.println((f.sum(x, y)));
    }
}