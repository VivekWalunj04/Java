import java.util.*;
public class Short_path {
    public static float getShortestPath (String name){
        int x=0, y=0;
        for(int i=0;i<name.length();i++){
            char dir = name.charAt(i);
            if(dir == 'S'){
                y--;
            }
            else if(dir == 'N'){
                y++;
            }
            else if(dir == 'E'){
                x++;
            }
            else{
                x--;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2 + Y2);
    }
    public static void  main(String args[]){
        String name = "NS";
        System.out.println(getShortestPath(name));
    }
}
