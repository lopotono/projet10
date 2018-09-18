package org.projet.libraryservice.consumer.contract;

import java.util.Calendar;
import java.util.Date;

public interface PretDAO {
	
	void SavePret(Calendar datedebut, Calendar datefin, String etat, Date dateprolongation, String userid, String livreid);
}