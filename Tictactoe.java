import java.util.Scanner;

public class Tictactoe{


    public static boolean haveWon(char [][] Board,char player) 
    {


        for(int row=0;row<Board.length;row++)
        {
           if(Board[row][0] ==player && Board[row][1]==player && Board[row][2]==player)
           {
           
           return true;
        }

    }
    
        for(int col=0;col<Board.length;col++)
        {
           if(Board[0][col] ==player && Board[1][col]==player && Board[2][col]==player)
         {  
    
            return true;
     
        }
        
    }


    

     if(Board[0][0]==player && Board[1][1]==player && Board [2][2]==player )
     {

        return true;


     }




     if(Board[0][2]==player && Board[1][1]==player && Board [2][0]==player )
     {

        return true;
        

     }




         return false;

    }

     



    public static void PrintBoard(char [][] Board)
    { 


        for(int i=0;i<Board.length;i++)
        {
           for(int j=0;j<Board[i].length;j++)
           {
               System.out.print(Board[i][j]+"|");              
           }
           System.out.println();
        }

    }
    


    public static void main(String[] args) {
        

         char Board[][] = new char[3][3];

         for(int i=0;i<Board.length;i++)
         {
            for(int j=0;j<Board[i].length;j++)
            {
                Board[i][j] = ' ';
            }
         }

         char Player = 'X';

        boolean gameover = false;
        
        Scanner scanner = new Scanner(System.in);


        while (!gameover) {
            
            PrintBoard(Board);
            System.out.println("player "+Player+" enter:");

            int row = scanner.nextInt();
            int col = scanner.nextInt();
            
            if(Board[row][col]==' ')
            {

                Board[row][col] = Player;
                gameover = haveWon(Board ,Player);
                if(gameover)
                {
                    System.out.println("Player "+Player+" has won");
                }
                else{
                    if(Player=='X')
                    {
                        Player = '0';
                    }
                    else{

                        Player = 'X';
                    }
                }
            }

            else{

                System.out.println("Invalid Move.Try again!");
            }


        }

             PrintBoard(Board);
    }
}