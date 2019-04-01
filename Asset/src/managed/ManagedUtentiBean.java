package managed;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import beans.Utente;
import common.MyBatisConnectionFactory;
import dao.UtenteDAO;

@ManagedBean
@SessionScoped
public class ManagedUtentiBean {
	//
	
	public List<Utente> getAllUtenti() {
		UtenteDAO dao = new UtenteDAO(MyBatisConnectionFactory.getSqlSessionFactory());
		return dao.selectAll();
	}
	public void update(Utente u) {
		UtenteDAO dao = new UtenteDAO(MyBatisConnectionFactory.getSqlSessionFactory());
		dao.update(u);
	}
	
//	public Utente getSelectedUser() {
//		System.out.println("get selUser = "+selectedUser);
//		return selectedUser;
//	}
//	public void setSelectedUser(Utente selectedUser) {
//		this.selectedUser = selectedUser;
//		System.out.println("set selUser to "+selectedUser);
//	}
}
