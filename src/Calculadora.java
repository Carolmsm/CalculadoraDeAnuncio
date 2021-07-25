public class Calculadora {


    public static void main(String[] args) {


        Calculadora visual = new Calculadora();

        System.out.println(visual.projecaoVisualizacao(499, 10000));
        System.out.println(visual.projecaoCompart(121));


    }


    int quantVisual = 0;
    int cClique = 12;
    int totalCliques = 0;
    int tolatlCliquesC = 0;
    int compart = 0;
    int restDTCliques;
    int totalVisual = 0;
    int valorInvest;
    private int cVisual = 30;
    private int quantVisualInvest;



    public String projecaoVisualizacao(int quantVisual, int valorInvest) {

        this.quantVisual = quantVisual;
        this.valorInvest = valorInvest;
        this.setQuantVisualInvest(valorInvest * cVisual);

        for (int i = 0; i <= this.quantVisual; i = i + 100) {

            if (this.quantVisual == i ) {

                int div = quantVisual/ 100;
                this.totalCliques = div * cClique;
                System.out.println(this.totalCliques);
                //System.out.println("i:" + i);

            } else if( this.quantVisual <= (i + 99) ){

                int div = quantVisual/ 100;
                this.totalCliques = div * cClique;
                System.out.println(this.totalCliques);
                //System.out.println("i:" + i);

            }


        }
        return "Valor de Investimento R$:" + valorInvest + ", Total de visualizações de acordo com o valor investido: " + this.getQuantVisualInvest()+ ", Numero inicial de visualizações: "+ this.quantVisual + ", projeção de cliques baseados nas visualizações inicias: "+ this.totalCliques + "";

    }

    public String projecaoCompart(int totalCliquesC){
        this.tolatlCliquesC= totalCliquesC;

        for (int x =0; x <= this.tolatlCliquesC; x = x + 20){
            int cComp = 3;
            int d;
            int dCliques;

            if (this.tolatlCliquesC == 20){

                d = totalCliquesC / 20;
                this.compart = d * cComp;

            }else if(this.tolatlCliquesC == x ){

                dCliques = totalCliquesC / 20;
                //d = dCliques /10 ;

                this.compart = dCliques * cComp;

            } else if((this.tolatlCliquesC <= (x + 19)  )){
                this.restDTCliques = this.tolatlCliquesC % 20;
                if (restDTCliques != 0){

                    dCliques = totalCliquesC / 2;
                    d = dCliques /10 ;

                    this.compart = d * cComp;
                }
            }

            this.totalVisual = this.getQuantVisualInvest() + this.quantVisual + (this.compart * 40) ;
        }
        return "Total de cliques:" + totalCliquesC + ", projeção total de compartilhamentos nas redes socias: " +(this.compart ) + ", total de visualizações:" + this.totalVisual ;

    }

    public int getcVisual() {
        return cVisual;
    }

    public void setcVisual(int cVisual) {
        this.cVisual = cVisual;
    }

    public int getQuantVisualInvest() {
        return quantVisualInvest;
    }

    public void setQuantVisualInvest(int quantVisualInvest) {
        this.quantVisualInvest = quantVisualInvest;
    }
}




