import java.util.*;

public class OOPS{

public static void main(String args[]){
    Queen q = new Queen();
        q.moves();
 }
}

interface Chessplayer{
    void moves();
}

class Queen implements Chessplayer{
    public void moves(){
        System.out.println("left , right , up , down , diagonal");
    }
}
class King implements Chessplayer{
   public void moves(){
        System.out.println("left , right , up , down , diagonal (By one step ) ");
    }
}
class Rook implements Chessplayer{
    public void moves(){
        System.out.println("up , down , right , left");
    }
}
class Pown implements Chessplayer{
    public void moves(){
        System.out.println("up");
    }
}
