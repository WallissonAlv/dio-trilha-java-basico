package collectionsjavaapi.MainJava.Map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
	
	private Map<LocalDate, Evento> eventosMap;

	public AgendaEventos() {
		this.eventosMap = new HashMap<>();
	}
	
	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		eventosMap.put(data, new Evento (nome,atracao));
	}
	public void exibirAgenda() {
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		System.out.println(eventosTreeMap);
	}
	public void obterProximoEvento() {
		LocalDate dataAtual = LocalDate.now();
		LocalDate proximaData = null;
		Evento proximoEvento = null;
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		for(Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()) {
			if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
				proximaData = entry.getKey();
				proximoEvento = entry.getValue();
				System.out.println("O próximo evento: "+ proximoEvento +" acontecerá na data "+ proximaData);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		AgendaEventos ae = new AgendaEventos();
		
		ae.adicionarEvento(LocalDate.of(2024,Month.JULY, 15), "Evento 1", "Atraçaõ 1");
		ae.adicionarEvento(LocalDate.of(2024,Month.NOVEMBER, 18), "Evento 2", "Atração 2");
		ae.adicionarEvento(LocalDate.of(2024,Month.OCTOBER, 22), "Evento 3", "Atraçaõ 3");
	
		ae.exibirAgenda();
		ae.obterProximoEvento();
	}
}
