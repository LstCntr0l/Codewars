//https://www.codewars.com/kata/587136ba2eefcb92a9000027/java

public class SnakesLadders {
    int player1=0;
    int player2=0;
    int number=1;
    public SnakesLadders() {}
    public String play(int die1, int die2) {
        // System.out.println(getPlayer1()+" "+getPlayer2());
        if(getPlayer1()==100 || getPlayer2()==100)
            return "Game over!";

        //System.out.println(getNumber());
        if(getNumber()==1){
            setPlayer1(getPlayer1()+die1+die2);

            if(getPlayer1()>100)
                setPlayer1(100-(getPlayer1()-100));

            if(getPlayer1()==100)
                return "Player 1 Wins!";

            if(getPlayer1()==2)
                setPlayer1(38);
            if(getPlayer1()==7)
                setPlayer1(14);
            if(getPlayer1()==8)
                setPlayer1(31);
            if(getPlayer1()==15)
                setPlayer1(26);
            if(getPlayer1()==21)
                setPlayer1(42);
            if(getPlayer1()==28)
                setPlayer1(84);
            if(getPlayer1()==36)
                setPlayer1(44);
            if(getPlayer1()==51)
                setPlayer1(67);
            if(getPlayer1()==71)
                setPlayer1(91);
            if(getPlayer1()==78)
                setPlayer1(98);
            if(getPlayer1()==87)
                setPlayer1(94);
            //snakes
            if(getPlayer1()==16)
                setPlayer1(6);
            if(getPlayer1()==49)
                setPlayer1(11);
            if(getPlayer1()==46)
                setPlayer1(25);
            if(getPlayer1()==62)
                setPlayer1(19);
            if(getPlayer1()==64)
                setPlayer1(60);
            if(getPlayer1()==74)
                setPlayer1(53);
            if(getPlayer1()==89)
                setPlayer1(68);
            if(getPlayer1()==92)
                setPlayer1(88);
            if(getPlayer1()==95)
                setPlayer1(75);
            if(getPlayer1()==99)
                setPlayer1(80);


            if(die1!=die2){
                switch(getNumber()){
                    case 0:
                        setNumber1();
                        break;
                    case 1:
                        setNumber1();
                        break;
                    case 2:
                        setNumber2();
                        break;
                }
            }
            return "Player 1 is on square "+String.valueOf(getPlayer1());
        }
        if(getNumber()==2){
            setPlayer2(getPlayer2()+die1+die2);

            if(getPlayer2()>100)
                setPlayer2(100-(getPlayer2()-100));

            if(getPlayer2()==100)
                return "Player 2 Wins!";
            if(getPlayer2()==2)
                setPlayer2(38);
            if(getPlayer2()==7)
                setPlayer2(14);
            if(getPlayer2()==8)
                setPlayer2(31);
            if(getPlayer2()==15)
                setPlayer2(26);
            if(getPlayer2()==21)
                setPlayer2(42);
            if(getPlayer2()==28)
                setPlayer2(84);
            if(getPlayer2()==36)
                setPlayer2(44);
            if(getPlayer2()==51)
                setPlayer2(67);
            if(getPlayer2()==71)
                setPlayer2(91);
            if(getPlayer2()==78)
                setPlayer2(98);
            if(getPlayer2()==87)
                setPlayer2(94);
            //snakes
            if(getPlayer2()==16)
                setPlayer2(6);
            if(getPlayer2()==49)
                setPlayer2(11);
            if(getPlayer2()==46)
                setPlayer2(25);
            if(getPlayer2()==62)
                setPlayer2(19);
            if(getPlayer2()==64)
                setPlayer2(60);
            if(getPlayer2()==74)
                setPlayer2(53);
            if(getPlayer2()==89)
                setPlayer2(68);
            if(getPlayer2()==92)
                setPlayer2(88);
            if(getPlayer2()==95)
                setPlayer2(75);
            if(getPlayer2()==99)
                setPlayer2(80);


            if(die1!=die2){
                switch(getNumber()){
                    case 0:
                        setNumber1();
                        break;
                    case 1:
                        setNumber1();
                        break;
                    case 2:
                        setNumber2();
                        break;
                }
            }
            return "Player 2 is on square "+String.valueOf(getPlayer2());
        }

        return "";
    }
    public void setNumber1(){
        number=number+1;
    }
    public void setNumber2(){
        number=number-1;
    }
    public int getNumber(){
        return number;
    }
    public void setPlayer1(int p){
        player1=p;
    }
    public void setPlayer2(int p){
        player2=p;
    }
    public int getPlayer1(){
        return player1;
    }
    public int getPlayer2(){
        return player2;
    }

}