package model;

import java.util.ArrayList;

import org.hibernate.Session;

import DAO.SlotDAO;
import access.HibernateAcesso;
import controller.CriacaoController;
import controller.JogoController;
import controller.PauseController;
import view.TelaCriacao;
import view.TelaJogo;
import view.TelaPause;

public class Principal {
	public static Inventario inventario;
	
	public static void main(String[] args) {
		
		/*TelaPause telaPause = new TelaPause(); 
		PauseController pauseController = new PauseController(telaPause);
		pauseController.inicializaController();
		
		  
		TelaJogo jogo = new TelaJogo();
		JogoController jogoController = new JogoController(jogo);
		jogoController.inicializaController();	
		*/
		
		Session session = HibernateAcesso.getSessionFactory().openSession();
		SlotDAO dao = SlotDAO.getInstance(session);
		
		inventario = new Inventario();
		
		inventario.setInventario((ArrayList<Slot>)dao.findAll());
		TelaCriacao tc = new TelaCriacao();
		CriacaoController criacaoController = new CriacaoController(tc,inventario);
		criacaoController.inicializaController();
		
		TelaJogo jogo = new TelaJogo();
		JogoController jogoController = new JogoController(jogo);
		jogoController.inicializaController();
		
		//Exemplo com DAO
		 
		 //Create
		 //dao.save(slot1);
		 
		 
		 
		 //Delete
		/*dao.remove(aluno);
		try{
			Aluno result4 = dao.getById(aluno.getId());
		}catch(ObjectNotFoundException ex) {
			System.out.println("Aluno não encontrado!");
		}
		*/
		
	}
}
