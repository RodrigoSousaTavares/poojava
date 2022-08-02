public class App {
    public static void main(String[] args) throws Exception {
        // Nike Air Force, branco, tamanho 40 centimetros 26.5
        // Adidas ULTRABOOST 22, preto, tamanho 39 centimetros 25.0
        // Puma RS-Z CORE, branco, tamanho 39 centimetros 26.5

        Tenis tenisA = new Tenis();
        tenisA.marca = "Nike";
        tenisA.modelo = "Air Force";
        tenisA.cor = "branco";
        tenisA.tamanho = 40;
        tenisA.tamanhoCentimetros = 26.5f;
        
        Tenis tenisB = new Tenis();
        tenisB.marca = "Adidas";
        tenisB.modelo = "ULTRABOOST 22";
        tenisB.cor = "preto";
        tenisB.tamanho = 39;
        tenisB.tamanhoCentimetros = 25.0f;

        Tenis tenisC = new Tenis();
        tenisC.marca = "Puma";
        tenisC.modelo = "RS-Z CORE";
        tenisC.cor = "branco";
        tenisC.tamanho = 39;
        tenisC.tamanhoCentimetros = 26.5f;

        System.out.format("Tenis %s %s, %s, tamanho %d, %.1f centimetros\n", tenisA.marca, tenisA.modelo, tenisA.cor, tenisA.tamanho, tenisA.tamanhoCentimetros );    
        System.out.format("Tenis %s %s, %s, tamanho %d, %.1f centimetros\n", tenisB.marca, tenisB.modelo, tenisB.cor, tenisB.tamanho, tenisB.tamanhoCentimetros );    
        System.out.format("Tenis %s %s, %s, tamanho %d, %.1f centimetros", tenisC.marca, tenisC.modelo, tenisC.cor, tenisC.tamanho, tenisC.tamanhoCentimetros );    
        
    }   
}
