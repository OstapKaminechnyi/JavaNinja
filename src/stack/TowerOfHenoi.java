package stack;

public class TowerOfHenoi {
    private static DynamicStack[] tower;
    public static void TowerOfHenoi(int n){
        tower = new DynamicStack[4];
        for (int i=0;i<=3;i++){
            tower[i] = new DynamicStack(4);
        }
        for (int d=n; d>0;d--){
            tower[1].push(d);

        }
        showTowerStates(n,1,2,3);
    }
    public static void showTowerStates(int n, int x, int y, int z){
        if (n>0){
            try {
                showTowerStates(n-1,x,y,z);
                Integer d = tower[x].pop();
                tower[y].push(d);
                System.out.println("Move Disk " + d + "from tower " + x + "to top of tower " + y);
                showTowerStates(n-1,z,y,x);
            }
            catch (Exception ex){}
        }
    }
    public static void main(String[] args){
            System.out.println("Running 3 disk Problem");
            TowerOfHenoi(3);
        }
}
