public class PseudoLinguagem {
    public int conta(){
        int p = 5;
        int q = 3;
        int s = 0;
        int constante = 0;
            for(constante = 1; constante<=5; constante++){
                if((p+q)>(2*p)){p=p-1;}
                else{q=q+2;}
                s=p+q;
        }
        return s;
    }
}
