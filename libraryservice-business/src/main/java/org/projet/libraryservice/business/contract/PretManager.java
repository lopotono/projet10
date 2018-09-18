package org.projet.libraryservice.business.contract;

import java.util.Calendar;
import java.util.Date;

public interface PretManager {
	
	void SavePret(Calendar datedebut, Calendar datefin, String etat, Date dateprolongation, String userid, String livreid);
}