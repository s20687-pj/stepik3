package interfejsy;

public class RomanNumeral {

    int number;
    int[] values ={1000,900,500,400,100,90,50,40,10,9,5,4,1};
    String[] symbols ={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};


    public RomanNumeral(int number){
        this.number = number;
    }

    public String getRomanNumeral(){
        StringBuilder romanNumer = new StringBuilder();
        int krok = this.number;

        for(int i=0; i<values.length;i++){
            while(krok>= values[i]){
                krok -= values[i];
                romanNumer.append(symbols[i]);
            }
        }
        return romanNumer.toString();
    }

}
