package codewars;

public class AreaofaCircle {
	    public static void main(String[] args) {
	        try {
	            System.out.println(area(43.2673));
	            System.out.println(area(68));
	          
	        }catch (IllegalArgumentException e) {
	            System.out.println("Erro: " + e.getMessage());
	        }
	    }
	    
	    public static double area(double radius) {
			 if (radius <= 0) {
		            throw new IllegalArgumentException("O raio deve ser um valor positivo");
		        }
		        double area = Math.PI * radius * radius;
		        return Math.round(area * 100) / 100.0; // Arredonda para 2 casas decimais
		    }
}
