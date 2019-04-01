package managed;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;

import beans.Utente;

@ManagedBean(name="dtSelectionView")
@ViewScoped
public class ViewUtentiBean implements Serializable{
	
	private static final long serialVersionUID = -1060598718658473231L;
	
	private Utente selectedUser ;

	public Utente getSelectedUser() {
		return selectedUser;
	}

	public void setSelectedUser(Utente selectedUser) {
		this.selectedUser = selectedUser;
	}
	
	 public void onRowSelect(SelectEvent event) {
	        FacesMessage msg = new FacesMessage("Car Selected", ((Utente) event.getObject()).getUsername());
	        FacesContext.getCurrentInstance().addMessage(null, msg);
	    }
	 
	    public void onRowUnselect(UnselectEvent event) {
	        FacesMessage msg = new FacesMessage("Car Unselected", ((Utente) event.getObject()).getUsername());
	        FacesContext.getCurrentInstance().addMessage(null, msg);
	    }
}
