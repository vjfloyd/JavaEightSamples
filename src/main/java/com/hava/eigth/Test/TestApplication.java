package com.hava.eigth.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication implements ApplicationRunner{

	private static final Logger log  = LoggerFactory.getLogger(TestApplication.class);
	 
	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		List<String> list = Arrays.asList("ver","bl","green");
//		list.stream().forEach(s->System.out.println(s));
		List<Nodo> listnodo = new ArrayList<>();
		List<Nodo> listnodo2 = new ArrayList<>();
		
		for (int i = 0; i < 4; i++) {
			Nodo a = new Nodo(String.valueOf(i+1),"val"+String.valueOf(i+1));
			listnodo.add(a);
			Nodo a2 = new Nodo(String.valueOf(i+1),"val"+String.valueOf(i+1));
			listnodo2.add(a2);
		}
		
		List<String> var  = listnodo.stream()
				//.filter(s->s.key.equalsIgnoreCase("1"))
//				.anyMatch(n->n.key.equalsIg)
				.map(s->s.value)
				.collect(Collectors.toList());
		
//		List<String> var2 = listnodo.stream()
//				.map(n->n.getKey())
//				.filter(nm -> (filterNodos(n)));
		var.stream().forEach(s->System.out.println(s));
//		List<String> newlist = list.stream().
//		System.out.println("dadad");

		applyFilter();

	}
	
	public static void applyFilter() {
		String[] restaurants = {
				"JUICY LUCY",
				"FIAMMA",
				"DON ROSALINO",
				"VILLA CHICKEN",
				"PAPPAS",
				"KINTARO",
				"SEGUNDO MUELLE",
				"BON BEEF",
				"LA FOLIE",
				"LOCHE",
				"EL HORNERO",
				"LAS CANASTAS",
				"PUNTO MARISKO",
				"LA PICCOLINA",
				"SARCLETTI",
				"DANICA",
				"LIMA THAI",
				"EMBARCADERO 41",
				"DON MAMINO",
				"NAGOYA",

		};
		String[] places = {
				"LIMON",
				"VERDE",
				"MAR",
				"LOCHE",
				"NAGOYA"
		};
		
		Predicate<String> p1 = a->a.matches("(.*)EL(.*)"); 
		
		List<String> listRest  =Arrays.asList(restaurants)
				.stream()
				//.filter(a -> Arrays.stream(restaurants).anyMatch(m->a.matches("(.*)EL(.*)")))
				.filter(p1)
				//.filter(a-> a.contains("PIZ"))
				.collect(Collectors.toList());
		log.info("Any match");
		listRest.stream().forEach(s->System.out.println(s));

		List<String> l1 = Arrays.asList(restaurants);
		List<String> l2 = Arrays.asList(places);

		boolean pre = l1.stream().anyMatch(var -> l2.stream().anyMatch(tmp->var.equalsIgnoreCase(tmp)));
//		List<String> lista =  l1.stream().filter(les -> a);

//		Predicate<String> pl2 = var -> var.equalsIgnoreCase(a);

//		return Arrays.stream(restaurant.getGeneralData().getFoodType())
//				.anyMatch(foodTye -> Arrays.stream(categories)
//						.anyMatch(category -> foodTye.equalsIgnoreCase(category)));

		//l1.stream().filter()

	}

	
	
//	public boolean filterNodos(Nodo nodo){
//
//	}
	
	class Nodo{
		String key;
		String value;
		
		public Nodo(String key, String value) {
			this.key = key;
			this.value = value;
		}
		public String getKey() {
			return key;
		}
		public void set(String key) {
			this.key = key;
		}
	}
	public void run3(ApplicationArguments args) throws Exception {
		log.info("RES=>"+calTest(2));
	}

	public static int calTest(int sf){
		int s = 0; int cont = 0;
		for (int i= 1; i < 6 ;i++){
			for(int j = 0 ;j < i;j++){
				s = i + j;
				if(s <= sf){
					if(s == sf)
						cont++;
					calTest(sf);
				}else if(s > sf){
					return cont;
				}
			}
		}
		return s;
	}

	
}
	
//	"SUBWAY",
//			"PUERTO MANCORA",
//			"NANKA",
//			"EL PEZ LANZA",
//			"HUANCAHUASI",
//			"RUSTICA",
//			"CHIFA BU BU GAO",
//			"EL ESCONDITE",
//			"KILO",
//			"HIKARI",
//			"LA BONBONNIERE",
//			"PUNTA SAL",
//			"PUNTO ITALIANO",
//			"KFC",
//			"MAMMA TOMATO",
//			"WING FACTORY",
//			"GREENS PIZZA",
//			"PIZZA HUT",
//			"EL MANJAR MARINO",
//			"OSSO",
//			"DON BELISARIO",
//			"STARBUCKS",
//			"TACON MADRE",
//			"NORKYS",
//			"MIS COSTILLITAS",
//			"4D",
//			"CARNIBAR",
//			"LA NACIONAL",
//			"PARDOS CHICKEN",
//			"NIKKO",
//			"BEMBOS",
//			"LA ROMANA",
//			"EL CHARACATO DE ORO",
//			"EL VERIDICO DE FIDEL",
//			"DELICASS",
//			"SENOR LIMON"