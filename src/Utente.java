import java.io.Serializable;
import java.util.ArrayList;

public class Utente implements Serializable{

	private String nomeUtente;
	private ArrayList<Evento> eventiUtente = new ArrayList<>();
	private ArrayList<Messaggio> messaggiUtente = new ArrayList<>();
		
		
		public Utente(String _nomeUtente)
		{
			nomeUtente=_nomeUtente;
		}
		
		
		public Boolean confrontaUtente(Utente uConfronto){
			Boolean uguale;
			if(nomeUtente.equalsIgnoreCase(uConfronto.getNomeUtente()))
				uguale=true;
			else
				uguale=false;
			
			return uguale;
		}
		
		

		public String getNomeUtente() {
			return nomeUtente;
		}


		public ArrayList<Evento> getEventiUtente() {
			return eventiUtente;
		}


		public ArrayList<Messaggio> getMessaggiUtente() {
			return messaggiUtente;
		}


		public void setNomeUtente(String nomeUtente) {
			this.nomeUtente = nomeUtente;
		}


		public void setEventiUtente(ArrayList<Evento> eventiUtente) {
			this.eventiUtente = eventiUtente;
		}


		public void setMessaggiUtente(ArrayList<Messaggio> messaggiUtente) {
			this.messaggiUtente = messaggiUtente;
		}
		
	
	
}
