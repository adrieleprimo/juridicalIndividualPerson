package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		List <Pessoa> list = new ArrayList<>();
		System.out.print("Enter the number of tax payers: ");
		int N = sc.nextInt();
		for(int i = 1; i<=N;i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char answer = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String personName = sc.nextLine();
			if(answer == 'i') {
				System.out.print("Anual income: ");
				Double individualIncome = sc.nextDouble();
				System.out.print("Health expenditures: ");
				Double health = sc.nextDouble();
				list.add(new PessoaFisica(personName, individualIncome, health));
			}
			else if (answer == 'c') {
				System.out.print("Anual income: ");
				Double companyIncome = sc.nextDouble();
				System.out.print("Number of employees: ");
				Integer employees = sc.nextInt();
				list.add(new PessoaJuridica(personName, companyIncome, employees));

			}	
		}
		System.out.println();
		System.out.println("TAXES PAID: ");
		list.forEach(System.out::print);
		System.out.println();
		Double sum = 0.0;
		for (Pessoa p: list) {
			sum += p.rendaAnual();
		}
		System.out.print("TOTAL TAXES: $ " + String.format("%.2f", sum));
		sc.close();
	}
}

