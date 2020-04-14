package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import model.services.ProductService;

public class Program_Func_recebe_Func {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90)); 
		
		System.out.println();
		System.out.println("===========FUNCAO RECEBE FUNÇAO COM ARGUMENTO======================================");
		System.out.println();
		System.out.println("Fazer um programa que, a partir de uma lista de produtos,"); 
		System.out.println("calcule a soma dos preços dos produtos cujo nome comece coma letra 'T'.");
		System.out.println("Product('Tv', 900.00)");
		System.out.println("Product('Mouse', 50.00)");
		System.out.println("Product('Tablet', 350.50)");
		System.out.println("Product('HD Case', 80.90)");
		System.out.println();

		ProductService ps = new ProductService();
		
		double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T'); 
		//double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'H');
 
		System.out.println("Sum = " + String.format("%.2f", sum));
	}
}
