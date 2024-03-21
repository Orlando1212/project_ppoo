public class Carro {
        private int velocidade;
        private int vezes;
        private String nomeCarro;
    
        public Carro(int velocidade ,int vezes, String nomeCarro) {
            this.velocidade = velocidade;
            this.vezes = vezes;
            this.nomeCarro = nomeCarro;
        }
    
        public int getVelocidade() {
            return velocidade;
        }
        public int getVezes() {
            return vezes;
        }
        public String getNomeCarro() {
            return nomeCarro;
        }


        public int desacelera(){
            for(int i=0;i < vezes ;i++){
                velocidade-= 5;
            }

            return velocidade;
        }

        public int acelerar(){

            for(int i=0;i < vezes ;i++){
                velocidade+= 5;
            }

            return velocidade;
        }
    
}
